package RecursiveFunction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 하노이탑이동순서 {

	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		// 재귀적인 패턴을 재귀함수로 찍는 문제 2
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		sb.append((int) (Math.pow(2, N) - 1)).append('\n');

		Hanoi(N, 1, 2, 3);
		System.out.println(sb);

	}

	/*
	 * N = 원판개수 
	 * start = 1 
	 * mid = 2 
	 * end = 3
	 */

	private static void Hanoi(int N, int start, int mid, int end) {
		if (N == 1) {
			sb.append(start + " " + end + "\n");
			return;
		}
		Hanoi(N - 1, start, end, mid); // 1->3-> 1->2
		sb.append(start + " " + end + "\n");
		Hanoi(N - 1, mid, start, end);

	}

}
