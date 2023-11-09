package DFS와BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test11724_연결요소의개수 {
	static int N;
	static int M;
	static List<Integer>[] graph;
	static int result;
	static boolean isVisited[];
	
	static void DFS(int start) {
		if(isVisited[start])return;
		isVisited[start] = true;
		
		for(int next : graph[start]) {	
			DFS(next);
		}
	}

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str[] = br.readLine().split(" ");
		
		int N = Integer.parseInt(str[0]);
		int M = Integer.parseInt(str[1]);
		
		graph = new ArrayList[N+1];
		isVisited = new boolean[N+1];
		
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
		for(int i = 1; i<=N; i++) {
			if(isVisited[i])continue;
			DFS(i);
			result++;
		}
		
		System.out.println(result);
		
		
		
		
		

	}

}
