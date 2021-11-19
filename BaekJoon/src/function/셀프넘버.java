package function;

public class 셀프넘버 {

	public static void main(String[] args) {
		// 10,000보다 작거나 같은 셀프 넘버를 한 줄에 하나씩 증가하는 순서로 출력한다.
		
		boolean[] check = new boolean[10001]; //1 - 10000
		
		for (int i = 1; i <= 10000; i++) {
			int n = d(i); // n을 d(n)의 생성자

			if (n <= 10000) {
				check[n] = true; // return된 수 n 을 boolean배열로 true로변경.
			}
		}
		StringBuilder sb = new StringBuilder();

		for (int i = 1; i <= 10000; i++) {
			if(!check[i]) {
				sb.append(i).append('\n');
			}
		}
		System.out.println(sb);

	}

	public static int d(int number) {
		int sum = number; // 들어온 수 초기화.

		while (number != 0) { // number가 0이 될 때 까지 계산
			sum += number % 10;
			number /= 10;
		}
		return sum;
	}
}
