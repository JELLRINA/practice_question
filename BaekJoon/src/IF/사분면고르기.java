package IF;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 사분면고르기 {

	public static void main(String[] args) throws IOException {
//		Scanner scan = new Scanner(System.in);
//		
//		int x = scan.nextInt();
//		int y = scan.nextInt();
		
//		
//		if(x > 0) {
//			if(y > 0) {
//				System.out.println(1);
//			}else {
//				System.out.println(4);
//			}
//		}
//		else {
//			if(y > 0) {
//				System.out.println(2);
//			}else {
//				System.out.println(3);
//
//			}
//		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int X = Integer.parseInt(br.readLine());
		int Y = Integer.parseInt(br.readLine());
		
		if(X > 0) {
			if(Y > 0) {
				System.out.println(1);
			}else {
				System.out.println(4);
			}
		}
		else {
			if(Y > 0) {
				System.out.println(2);
			}else {
				System.out.println(3);

			}
		}
		

	}

}
