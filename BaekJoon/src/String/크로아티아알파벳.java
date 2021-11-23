package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 크로아티아알파벳 {

	public static void main(String[] args) throws IOException {
		// 크로아티아 알파벳의 개수를 세는 문제
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();

		int cnt = 0; //몇 개?
		int len = str.length(); //입력 문자열

		for (int i = 0; i < len; i++) {
			char ch = str.charAt(i);

			// 만약 ch가 c 이고, 문자열길이 출력에 -1이면(을 안하면 다음 값이 없어서 반복문 끝이x->error),
			if (ch == 'c' && i < len - 1) { 
				// ch(i+1)의 다음 문자가 '=' or '-' 이면,
				if (str.charAt(i + 1) == '=' || str.charAt(i + 1) == '-') {
					// 다음 문자를 넘어 +1
					i++;
				}
			} else if (ch == 'd' && i < len - 1) {
				if (str.charAt(i + 1) == '-') { // d-
					i++;
				} else if (str.charAt(i + 1) == 'z' && i < len - 2) {
					if (str.charAt(i + 2) == '=') { // dz=
						i += 2;
					}
				}
			} else if ((ch == 'l' || ch == 'n') && i < len - 1) {
				if (str.charAt(i + 1) == 'j') { // lj or nj
					i++;
				}
			} else if ((ch == 's' || ch == 'z') && i < len - 1) {
				if (str.charAt(i + 1) == '=') { //s= or z=
					i++;
				}
			}
			cnt++; //for문의 끝;
		}
		System.out.print(cnt);

	}

}
