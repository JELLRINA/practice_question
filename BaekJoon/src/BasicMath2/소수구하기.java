package BasicMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 소수구하기 {

	public static boolean prime[];

	public static void main(String[] args) throws IOException {
		// 에라토스테네스의 체로 풀어 봅시다.

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());

		prime = new boolean[N + 1];
		get_prime(); 
		
		for (int i = M; i <= N; i++) {
			//
			if(!prime[i]) sb.append(i).append('\n');
		}
		System.out.println(sb);

	}

	//에라토스테네스의 체
	private static void get_prime() {
		prime[0] = prime[1] = true; //0과1은 소수가 아니므로 true.
		//소수인 2부터 루트값 이하까지 반복 수행 -> i배수 제외시킴
		for(int i = 2; i <= Math.sqrt(prime.length); i++) { 
			if(prime[i]) continue; 
			for(int j = i * i; j < prime.length; j += i) {
				prime[j] = true; 
			}
		}

	}

}
