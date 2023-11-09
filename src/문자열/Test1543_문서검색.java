package 문자열;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test1543_문서검색 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str= sc.nextLine();
		String word = sc.nextLine();
		
		int answer = 0;
		int start = 0;
		
		String replaced = str.replaceAll(word, "");
	
		answer =(str.length()- replaced.length()) / word.length();
		
		System.out.println(answer);
		
	}

}
