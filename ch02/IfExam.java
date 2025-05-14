package ch02;

import java.util.Scanner;

public class IfExam {

	public static void main(String[] args) {
		// if문 else문 및 equalsIgnoreCase문 활용하기

		
	Scanner input = new Scanner (System.in) ;
	
	System.out.print("성적 확인할 학생 성함을 입력해 주세요!! >> ");
	String name = input.next() ;
	
	System.out.print("성적 확인할 학생의 점수를 입력해 주세요!! >> ");
	int star = input.nextInt() ;  // int문 이용
	
	System.out.print("성적을 확인하고 싶으면 yes 문구를 입력해 주세요!! >>  ");
	String or = input.next() ;
	name.equalsIgnoreCase("yes") ;  // equalsIgnoreCase문
	
	
	if (star > 0 && star <= 100) {
		
		if (star >= 90) {  
		 System.out.println("학생의 등급은 A입니다!! "); }
		
		else if (star >= 80)  
		{ System.out.println("학생의 등급은 B입니다!! "); }
		
		else if (star >= 70) 
		{ System.out.println("학생의 등급은 C입니다!! "); }
		
		else { System.out.println("학생의 등급은 F입니다!! "); } } // if문 종료
		
		else {System.out.println("문자를 잘못 입력하였습니다 ㅠ_ㅠ "); }
			System.out.println("프로그램을 종료합니다!! ");
		
	
	
	}  // main 메서드 종료

}  // class 종료
