package ch04.calculator;

public class CalculatorExam {

	public static void main(String[] args) {
		// 정적 메서드에 저장된 계산기 활용하기
		// 이미 new가 저장된 상태
		
		
		double res1 = 10 * 10 * Calculator.pi ;	// Calculator에 저장된 파이 값을 가지고 온다
		int res2 = Calculator.plus(10, 20) ;	// x는 10, y는 20이라고 객체에 박히며 그 값을 계산한다
		int res3 = Calculator.minus(50, 30) ;	// x는 50, y는 30이라고 박히며 그 값을 계산한다
		
		System.out.println("res1은: " + res1);
		System.out.println("res2은: " + res2);
		System.out.println("res3은: " + res3);
		
		
		
		

	}

}
