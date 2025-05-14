package ch02;

import java.util.Scanner;

public class SwitchExam {

	public static void main(String[] args) {
		// Switch는 조건 제어문이다.
		// 조건이 맞으면 case에 있는 실행문이 실행된다.
		// if문은 true나 false의 조건이 2 개 있지만 Switch문은 여러 개의 조건 결과를 받는다.
		
		// 성적 처리 프로그램 만들기
		// key point: C(생성) R(읽기) U(수정) D(삭제)
		// 교직원:
		// 학생: 
		// 성적:
		// 프로그램 종료:
		
		
		// 메뉴 구현 (알파벳을 눌러서 메뉴로 진입)
		
		Scanner input = new Scanner (System.in) ;
		System.out.println("==============================");
		System.out.println("=========엠비씨 아카데미==========");
		System.out.println("=======성적 처리 프로그램=========");
		System.out.println("==============================");
		System.out.println("A: 교직원 관리");
		System.out.println("B: 학생 관리");
		System.out.println("C: 성적 관리");
		System.out.println("Z: 프로그램 종료");
		System.out.print("(A ~ Z) >>>>> ");
		
		char select = input.next().charAt(0);
		// System.out.print("선택한 문자: " + select);
		
		switch (select) {
		
		case 'a':
		case 'A':
			System.out.println("교직원 관리 메뉴로 진입하였습니다!!"); 
			System.out.println("1: 교직원 등록");
			System.out.println("2: 교직원 보기");
			System.out.println("3: 교직원 수정");
			System.out.println("4: 교직원 삭제");
			System.out.print("(1 ~ 4)  >>>> ");
			int subSelect = input.nextInt();
			switch (subSelect) {
			
				case 1:
				System.out.println("교직원 등록 메뉴입니다!!"); break;
				case 2:
				System.out.println("교직원 보기 메뉴입니다!!"); break;
				case 3:
				System.out.println("교직원 수정 메뉴입니다!!"); break;
				case 4:
				System.out.println("교직원 삭제 메뉴입니다!!"); break;
				default:
				System.out.println("숫자를 잘목 입력하였습니다!! 1 ~ 4만 입력 가능합니다!!");
				System.out.println("프로그램을 다시 실행하세요!!");	}  // 교직원 스위치문 종료
			break;
			
					case 'b':	
					case 'B':
						System.out.println("학생 관리 메뉴로 진입하였습니다!!"); break;
					case 'c':
					case 'C':
						System.out.println("성적 관리 메뉴로 진입하였습니다!!"); break;
					case 'z':
					case 'Z':
						System.out.println("프로그램을 종료합니다!!"); break;
					default: System.out.println("메뉴에 없는 문자를 넣었습니다!!"); 
					System.out.println("프로그램을 다시 실행해 주세요!!"); break; }  // switch문 종료
		
		

	}

}
