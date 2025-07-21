package test;

public class Test05 {
// 1 2 3 4 5 다음 숫자들을 모두 곱한 값을 배열을 사용하여 출력
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };

		int result = 1;

		for (int i : arr) {
			result *= i;
		}
		System.out.println(result);
	}

}
