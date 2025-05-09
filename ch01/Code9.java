package ch01;

public class Code9 {

	public static void main(String[] args) {
		// 문자열과 숫자 조합 연습하기
		
		String str1 = "A 학생의 점수는 " + 25 ;
		String str2 = "점" ;
		String str3 = str1 + str2 ;
		System.out.println(str3);
		
		String str4 = "B 학생의 점수는 " + 5 + 2 ;
		System.out.println(str4);
		
		String str5 = 8 + 5 + " 점임 C 학생의 점수는" ;
		System.out.println(str5);
		
		// 비교 연산자 연습하기
		
		int in1 = 465 ;
		int in2 = 454 ;
		boolean in3 = (in1 == in2) ;
		boolean in4 = (in1 != in2) ;
		boolean in5 = (in1 <= in2) ;
		System.out.println(in3);
		System.out.println(in4);
		System.out.println(in5);
		
		// 다른 객체 연습하기
		
		String str6 = "클라우드" ;
		String str7 = "클라우드" ;
		String str8 = new String ("클라우드") ;
		
		System.out.println(str6 == str7);
		System.out.println(str7 == str8);
		System.out.println(str6.equals(str8));
		
		
		

	}

}
