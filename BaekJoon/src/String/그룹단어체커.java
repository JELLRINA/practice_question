package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 그룹단어체커 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		// 조건에 맞는 문자열을 찾는 문제

		int cnt = 0;
		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			if (check()) { // check 메소드 호출로 내려감
				cnt++;
			}
		}
		System.out.print(cnt);

	}

	// check 메소드 선언
	public static boolean check() throws IOException {
		boolean[] check = new boolean[26]; // 그룹단어 체크
		int pre = 0; // 이전단어
		String str = br.readLine(); // 단어 입력

		// 단어길이만큼 반복.
		for (int i = 0; i < str.length(); i++) {
			// 현재단어
			int now = str.charAt(i);

			if (pre != now) { // 이전과 현재가 다른경우
				if (check[now - 'a'] == false) { // 중복되는지 확인하기.
					check[now - 'a'] = true;
					pre = now;
					// 이전 단어가 나왔을 경우 종료
				} else {
					return false;
				}
			}
			/*연속된 동일 문자라면 다음문자로 반복.(pre == now) 
			boolean default값이 false라서 생략가능.
			
			else {
				continue;
			}*/
		}
		return true; //메소드 종료
	}
}
