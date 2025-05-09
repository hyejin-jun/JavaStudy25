package ch01;

public class Code6 {

	public static void main(String[] args) {

		// RGB 타입 연습하기
		System.out.println("==== RBG 타입 연습하기 byte 코드 ====");
		byte type1 = -128 ;
		byte type2 = -30 ;
		byte type3 = 0 ;
		byte type4 = 30 ;
		byte type5 = 127 ; 
		// byte type6 = 128 byte의 숫자 범위 초과로 오류가 뜬다 
		System.out.println(type1);
		System.out.println(type2);
		System.out.println(type3);
		System.out.println(type4);
		System.out.println(type5);
		
		
		System.out.println("==== 유니코드 연습하기 char & int 코드 ====");
		char c1 = 85 ;
		char c2 = 125 ;
		char c3 = 109 ;
		 System.out.println(c1);
		 System.out.println(c2);
		 System.out.println(c3);
	
		 int code1 = '전' ;
		 int code2 = '혜' ;
		 int code3 = '진' ;
		 
		 System.out.println(code1);
		 System.out.println(code2);
		 System.out.println(code3); // 유니코드 숫자가 입력된다 (51652)
		 
		 System.out.println("==== byte 연습하기 ====");
		 long no1 = 50 ;
		 long no2 = 50L ;
		 // long no3 = 9999999999999 ; 뒤에 L이 안 붙으면 오류가 뜸
		 long no4 = 100000000000000000L ;
		 
		 System.out.println(no1);
		 System.out.println(no2);
		 System.out.println(no4);
		 
		 double bo1 = 3.14 ; 
		 float bo2 = 3.14F ;
		 
		 double bo3 = 0.8468468464684 ;
		 float bo4 = 0.8468468464684F ;
		 
		 System.out.println(bo1);
		 System.out.println(bo2);
		 System.out.println(bo3); // 결과값: 0.8468468464684
		 System.out.println(bo4); // 결과값: 0.8468468
		 
		 boolean stop = false ;
		 
		 if(stop) {
			 System.out.println("중지합니다");
			 }else {
				 System.out.println("출발합니다");} // 위에 것이 참이 아니면 아래로 인식
		 
		 System.out.println("==== 타입 변환 연습하기 ====");
		byte by1 = 10 ;
		int in1 = by1 ; // 자동 타입 변환
		System.out.println(in1); // 10이 출력
		// 큰 타입에서 작은 타입으로 가게 된다면 오류 뜸 (byte가 int보다 작아서 그렇게 하면 오류)
		
		char ch1 = '나' ;
		in1 = ch1 ;
		System.out.println("나의 유니코드 값 = " + in1);
		
		in1 = 800 ;
		long lo1 = in1 ; // int를 큰 타입인 iong으로 변환
		System.out.println(lo1);
		
		in1 = 400 ;
		double do1 = in1 ; // int 값을 큰 타입인 double로 변환
		System.out.println(do1); // 결과값: 400.0
		
		int in2 = 815468 ;
		byte by2 = (byte) in2 ;
		System.out.println(in2);
		System.out.println(by2); // 큰 타입인 int를 작은 byte에 담아서 손실이 일어난다.
		
		
		
		
		
		
		
		
		

	}

}
