package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Test11399_ATM {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		String str[]= br.readLine().split(" ");
		
		Integer arr[] = new Integer[N];
		int sum[] = new int[N+1];
		
		for(int i = 0; i<N; i++) {
			arr[i] = Integer.parseInt(str[i]);
		}
		
		Arrays.sort(arr);
		//오름차순 
		
		//Arrays.sort(arr,Collections.reverseOrder()); 
		//내림차순 - arr을 Integer로 변경해야 함	
		
		for(int i = 0; i<N; i++) {
			sum[i+1] = sum[i] + arr[i];
		}
		int answer = 0;
		
		for(int i = 1; i<=N; i++) {
			answer += sum[i];
		}
		
		System.out.println(answer);

	}

}
