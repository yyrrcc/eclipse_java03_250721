package reference;

import java.util.Arrays;

public class Refer03 {

	public static void main(String[] args) {
		int[] arr1 = null;
		int[] arr2 = { 10, 20, 30, 40, 50 };

		arr1 = arr2; // 참조값이 동일하게 변하면서 힙의 영역의 값도 동일하게 복사됨

		System.out.println(arr1[3]);

		arr2[2] = 70;
		System.out.println(arr1[2]); // 같은 참조값이기 때문에 값도 동일하게 변경됨

		// 두개 해시코드가 동일
		System.out.println("arr1의 해시코드 : " + System.identityHashCode(arr1));
		System.out.println("arr2의 해시코드 : " + System.identityHashCode(arr2));

		System.out.println("------------------------------------");

		int[] arr3 = null;
		int[] arr4 = { 100, 200, 300, 400, 500 };

		arr3 = Arrays.copyOf(arr4, 3); // 깊은 복사. 새로운 배열 객체로 만듬. 앞 3개 요소 복사
		for (int i : arr3) {
			System.out.println(i);
		} // length를 3으로 지정했기 때문에 결과값은 100, 200, 300

		arr4[0] = 700;
		System.out.println(arr4[0]); // 700
		System.out.println(arr3[0]); // 100, 다른 참조값이기 때문에 값은 변경 안 됨

		// 두개 해시코드가 다름!
		System.out.println("arr1의 해시코드 : " + System.identityHashCode(arr3));
		System.out.println("arr2의 해시코드 : " + System.identityHashCode(arr4));
	}

}
