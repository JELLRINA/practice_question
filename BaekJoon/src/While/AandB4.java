package While;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AandB4 {

	public static void main(String[] args) throws IOException {
		//EOF(End of File) 더 이상 읽을 수 있는 데이터가 존재하지 않을 때 종료.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		String str;
		
		while( (str = br.readLine()) != null) { //str에 저장된 데이터가 null이면 반복문 종료
			st = new StringTokenizer(str," ");
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			sb.append(A+B).append("\n");
		}
		System.out.print(sb); //ln으로 하면 ctrl+z(EOF) 안됨.
	}

}
