package ch04;

public class EnumMathodExam {

	public static void main(String[] args) {
		// 각종 메서드를 활용하여 이뮴 객체를 만들어 보자!!

		// name 메서드 활용
		Week today = Week.SUNDAY;
		String name = today.name();
		System.out.println("객체의 이름은: " + name);

		// ordinal 메서드 활용
		int ordinal = today.ordinal();
		System.out.println("열거의 순서는: " + ordinal);

		// compareTo 메서드 활용
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		System.out.println(result1);
		System.out.println(result2);

		// valueof 메서드 활용
		Week weekday = Week.valueOf("MONDAY");
		if (weekday == Week.SATURDAY || weekday == Week.SUNDAY) {
			System.out.println("주말이군요 푹 쉬세요 ㅎㅎ");
		} else {
			System.out.println("평일이군요.. 자바 공부를 열심히 하세요");
		}

		
		// values 메서드 활용
		Week[] days = Week.values() ; 
		for (Week a : days) {
			System.out.print(a + " ");
		}
		
	}

}
