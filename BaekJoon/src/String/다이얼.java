package String;

import java.io.IOException;

public class 다이얼 {

	public static void main(String[] args) throws IOException {
		// 규칙에 따라 문자에 대응하는 수를 출력하는 문제
		// type.1
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		String str = br.readLine();
//		
//		int cnt = 0; //시간
//		int val = str.length(); //문자열 길이
//		
//		for(int i = 0; i < val; i++) {
//			
//			switch(str.charAt(i)) {
//			case 'A' : case 'B' : case 'C' : //숫자 1을 걸려면 총 2초가 필요하다.
//				cnt += 3; 	//한 칸 옆에 있는 숫자를 걸기 위해선 1초씩 더 걸린다.
//				break;
//			case 'D' : case 'E' : case 'F' :
//				cnt += 4;
//				break;
//			case 'G' : case 'H' : case 'I' :
//				cnt += 5;
//				break;
//			case 'J' : case 'K' : case 'L' :
//				cnt += 6;
//				break;
//			case 'M' : case 'N' : case 'O' :
//				cnt += 7;
//				break;
//			case 'P' : case 'Q' : case 'R' : case 'S' :
//				cnt += 8;
//				break;
//			case 'T' : case 'U' : case 'V' :
//				cnt += 9;
//				break;
//			case 'W' : case 'X' : case 'Y' : case 'Z' :
//				cnt += 10;
//				break;	
//			}
//		}
//		System.out.print(cnt);

		// type.2
		int cnt = 0;
		int value;

		while (true) {
			value = System.in.read();

			if (value == '\n') {
				break;
			}

			if (value < 68)
				cnt += 3; // 65=A , A-C까지는 67이지만 <=가아니므로 +1한 68
			else if (value < 71)
				cnt += 4;
			else if (value < 74)
				cnt += 5;
			else if (value < 77)
				cnt += 6;
			else if (value < 80)
				cnt += 7;
			else if (value < 84)
				cnt += 8;
			else if (value < 87)
				cnt += 9;
			else
				cnt += 10;
			
		}
		System.out.print(cnt - 3);

	}

}
