package FOR;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AandB8 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int A;
		int B;

		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		for (int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			A = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());
//			System.out.println("Case #" + i + ": " + A + " + " + B + " = " + (A + B));

			sb.append("Case #" + i + ": ").append(A + " + " + B + " = " + (A + B)).append("\n");
		}
		br.close();
		System.out.println(sb);

	}

}
