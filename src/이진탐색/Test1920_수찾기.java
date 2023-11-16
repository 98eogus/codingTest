package 이진탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Test1920_수찾기 {
	
	static void find(int arr[], int num) {
		  int start = 0;
		  int end = arr.length-1;
		  boolean find = false;
		
		  while(start<=end) {
			  int mid = (start+end)/2;
			  
			  if(arr[mid]>num) {
				  end = mid-1;
			  }
			  else if(arr[mid]<num){
				  start = mid+1;			  
			  }
			  else if(arr[mid] == num) {
				  find = true;
				  break;
			  }

		  }//while문 종료
		  
		  if(find)
			  System.out.println(1);
		  else
			  System.out.println(0);
		
	}

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String str[] = br.readLine().split(" ");
		int arr[] = new int[N];
		for(int i = 0; i<N; i++) {
			arr[i] = Integer.parseInt(str[i]);
		}
		
		Arrays.sort(arr);
		
		int M = Integer.parseInt(br.readLine());
		str = br.readLine().split(" ");
		
		for(int i = 0; i<M; i++) {
			find(arr, Integer.parseInt(str[i]));
		}
		
	

	}

}
