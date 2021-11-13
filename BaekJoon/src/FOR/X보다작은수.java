package FOR;

import java.io.IOException;
import java.util.Scanner;

public class X보다작은수 {

	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine()," ");
//		
//		int n = Integer.parseInt(st.nextToken());
//		int x = Integer.parseInt(st.nextToken());
//		
//		StringBuilder sb = new StringBuilder();
//		
//		st = new StringTokenizer(br.readLine()," ");
//		
//		for(int i = 0; i < n; i++) {
//			int a = Integer.parseInt(st.nextToken());
//			if(a < x)
//				sb.append(a).append(" ");
//		}
//		
//		System.out.println(sb);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int X = sc.nextInt();
		int arr [] = new int[N];
		
		for(int i = 0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		for(int i = 0; i < N; i++) {
			if(arr[i]<X) {
				System.out.print(arr[i]+" ");

			}
		}
	}

}
