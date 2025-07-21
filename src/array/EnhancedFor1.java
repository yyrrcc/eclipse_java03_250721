package array;

public class EnhancedFor1 {

	public static void main(String[] args) {
		int[] arr1 = { 10, 20, 30, 40, 50 };

		// 기본 for문
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}

		System.out.println("-------------------");

		// 향상된 for문 (for-each문)
		for (int i : arr1) {
			System.out.println(i);
		}

		System.out.println("-------------------");

		// 향상된 for문 응용
		int[] numArr = { 10, 20, 55, 74, 33, 91, 16 };
		for (int i : numArr) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

}
