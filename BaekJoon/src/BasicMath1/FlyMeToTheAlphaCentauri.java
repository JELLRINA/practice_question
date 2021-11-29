package BasicMath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FlyMeToTheAlphaCentauri {

	public static void main(String[] args) throws IOException {
		// 거리에 따른 장치 사용 횟수를 출력하는 문제
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(); // 한번에 출력

		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " "); // 문자열 분리

			// x는 항상 y보다 작은 값을 갖는다. (0 ≤ x < y < 231)
			int X = Integer.parseInt(st.nextToken());
			int Y = Integer.parseInt(st.nextToken());

			int distance = Y - X; // 거리
			int max = (int) Math.sqrt(distance); // 거리의 루트 값 int형으로.

			// 최소한의 공간이동 장치 작동 횟수를 출력한다.
			if (max == Math.sqrt(distance)) {
				sb.append(max * 2 - 1).append('\n'); // k-1,
			} else if (distance <= max * max + max) {
				sb.append(max * 2).append('\n'); // k 혹은
			} else {
				sb.append(max * 2 + 1).append('\n'); // k+1 광년만을 다시 이동
			}

		}
		System.out.print(sb);

	}

}
