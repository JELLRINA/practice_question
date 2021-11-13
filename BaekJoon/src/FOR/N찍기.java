package FOR;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NÂï±â {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		
//		int n = Integer.parseInt(br.readLine());
//		
//		
//		for (int i = 1; i <= n; i++) {
//			System.out.println(i);
//
//		}
//		br.close();
//		
//		
//		bw.flush();
//		bw.close();
		
		int n = Integer.parseInt(br.readLine());
		br.close();
		
		StringBuilder sb = new StringBuilder();
		
		int i = 1;
		while(i<=n) {
			sb.append(i+"\n");
			i++;
		}
		System.out.print(sb);

		
	}
	
}
