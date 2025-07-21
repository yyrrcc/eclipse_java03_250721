// array 배열
package array;

public class Array03 {

	public static void main(String[] args) {

		int[] numbers = { 10, 20, 30, 40, 50 };
		// 배열 범위 벗어난 경우 발생하는 오류
		// ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
		// System.out.println(numbers[5]);

		String[] strArr = new String[5];
		System.out.println(strArr[1] + 1234); // null1234

		// 배열 요소의 갯수 구하기 .length
		int[] intArr = { 60, 1, 2, 8, 6, 54, 21, 13, 8, 45, 87, 13, 41, 95 };
		System.out.println(intArr.length);

		for (int i = 0; i < intArr.length; i++) {
			System.out.print(intArr[i] + ",");
		}
	}
}