package test;

public class Test01 {
// 90 80 70 100 85 평균 구하기 (향상된 for문 사용)
	public static void main(String[] args) {
		int[] arr = { 90, 80, 70, 100, 85 };

		int sum = 0;

		for (int i : arr) {
			sum += i;
		}

		// 평균값(나눗셈 사용) 구할 때는 변수 타입을 double로 하는 게 좋다
		double average = sum / arr.length;
		System.out.println(average);
	}

}
