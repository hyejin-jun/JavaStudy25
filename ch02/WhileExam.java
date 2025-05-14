package ch02;

import java.util.Scanner;

public class WhileExam {

	public static void main(String[] args) {
		// while문은 조건식이 true일 때만 반복한다
		// while문을 종료처리하고 싶으면 false 처리하면 된다
		// 무한반복용 코드를 작성할 때 사용한다

		Scanner inputInt = new Scanner(System.in); // 정수용
		Scanner inputChar = new Scanner(System.in); // 문자용

		boolean run = true; // 무한반복용 변수

		while (run) {
			System.out.println("======== 엠비씨 성적 처리 ========");
			System.out.println("1 번 누르면 교직원 관리로 이동합니다 !! ");
			System.out.println("2 번 누르면 학생 관리로 이동합니다 !! ");
			System.out.println("3 번 누르면 성적 관리로 이동합니다 !! ");
			System.out.println("9 번 누르면 프로그램을 종료합니다 !! ");
			System.out.print("1 ~ 9까지 입력하세요  >> ");
			int selectInt = inputInt.nextInt(); // 숫자 입력

			switch (selectInt) { // 키보드로 입력된 숫자를 판단하여 분기를 결정

			case 1: // C R U D 기법 맞추기
				boolean subRun = true;

				while (subRun) {
					System.out.println("교직원 관리로 이동하였습니다 !! ♡ ");
					System.out.println("A는 교직원 등록으로 이동합니다!! ♡ "); // C
					System.out.println("B는 교직원 보기으로 이동합니다!! ♡ "); // R
					System.out.println("C는 교직원 수정으로 이동합니다!! ♡ "); // U
					System.out.println("D는 교직원 삭제으로 이동합니다!! ♡ "); // D
					System.out.println("Z는 교직원 관리 메뉴를 종료합니다!! ♡");
					System.out.print("A ~ Z까지 입력하세요  >>  ");
					char subSelect = inputChar.next().charAt(0);
					// 문자열로 입력된 값 중에 맨앞 문자만 subSelect 변수에 넣음
					// 위에서 입력받은 알파벳을 처리

					switch (subSelect) {

					case 'A':
					case 'a':
						System.out.println("교직원 등록 메뉴로 이동하였습니다!! ♡"); // 교직원 등록 코드 작성
						break;

					case 'B':
					case 'b':
						System.out.println("교직원 보기 메뉴로 이동하였습니다!! ♡"); // 교직원 보기 코드 작성
						break;

					case 'C':
					case 'c':
						System.out.println("교직원 수정 메뉴로 이동하였습니다!! ♡"); // 교직원 수정 코드 작성
						break;

					case 'D':
					case 'd':
						System.out.println("교직원 삭제 메뉴로 이동하였습니다!! ♡"); // 교직원 삭제 코드 작성
						break;

					case 'Z':
					case 'z':
						System.out.println("프로그램을 종료합니다!! ♡"); // 프로그램 종료 코드 작성
						subRun = false;
						break;

					default:
						System.out.println("문자를 잘못 입력하였습니다 ㅠ_ㅠ!!");
						break;

					} // 교직원 관리용 switch문 종료

					// 교직원 관리용 코드 입력
				}
				break;

			case 2:
				System.out.println("학생 관리로 이동하였습니다 !! ♡ ");
				// 학생 관리용 코드 입력
				break;

			case 3:
				System.out.println("성적 관리로 이동하였습니다 !! ♡ ");
				// 성적 관리용 코드 입력
				break;

			case 9:
				System.out.println("프로그램을 종료하겠습니다 !! ♡ ");
				// 프로그램 종료 코드 입력
				run = false;
				break;

			default: // 위 조건에 해당하지 않는 값
				System.out.println("문자를 잘못 입력하였습니다 ㅠ_ㅠ!!");
				break;

			} // switch문 종료

		} // while문 종료

	} // main 메서드 종료

} // class 종료
