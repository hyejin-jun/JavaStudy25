package ch01;

public class AccuracyExam1 {

	public static void main(String[] args) {
		// 사과 1 개를 10 조각으로 쪼개면 1 조각이 0.1로 1 개가 된다.
		
		int apple = 1 ;  // 사과 1 개
		double pieceUint = 0.1 ;  // 조각 단위
		int number = 7 ;  // 7 개의 조각
		
		double result = apple - number*pieceUint ;
		System.out.println("사과 7 조각을 뺀 값: " + result);  // 결과값: 0.29999999999999993
		
		System.out.println("7 조각의 값: " + number * pieceUint );  // 결과값: 0.7000000000000001
		
		// 결론: 정확한 계산을 위해서는 실수 타입을 사용하지 않는 것이 좋다.
		
		
		

	}

}
