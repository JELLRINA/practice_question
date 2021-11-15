package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class 나머지 {

	public static void main(String[] args) throws IOException {
		//*서로 다른 나머지*가 몇 개 있는지 출력한다. == *hashset*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//		int[] arr = new int[10];
//		boolean bl;
//		int cnt = 0;
//
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = Integer.parseInt(br.readLine()) % 42;
//		}
//		for (int i = 0; i < 10; i++) {
//			bl = false;
//			for (int k = i + 1; k < arr.length; k++) {
//				if(arr[i] == arr[k]) {
//					bl = true;
//					break;
//				}
//			}
//			if(bl == false) {
//				cnt++;
//			}
//		}
//		System.out.println(cnt);
		
		//해쉬셋은 중복되는 원소 허용x only one save. but,정렬기능 메소드 사용불가. 하려면 리스트로 변환 후 정렬.
		HashSet<Integer> hs = new HashSet<Integer>();

		for (int i = 0; i < 10; i++) {
			hs.add(Integer.parseInt(br.readLine()) % 42);
		}
		br.close();
		System.out.println(hs.size());

	}

}
