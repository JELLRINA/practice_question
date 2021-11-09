package IF;

import java.util.Scanner;

public class 두수비교하기 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		scan.close();
		
		if (A > B) {
			System.out.println(">");
		}else if (A < B) {
			System.out.println("<");
		}else {
			System.out.println("==");
		}

	}

}
