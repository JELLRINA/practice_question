package BasicMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 골드바흐의추측 {

	public static boolean[] prime = new boolean[10001];

	public static void main(String[] args) throws IOException {
		// 소수 응용 문제 2
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		get_prime();

		int T = Integer.parseInt(br.readLine()); // 주어지는 테스트케이스 개수

		// 두 '소수'의 차이가 가장 작은 것을 출력한다.
		while (T-- > 0) {
			int n = Integer.parseInt(br.readLine()); // 짝수 n
			int first = n / 2; //p와q는 소수
			int second = n / 2;
			
			while (true) {
				//두 수가 소수일 경우에만 출력
				if(!prime[first] && !prime[second]) {
					//공백으로 구분한다.
					sb.append(first).append(' ').append(second).append('\n');
					break;
				}
				//출력하는 소수는 작은 것부터 먼저 출력하며,(감소 증가값 해주고 반복.)
				first--;
				second++;
			}
		}
		System.out.println(sb);

	}

	private static void get_prime() {
		// 0,1은 소수가 아니다
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
