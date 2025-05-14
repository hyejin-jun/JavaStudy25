package ch01;

public class PromotionExam {

	public static void main(String[] args) {
		// 자동 타입 변환 연습
		// : 작은 타입 값을 손실 없이 큰 타입 값으로 변환한다.
		// byte (1 byte : 8 bit)
		// short (2 byte : 16 bit) & char (유니코드용: 문자표현 코드)
		// int (4 byte : 32 bit)
		// long (8 byte : 64 bit) // 접미사 L
		// float (4 byte : 32 bit) // 실수형 접미사 F
		// double (8 byte : 64 bit) 
		
		byte byteValue = 10 ; // byte 타입의 변수에 10 값을 넣는다.
		int intValue = byteValue ; // 자동 타입 변환됨.
		
		System.out.println("자동 타입된 int : " + intValue);
		
		char charValue = '가' ;
		intValue = charValue;
		System.out.println("자동 타입된 int : " + intValue );
		
		intValue = 500 ;
		long longValue = intValue ;
		System.out.println("자동 타입된 long : " + longValue);
		
		double doubleValue = intValue ;
		System.out.println("자동 타입된 double : " + doubleValue);
		

	}

}
