package ch02;

import java.util.Scanner;

public class ForExam {

	public static void main(String[] args) {
		// for문 작성해 보기 (1단에서 9단까지 모든 단이 곱하기가 되게 만들기)

		Scanner inputInt = new Scanner(System.in);

			
			// 앞단에 for문 구현
			for (int A = 5 ; A <= 8 ; A++) { // 2부터 9까지 1씩 증가
				System.out.println("=========" + A + " 단 ======"); 
				
				// 뒤단에 for문 구현
				for (int B = 3 ; B <= 6 ; B++) { // 1부터 9까지 1씩 증가
					System.out.println(A + " X " + B + " = " + (A*B));  }
			
		} // 두 번째 for 종료



	} // main 메서드 종료

} // class 종료
