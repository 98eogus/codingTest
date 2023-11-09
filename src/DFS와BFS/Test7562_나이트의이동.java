package DFS와BFS;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Test7562_나이트의이동 {
	
	static Queue<int[]> queue;
	static int N;
	static int l;
	static int X,Y;
	static int resultX,resultY;
	static int graph[][];
	static int time[][];
	static boolean isVisited[][];
	
	static void BFS(int x, int y) {
		queue = new ArrayDeque<>();
		queue.offer(new int[] {x,y});
		time[x][y] = 0;
		isVisited[x][y] = true;
		int dr[] = {-2,-1,1,2,2,1,-1,-2};
		int dc[] = {1,2,2,1,-1,-2,-2,-1};
		
		while(!queue.isEmpty()) {
			int now[] = queue.poll();
			int nowX = now[0];
			int nowY = now[1];
			
			if(nowX == resultX && nowY == resultY) {
				return;
			}
			
			for(int i = 0; i<8; i++) {
				int nextX = nowX + dr[i];
				int nextY = nowY + dc[i];
				
				if(nextX<0 || nextX>l-1 || nextY<0 || nextY>l-1) continue;
				if(isVisited[nextX][nextY]) continue;
				isVisited[nextX][nextY] = true;
				time[nextX][nextY] = time[nowX][nowY]+1;
				
				queue.offer(new int[]{nextX,nextY});
				
			}
			
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		
		for(int i = 0; i<N; i++) {
			l = sc.nextInt();
			X = sc.nextInt();
			Y = sc.nextInt();
			resultX = sc.nextInt();
			resultY = sc.nextInt();
			
			graph = new int [l][l];
			isVisited= new boolean[l][l];
			time = new int[l][l];
			BFS(X,Y);
			
			System.out.println(time[resultX][resultY]);
			
		}
		
	}

}
 