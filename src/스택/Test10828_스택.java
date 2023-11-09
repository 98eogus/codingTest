package 스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
public class Test10828_스택 {

	public static void main(String[] args)throws IOException {
		
			Stack<Integer> stack = new Stack<>();
			int lastValue = -1;
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringBuffer bf = new StringBuffer();
			
			
			int N = Integer.parseInt(br.readLine());
			
			while(N --> 0) {
				String cmd[] = br.readLine().split(" ");
				if(cmd[0].equals("push")) {
					lastValue = (Integer.parseInt(cmd[1]));
					stack.push(lastValue);
				}
				else if(cmd[0].equals("pop")) {
					if(stack.isEmpty()) {
						bf.append("-1\n");
					}
					else
						bf.append(stack.pop()+"\n");
				} 
				else if(cmd[0].equals("size")) {
					bf.append(stack.size()+"\n");
				}
				else if(cmd[0].equals("empty")) {
					if(stack.isEmpty()) {
						bf.append("1\n");
					}else
						bf.append("0\n");
				}
				else if(cmd[0].equals("top")) {
					if(stack.isEmpty()) {
						bf.append("-1\n");
					}
					else
					bf.append(stack.peek() + "\n");
				}
				
			}
			
			System.out.println(bf.toString());
	    }
	}


