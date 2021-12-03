package RecursiveFunction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 별찍기10 {

	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		// 재귀적인 패턴을 재귀함수로 찍는 문제 1
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		//27*27칸 中 n=27/3= 9/3= 3
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				star(i, j); //별 메소드 호출
			}
			sb.append("\n");//i의 반복1 + j의반복 끝난 후 
		}
		System.out.println(sb.toString()); //문자로 변환후 출력

	}

	//3으로 나눈 나머지가 1 일 경우 공백출력, 
	private static void star(int x, int y) {
		while (true) {
			if (y == 0) //호출된 j가 0이면 넘어가기
				break;
			if (y % 3 == 1 && x % 3 == 1) {
				sb.append(" ");
				return;
			}

			y /= 3; //몫이 1이아닌 나머지는 *출력
			x /= 3;
		}
		sb.append("*");
	}
}
