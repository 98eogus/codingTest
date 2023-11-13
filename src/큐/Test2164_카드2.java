package 큐;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Test2164_카드2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		Queue<Integer> queue = new ArrayDeque<>();
		
		for(int i = 1; i<=N; i++) {
			queue.offer(i);
		}
		
		while(queue.size()>1) {
			
			 queue.poll();
			queue.offer(queue.poll());
		}
		
		System.out.println(queue.poll());

	}

}
