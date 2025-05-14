package ch01;

public class CompareExam {

	public static void main(String[] args) {
		// 비교 연산자는 동등 비교와 크기 비교가 있다.
		// ==이면 같냐고 묻는 코드
		// !=이면 다르냐고 묻는 코드
		// >이면 초과 혹은 크냐고 묻는 코드
		// >=이면 이상이거나 크거나 같냐고 묻는 코드
		// <이면 미만 혹은 작냐고 묻는 코드
		// <=이면 이하 혹은 작거나 같냐고 묻는 코드
		
		int num1 = 10 ;
		int num2 = 10 ;
		boolean result1 = (num1 == num2) ;
		// boolean 타입은 true나 false 값을 가질 수 있다.
		//                참     거짓
		
		System.out.println(result1);
		
		char char1 = '1' ;  // char는 유니코드이며 A는 65, B는 66의 숫자값이다.
		char char2 = 1 ;  // Java는 문자와 숫자를 따로 처리하며, 대소문자를 따로 구분한다.
		boolean result2 = (char1 == char2) ;
		
		System.out.println(result2);
		
		int v2 = 1 ;  // 정수 타입의 1
		double v3 = 1.0 ;  // 실수 타입의 1.0
		System.out.println(v2 == v3);
		// 동등 비교 연산자에 타입이 다른 변수를 비교하면 자동 타입 변환이 일어난다.
		// 이때 자동 타입 변환은 큰값으로 타입을 매칭한다.
		
		double  v4 = 0.1 ;
		float v5 = 0.1F ;
		System.out.println("=======================");
		System.out.println(v4 == v5);  // 결과값: false
		// 실수형(소수점)은 부동 소수점 연산을 수행해서 근사값으로 표현함
		// true로 처리하려면 강제 타입 변환을 해야 한다.
		System.out.println((float)v4 == v5);  // v4를 float형으로 변환한다.
		System.out.println(v4 == (double) v5);  // 자동 타입 변환이다. 위에 false랑 같은 코드다.
		
		System.out.println((int)(v4*10) == (int)(v5*10));  // int는 소수점을 날려서 0과 0을 비교한다.
		System.out.println(v4);  // 결과값: 0.1
		System.out.println(v5);  // 결과값: 0.1
		// print문에서 계산을 한 값은 변수에 저장되지 않는다.
		
		
		
		
	}

}
