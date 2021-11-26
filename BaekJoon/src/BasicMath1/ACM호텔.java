package BasicMath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ACM호텔 {

	public static void main(String[] args) throws IOException {
		// 호텔 방 번호의 규칙을 찾아 출력하는 문제
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine()); // 호텔
		StringBuilder sb = new StringBuilder();

		// 호텔 정문으로부터 걸어서 가장 짧은 거리에 있는 방을 선호
		for (int i = 0; i < T; i++) {

			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int H = Integer.parseInt(st.nextToken()); // 층 수
			//int W = Integer.parseInt(st.nextToken()); // 방 수(필요x)
			int N = Integer.parseInt(st.nextToken()); // N번째 손님

			// 예로 들면, H = 6이므로 10 번째 손님은 402 호에 배정해야 한다. == 6%10=4=*100+(6/10)=+1=2=402
			if (N % H == 0) { //0이 나오면 0층이 되므로 조건 걸기.
				sb.append((H * 100) + (N / H)).append('\n');
			} else { // 나머지가 0이 아닐 경우,
				sb.append(((N % H) * 100) + ((N / H) + 1)).append('\n');
			}
		}
		System.out.print(sb);

	}

}
