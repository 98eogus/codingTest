package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Test11399_ATM { //퀵정렬
	static void swap(int arr[], int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	static void quickSort(int arr[], int start, int end) {
		if(start>=end) return;
		
		int pivot = partition(arr,start,end);
		
		quickSort(arr,start,pivot-1);
		quickSort(arr,pivot+1,end);
	}
	
	static int partition(int arr[],int start, int end) {
		
		int pivot = start;
		int left = start+1;
		int right = end;
		
		while(left <=right) {
			while(left<=right && arr[left]<=arr[pivot]) {
				left++;
			}
			while(left<=right && arr[right]>=arr[pivot]) {
				right--;
			}
			
			if(left<=right) {
				swap(arr,left,right);
			}
			else{
				swap(arr,right,pivot);
			}
			
			
		} //while문 종료
		
		
		return right;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		String str[] = br.readLine().split(" ");

		int arr[] = new int[N];
		int sum[] = new int[N + 1];

		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(str[i]);
		}

		quickSort(arr, 0, arr.length - 1);

		for (int i = 0; i < N; i++) {
			sum[i + 1] = sum[i] + arr[i];
		}
		int answer = 0;

		for (int i = 1; i <= N; i++) {
			answer += sum[i];
		}

		System.out.println(answer);

	}

}
