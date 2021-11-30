package BasicMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 소인수분해 {

	public static void main(String[] args) throws IOException {
		// N을 소인수분해하는 문제
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
 
		//i가 루트 값 보다 작거나 같은 경우. i*i <= N 로 사용 가능.
		for (int i = 2; i <= Math.sqrt(N); i++) { //1은 소수가 아니다. 
			while (N % i == 0) { //나머지값이 0일 동안 i출력 반복 n % 2
				sb.append(i).append('\n');
				N /= i; //몫이 끝날 때 까지 
			}
		}
		if (N != 1) { //N몫이 1이 아니면 n출력 후 종료
			sb.append(N);
		}
		System.out.println(sb);

	}

}
