package ch01;

public class IntToDouble {

	public static void main(String[] args) {
		// int 타입과 float 타입은 같은 32 bit를 사용하지만 float이 소수점을 사용하기 때문에 값에 변조가 일어난다.
		
		// float보다 큰 double을 사용하여 해결한다.
		
		int num1 = 123456780 ;
		int num2 = 123456780 ;
		
		double num3 = num2 ; // int 타입 값을 double에 넣음
		num2 = (int) num3 ; // 위에서 선언한 변수에 값을 다시 넣음
		
		System.out.println("num1 : " + num1); // num1 : 123456780
		System.out.println("num2 : " + num2); // num2 : 123456784
		System.out.println("num3 : " + num3); 
		// num3 : 1.23456784E8 > 지수 형식으로 E 뒤에 숫자는 소수점 뒤에 횟수 (부동 소수점 처리)
		//        12.3456784E7
		//        1234567.84E2
		
		int result = num1 - num2 ;
		System.out.println("double로 다녀온 후에 num2 값 변경 안 됨");
		System.out.println("num1 - num2 : " + result );
		

	}

}
