package ch02;

public class ForAndExam {

	public static void main(String[] args) {
		// for && 활용

		for (int q = 0, w = 50; q <= 10 && w > 20; q++, w--) {
			System.out.println("q의 플러스 값: " + q + "     ||  w의 마이너스 값: " + w);
			System.out.println("====================");
		} // for 종료

		// 1에서 45까지 더한 값
		int sum = 0;
		for (int e = 1; e <= 45; e++) {
			sum = sum + e;
		}

		System.out.println("e의 값은:  " + sum);

		System.out.println("====================");
		

		// 1에서 50까지 합 만들기
		int run = 0;
		int a = 2;
		for (; a <= 50; a++) {   // main 닫히는 거 주의하기
			run = run + a;
			System.out.println("1에서 " + (a - 1) + "의 합산은:  " + run);
		} // for 종료

	} // main 메서드 종료

} // class 종료
