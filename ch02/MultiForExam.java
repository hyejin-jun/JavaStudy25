package ch02;

public class MultiForExam { // class 시작
 
	public static void main(String[] args) {  // main 시작
		// for문 안쪽에 또다른 for문을 넣어 테스트한다.
		// 구구단을 만들어 보자.
		// 처음은 2 * 1 = 2 ~ 2 * 9 = 18
		// 마지막에는 9 * 1 = 9 ~ 9 * 9 = 81
		
		// 앞단에 for문 구현
		for (int m = 2 ; m <= 9 ; m++) { // 2부터 9까지 1씩 증가
			System.out.println("=========" + m + " 단 ======"); 
			
			// 뒤단에 for문 구현
			for (int n = 1 ; n <= 9 ; n++) { // 1부터 9까지 1씩 증가
				System.out.println(m + " X " + n + " = " + (m*n));  }
			
		}
		

	}  // main 메서드 종료

}  // class 종료
