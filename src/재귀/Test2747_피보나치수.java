package 재귀;

import java.util.Scanner;

public class Test2747_피보나치수 {
	static int n; // n번째 피보나치 수
	
	static void sum(int first, int second,int cnt) {
		if(cnt == n) {
			System.out.println(second);
			return;
		}
		int next =first+second;
		cnt++;
		sum(second,next,cnt);
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		sum(0,1,1);
		

	}

}
