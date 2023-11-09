package DFS와BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test2606_바이러스 {

	static int N;
	static int M;
	static boolean isVisited[];
	static List<Integer>[] graph;
	static int result;
	
	static void DFS(int start) {
		
		if(isVisited[start])return;
		isVisited[start] = true;
		result++;
		
		for(int next : graph[start]) {
			DFS(next);
		}
		
		
	}
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		M = Integer.parseInt(br.readLine());
		isVisited = new boolean[N+1];
		graph = new ArrayList[N+1];
		for(int i = 0; i<N+1; i++) {
			graph[i] = new ArrayList<>();
		}
		
		for(int i = 0; i<M; i++) {
			String str[] = br.readLine().split(" ");
			int u = Integer.parseInt(str[0]);
			int v = Integer.parseInt(str[1]);
			graph[u].add(v);
			graph[v].add(u);
		}
		for(int i = 0; i<N+1; i++) {
			Collections.sort(graph[i]);
		}
		
		DFS(1);
		
		
		System.out.println(result-1);
		
		
	}

}
