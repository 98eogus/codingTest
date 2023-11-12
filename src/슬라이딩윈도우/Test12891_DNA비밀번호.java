package 슬라이딩윈도우;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test12891_DNA비밀번호 {
	
	public static boolean check(int dnaNow[], int dnaRule[]) {
		for(int i = 0; i<4; i++) {
			if(dnaNow[i]<dnaRule[i]) {
				return false;
			}
		}
		return true;
	}
	

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String strs[] = bf.readLine().split(" ");
		int S = Integer.parseInt(strs[0]); // 임의 DNA문자열 길이
		int P = Integer.parseInt(strs[1]); // 사용할 부분문자열 길이
		char dna [] = bf.readLine().toCharArray(); //DNA문자열
		int dnaRule[] = new int[4]; //DNA 조건 ('A','C','G','T')
		
		
		strs = bf.readLine().split(" ");
		for(int i = 0; i<4; i++) {
			dnaRule[i]=Integer.parseInt(strs[i]);
		}
		
		int dnaNow[] = new int[4];
		int cnt = 0;
		
		for(int i = 0; i<P; i++) { //슬라이딩윈도우 초기화
			if(dna[i] == 'A') {
				dnaNow[0]++;
			}
			else if(dna[i] == 'C') {
				dnaNow[1]++;
			}
			else if(dna[i] == 'G') {
				dnaNow[2]++;
			}
			else if(dna[i] == 'T') {
				dnaNow[3]++;
			}
			
		} //for문 종료

		if(check(dnaNow, dnaRule)==true){
			cnt++;
		}
		
		for(int i=1; i<S-P+1; i++) {
			int remove = i-1;
			int add = P+i-1;
			
			if(dna[remove] == 'A') {
				dnaNow[0]--;
			}
			else if(dna[remove] == 'C') {
				dnaNow[1]--;
			}
			else if(dna[remove] == 'G') {
				dnaNow[2]--;
			}
			else if(dna[remove] == 'T') {
				dnaNow[3]--;
			}
			

			if(dna[add] == 'A') {
				dnaNow[0]++;
			}
			else if(dna[add] == 'C') {
				dnaNow[1]++;
			}
			else if(dna[add] == 'G') {
				dnaNow[2]++;
			}
			else if(dna[add] == 'T') {
				dnaNow[3]++;
			}
			

			if(check(dnaNow, dnaRule)==true){
				cnt++;
			}
			
		} // for문 종료
		
		
		
		
		System.out.println(cnt);
		
		
	}

}
