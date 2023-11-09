package DFS와BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class Test2178_미로탐색 {
	static int N; //행
	static int M; //열
	static int result[][];
	static boolean isVisited[][];
	static Queue<int[]> queue;
	static int graph[][];
	static void BFS(int x , int y) {
		
		queue.offer(new int[] {x,y});
		result[x][y] = 1;
		isVisited[x][y] = true;
		int dx[] = {1,0,-1,0};
		int dy[] = {0,1,0,-1};
		
		while(!queue.isEmpty()) {
			int nowNode[] = queue.poll();
			int nowN = nowNode[0];
			int nowM = nowNode[1];
			if(nowN == N-1 && nowM == M-1) {
				break;
			}
			
			for(int i = 0; i<4; i++) {
				int nextN = nowN + dx[i];
				int nextM = nowM + dy[i];
				
				if(nextN >N-1 || nextN <0 || nextM >M-1 ||nextM<0 ) continue;
				if(isVisited[nextN][nextM]) continue;
				if(graph[nextN][nextM] == 0) continue;
				
				isVisited[nextN][nextM] = true;
				result[nextN][nextM] = result[nowN][nowM]+1;
				queue.offer(new int[]{nextN,nextM});
			}
			
			
			
			
		}
		
	}
	
	
	
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str[] = br.readLine().split(" ");
		N = Integer.parseInt(str[0]);
		M = Integer.parseInt(str[1]);

		
		graph= new int[N][M];
		result = new int[N][M];
		isVisited = new boolean[N][M];
		
		for(int i = 0; i<N; i++) {
			str = br.readLine().split("");
			for(int j = 0; j<M; j++)
			{
				graph[i][j] = Integer.parseInt(str[j]);
			}
		}
		queue = new ArrayDeque<>();
		
		BFS(0,0);
		
		System.out.println(result[N-1][M-1]);
		
		
		
	}

}
