package 재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Test1759_암호만들기 {
	static int L,C;
	static boolean isVisited[];
	static String result[];
	static StringBuffer bf;
	static String str[];
	
	static boolean check(String code) {
		
		int a = 0; //모음
		
		for(int i = 0; i<code.length(); i++) {
			
			if(code.charAt(i) == 'a') {
				a++;
			}
			if(code.charAt(i) == 'e') {
				a++;
			}
			if(code.charAt(i) == 'i') {
				a++;
			}
			if(code.charAt(i) == 'o') {
				a++;
			}
			if(code.charAt(i) == 'u') {
				a++;
			}
			
		}//for문 종료
		int b = L-a; //자음
		if(b>=2 && a>=1) return true;
		else
			return false;
		
	}
	
	
	static void DFS(int size,int cnt) {
		if(size == L) {
			bf = new StringBuffer();
			
			for(int i = 0; i<L; i++) {
				bf.append(result[i]);
			}
			if(check(bf.toString())) {
				System.out.println(bf.toString());				
			}
			return;
		}
		
		for(int i = cnt; i<C; i++) {
			if(isVisited[i]) continue;
			isVisited[i] = true;
			
			result[size] = str[i];
			DFS(size+1,i);
			isVisited[i] = false;
			cnt++;
			
		}
		
		
		
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		str= br.readLine().split(" ");
		
		L = Integer.parseInt(str[0]);
		C = Integer.parseInt(str[1]);
		
		str = br.readLine().split(" ");
		isVisited = new boolean[C];
		result = new String[L];
		
		Arrays.sort(str);
	
		DFS(0,0);
		
	}

}
