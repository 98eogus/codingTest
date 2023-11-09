package 스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Test4949_균형잡힌세상 {

	static Stack<Character> stack;

	public static boolean check(char value) {
		if (stack.isEmpty())
			return false;
		if (stack.peek() == '(' && value == ')')
			return true;
		if (stack.peek() == '[' && value == ']')
			return true;
		return false;
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = "";

		while (true) {
			stack = new Stack<>();
			boolean flag = true;
			str = br.readLine();
			if (str.equals("."))
				break;
			char arr[] = str.toCharArray();

			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == '(' || arr[i] == '[') {
					stack.push(arr[i]);
				} else if (arr[i] == ')' || arr[i] == ']') {
					if (check(arr[i])) {
						stack.pop();
					} else {
						flag = false;
						break;
					}
				}
			} // for문 종료

			if (!stack.isEmpty()) {
				flag = false;
			}

			if (flag == true) {
				System.out.println("yes");
			} else
				System.out.println("no");
		} // while문 종료

	}

}
