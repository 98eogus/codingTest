package 정렬;

import java.util.Scanner;

public class Test2750_수정렬하기 { //버블정렬

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int arr[] = new int[N];
		
		for(int i = 0; i<N; i++) {
			arr[i] = sc.nextInt();
			}
		
		for(int i = 0; i<N-1; i++) {
			for(int j = i+1; j<N; j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}//for문 종료
		for(int i =0; i<N; i++) {
			System.out.println(arr[i]);			
		}
	}

}
