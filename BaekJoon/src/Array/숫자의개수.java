package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 숫자의개수 {

	public static void main(String[] args) throws IOException {
		
		// 각 숫자가 몇 번 나왔는지 저장하기 위해 일차원 배열을 만드는 문제
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//0-9까지 배열 생성
		int[] arr = new int[10];
		
		//n의 값에 A,B,C곱 저장
		int n = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());
		
		//int형을 string으로 변환
		String str = String.valueOf(n);
		
		//string값을 아스키코드 -48 or -'0' 로 추출 후 +1
		for (int i = 0; i < str.length(); i++) {
			arr[(str.charAt(i)-48)]++;
		}
		for(int result : arr) {
			System.out.println(result);

		}
	}

}
