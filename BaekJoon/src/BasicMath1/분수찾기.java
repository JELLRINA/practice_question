package BasicMath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 분수찾기 {

	public static void main(String[] args) throws IOException {
		// 분수의 순서에서 규칙을 찾는 문제

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 1/1=2(짝수 but,대각선 개수 홀수), 1/2 2/1=3(홀수 but,대각선 개수 짝수) ...
		//
		int X = Integer.parseInt(br.readLine());
		int cnt = 1, sum = 0; // 대각선개수,누적 합

		while (true) {
			if (X <= sum + cnt) {
				if (cnt % 2 == 1) { // 대각선 개수가 홀수라면,
					System.out.print((cnt - (X - sum - 1)) + "/" + (X - sum));
					break; 
				} else { // 대각선 개수가 짝수라면,
					System.out.print((X - sum) + "/" + (cnt - (X - sum - 1)));
					break; //계산 후 종료
				}

			} else { //X가 더 크면 늘려주고 반복문 다시 재개.
				sum += cnt;
				cnt++;
			}
			
		}

	}

}
