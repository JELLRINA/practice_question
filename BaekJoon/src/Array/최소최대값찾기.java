package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 최소최대값찾기 {

	public static void main(String[] args) throws IOException {
		// type.1
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//		int n = Integer.parseInt(br.readLine());
//		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//
//		int index = 0;
//		int[] arr = new int[n];
//		while (st.hasMoreTokens()) { // st에 토큰이 남으면 true, 아니면 false를 반환.
//			arr[index] = Integer.parseInt(st.nextToken());
//			index++;
//		}
//		Arrays.sort(arr);
//		System.out.print(arr[0] + " " + arr[n - 1]);

		// type.2 not array
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		// ex.모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.
		int max = -1000001;
		int min = 1000001;

		while (st.hasMoreTokens()) {
			int n = Integer.parseInt(st.nextToken());
			if (n > max) {
				max = n;
			}
			if (n < min) {
				min = n;
			}
		}
		System.out.println(min + " " + max);


	}

}
