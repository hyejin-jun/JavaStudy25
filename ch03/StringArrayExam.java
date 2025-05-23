package ch03;

import java.util.Scanner;

public class StringArrayExam {

	public static void main(String[] args) {
		// 배열을 이용하여 성적표 만들기
		
		Scanner input = new Scanner (System.in) ;
		
		System.out.println("========== 성적표 ==========");
		System.out.print("학생 수를 입력하세요 >>>  ");
		
		int count = input.nextInt();
		
		int [] scores = new int [count] ;
		
		System.out.println("배열의 길이: " + scores.length);
		
		for (int i = 0 ; i < scores.length ; i++) 
		{ // 배열의 길이
			
			System.out.println(i + 1 + " 번째 학생의 점수를 입력하세요");
			
			scores[i] = input.nextInt();
		} // 학생 수만큼 배열의 점수를 입력한다
		
		System.out.println("입력된 점수 확인!!");
		
		for (int i = 0 ; i < scores.length ; i++) {
			System.out.println(scores[i] + "  ")  ; // 점수
		}
		
		System.out.print("수정할 번호 입력 >>> ");
		int select = input.nextInt() ;
		
		System.out.print("수정할 점수 입력  >>> ");
		
		int score = input.nextInt() ;
		
		scores [select - 1] = score ;
		
		System.out.println("수정한 확인 결과");
		System.out.println(select + " 번의 점수는: " + score + "로 수정 완료!!");  // 총점고 평균 구함
		
		int sum = total (scores) ;
		
		System.out.println("총점: " + sum + " 점입니다");
		
		double ave = average (sum, count);
		
		System.out.println("평균:  " + ave + " 점입니다");

	}  // 메인 메서드 종료

	private static int total(int[] scores) {  // 총합 메서드
		
		int sum = 0 ;
		for (int i = 0 ; i < scores.length ; i++) {
			sum += scores [i];
		} 
		return sum;
	}  // 총합 메서드 종료

	private static double average(int sum, int count) { // 평균 점수 메서드
		double ave = 0 ;
		ave = sum / count ;
	
		return ave;
	} // 평균 메서드 종료

	
	
}  // 클래스 종료
