package DFS와BFS;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Test1697_숨바꼭질 {
	static int N;
	static int K;
	static int cnt;
	static Queue<Integer> queue;
	static boolean isVisited[];
	static int result[];
	static void BFS(int start) {
		queue.offer(start);
		
		isVisited[start] = true;
		result[start] = 0;
		while(!queue.isEmpty()) {
			int now = queue.poll();
			int next[] = {now+1,now-1,now*2};
			if(now == K)return;
			
			for(int i = 0; i<3; i++) {
				if(next[i]<0 || next[i]>100000)continue;
				if(isVisited[next[i]]) {
					continue;
				}
				isVisited[next[i]] = true;
				result[next[i]] = result[now]+1;
				queue.offer(next[i]);
			}
				
			
			
			
		}
		
		
	}
	public static void main(String[] args) {
	

		Scanner sc = new Scanner(System.in);
		
		N =sc.nextInt();
		K =sc.nextInt();
		queue = new ArrayDeque<>();
		isVisited = new boolean [100001];
		result = new int[100001];
		BFS(N);
		
		System.out.println(result[K]);
		
	}

}
