package 정렬;

import java.util.Arrays;
import java.util.Scanner;

public class Test2751_수정렬하기2 {
	public static void mergeSort(int[] arr, int[] tmp, int start, int end) {

		if (start >= end)
			return;

		int mid = (start + end) / 2;

		// 확장
		mergeSort(arr, tmp, start, mid);
		mergeSort(arr, tmp, mid+1, end);

		// 병합
		int left = start; // 왼쪽부분 포인터
		int right = mid+1; // 오른쪽부분 포인터

		int index = start;

		while (left <= mid && right<=end) {

			// 오른쪽 포인터가 가르키는 값이 더 작은 경우
			if (arr[left] >= arr[right]) {
				tmp[index] = arr[right];
				right++;
			}
			// 왼쪽 포인터가 가르키는 값이 더 작은 경우
			else if (arr[left] < arr[right]) {
				tmp[index] = arr[left];
				left++;
			}
			
			index++;
			
		}
		
		while(index<=end) {
			
			// 왼쪽 배열을 전부 사용한 경우
			if (left > mid) {
				tmp[index] = arr[right];
				right++;
			}
			
			// 오른쪽 배열을 전부 사용한 경우
			else if (right > end) {
				tmp[index] = arr[left];
				left++;
			}
			
			index++;
			
		}


		
		
		for(int i = start; i <=end; i++)
			arr[i] = tmp[i];
		
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int arr[] = new int[N];
		int tmp[] = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}

		mergeSort(arr, tmp, 0, arr.length - 1);

		StringBuffer bf = new StringBuffer();
		for (int i = 0; i < N; i++) {
			bf.append(arr[i]+"\n");
		}
		
		System.out.println(bf.toString());
	}

}