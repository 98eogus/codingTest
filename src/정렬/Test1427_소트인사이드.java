package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test1427_소트인사이드 { //선택정렬

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int arr[] = new int [str.length()];
		int N = arr.length;
		for(int i = 0; i<N; i++) {
			arr[i] = (str.charAt(i)-'0');
		}
		
		for(int i = 0; i<N; i++) {
			int max = i;
			for(int j = i+1; j<N; j++) {
				if(arr[max]<arr[j]) {
					max = j;
				}
			}
			if(arr[i]<arr[max]) {
				int temp = arr[i];
				arr[i] = arr[max];
				arr[max] = temp;
			}
		}
		
		for(int i = 0; i<N; i++) {
			System.out.print(arr[i]);			
		}
		
		
		
		
		
		
	
	}

}
