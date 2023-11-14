package 투포인터;

import java.util.Scanner;

public class Test2018_수들의합5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int N = sc.nextInt();
		int arr[] = new int[N+1];
		int answer =0;
		
		for(int i = 1; i<=N; i++) {
			arr[i] = i;
		}
	
		int start = 1;
		int end = 2;
		
		int sum = arr[start];
		
		while(end<=N) {	
			
			if(sum == N) {
				answer++;
				sum += arr[end];
				end++;
			}
			else if(sum<N) {
				sum += arr[end];
				end++;
			}
			else if(sum>N) {
				sum -= arr[start];
				start++;
			}
				
		}
		
		System.out.println(answer+1);
		
		
	}

}
