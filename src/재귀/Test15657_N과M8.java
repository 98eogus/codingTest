package 재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Test15657_N과M8 {
	
	static int N,M;
	static int arr[];
	static int result[];
	static boolean isVisited[];
	static StringBuffer bf;
	static void DFS(int size,int cnt) {
		if(size == M) {			
			bf = new StringBuffer();
			for(int i =0; i<M; i++) {
				bf.append(result[i]+" ");
			}
			System.out.println(bf.toString());
			return;
		}
		
		
		for(int i = cnt; i<N; i++) {
			
			result[size] = arr[i];
			DFS(size+1,i);
			cnt++;
		}
		
		
	}

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str[] = br.readLine().split(" ");
		
		N = Integer.parseInt(str[0]);
		M = Integer.parseInt(str[1]);
		str = br.readLine().split(" ");
		
		arr = new int[N];
		isVisited = new boolean[N];
		result = new int[M];
		
		for(int i = 0; i<N; i++) {
			arr[i] = Integer.parseInt(str[i]);
		}
		Arrays.sort(arr);
		
		
		DFS(0,0);
		
		
		
		

	}

}
