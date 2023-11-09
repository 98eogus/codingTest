package DFS와BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Queue;

public class Test1260_DFS와BFS {
	static int N;
	static int M;
	static int V;
	static boolean isVisited[];
	static List<Integer >graph[];
	
	static void DFS(int start) {
		if(isVisited[start])return;
		isVisited[start] = true;
		System.out.print(start+" ");
		
		for(int next : graph[start]) {
			
			
			DFS(next);
		}
	}
	
	static void BFS(int start) {
		Queue<Integer> queue = new ArrayDeque<>();
		queue.offer(start);
		isVisited = new boolean[N+1];
		isVisited[start] = true;
		
		while(!queue.isEmpty()) {
			
			int nowNode = queue.poll();
			System.out.print(nowNode + " ");
			
			for(int next : graph[nowNode]) {
				if(isVisited[next]) continue;
				isVisited[next] = true;
				queue.offer(next);		
			}
			
		}
	
	}

	public static void main(String[] args)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str[] = br.readLine().split(" ");
		N = Integer.parseInt(str[0]);
		M = Integer.parseInt(str[1]);
		V = Integer.parseInt(str[2]);
		isVisited = new boolean[N+1];
		graph = new ArrayList[N+1];
		for(int i = 0; i<graph.length; i++) {
			graph[i] = new ArrayList<>();
		}
		
		
		for(int i = 0; i<M; i++) {
			str = br.readLine().split(" ");
			int u = Integer.parseInt(str[0]);
			int v = Integer.parseInt(str[1]);
			graph[u].add(v);
			graph[v].add(u);
		}
		
		for(int i = 0; i<N+1; i++) {
			Collections.sort(graph[i]);
		}
		
		
		
		DFS(V);
		System.out.println();
		BFS(V);

	}

}
