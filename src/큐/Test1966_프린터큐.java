package 큐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class Test1966_프린터큐 {
	
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int tc = Integer.parseInt(br.readLine());
		
		for(int i =0; i<tc; i++) {
			Queue<int[]> queue = new ArrayDeque<>();
			
			String str[] = br.readLine().split(" ");
			
			int N = Integer.parseInt(str[0]); //문서 개수
			int M = Integer.parseInt(str[1]); //찾으려는 문서
			
			str = br.readLine().split(" ");
			
			for(int j = 0; j<N; j++) {
				queue.offer(new int[] {Integer.parseInt(str[i])} );
			}
			
			
			
			
			
		}

	}

}
