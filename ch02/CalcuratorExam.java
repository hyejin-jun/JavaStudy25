package ch02;

import java.util.Scanner;

public class CalcuratorExam {

	static int plus(int x1, int x3) {
		int x4 = 0;
		x4 = x1 + x3;
		return x4;
	} // plus 메서드 종료

	static int minus(int x1, int x3) {
		int x4 = 0;
		x4 = x1 - x3;
		return x4;
	} // minus 메서드 종료

	static int times(int x1, int x3) {
		int x4 = 0;
		x4 = x1 * x3;
		return x4;
	} // times 메서드 종료

	static int divide(int x1, int x3) {
		int x4 = 0;
		x4 = x1 / x3;
		return x4;
	} // divide 메서드 종료

	public static void main(String[] args) {
		// 간단한 계산기 프로그램 만들기
		// 입력 받기 : 숫자 > 연잔자 > 숫자
		// 연산자별로 메서드에 숫자 넣기 (입력받는 순서에 맞춰서 조금 귀찮지만 메서드에서 해결하기)
		// 결과값 main 매서드에서 출력해 주기 (return 받기)
		// 완료 반복 재생 가능하게 while문 사용하기 (다시 실행하겠습니까 or 이어서 계산 계산하겠습니까)

		int x1 = 0, x2 = 0, x3 = 0, x4 = 0, x5 = 0; // 변수 4 개

		boolean run = true, run2 = true; // while문 boolean

		String y1 = "연산기호"; // 정답 표시용

		Scanner scInt = new Scanner(System.in); // 스캐너 입력 코드

		while (run) {
			if (x1 == 0) {
				System.out.print("정수 계산기 !! 숫자를 입력해 주세요 >> ");
				x1 = scInt.nextInt();
			} // if 종료

			System.out.print("부호를 선택해 주세요!! 1 번: 더하기, 2 번: 빼기 , 3 번: 곱하기, 4 번: 나누기");
			x2 = scInt.nextInt();

			System.out.print("숫자를 입력해 주세요 범위 내에서만!! >>> ");
			x3 = scInt.nextInt();

			run = true;

			switch (x2) {

			case 1:
				x4 = plus(x1, x3);
				y1 = " + ";
				break;

			case 2:
				x4 = minus(x1, x3);
				y1 = " - ";
				break;

			case 3:
				x4 = times(x1, x3);
				y1 = " x ";
				break;

			case 4:
				x4 = divide(x1, x3);
				y1 = " ÷ ";
				break;
			// default는 생략
			} // switch (x2) 종료

			System.out.println("계산 결과:  " + x1 + " " + y1 + " " + x3 + " = " + x4);

			while (run2) { // while (run2) 시작
				if (x4 != 0) {
					System.out.print("1 번: 종료하기, 2 번: 다시하기, 3 번: 이어서 계산하기   >>   ");
				} else {
					System.out.print("1. 종료하기, 2 번: 다시하기   >>>  ");
				} // else 종료

				x5 = scInt.nextInt();

				switch (x5) {

				case 2:
					x1 = 0;
					x2 = 0;
					x3 = 0;
					run2 = false;
					break;

				case 3:
					x1 = x4;
					x2 = 0;
					x3 = 0;
					run2 = false;
					break;

				case 1:
					run = false;
					run2 = false;
					break;
				default:

					System.out.println("숫자를 잘못 입력하였습니다!! 다시 입력해 주세요 !!");

				} // switch문 종료

			} // while(run2) 종료

		} // while(run1) 종료

	} // main 메서드 종료

} // class 종료
