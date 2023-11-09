package 재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test6603_로또 {
	static int N;
	static int arr[];
	static boolean check[];
	static int result[];
	static StringBuffer bf;

	static void DFS(int cnt,int size) {
		
		if(size == 6) {
			bf = new StringBuffer();
			for(int i = 0; i<6; i++) {
				bf.append(result[i]+" ");
			}
			
			System.out.println(bf.toString());
			
			
			return;
		}
		
		for(int i = cnt++; i<N; i++) {
			if(check[i]) {
				continue;
			}
			check[i] = true;
			result[size] = arr[i];
			DFS(i, size+1);
			check[i] = false;
			
		}
		
		
		
		
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true)
		{
			String str[] = br.readLine().split(" ");
			if(str[0].equals("0"))break;
			
			N = Integer.parseInt(str[0]);
			arr = new int[N];
			check = new boolean[N];
			result = new int[6];
			for(int i = 0; i<N; i++) {
				arr[i] = Integer.parseInt(str[i+1]); 
			}
			
			DFS(0,0);
			System.out.println();

				
		}
	}

}
