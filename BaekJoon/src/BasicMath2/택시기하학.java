package BasicMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 택시기하학 {

	public static void main(String[] args) throws IOException {
		// 유클리드 기하학과 택시 기하학에 대한 문제
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//string -> double
		double R = Double.parseDouble(br.readLine()); //반지름 R

		//정답과의 오차는 0.0001까지 허용 (double / math.pi사용)
		System.out.println(R * R * Math.PI); // 유클리드 원의 넓이 𝜋𝑟²
		System.out.println(2 * R * R); // 택시기하학 원의 넓이 2𝑟²

	}

}
