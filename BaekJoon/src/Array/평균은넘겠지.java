package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 평균은넘겠지 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		int[] arr;
		int test_case = Integer.parseInt(br.readLine()); 
		StringTokenizer st; //공백
		
		for(int i = 0; i < test_case; i++) {
			st = new StringTokenizer(br.readLine()," ");
			
			int N = Integer.parseInt(st.nextToken()); //학생 수
			arr = new int[N]; //n명의 점수
			
			double sum = 0; //성적 점수 변수
			
			for(int j = 0; j < N; j++) {
				int val = Integer.parseInt(st.nextToken());
				arr[j] = val;
				sum += val; //성적 합계
			}
			double avg = (sum / N); //평균
			double cnt = 0; //을 넘는 학생 수
			
			//평균 넘는 학생 비율
			for(int j = 0; j < N; j++) {
				if(arr[j] > avg) {
					cnt++;
				}
			}
			String result = String.format("%.3f", ((double)cnt/N)*100);
			sb.append(result + "%\n");
		}
		br.close();
		System.out.println(sb);
	}

}
