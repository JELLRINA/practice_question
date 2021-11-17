package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 평균 {

	public static void main(String[] args) throws IOException {
		// 평균 조작 문제.
		//type.1
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		//절대오차 or 상대오차 == double
//		double arr[] = new double[Integer.parseInt(br.readLine())];
//		StringTokenizer st = new StringTokenizer(br.readLine()," ");
//		
//		for(int i = 0; i < arr.length; i++ ) {
//			arr[i] = Double.parseDouble(st.nextToken());
//		}
//		double sum = 0;
//		//오름차순 정렬 import arrays
//		Arrays.sort(arr);
//		
//		for (int i = 0; i < arr.length; i++) {
//			//점수/최댓값(M)*100
//			sum += ((arr[i] / arr[arr.length-1])*100);
//		}
//		System.out.print(sum / arr.length);

		//type.2 not array
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine()); // 입력개수

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int max = -1; //value가 음이 아닌 정수, 0보다 커야함
		double sum = 0.0;

		for (int i = 0; i < n; i++) {
			int value = Integer.parseInt(st.nextToken());

			if (value > max) {
				max = value;
			}

			sum += value;
		}

		System.out.println(((sum / max) * 100.0) / n);

	}

}
