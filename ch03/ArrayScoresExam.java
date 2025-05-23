package ch03;

public class ArrayScoresExam {

	public static void main(String[] args) {
		// 배열을 이용하고 총점과 평균 만들기
		
		int [] scores = {83, 90, 87} ;
		
		System.out.println("스코어 1: " + scores[0]);
		System.out.println("스코어 2: " + scores[1]);
		System.out.println("스코어 3: " + scores[2]);
		
		int sum = 0;
		for (int i = 0 ; i < 3; i++) {
			sum += scores [i] ;
			
		}  // 폴 종료
		System.out.println("총점:  " + sum);
		double avg = (double) sum / 3 ;
		System.out.println("평균:  " + avg);
	}  // 메인 메서드 종료
 
} // 클래스 종료
