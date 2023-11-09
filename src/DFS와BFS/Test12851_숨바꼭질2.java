package DFS와BFS;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Test12851_숨바꼭질2 {
	static int N;
	static int K;
	static int cnt[];
	static Queue<Integer> queue;
	static boolean isVisited[];
	static int time[];
	static void BFS(int start) {
		
		queue.offer(start);
		isVisited[start] = true;
		time[start] = 0;
		cnt[start] = 1;
		while(!queue.isEmpty()) {
			
			int now = queue.poll();
			if(now == K)return;
			int next[] = {now+1,now-1,now*2};
			
			for(int i = 0; i<3; i++) {
                if(next[i]<0 || next[i]>100000)continue;
               
				if(isVisited[next[i]]==true) {
					if(time[next[i]] == time[now]+1) {
						cnt[next[i]] = cnt[next[i]] + cnt[now];						
					}
					continue;
				}
				else if(isVisited[next[i]]==false) {
					isVisited[next[i]] = true;
					time[next[i]] = time[now]+1;
					queue.offer(next[i]);
					cnt[next[i]] = cnt[now];						
					
				}
				
			}
			
		
		}
		
		
	}
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		N =sc.nextInt();
		K =sc.nextInt();
		queue = new ArrayDeque<>();
		isVisited = new boolean [100001];
		time = new int[100001];
		cnt = new int[100001];
		BFS(N);
		
		System.out.println(time[K]);
		System.out.println(cnt[K]);
	}

}
