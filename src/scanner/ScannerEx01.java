package scanner;

import java.util.Scanner;

public class ScannerEx01 {
// 입력한 숫자가 짝수인지 홀수인지 출력 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number : ");
		int num = scanner.nextInt();

		if (num % 2 == 0) {
			System.out.println("This number is EVEN");
		} else {
			System.out.println("This number is ODD");
		}

		scanner.close();
	}

}
