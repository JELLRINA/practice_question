package BasicMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 분해합 {

	public static void main(String[] args) throws IOException {
		// 모든 경우를 시도하여 N의 생성자를 구하는 문제
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 어떤 자연수 N이 있을 때,첫째 줄에 자연수 N(1 ≤ N ≤ 1,000,000)이 주어진다.
		int n = Integer.parseInt(br.readLine());

		// 첫째 줄에 답을 출력한다. 생성자가 없는 경우에는 0을 출력한다.
		int result = 0;

		for (int i = 0; i < n; i++) {
			int num = i;
			// 각 자릿수 합 변수
			int sum = 0;

			// 그 자연수 N의 분해합은 N과 N을 이루는 각 자리수의 합
			while (num != 0) {
				sum += num % 10;
				num /= 10;
			}
			if (sum + i == n) {
				result += i;
				break;
			}
		}
		System.out.println(result);

	}

}
