package BasicMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 직각삼각형 {

	public static void main(String[] args) throws IOException {
		// 피타고라스의 정리에 대해 배우는 문제 𝑎² = 𝘣² + 𝘤²
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int z = Integer.parseInt(st.nextToken());

			// 마지막줄에는 0 0 0이 입력된다.
			if (x == 0 && y == 0 && z == 0)
				break;

			// 직각 삼각형이 맞다면 "right", 아니라면 "wrong"
			if ((x * x + y * y) == z * z) {
				sb.append("right").append('\n');
			} else if (x * x == (y * y + z * z)) {
				sb.append("right").append('\n');
			} else if (y * y == (x * x + z * z)) {
				sb.append("right").append('\n');
			} else {
				sb.append("wrong").append('\n');
			}
		}
		System.out.println(sb);
	}

}
