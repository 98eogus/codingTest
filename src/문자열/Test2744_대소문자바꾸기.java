package 문자열;

import java.util.Scanner;

public class Test2744_대소문자바꾸기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		String upperStr = str.toUpperCase();
		String lowerStr = str.toLowerCase();
		String answer = "";
		
		for(int i = 0; i<str.length(); i++) {
			if(str.charAt(i) == upperStr.charAt(i)) {
				answer = answer + lowerStr.charAt(i);
			}
			else
				answer = answer + upperStr.charAt(i);
				
		}
		
		System.out.println(answer);
	}

}
