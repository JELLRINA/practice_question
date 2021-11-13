package FOR;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ºü¸¥AandB {

	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		
//		int n = Integer.parseInt(br.readLine());
//		
//		StringTokenizer st;
//		
//		for(int i = 0; i < n; i++) {
//			st = new StringTokenizer(br.readLine()," ");
//			bw.write((Integer.parseInt(st.nextToken())+ Integer.parseInt(st.nextToken()))+"\n");
//		}
//		
//		br.close();
//		
//		bw.flush();
//		bw.close();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine()," ");
			sb.append(Integer.parseInt(st.nextToken())+ Integer.parseInt(st.nextToken())).append('\n');
		}
		br.close();
		
		System.out.println(sb);

	}

}
