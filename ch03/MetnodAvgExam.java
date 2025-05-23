package ch03;

public class MetnodAvgExam {

	public static void main(String[] args) {
		// 메서드를 활용한 평균 계산
		
		int sum = add (new int[] {70, 80, 90}) ;
		System.out.println("총합:    " + sum);
		
		int tot1 = add (new int[] {40, 80, 90}) ;
		System.out.println("1 반 총합:    " + tot1);
		int tot2 = add (new int[] {10, 60, 90}) ;
		System.out.println("2 반 총합:    " + tot2);
		int tot3 = add (new int[] {20, 40, 80}) ;
		System.out.println("3 반 총합:    " + tot3);

	}

	private static int add(int[] scores) {
		// 총합 계산 메서드
		
		int sum = 0 ;
		for (int i = 0 ; i < 3 ; i++) {
			sum += scores[i] ;
		} // 폴 종료
			
		return sum;
	}

}
