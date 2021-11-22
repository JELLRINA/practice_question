package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 문자열반복 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine()); // T(1 ≤ T ≤ 1,000)
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < T; i++) {
			String[] str = br.readLine().split(" "); // 공백

			int R = Integer.parseInt(str[0]); // 반복횟수R(1 ≤ R ≤ 8)
			String S = str[1];

			for (int j = 0; j < S.length(); j++) {
				for (int k = 0; k < R; k++) {
					sb.append(S.charAt(j));

				}
			}
			sb.append('\n');
		}
		System.out.print(sb);


	}

}
