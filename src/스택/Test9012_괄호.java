package 스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Test9012_괄호 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			boolean flag = true;
			Stack<Character> stack = new Stack<>();
			
			char[] cmd= br.readLine().toCharArray();
			
			
			for(char ch : cmd) {
				if(ch == '(') {
					stack.push('(');
				}
				else if(ch == ')') {
					if(stack.isEmpty()) {
						flag = false;
						break;
					}
					stack.pop();
				}
				
				
			}//for문 종료
			
			if(!stack.isEmpty()) flag = false;
			
			
			if(flag == true) {
				System.out.println("YES");
			}else
				System.out.println("NO");
			
			flag = true;
		} //while문 종료
		
		
	}

}
