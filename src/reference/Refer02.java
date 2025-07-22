package reference;

public class Refer02 {

	public static void main(String[] args) {

		// 참조 타입 변수는 객체를 참조하지 않는다는 뜻으로 null 값을 가질 수 있음
		// 참조 타입 = Array 배열, Class 클래스(String..) ...
		// 기본 타입 = 정수, 실수, 논리타입 ...

		// int a = null;
		String b = null;
		int[] c = null;

		System.out.println(b); // null
		System.out.println(c); // null

		System.out.println("-----------------------");

		String str1 = null;
		str1 = "hello";

		String str2 = "hello";
		str2 = null;

		System.out.println(str1); // hello
		System.out.println(str2); // null

	}

}
