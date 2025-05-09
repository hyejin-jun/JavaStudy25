package ch01;

public class Code7 {

	public static void main(String[] args) {
		// 강제 타입 변환
		
		int in1 = 500 ;
		byte by1 = (byte) in1 ; // int(4) 타입을 byte(1) 강제 타입으로 변환
		System.out.println(in1); 
		System.out.println(by1);
		
		in1 = 7851685 ;
		char ch1 = (char) in1 ; // int(4) 타입을 char(2) 강제 타입으로 변환
		System.out.println(ch1); 
		
		double do1 = 754.715 ;
		in1 = (int) do1 ; // double(8) 타입을 int(4) 강제 타입 전환
		System.out.println(in1); // 결과값: 754 > 큰 것에서 작은 것으로 가 손실이 일어남
		
		int no1 = 445454515 ;
		int no2 = 445454515 ;
		
		// float no3 = no2 ; // 결과값: -13 > 정수 타입을 실수로 변환하여 손실이 있다. 
		double no3 = no2 ; // 결과값: 0
		no2 = (int) no3 ;
		
		System.out.println(no1) ;
		System.out.println(no2) ;
		System.out.println(no3) ;
		
		int res = no1 - no2 ;
		System.out.println(res) ;
		
		
		
				

	}

}
