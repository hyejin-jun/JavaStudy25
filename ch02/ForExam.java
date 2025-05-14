package ch02;

import java.util.Scanner;

public class ForExam {

	public static void main(String[] args) {
		// for문은 반복문으로 초기화식, 조건식, 증감식으로 만든다.
		// for(int i = 0 ; ㅑ < 10 ; i++) { 반복 실행문 ; }
		// i는 0부터 10 이전까지 1씩 반복하는 실행문
		// for문에서 사용하는 i 초기값은 for{} 끝나면 사라진다.

		Scanner inputInt = new Scanner(System.in);
		System.out.println("확인할 max 값을 입력하세요!! ");
		System.out.print("숫자 입력 >>>  ");
		int max = inputInt.nextInt(); // 키보드로 입력한 숫자를 max 변수에 넣음
		System.out.println("확인할 min 값을 입력하세요!! >>>  ");
		System.out.print("숫자 입력 >>>  ");
		int min = inputInt.nextInt(); // 키보드로 입력한 숫자를 min 변수에 넣음

		System.out.println("확인할 증가값 값을 입력하세요!! >>>  ");
		System.out.print("숫자 입력 >>>  ");
		int add = inputInt.nextInt(); // 키보드로 입력한 숫자를 add 변수에 넣음

		System.out.println(min + " ~ " + max + " 까지" + add + "증가값을 출력해 보자!!");

		int total = 0;
		// total = total1 + 1 ; // * 100 번을 써야 한다

		for (total = min; total <= max; total = total + add) {
			// total += total = add
			System.out.println("출력 테스트: " + total);

		} // for문 종료

	} // main 메서드 종료

} // class 종료문
