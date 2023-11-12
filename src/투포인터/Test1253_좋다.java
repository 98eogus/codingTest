package 투포인터;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Test1253_좋다 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		String str[] = br.readLine().split(" ");
		
		int arr[] = new int[N];
		
		int answer = 0;
		
		for(int i = 0; i<N; i++) {
			arr[i] = Integer.parseInt(str[i]);
		}
		
		
		
		Arrays.sort(arr);
		
		for(int i = 0; i<N; i++) {
			
			int start= 0;
			int end = N-1;
			
			while(start<end) {
				
				if(arr[start]+arr[end] == arr[i]) {
					if((start != i) && (end != i)) {
						answer++;
						break;						
					}
					else if(start ==i) {
						start++;
					}
					else if(end == i) {
						end--;
					}
					
				}
				else if(arr[start]+arr[end]>arr[i]) {
					end--;
				}
				else if(arr[start]+arr[end] <arr[i]) {
					start++;
				}
			
				
			
				
		}
			
			
			
			
		}
		
		System.out.println(answer);
		
		
		
		
		
		
		
	}

}
