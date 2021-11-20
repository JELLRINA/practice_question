package String;

import java.io.IOException;
import java.io.InputStream;

public class 아스키코드 {

	public static void main(String[] args) throws IOException {
		
//		Scanner sc = new Scanner(System.in);
//		
//		int ch = sc.next().charAt(0); //문자열을 잘라 문자로 변환
//		
//		System.out.print(ch);

//		int a = System.in.read();
//		System.out.print(a);

		InputStream is = System.in;
		int a = is.read();
		System.out.print(a);

	}

}
