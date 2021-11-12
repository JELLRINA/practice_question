package FOR;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ±¸±¸´Ü {

	public static void main(String[] args) throws IOException {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		
//		sc.close();
//		
//		for (int i = 1; i <= 9; i++) {
//			System.out.println(n + "*" + i + "=" + (n*i));
//
//		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		br.close();
		
		for (int i = 1; i < 10; i++) {
			System.out.println(n+" * "+i+" = "+(n*i));

		}
		

	}

}
