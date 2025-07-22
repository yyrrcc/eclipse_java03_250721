// enumeration 열거
package enumeration;

public class Enum01 {
	// enum : 한정된 값을 가지는 데이터들의 묶음

	enum Gender {
		FEMALE, MALE
	}

	enum Day {
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
	}

	public static void main(String[] args) {
		Gender g1 = Gender.FEMALE;
		if (g1 == Gender.MALE) {
			System.out.println("남성입니다.");
		} else {
			System.out.println("여성입니다.");
		}

		Day d1 = Day.FRIDAY;
		System.out.println("제가 가장 좋아하는 요일은 " + d1 + "입니다.");
	}

}
