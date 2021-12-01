package BasicMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 직사각형에서탈출 {

	public static void main(String[] args) throws IOException {
		// 직사각형과 점의 거리를 구하는 문제
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		//첫째 줄에 x, y, w, h가 주어진다.(정수)
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		
		////Math.min():둘 중 더 작은 숫자 반환
		//1 ≤ x ≤ w-1 최소거리
		int x_min = Math.min(x, w-x); 
		//1 ≤ y ≤ h-1 최소거리
		int y_min = Math.min(y, h-y);
		
		//직사각형의 경계선까지 가는 거리의 최솟값
		System.out.println(Math.min(x_min, y_min));

		
	}

}
