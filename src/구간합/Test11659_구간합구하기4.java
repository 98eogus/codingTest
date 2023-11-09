package 구간합;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test11659_구간합구하기4 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str[] = br.readLine().split(" ");
		
		int N = Integer.parseInt(str[0]);
		int M = Integer.parseInt(str[1]);
		
		int arr[] = new int[N];
		int sum[] = new int[N+1];
		
		str = br.readLine().split(" ");
		
		for(int i = 0; i<N; i++) {
			arr[i] = Integer.parseInt(str[i]);
		}
		
		sum[0] = 0;
		
		for(int i = 0; i<N; i++) {
			sum[i+1] = sum[i]+arr[i]; 
		}
		
		for(int i = 0; i<M; i++) {
			str = br.readLine().split(" ");
			int start = Integer.parseInt(str[0]);
			int end = Integer.parseInt(str[1]);
			int answer = sum[end]-sum[start-1];
			System.out.println(answer);
		}
		
		
		
		
		
		
		
		
		
	}

}
