package String;

import java.io.IOException;
import java.util.Scanner;

public class 상수 {

	public static void main(String[] args) throws IOException {
		// 숫자를 뒤집어서 비교하는 문제
		//type.1
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//		StringTokenizer st = new StringTokenizer(br.readLine(), " "); 
//		//두 수는 같지 않은 세 자리 수이며, 0이 포함되어 있지 않다.
//		
//		int A = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString()); //입력된 상수를 거꾸로 나열
//		int B = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString()); //인자가 string type 이므로 append 사용x
//
////		System.out.print(A > B ? A : B); 
//
//		if( A > B)
//			System.out.print(A);
//		else
//			System.out.print(B);

		//type.2
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();

		sc.close();

		A = Integer.parseInt(new StringBuilder().append(A).reverse().toString()); //tostring:sb를 문자열 반환
		B = Integer.parseInt(new StringBuilder().append(B).reverse().toString());

		System.out.print(A > B ? A : B);

	}

}
