package function;

public class TestMain {

	public static void main(String[] args) {
		// 정수 N개의 합
		Test t = new Test();
		int[] a = { 2147483647, 1 }; //int 최대범위 +1 sum ==> 오버플로우 발생
		System.out.println(t.sum(a));

	}

}
