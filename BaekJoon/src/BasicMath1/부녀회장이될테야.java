package BasicMath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 부녀회장이될테야 {

	// 1 ≤ k, n ≤ 14
	public static int[][] APT = new int[15][15]; // 층,호

	public static void main(String[] args) throws IOException {
		// 층과 거주자 수의 규칙을 찾는 문제
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		APT(); //호출
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) { //k,n을 반복할 test case의 수
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			sb.append(APT[k][n]).append('\n');
		}
		System.out.println(sb);
	}

	public static void APT() {
		for (int i = 0; i < APT.length; i++) {
			APT[i][1] = 1; // 0층부터 있고 각층에는 1호부터 있으며,
			APT[0][i] = i; // 0층의 i호에는 i명이 산다.
		}
		//“i층의 j호에 살려면 자신의 아래(i-1)층의 1호부터 b호까지 사람들의 수의 합만큼 사람들을 데려와 살아야 한다”
		for (int i = 1; i < APT.length; i++) { // 1층 - 14층
			for (int j = 2; j < APT.length; j++) { // 2호 - 14호
				APT[i][j] = APT[i][j - 1] + APT[i - 1][j];
			}
		}
	}

}
