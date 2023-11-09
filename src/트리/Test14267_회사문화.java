package 트리;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Test14267_회사문화 {
	static int n; //회사 직원수 n명
	static int m; //최초의 칭찬 횟수 m
	static List<Integer>[] tree;
	
	static boolean check[];
	static int result[];
	
	static void getSum(int nowNode) {
		check[nowNode] = true;
		
		
		for(int nextNode : tree[nowNode]) {
			
			result[nextNode] += result[nowNode];
		
			getSum(nextNode);
			
		}
			
	}
	public static void main(String[] args)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str[] = br.readLine().split(" ");
		n = Integer.parseInt(str[0]); 
		m = Integer.parseInt(str[1]);
		
		tree = new ArrayList[n+1];
		check = new boolean[n+1];
		result = new int[n+1];
		
		for(int i = 0; i<n+1; i++) {
			tree[i] = new ArrayList<>();
		}
		
		str = br.readLine().split(" ");
		
		for(int i =0; i<n; i++) {
			if(Integer.parseInt(str[i])==-1)continue;
			tree[Integer.parseInt(str[i])].add(i+1);
		}
		
		for(int i =0; i<m; i++) {
			str = br.readLine().split(" ");
			
			int man = Integer.parseInt(str[0]);
			int w = Integer.parseInt(str[1]);
			
			result[man] = w;
		}
	
		getSum(1);
		
		
		for(int i = 1; i<=n; i++) {
			System.out.print(result[i]+" ");
		}
		
		
		
	}

}
