package 트리;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Test11725_트리의부모찾기 {
	static boolean isVisited[];
	static int result[];
	static int N;
	static List<Integer>[] tree;
	static void function(int nowNode) {
		
		isVisited[nowNode] = true;
		
		for(int nextNode : tree[nowNode]) {
			if(isVisited[nextNode]) {
				continue;
			}
			
			isVisited[nextNode] = true;
			
			result[nextNode] = nowNode;	
			function(nextNode);
			
		}
		
		
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		
	
		tree = new ArrayList[N+1];
		
		isVisited = new boolean[N+1];
		result = new int[N+1];
		for(int i = 1; i<N+1; i++) {
			tree[i] = new ArrayList<>();
		}
			
		for(int i = 0; i<N-1; i++) {
			String str[] = br.readLine().split(" ");
			
			int u = Integer.parseInt(str[0]);
			int v = Integer.parseInt(str[1]);
			
			tree[u].add(v);
			tree[v].add(u);
			
		}
		
		function(1);
		
		for(int i = 2; i<N+1; i++) {
			System.out.println(result[i]);
		}
		
		
	}

}
