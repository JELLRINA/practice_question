package BasicMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 네번째점 {

	public static void main(String[] args) throws IOException {
		// 직사각형을 완성하는 문제
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		//StringBuilder sb = new StringBuilder();

		// 세 점의 좌표 x,y축 각각 입력
		int[] coord1 = { Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()) };
		st = new StringTokenizer(br.readLine(), " ");
		int[] coord2 = { Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()) };
		st = new StringTokenizer(br.readLine(), " ");
		int[] coord3 = { Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()) };

		int x;
		int y;

		// 축에 평행한(동등) 직사각형 만들기.
		// x 좌표
		if (coord1[0] == coord2[0]) {
			x = coord3[0];
		} else if (coord1[0] == coord3[0]) {
			x = coord2[0];
		} else {
			x = coord1[0];
		}

		// y좌표
		if (coord1[1] == coord2[1]) {
			y = coord3[1];
		} else if (coord1[1] == coord3[1]) {
			y = coord2[1];
		} else {
			y = coord1[1];
		}
//		sb.append(x+" "+y).append('\n');
//		System.out.println(sb);

		System.out.println(x + " " + y);
	}

}
