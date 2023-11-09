package DFS와BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class Test7576_토마토 {
	static Queue<int[]> queue;
	static int time[][];
	static int N,M;
	static int board[][];
	
	static void BFS() {
		int dx[] = {1,0,-1,0};
		int dy[] = {0,1,0,-1};
		
		while(!queue.isEmpty()) {
			int nowNode[] = queue.poll();
			int nowN = nowNode[0];
			int nowM = nowNode[1];
		
			for(int i = 0; i<4; i++) {
				int nextN = nowN+dx[i];
				int nextM = nowM+dy[i];
				
				if(nextN <0 || nextN >N-1 || nextM <0 || nextM>M-1)continue;
				if(board[nextN][nextM] != 0)continue;
				if(time[nextN][nextM]>0)continue;
				
				time[nextN][nextM] = time[nowN][nowM]+1;
				queue.offer(new int[] {nextN,nextM});	
					
			}
		} //while문 종료
		
		
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str[] = br.readLine().split(" ");
		
		N = Integer.parseInt(str[1]);
		M = Integer.parseInt(str[0]);
		
		board = new int[N][M];
		time = new int[N][M];
		queue = new ArrayDeque<>();
		
		for(int i = 0; i<N; i++) {
			str = br.readLine().split(" ");
			for(int j = 0; j<M; j++) {
				board[i][j] = Integer.parseInt(str[j]);
				if(board[i][j]==1) {
					queue.offer(new int[] {i,j});
				}
			}
		}
		
		BFS();
		
		int max = 0;
		boolean answer = true;
		for(int i = 0; i<N; i++) {
			for(int j = 0; j<M; j++) {
				if(time[i][j]==0 && board[i][j]==0) {
					answer = false;
				}
				if(time[i][j]>max) {
					max = time[i][j];
				}
			}
		}
		
		if(answer) {
			System.out.println(max);			
		}
		else
			System.out.println(-1);
		
		
	}

}
