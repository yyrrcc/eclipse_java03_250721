package scanner;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your favorite number : ");
		int num1 = sc.nextInt();
		// 만약 실수나 문자열이 입력되면 java.util.InputMismatchException 오류 발생
		System.out.println("Your favorite number is " + num1);
		sc.close();
	}

}
