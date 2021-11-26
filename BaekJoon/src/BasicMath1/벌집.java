package BasicMath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 벌집 {

	public static void main(String[] args) throws IOException {
		// 벌집이 형성되는 규칙에 따라 벌집의 위치를 구하는 문제
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int cnt = 1; //방 개수
		int range = 2; //1제외 최솟값 범위
		
		if (N == 1){ //n이 1일 경우 1 출력
			System.out.print(1);
		}
		else {
			while(range <= N) { //N을 넘기 전까지 반복
				range = range + (6 * cnt); //반복 중 최솟값 범위 증가
				cnt++;
			}
			System.out.print(cnt);

		}

	}

}
