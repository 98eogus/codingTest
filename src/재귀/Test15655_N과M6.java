package 재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Test15655_N과M6 {
	
	static int N ; //N개의 자연수
	static int M; //M개를 고른 수열
	static StringBuffer bf;
	static int result[];
	static boolean isVisited[];
	static int arr[];
	
	static void function(int cnt, int size) {
		
		
		if(size == M) {
			bf = new StringBuffer();
			for(int i = 0; i<result.length; i++) {
				bf.append(result[i]+" ");
			}
			System.out.println(bf.toString());
			return;
		}
		
		for(int i = cnt; i<N; i++) {
			if(isVisited[i]==true) {
				continue;
			}
			
			isVisited[i] = true;
			result[size] = arr[i];
			function(i,size+1);
			isVisited[i] = false;
			cnt++;
		}
		
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str[] = br.readLine().split(" ");
		
		N = Integer.parseInt(str[0]);
		M = Integer.parseInt(str[1]);
		result = new int[M];
		arr = new int[N];
		isVisited = new boolean[N];
		str = br.readLine().split(" ");
		
		for(int i = 0; i<str.length; i++) {
			arr[i] = Integer.parseInt(str[i]);
		}
		
		Arrays.sort(arr);
		
		function(0,0);
		
		
	}

}
