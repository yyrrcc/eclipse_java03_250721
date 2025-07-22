package reference;

public class Refer01 {

	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "Hello";

		// Java는 문자열을 효율적으로 관리하기 위해 String Constant Pool이라는 메모리 공간을 사용.
		// 코드에서 str1 = "Hello"와 str2 = "Hello"는 동일한 문자열 리터럴이므로
		// Java는 같은 메모리 주소를 공유하기 위해 같은 객체를 참조하게 합니다.
		if (str1 == str2) {
			System.out.println("두 문자열은 같다");
		} else {
			System.out.println("두 문자열은 다르다");
		}

		// 문자열 내용을 비교할 때는 항상 equals()를 사용
		if (str1.equals(str2)) {
			System.out.println("두 문자열은 같다.");
		}

		System.out.println("str1의 해시코드 : " + System.identityHashCode(str1));
		System.out.println("str2의 해시코드 : " + System.identityHashCode(str2));

		System.out.println("------------------------------------");

		// 새로운 객체를 만들면 무조건 메모리에 새로운 참조값을 만듬
		String str3 = new String("Hello");
		String str4 = new String("Hello");

		System.out.println(str3 == str4); // false
		System.out.println(str3.equals(str4)); // true

		System.out.println("str3의 해시코드 : " + System.identityHashCode(str3));
		System.out.println("str4의 해시코드 : " + System.identityHashCode(str4));

	}

}
