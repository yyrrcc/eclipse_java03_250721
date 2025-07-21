package scanner;

import java.util.Scanner;

public class ScannerEx02 {
// 1 ~ 100 사이의 정수 중 컴퓨터가 생각한 숫자를 맞추는 게임
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int randomNumber = (int) (Math.random() * 100) + 1;
		int count = 0;

		while (true) {
			System.out.print("1 ~ 100 사이 정수 중 하나를 입력하세요. (0 입력 시 프로그램 종료) : ");
			int num = scanner.nextInt();
			count++;
			if (num == 0) {
				System.out.println("프로그램이 종료되었습니다.");
				break;
			}

			if (num > randomNumber) {
				System.out.println("숫자가 너무 큽니다.");
			} else if (num < randomNumber) {
				System.out.println("숫자가 너무 작습니다.");
			} else {
				System.out.println("정답입니다! " + count + "번만에 맞췄습니다. 게임을 종료합니다.");
				break;
			}
		}
		scanner.close();
	}

}
