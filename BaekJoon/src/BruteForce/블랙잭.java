package BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 블랙잭 {

	public static void main(String[] args) throws IOException {
		// 세 장의 카드를 고르는 모든 경우를 고려하는 문제
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		// 카드개수
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int[] arr = new int[n];

		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		int result = search(arr, n, m);
		System.out.println(result);
	}

	private static int search(int[] arr, int n, int m) {
		int result = 0;

		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n-1; j++) {
				for (int k = j + 1; k < n; k++) {
					int temp = arr[i] + arr[j] + arr[k];
					if (m == temp) {
						return temp;
					}
					if (result < temp && temp < m) {
						result = temp;
					}
				}
			}
		}
		return result;
	}

}
