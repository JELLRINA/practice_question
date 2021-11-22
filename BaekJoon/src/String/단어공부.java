package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 단어공부 {

	public static void main(String[] args) throws IOException {
		// 주어진 단어에서 가장 많이 사용된 알파벳을 출력하는 문제
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] arr = new int[26]; //a-z,A-Z
		String str = br.readLine(); //주어지는 단어의 길이는 1,000,000을 넘지 않는다.

		for (int i = 0; i < str.length(); i++) {
			if (65 <= str.charAt(i) && str.charAt(i) <= 90) {
				arr[str.charAt(i) - 65]++; // 대문자 (65-90) ,++:인덱스값 +1증가
			} else {
				arr[str.charAt(i) - 97]++; // 소문자 (97-122)
			}
		}

		int max = -1; 
		char ch = '?';

		for (int i = 0; i < 26; i++) {
			if (arr[i] > max) {
				max = arr[i]; // 가장 많이 사용된 알파벳
				ch = (char) (i + 65); // 대문자로 출력(캐스팅)
			} else if (arr[i] == max) {
				ch = '?'; //여러개 존재 할 경우 
			}
		}
		System.out.print(ch);

	}

}
