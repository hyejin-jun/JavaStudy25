package ch02;

import java.util.Scanner;

public class DoWhileExam {

	public static void main(String[] args) {
		// 메신저를 만들어 보자
		
		System.out.println("메시지를 입력하세요 >>> ");
		System.out.print("프로그램을 종료하려면 z를 입력하세요 >>>   ");
		
		Scanner in = new Scanner (System.in);
		String inputString ; // 키보드로 입력받은 값 저장용
		
		do {

			inputString = in.nextLine() ;  // String 값을 입력받는다.
			System.out.println("ㅇㅇ 님이 보내는 메시지:  "  + inputString);
			System.out.print( " ㅇㅇ 님에게 보낼 메시지 입력 >>> ");
		}
		while (!inputString.equals("z"));
		System.out.println("=========");
		System.out.println("프로그램을 종료합니다!! ");
		System.out.println("=========");
			
		

	}  // mail 메서드 종료

}  // class 종료
