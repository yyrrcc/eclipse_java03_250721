package test;

public class Test03 {
// 1 3 7 3 3 5 3 6 9 3 3 3 다음 숫자열에서 3의 갯수 출력
	public static void main(String[] args) {
		int[] arr = { 1, 3, 7, 3, 3, 5, 3, 6, 9, 3, 3, 3 };

		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 3) {
				count++;
				continue;
			}
		}
		System.out.println(count);
	}
}
