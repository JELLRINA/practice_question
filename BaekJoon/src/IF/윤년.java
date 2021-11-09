package IF;

import java.util.Scanner;

public class À±³â {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int y = scan.nextInt();
		scan.close();
		
		if(y%4 == 0 && (y%400 == 0 || y%100 != 0)){
            System.out.println("1");
        } else {
            System.out.println("0");

	}

	}

}
