package 재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test1182_부분수열의합 {
	static int result;
	static int N;
	static int S;
	static int arr[];
	static void getSum(int r,int sum) {
		if(r==arr.length) return;
		
		if(sum+arr[r] == S) result++;
		
		getSum(r+1,sum);
		getSum(r+1,sum+arr[r]);
		
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str[] = br.readLine().split(" ");
		N = Integer.parseInt(str[0]);
		S = Integer.parseInt(str[1]);
		str = br.readLine().split(" ");
		arr = new int[N];
		for(int i = 0; i<N; i++) {
			arr[i] = Integer.parseInt(str[i]);
		}
		getSum(0,0);
		System.out.println(result);
		
		
		
		
	}

}
