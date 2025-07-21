package scanner;

import java.util.Scanner;

public class Scanner03 {

	public static void main(String[] args) {
		while (true) {
			System.out.println("종료하려면 이름란에 '종료'라고 작성해주세요.");

			Scanner sc = new Scanner(System.in);
			System.out.print("Enter your name : ");
			String name = sc.nextLine();

			// 문자열은 이렇게 하면 오류 나거나 작동하지 않는다. (나중에 배울 예정)

			// if (name == "종료") {
			// System.out.println("프로그램을 종료합니다.");
			// break;
			// }

			System.out.println("Hello, " + name);
			System.out.print("Enter your age : ");
			int age = sc.nextInt();
			System.out.println("Your age is " + age);
		}

	}

}
