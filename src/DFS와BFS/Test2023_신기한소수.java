package DFS와BFS;

import java.util.Scanner;

public class Test2023_신기한소수 {

	static int N;
	static String start[] = {"2","3","5","7"};
	static boolean isVisited[];
	
	static boolean check(int num) {
	
		for(int i = 2; i<num; i++) {
			if(num%i == 0)
				return false;
		}
	
		return true;
	}

	static void DFS(String nowNum) {
	
		if(nowNum.length() == N) {
			
				System.out.println(nowNum);				
			
			return;
		}
			
	
		
		for(int i = 1; i<=9; i= i+2) {
			String nextNum = nowNum+i;
			if(check(Integer.parseInt(nextNum))) {
				DFS(nextNum);				
			}
			 
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		
		isVisited = new boolean[N];

		for(int i = 0; i<start.length; i++) {
			DFS(start[i]);			
		}
		
	}

}
