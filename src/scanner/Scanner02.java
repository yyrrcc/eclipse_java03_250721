package scanner;

import java.util.Scanner;

public class Scanner02 {

	public static void main(String[] args) {
		while (true) {
			System.out.println("종료하려면 나이란에 '0'을 작성해주세요.");

			Scanner sc = new Scanner(System.in);
			System.out.print("Enter your name : ");
			String name = sc.nextLine();
			System.out.println("Hello, " + name);
			System.out.print("Enter your age : ");
			int age = sc.nextInt();

			if (age == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

			System.out.println("Your age is " + age);
		}

	}

}
