// array 배열
package array;

public class Array02 {

	public static void main(String[] args) {

		int[] nums = { 100, 200, 300, 400, 500 };

		// 배열 nums의 모든 값(요소) 출력하기
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}

		System.out.println("-----------------");

		// 배열 nums의 모든 요소의 합 출력하기
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		System.out.println(sum);
	}

}
