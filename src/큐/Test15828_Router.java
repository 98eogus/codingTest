package 큐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class Test15828_Router {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Queue<Integer> q  = new ArrayDeque<>();
		int N = Integer.parseInt(br.readLine()); //라우터 크기
		
		while(true) {
			int cmd = Integer.parseInt(br.readLine());
			if(cmd >0) {
				if(q.size() == N) {
					continue;
				}
				q.offer(cmd);
			}
			else if(cmd == 0) {
				q.poll();
			}
			else if(cmd == -1) {
				break;
			}
		
		}//while문 종료
		
		if(q.isEmpty()) {
			System.out.println("empty");
		}
		else {
			while(!q.isEmpty()) {
				System.out.print(q.poll() + " ");
			}
		}
		
		
		
		
	}

}
