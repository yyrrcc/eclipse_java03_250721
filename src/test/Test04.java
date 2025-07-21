package test;

public class Test04 {
// {10, 20, 30, 40, 50} 배열에서 홀수인덱스의 값 출력
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };

		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 1) {
				System.out.println(arr[i]);
			}
		}
	}
}
