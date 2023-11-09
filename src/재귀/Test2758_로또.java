package 재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test2758_로또 {
	static int N; //n개의 수
	static int M; //1~m까지의 숫자
	static int result;
	static int arr[];

	static void function(int size) {
		
		if(size == N) {
			result++;
			return;
		}
		
		for(int i = 1; i<=M; i++) {
			arr[size] = i;
			if(2*arr[size-1]>arr[size]) continue;
			function(size++);
			
		}
		
	}
	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		
			String str[] = br.readLine().split(" ");
			N = Integer.parseInt(str[0]);
			M = Integer.parseInt(str[1]);
			result = 0;
			arr = new int[N];
			arr[0] = 1;
			function(1);
			System.out.println(result);
		
	
	}

}
