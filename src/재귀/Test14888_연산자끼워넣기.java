package 재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Test14888_연산자끼워넣기 {
	
	static int num[];
	static int max;
	static int min;
	static int N;
	static List<Character> list;
	static boolean isVisited[];
	
	public static void DFS(int r,int sum) {
		
		if(r == N) {

			
			
			if(sum>max) {
				max = sum;
			}
			if(sum< min) {
				min = sum;
			}
			
			
			return;
		}
		
		
		for(int i = 0; i<N-1; i++) {
			if(isVisited[i]) {
				continue;
			}
			isVisited[i] = true;
			
			if(list.get(i) == '+') {
				DFS(r+1,sum + num[r]);
			}
			if(list.get(i) == '-') {
				DFS(r+1,sum - num[r]);
			}
			if(list.get(i) == '*') {
				DFS(r+1,sum * num[r]);
			}
			if(list.get(i) == '/') {
				DFS(r+1,sum / num[r]);
			}
			
		
			isVisited[i] = false;
		}//for문 종료
		
		
	}
	
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		
		String str[] = br.readLine().split(" ");
		
		num = new int[N];
		for(int i = 0; i<N; i++) {
			num[i] = Integer.parseInt(str[i]); 			
		}
		list = new ArrayList<>();
		isVisited = new boolean[N-1];
		str = br.readLine().split(" ");
		max = -1000000000;
		min = 1000000000;
	
		for(int i = 0; i<4; i++) { //list에 사칙연산 추가
			int cnt = Integer.parseInt(str[i]);
			for(int j= 0; j<cnt; j++) {
				if(i == 0) {
					list.add('+');
				}
				if(i == 1) {
					list.add('-');
				}
				if(i == 2) {
					list.add('*');
				}
				if(i == 3) {
					list.add('/');
				}
			}
		}
		
		DFS(1,num[0]);
		
		System.out.println(max);
		System.out.println(min);
		
	}
}
