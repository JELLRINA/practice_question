package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 알파벳찾기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] arr = new int[26]; //a-z: 26

		for (int i = 0; i < arr.length; i++) { //-1로 모두 출력
			arr[i] = -1; //입력 안된 알파벳은 -1로 출력.
		}
		String S = br.readLine(); //문자열 입력. ex)baekjoon 8개
		for (int i = 0; i < S.length(); i++) {
			char ch = S.charAt(i); //문자 추출 후 ch에 저장

			if (arr[ch - 'a'] == -1) { // arr = -1(입력안된배열만)이면 초기화.
				arr[ch - 'a'] = i;	   // arr[b:98]-97= [1]자리에 i(몇번째인지:0) 저장.
			}
		}
		for(int val : arr) {
			System.out.print(val + " "); //line12 print

		}
	}

}
