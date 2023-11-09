package 트리;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Test15681_트리와쿼리 {
	static int N; // 트리의 정점의 수 N
	static int R; // 루트의 번호 R
	static int Q; // 쿼리의 수 Q
	static int U; // 정점 U
	static List<Integer>[] tree;
	static boolean isVisited[];
	static int sum[];
	
	static int getSum(int nowNode) {
		
		isVisited[nowNode] = true;
		
		int result = 1;
		
		for(int nextNode : tree[nowNode]) {
			if(isVisited[nextNode]) {
				continue;
			}
			
			result = result+getSum(nextNode);
		}
		
		sum[nowNode] = result;
		
		return sum[nowNode];
	}
	
	
	public static void main(String[] args )throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str[] = br.readLine().split(" ");
		
		N = Integer.parseInt(str[0]);
		R = Integer.parseInt(str[1]);
		Q = Integer.parseInt(str[2]);
		
		tree = new ArrayList[N+1];
		isVisited = new boolean[N+1];
		sum = new int[N+1];
		for(int i = 0; i<N+1; i++) {
			tree[i] = new ArrayList<>();
		}
		
		for(int i = 0; i<N-1; i++) {
			str = br.readLine().split(" ");
			int u = Integer.parseInt(str[0]);
			int v = Integer.parseInt(str[1]);
			tree[u].add(v);
			tree[v].add(u);
		}
		
		
		getSum(R);
		
		for(int i = 0; i<Q; i++) {
			U= Integer.parseInt(br.readLine());
			System.out.println(sum[U]);
		}
	
	
		
	}

}
