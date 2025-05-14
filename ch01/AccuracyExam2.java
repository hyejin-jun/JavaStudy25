package ch01;

public class AccuracyExam2 {

	public static void main(String[] args) {
		// 사과 1 개를 10 개로 쪼갤 때 소수점을 처리하지 말고 10으로 곱해서 활용을 해 보는 방식 (int 타입만 활용)
		
		int apple = 1 ;  // 사과 1 개
		int totalpiecieces = apple * 10 ;  // 10 조각 처리용
		int number = 7 ;  // 사과 7 조각
		int temp = totalpiecieces - number ;  // 10 조각 - 7 조각
		
		double result = temp / 10.0 ;  // 위에서 10 조각을 원위치
		System.out.println("사과 남은 조각 수: " + result);
		

	}

}
