package DFS와BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;

public class Test1167_트리의지름 {
	static boolean visited[];
	static int distance[];
	static List<Edge> graph[];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		graph = new ArrayList[N + 1];
		for (int i = 1; i <= N; i++) {
			graph[i] = new ArrayList<Edge>();
		}

		for (int i = 0; i < N; i++) {
			String str[] = br.readLine().split(" ");
			int j = 1;
			while (true) {
				int e = Integer.parseInt(str[j]);
				if (e == -1)
					break;
				int value = Integer.parseInt(str[j + 1]);
				graph[Integer.parseInt(str[0])].add(new Edge(e, value));
				j = j + 2;
			}
		} // for문 종료
		visited = new boolean[N + 1];
		distance = new int[N + 1];
		BFS(1);
		int max = 1;
		for (int i = 2; i <= N; i++) {
			if (distance[max] < distance[i]) {
				max = i;
			}
		}

		visited = new boolean[N + 1];
		distance = new int[N + 1];
		BFS(max);

		Arrays.sort(distance);

		System.out.println(distance[N]);

	}

	static void BFS(int start) {
		
		Queue<Integer> queue = new ArrayDeque<>();
		queue.offer(start);
		visited[start] = true;
		
		while(!queue.isEmpty()) {
			int now = queue.poll();
			
			for(Edge next : graph[now]) {
				if(visited[next.e])continue;
				visited[next.e] = true;
				distance[next.e] = distance[now] + next.value; 
				queue.offer(next.e);
			}
		}
	}

}

class Edge {
	int e;
	int value;

	Edge(int e, int value) {
		this.e = e;
		this.value = value;
	}
}
