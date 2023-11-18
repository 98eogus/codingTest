package DFS와BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Test2573_빙산 {
	static int N,M;
	static int[][] earth;
	static boolean[][] visited;
	static int[] dr = {-1,1,0,0};
	static int[] dc = {0,0,-1,1};
	static List<Ice> iceList;

	
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str[] = br.readLine().split(" ");

		N = Integer.parseInt(str[0]);
		M = Integer.parseInt(str[1]);
		earth = new int[N][M];
		visited = new boolean[N][M];
		iceList = new ArrayList<>();
	
		
		for(int i = 0; i<N; i++) {
			str= br.readLine().split(" ");
			
			for(int j= 0; j<M; j++) {
				earth[i][j] = Integer.parseInt(str[j]);
				if(earth[i][j] > 0) iceList.add(new Ice (i,j,earth[i][j]));
				visited[i][j] = true;
			}
			
		}
		//시간 흐를때마다 빙산 녹이기
		for(int year = 1; !iceList.isEmpty(); year++) {
			for(Ice ice : iceList ) {
				for(int j = 0; j<4; j++) {
					int nr = ice.row + dr[j];
					int nc = ice.col + dc[j];
					if(earth[nr][nc] == 0)ice.height--;
				}
			}
			
			
			//녹은 빙산들의 높이를 한번에 갱신
			for(int i = 0; i<iceList.size(); i++) {
				Ice ice = iceList.get(i);
				if(ice.height <= 0) {
					earth[ice.row][ice.col] = 0;
					iceList.set(i, iceList.get(iceList.size()-1));
					iceList.remove(iceList.size()-1);
					i--;
				}
				//빙산이 남아있다면 연결되어 있는지 탐색하도록 세팅
				else {
					visited[ice.row][ice.col] = false;
				}
			}
			
			int firstR = iceList.get(0).row;
			int firstC = iceList.get(0).col;
			if(iceList.size() > 0 && dfs(iceList.get(0).row, iceList.get(0).col) != iceList.size()) {
				System.out.println(year);
				System.exit(0);
			}
		} //for문 종료
		System.out.println(0);
		
	}
	
	static int dfs(int r, int c) {
		visited[r][c] = true;
		int cnt = 1;
		for(int i = 0; i<4; i++) {
			int nr = r+ dr[i];
			int nc = c + dc[i];
			if(visited[nr][nc])continue;
			cnt += dfs(nr, nc);
		}
		return cnt;
		
	}
	
	
}


class Ice{
	int row;
	int col;
	int height;
	
	public Ice(int r, int c, int h) {
		this.row =r;
		this.col = c;
		this.height = h;
	}
	
}
