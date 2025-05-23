package ch02;

import java.util.Scanner;

public class CarRunExam {

	public static void main(String[] args) {
		// 자동차 주행 프로그램 만들기
		// C - 시동 / R - 계기판 정보 출력 / U - 주행 / D - 시동 종료
		
		Scanner input = new Scanner (System.in);
		
		boolean run = true ;  // 시동을 켰다
		
		int speed = 0 ;  // 차량 속도
		
		final int MAXSPEED = 300 ;  // 최고 속도
		
		final int MINSPEED = 0 ;  // 최저 속도
		
		System.out.println("람보르기니가 입고되었습니다!! ");
		System.out.println("현재 속도:  " + speed + " km/h");
		
		while (run) {
		
		System.out.println("=============");
		System.out.println("0 번을 누르시면 시동이 종료됩니다!! ");
		System.out.println("1 번을 누르시면 엑셀이 실행됩니다!! ");
		System.out.println("2 번을 누르시면 브레이크가 실행됩니다!! ");
		System.out.println("3 번을 누르시면 멀티미디어가 실행됩니다!! ");
		System.out.println("4 번을 누르시면 주유가 실행됩니다!! ");
		System.out.println("=============");
		System.out.print("1부터 4의 숫자를 입력하세요 >>> ");
		
		int select = input.nextInt();
		
		switch(select) {
		case 0:
		System.out.println("시동을 종료합니다!! ");
		break;
		
		case 1:
			System.out.println("엑셀을 실행합니다!! ");
			speed += 30 ;
			if (speed >= MAXSPEED) { // 현재 속도가 최고 속도보다 크거나 같으면
				speed = MAXSPEED ; } // 300 이상 출력 안 됨
			System.out.println("현재 속도:   " + speed + " km/h");
			break;
			
		case 2:
			System.out.println("브레이크를 실행합니다!! ");
			speed -= 10 ;
			if (speed <= MINSPEED) {
				speed = MINSPEED;
			}
			System.out.println("현재 속도:   " + speed +  " km/h");
			break;
			
		case 3:
			System.out.println("멀티미디어를 실행합니다!! ");
			break;
			
		case 4:
			System.out.println("주유를 실행합니다!! ");
			break;
		} // switch 종료문
	} // while문 종료

	System.out.println("자동차가 사라집니다!! ");
		
		

} // main 메서드 종료

} // class 종료
