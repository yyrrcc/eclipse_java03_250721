// enumeration 열거
package enumeration;

public class Enum02 {

	enum Season {
		SPRING, SUMMER, FALL, WINTER
	}

	public static void main(String[] args) {

		Season nowSeason = Season.SUMMER;

		switch (nowSeason) {
		case SPRING:
			System.out.println("싱그러운 봄");
			break;
		case SUMMER:
			System.out.println("청량한 여름");
			break;
		case FALL:
			System.out.println("선선한 가을");
			break;
		case WINTER:
			System.out.println("포근한 겨울");
			break;
		default:
			break;
		}
	}

}
