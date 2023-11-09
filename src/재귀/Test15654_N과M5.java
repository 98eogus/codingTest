package 재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Test15654_N과M5 {
	static boolean isVisited[];
	static int N; //N개의 자연수
	static int M; //M개를 고른 수열
	static int num[];
	static int result[];
	static StringBuffer bf;
	
	static void function(int size) {
		if(size == M ) {
			bf= new StringBuffer();
			for(int i = 0; i<M; i++) {
				bf.append(result[i]+" ");
			}
			System.out.println(bf);
			return;
		}
		
		
		for(int i = 0; i<N; i++) {
			if(isVisited[i] == true)
				continue;
			isVisited[i] = true;
			result[size] = num[i];
			function(size+1);
			isVisited[i]  = false;
			
		}
		
		
			
	}
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		String str[] = br.readLine().split(" ");
		
		N = Integer.parseInt(str[0]);
		M = Integer.parseInt(str[1]);
		
		str = br.readLine().split(" ");
		
		isVisited = new boolean[N];
		num = new int[N];
		result = new int[M];
		
		for(int i = 0; i<N; i++) {
			num[i] = Integer.parseInt(str[i]);
		}
		
		Arrays.sort(num);
		
		function(0);
		
		
	}

}
