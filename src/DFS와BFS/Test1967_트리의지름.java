package DFS와BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;

public class Test1967_트리의지름 {
	static List<Node_1967> graph[];
	static boolean visited[];
	static int distance[];
	
	static void BFS(int start) {
		Queue<Integer> queue = new ArrayDeque<>();
		queue.offer(start);
		visited[start] = true;
		
		
		while(!queue.isEmpty()) {
			int now = queue.poll();
			for(Node_1967 node : graph[now]) {
				if(visited[node.child]) continue;
				visited[node.child] = true;
				distance[node.child] = distance[now]+node.value;
				
				queue.offer(node.child);
				
			}
		}
	}

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		graph = new ArrayList[N+1];
		visited = new boolean [N+1];
		distance = new int [N+1];
		for(int i = 1; i<=N; i++) {
			graph[i] = new ArrayList<Node_1967>();
		}
		
		for(int i = 0; i<N-1; i++) {
			String str[] = br.readLine().split(" ");
			int parent = Integer.parseInt(str[0]);
			int child = Integer.parseInt(str[1]);
			int value = Integer.parseInt(str[2]);
			graph[child].add(new Node_1967(parent,value));
			graph[parent].add(new Node_1967(child, value));
		}
		
		
		BFS(1);
		int max = 1;
		for(int i=2; i<=N; i++) {
			if(distance[i]>distance[max]) {
				max = i;
			}
		}
		//가장 멀리 있는 노드의 번호를 찾기
		System.out.println("max = " + max);
		
		visited = new boolean[N+1];
		distance = new int[N+1];
		BFS(max);
		Arrays.sort(distance);
		
		
		System.out.println(distance[N]);
		
		
	}

}


class Node_1967{
	
	int child;
	int value;
	
	Node_1967(int child , int value) {
		this.child = child;
		this.value = value;
	}
}