package test;

public class Test02 {
// 10 20 30 40 50 숫자 거꾸로 출력하기
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };

		// 1번
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}

		System.out.println("------------");

		// 2번
		for (int i = 1; i <= arr.length; i++) {
			System.out.println(arr[arr.length - i]);

		}

	}

}
