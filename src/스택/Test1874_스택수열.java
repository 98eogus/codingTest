package 스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Test1874_스택수열 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
	
	        Stack<Integer> stack = new Stack<>();
	        
	       
	        StringBuffer bf = new StringBuffer();
	        int index = 1;
	        for(int j = 0; j<n; j++) {
	        	int next = Integer.parseInt(br.readLine());
	        	
	        	if(stack.isEmpty()) {
	        		for(int i =index; i<=next; i++) {
	        			stack.push(i);
	        			bf.append("+\n");
	        			index++;
	        		}
	        		stack.pop();
	        		bf.append("-\n");
	        	
	        	} 
	       
	        	
	        	else if(stack.peek()<next) {
	        		for(int i =index; i<=next; i++) {
	        			stack.push(i);
	        			bf.append("+\n");
	        			index++;
	        		}
	        		stack.pop();
	        		bf.append("-\n");
	        	} 
	        	else if(next == stack.peek()){
	               	stack.pop();
	               	bf.append("-\n");
	               }
	        	
	        	else {
	        		System.out.println("NO");
	        		return;
	        	}
	        	
	        }//for문 종료
	        
	       
	        System.out.println(bf.toString());	
		
		
	}

}
