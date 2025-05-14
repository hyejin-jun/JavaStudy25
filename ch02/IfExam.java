package ch02;

import java.util.Scanner;

public class IfExam {

	public static void main(String[] args) {
		// If(조건문) {실행문}
		// 조건문에 true가 처리되면 중괄호 안쪽이 실행된다
		// 조건문에 false가 처리되면 중괄호 안쪽이 실행되지 않는다
	
		Scanner input = new Scanner (System.in) ;
		// 키보드로 입력받을 수 있는 객체를 생성하여 input 변수에 연결
		
		System.out.print("귀하의 성함을 입력하세요!! ");
		System.out.print(">>> ");
		String name = input.next() ;  // 키보드로 입력받은 이름을 name 변수에 넣음
		
		
		System.out.print("귀하의 점수를 입력하세요!! ");
		System.out.print(">>> ");
		
		int score = input.nextInt() ; // 키보드로 입력받은 정수를 score에 넣음
		
		if (score > 0 && score <= 100) {  // 0보다 크거나 100 이하이면 true
			if (score >= 90) { // score 변수에 입력된 값이 90 이상인지 묻는 코드
				System.out.println(name + " 님이 임력하신 점수가 90 점 이상입니다.");
				System.out.println("점수: " + score + " 점 등급 A");
			}

			else if (score >= 80) {
				System.out.println(name + " 님이 임력하신 점수가 89 ~ 80 점 이상입니다.");
				System.out.println("점수: " + score + " 점 등급 B");
			}

			else if (score >= 70) {
				System.out.println(name + " 님이 임력하신 점수가 79 ~ 70 점 이상입니다.");
				System.out.println("점수: " + score + " 점 등급 C");
			}

			else if (score >= 60) {
				System.out.println(name + " 님이 임력하신 점수가 69 ~ 60 점 이상입니다.");
				System.out.println("점수: " + score + " 점 등급 D");
			}

			else {
				System.out.println(name + " 님이 입력하신 점수가 낮아 등급이 F로 산출되었습니다.");
				System.out.println("점수: " + score + " 점 등급 F");
			}  // 정상값이 입력되었을 때 실행문
		} 
		else { System.out.println(name + " 님 입력값을 확인해 주세요!!");
		System.out.println("현재 입력값은 " + score + " 점입니다" );
		}
		System.out.println("프로그램이 종료되었습니다!!"); 
		
		

	}  // main 메서드 종료 > 변수(input, name, score)가 사라짐

}  // class 종료 > 메서드가 사라짐 > 프로그램 종료
