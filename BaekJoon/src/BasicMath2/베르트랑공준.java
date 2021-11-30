package BasicMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 베르트랑공준 {

	public static boolean[] prime = new boolean[246913]; //n=123456 -> n2=246912+1
	public static void main(String[] args) throws IOException {
		// 소수 응용 문제 1
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		get_prime();//메소드 호출
		
		while(true) {
			int N = Integer.parseInt(br.readLine()); //n이 주어졌을 때 
			if(N == 0) break; //n이 0일 경우 종료 : 입력의 마지막에는 0이 주어진다.
			
			int cnt = 0; //개수 변수
			//1 ≤ n ≤ 123,456
			for(int i = N + 1; i <=2*N; i++) {//n보다크고 2n보다 작거나 같은 
				if(!prime[i]) cnt++;
			}
			sb.append(cnt).append('\n'); //소수의 개수를 구하는 프로그램 작성.

		}
		System.out.println(sb);

	}
	//에라토스테네스의 체 구현
	private static void get_prime() {
		// 0,1은 소수가 아니므로 true.
		prime[0] = prime[1] = true;

		for (int i = 2; i <= Math.sqrt(prime.length); i++) {
			if (prime[i])
				continue;
			for (int j = i * i; j < prime.length; j += i) {
				prime[j] = true;
			}
		}

	}

}
