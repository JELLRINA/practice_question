package BasicMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 터렛 {

	public static void main(String[] args) throws IOException {
		// 두 원의 교점의 개수를 구하는 문제
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());

		// -10,000 <= x1, y1, x2, y2 (원의중심)<= 10,000 & r2,r2(반지름) <= 10,000
		while (T-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int r1 = Integer.parseInt(st.nextToken());

			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			int r2 = Integer.parseInt(st.nextToken());

			sb.append(contact_point(x1, y1, r1, x2, y2, r2)).append('\n');

		}
		System.out.println(sb);

	}

	public static int contact_point(int x1, int y1, int r1, int x2, int y2, int r2) {

		int distance_pow = (int) (Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)); // 제곱근을 이용해서 두 원 사이의 거리

		// r1,r2(반지름)이 있을 수 있는 위치의 개수가 무한대일 경우에는 -1을 출력
		if (x1 == x2 && y1 == y2 && r1 == r2) {
			return -1;
		} else if (distance_pow > Math.pow(r1 + r2, 2)) {
			return 0;
		} else if (distance_pow < Math.pow(r1 - r2, 2)) {
			return 0;
		} else if (distance_pow == Math.pow(r1 - r2, 2)) {
			return 1;
		} else if (distance_pow == Math.pow(r1 + r2, 2)) {
			return 1;
		} else {
			return 2;
		}
	}
}
