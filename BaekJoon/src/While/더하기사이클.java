package While;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 더하기사이클 {

	public static void main(String[] args) throws IOException {
		// 원래 수로 돌아올 때까지 연산을 반복하는 문제
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int cnt = 0; //반복되지는 수
		int copy = n; //복사

		do {
			n = ((n % 10) * 10) + (((n / 10) + (n % 10)) % 10); //수 를 더해서 다시 되돌아 오는 수를 찾는 공식
			cnt++;
		} while (copy != n); //입력된 값과 복사 값이 다를 경우 반복 후 ==되면 print

		System.out.println(cnt);

	}

}
