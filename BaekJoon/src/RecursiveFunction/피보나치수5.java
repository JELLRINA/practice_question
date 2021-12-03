package RecursiveFunction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 피보나치수5 {

	public static void main(String[] args) throws IOException {
		// 피보나치 수 역시 단순 for문으로도 구할 수 있지만, 학습을 위해 재귀를 써 봅시다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		// 배열은 0부터 시작이므로 N+1해주기
		int[] fibonacci = new int[N + 1];

		for (int i = 0; i < fibonacci.length; i++) {
			// 0 과 1 일 경우 각각 초기화
			if (i == 0)
				fibonacci[0] = 0;
			else if (i == 1)
				fibonacci[1] = 1;
			
			//Fn = Fn-1 + Fn-2 (n ≥ 2)
			else
				fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
		}
		System.out.println(fibonacci[N]);
	}

}
