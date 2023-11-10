package 투포인터;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Test1940_주몽 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		
		int arr[] = new int[N];
		
		int answer = 0;
		
		String str[] = br.readLine().split(" ");
		
		for(int i = 0; i<N; i++) {
		 arr[i]	 = Integer.parseInt(str[i]);
		}
		
		Arrays.sort(arr);
		
		int start = 0;
		int end = N-1;
		
		int sum = arr[start]+arr[end];

		while(start<end) {
			
			if(sum == M) {
				answer++;
				start++;
				end--;
				sum = arr[start] + arr[end];
			}
			else if(sum<M) {
				sum+=arr[start+1];
				sum-=arr[start];
				start++;
			}
			else if(sum>M) {
				sum+=arr[end-1];
				sum-=arr[end];
				end--;
			}
			
			
		} //while문 종료
		
		System.out.println(answer);
		
		
	}

}
