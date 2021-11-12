package FOR;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AandB {

	public static void main(String[] args) throws IOException {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int arr[] = new int[n];
//
//		for (int i = 0; i < n; i++) {
//			int a = sc.nextInt();
//			int b = sc.nextInt();
//
//			arr[i] = a + b;
//
//			System.out.println(arr[i]);
//
//		}
//		sc.close();
		
		//bufferedreader열은 문자열로 받아들임.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		//공백기준 문자열 분리 stringtokenizer
		StringTokenizer st;
		//sb에 계산식을 넣어준 뒤 출력
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine()," ");
			sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
			//prinln 역할
			sb.append('\n');
		}
		System.out.println(sb);

	}

}
