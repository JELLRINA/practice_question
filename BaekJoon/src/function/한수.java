package function;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 한수 {

	public static void main(String[] args) throws IOException {
		// X가 한수인지 판별하는 함수를 정의하여 문제를 해결. 1-99는 무조건 등차수열. 1-9,10-99 = 한수
		// 첫째항부터 차례로 일정한 수를 더해 만들어지는 수열 = 등차수열 / 일정한 수 = 공차 ex)222 ->0
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print(hansu(Integer.parseInt(br.readLine())));

	}

	public static int hansu(int num) {
		int cnt = 0; // 한수의 개수

		if (num <= 99) { // 100보다 작을 경우 리턴하면 반복문 x
			return num;
		} else {
			cnt = 99;
			if (num == 1000) { // 1000은 등차수열이 x, 예외처리
				num = 999;
			}

			for (int i = 100; i <= num; i++) {
				int hun = i / 100; // 백의자리
				int ten = (i / 10) % 10; // 십의자리
				int one = i % 10; // 일의자리

				if ((hun - ten) == (ten - one)) {
					cnt++;
				}
			}
		}

		return cnt;
	}

}
