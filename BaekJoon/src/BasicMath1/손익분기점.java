package BasicMath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 손익분기점 {

	public static void main(String[] args) throws IOException {
		// 이익이 발생하는 지점을 찾는 문제
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine()); //빈 칸
		
		// A/C-B +1 = 손익분기점
		int A = Integer.parseInt(st.nextToken()); //고정비용
		int B = Integer.parseInt(st.nextToken()); //가변비용
		int C = Integer.parseInt(st.nextToken()); //판매비용
		
		//C와B가 같으면 '-'했을때 0이 되므로 '<='
		if(C <= B) {
			System.out.println("-1"); //손익분기점이 존재하지 않으면 -1을 출력한다.

		}else {
			System.out.println((A/(C-B))+1);

		}
	}

}
