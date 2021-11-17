package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OX퀴즈 {

	public static void main(String[] args) throws IOException {
		//OX 퀴즈의 결과를 일차원 배열로 입력받아 점수를 계산하는 문제
		//type.1
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//		StringBuilder sb = new StringBuilder();
//		int test_case = Integer.parseInt(br.readLine()); // bufferedReader가 문자열로 입력 되므로 int변환
//		String arr[] = new String[test_case]; // 길이가... 0 < 80 array
//
//		for (int i = 0; i < test_case; i++) {
//			arr[i] = br.readLine();
//		}
//		for (int i = 0; i < test_case; i++) {
//			int cnt = 0; // 개수
//			int sum = 0; // 점수
//
//			for (int j = 0; j < arr[i].length(); j++) {
//				if (arr[i].charAt(j) == 'O') { 
//					cnt++;
//				} else {
//					cnt = 0;
//				}
//				sum += cnt; // if or else 값의 점수값.
//			}
//			sb.append(sum).append("\n"); // sb로 문자열 이어주고 개행.
//		}
//		System.out.print(sb); //31값 출력.

		//type.2
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		int test_case = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < test_case; i++) {
			
			int cnt = 0;
			int sum = 0;
			
			for(byte value : br.readLine().getBytes()) {
			//for-each 구문	 getBytes():문자열을 byte 단위의 배열로 반환
				if (value == 'O') {
					cnt++;
					sum += cnt;
				}
				else {
					cnt = 0;
				}
			}
			sb.append(sum).append('\n');
		}
		System.out.print(sb);

	}

}
