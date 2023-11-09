package 큐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class Test1158_요새푸스문제 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer bf = new StringBuffer();
		
		String str[] = br.readLine().split(" ");
		int N = Integer.parseInt(str[0]);
		int K = Integer.parseInt(str[1]);
		
		Queue<Integer> q = new ArrayDeque<>();
		
		
		bf.append("<");
		
		for(int i = 1; i<=N; i++) {
			q.offer(i);
		}
		
		while(q.size() !=1) {
			
			for(int i = 0; i<K-1; i++) {
				q.offer( q.poll());
			}
			bf.append(q.poll() + ", ");
			
		}
		bf.append(q.poll() + ">");
		
		System.out.println(bf.toString());
	}

}
