package BasicMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 소수 {

	public static boolean prime_num[]; // 소수 확인하는 배열

	public static void main(String[] args) throws IOException {
		// 2부터 X-1까지 모두 나눠서 X가 소수인지 판별하는 문제 2
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());

		prime_num = new boolean[N + 1]; //배열 할당
		get_prime_num();

		// 소수의
		int sum = 0; // 합과
		int min = Integer.MAX_VALUE; // 최솟값 2147483647 변수
		for (int i = M; i <= N; i++) {
			if (prime_num[i] == false) { // 소수 일 경우 +sum
				sum += i;
				if (min == Integer.MAX_VALUE) {
					min = i;
				}
			}
		}

//		if(sum == 0) { //소수가 없을 경우 첫째 줄 -1출력
//			System.out.println(-1);
//		}
//		else {
//			System.out.println(sum);
//			System.out.println(min);
//
//		}
		System.out.println(sum != 0 ? sum + "\n" + min : -1);

	}

	private static void get_prime_num() {
		prime_num[0] = true; // 소수가 아닌 0,1은 true
		prime_num[1] = true;

		// 소수 걸러내기
		for (int i = 2; i <= Math.sqrt(prime_num.length); i++) {
			if (prime_num[i]) { // 배열
				continue;
			}
			for (int j = i * i; j < prime_num.length; j += i) { // i의 배수는 소수가 아니므로 배수 체크
				prime_num[j] = true; // 소수가 아닌수 true
			}
		}

	}

}
