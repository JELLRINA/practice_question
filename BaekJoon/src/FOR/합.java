package FOR;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class �� {

	public static void main(String[] args) throws IOException {
//		Scanner sc = new Scanner(System.in);
//		
//		int n = sc.nextInt();
//		sc.close();
//		int sum = 0;
//		
//		for (int i = 1; i<=n; i++) {
//			sum += i;
//		}
//		System.out.println(sum);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		br.close();
		int sum = 0;

		for (int i = 1; i <= n; i++)
			sum += i;

		System.out.println(sum);

	}

}
