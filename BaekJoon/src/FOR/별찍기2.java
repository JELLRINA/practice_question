package FOR;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class º°Âï±â2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		br.close();

		StringBuilder sb = new StringBuilder();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
//				System.out.println(" ");
				sb.append(" ");
			}
			for (int k = 1; k <= i; k++) {
//				System.out.println("*");
				sb.append("*");

			}
//			System.out.println();
			sb.append('\n');

		}
		System.out.println(sb);

	}

}
