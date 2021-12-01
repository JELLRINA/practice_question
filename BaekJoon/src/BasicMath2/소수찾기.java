package BasicMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 소수찾기 {

	public static void main(String[] args) throws IOException {
		// 2부터 X-1까지 모두 나눠서 X가 소수인지 판별하는 문제 1

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		br.readLine();
		int cnt = 0;

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		while (st.hasMoreTokens()) { //true를 반환하면 토큰이 존재 
			boolean value = true;

			int num = Integer.parseInt(st.nextToken());

			if (num == 1) { // 1은 소수가 아니다.
				continue;
			}
			//소수의 판별은 num-1이 아닌 2부터 나눈 num의 제곱근까지 검사
			for (int i = 2; i <= Math.sqrt(num); i++) { 
				if (num % i == 0) {
					value = false;
					break;
				}
			}
			if (value) { // 아니면 소수라서 개수 +1증가
				cnt++;
			}
		}
		System.out.println(cnt);

	}

}
