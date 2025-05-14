package ch01;

public class StringEqualsExam {

	public static void main(String[] args) {
		// 지금까지 배운 변수 타입은 기본 타입으로 자바에서 객체 없이 사용된다. (자바는 객체 지향 언어이다.)
		// String도 원래 객체를 생성하고 만들어야 하지만 편의상 생략해서 사용한다.
		
		String strval1 = "김기원" ;
		String strval2 = "김기원" ;
		String strval3 = new String("김기원") ;  // 객체 생성 문구 new String을 쓰면 객체가 하나 생성된다.
		
		System.out.println(strval1 == strval2 );  // 결과값: true
		System.out.println(strval1 == strval3);  // 결과값: false
		
		// 객체의 주소를 판단할 때는 ==을 사용하지만 객체의 안쪽 값을 동등 비교할 때는 내장된 메서드를 사용해야 한다.
		// String은 객체이고 객체 안쪽에는 메서드들이 들어있다.
		// 메서드가 보고 싶으면 .을 찍으면 보인다.
		boolean eq1 = strval1.equals(strval3);
		System.out.println("1과 3 번의 equals 메서드 사용 결과: " + eq1);  // equals는 안쪽 문구를 비교한다. 문자 비교는 equals
		
		
		
		

	}

}
