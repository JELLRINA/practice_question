package BasicMath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 달팽이는올라가고싶다 {

	public static void main(String[] args) throws IOException {
		// 달팽이의 움직임을 계산하는 문제
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine()," ");

		int A = Integer.parseInt(st.nextToken()); // up
		int B = Integer.parseInt(st.nextToken()); // down
		int V = Integer.parseInt(st.nextToken()); // length

		int day = ((V - B) / (A - B)); 
		//정상에 올라간 후에는 미끄러지지 않는다.
		if ((V - B) % (A - B) != 0)
			day++;
		System.out.println(day);

	}

}
