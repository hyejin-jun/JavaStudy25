package ch05.overred;

public class Computer extends Calculator{	// 자식 클래스
	@Override
	double areaCircle(double r) {	// 부모 객체 부르고 오버레이드 부르면 자동으로 입력
		System.out.println("Calculator 객체의 areaCircle() 실행");
		return Math.PI * r* r ;
	}

}

