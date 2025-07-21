// array 배열
package array;

public class Array01 {

	public static void main(String[] args) {
		// 정수형 배열 1 - 예전 방식
		int intArr[] = { 20, 25, 31, 33 };

		// 정수형 배열 2 - 요새 방식
		// 선언과 초기화를 동시에 진행
		int[] intArr1 = { 90, 80, 55, 97, 88 };
		double[] doubleArr1 = { 1.145, 2.25, 3.87 };
		boolean[] boolArr1 = { true, false, false, true };
		String[] strArr1 = { "apple", "banana", "kiwi" };

		// 배열의 크기만 잡고 기본값으로 초기화 (new 연산자)
		int[] intArr2 = new int[5]; // { 0, 0, 0, 0, 0 };
		double[] doubleArr2 = new double[4]; // { 0.0, 0.0, 0.0, 0.0 };
		boolean[] boolArr2 = new boolean[3]; // { false, false, false };
		String[] strArr2 = new String[4]; // { null, null, null, null };

		// new 연산자를 사용하여 배열의 선언과 동시에 초기화
		int[] intArr3 = new int[] { 1, 2, 3, 4 };
		String[] strArr3 = new String[] { "aa", "bb", "cc" };

		// 배열 크기만 잡고 기본값으로 초기화한 배열에 값 대입하기 (인덱스 이용)
		intArr2[0] = 40;
		intArr2[1] = 80;
		intArr2[2] = 50;
		intArr2[3] = 90;
		intArr2[4] = 75;

	}
}
