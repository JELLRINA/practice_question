package RecursiveFunction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 팩토리얼 {

	public static void main(String[] args) throws IOException {
		// 팩토리얼은 단순 for문으로도 구할 수 있지만, 학습을 위해 재귀를 써 봅시다.
		/*
		 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 * 
		 * int N = Integer.parseInt(br.readLine()); int result = factorial(N);
		 * System.out.println(result);
		 * 
		 * }
		 * 
		 * private static int factorial(int N) { // TODO Auto-generated method stub if
		 * (N <= 1) return 1; // 0!=1 0,1이 될 경우 return 1 return N * factorial(N - 1);
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int sum = 1;

		//// N 이 0이 아닐 때 까지 1씩 감소하면서 sum에 반복적으로 곱해준다
		while (N != 0) {
			sum = sum * N;
			N--;
		}
		System.out.println(sum);

	}

}
