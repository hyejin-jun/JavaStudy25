package ch01;

public class VariableExam {

	public static void main(String[] args) {
		
		int mach ;
		int distance ;
		mach = 340 ;
		distance = mach * 60 *60 ;  // 음속 (m/s으로 계산하였다.)
		
		System.out.println("소리가 1 시간 동안 가는 거리");
		System.out.println(distance + "m");
		
		double radius ;  // 실수 타입의 radius 변수 선언
		double area ;  // 실수 타입의 area 변수 선언
		// 실수 타입은 소수점이 있다.
		
		radius = 10 ;  // 초기값이 정수이지만 실수 타입으로 변경된다.
		area = radius * radius * 3.14 ;  // 원의 넓이 계산
		
		System.out.print("반지름이 " +  radius + " 인");
		System.out.println("원의 넓이 :" + area);
		
		

	}

}
