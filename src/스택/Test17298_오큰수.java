package 스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Test17298_오큰수 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String str[] = br.readLine().split(" ");
		
		int answer[] = new int[N];
		int arr[] = new int[N];
		for(int i = 0; i<N; i++) {
			arr[i] = Integer.parseInt(str[i]);	
		}
		Stack<Integer> stack = new Stack<>();
		stack.push(0);
		
		for(int i = 1; i<N; i++) {
			if(arr[i]>arr[stack.peek()]) {
				while(!stack.isEmpty() && (arr[stack.peek()]<arr[i])) {
					answer[stack.pop()] = arr[i];
					
				}
				stack.push(i);
			}
			else
				stack.push(i);
			
			
		}// for문 종료
		
		while(!stack.isEmpty()) {
			answer[stack.pop()] = -1;
		}

		StringBuffer bf = new StringBuffer();
		for(int i = 0; i<N; i++) {
			bf.append(answer[i]+" ");
		}
		
		System.out.println(bf.toString());
		
	}

}
