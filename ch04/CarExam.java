package ch04;

import java.util.Random;
import java.util.Scanner;

import javax.swing.border.MatteBorder;

public class CarExam {

	

	public static void main(String[] args) {
		// 주 실행코드 생성

		Scanner input = new Scanner(System.in);

		String[] pic = {"서울", "경기도", "강원도", "충청도", "경상도", "전라도", "제주도"} ;
		
	
			

		System.out.println("=======차량 정보를 입력합니다========");

		Car myCar = new Car(); // 객체 생성 (무조건 깔고 가야 함)

		System.out.print("차량 정보: ");
		myCar.company = input.next();
		System.out.print("모델 정보: ");
		myCar.model = input.next();
		System.out.print("색상 정보: ");
		myCar.color = input.next();

		boolean run = true;

		while (run) {
			System.out.println("1. 차량 정보 확인");
			System.out.println("2. 차량 시동 걸기");
			System.out.println("3. 차량 속도 충전");
			System.out.println("4. 차량 주행 시작");
			System.out.println("4. 차량 주행 종료");
			System.out.print("번호 입력 >>>>>>> ");
			String select = input.next();
			switch (select) {

			case "1":
				Car myCar1 = new Car();
				myCar1 = myCar.CarList(null);
				break;

			case "2":
				Car mycar2 = new Car () ;
				mycar2 = myCar.CarStart() ;
				
				break;
				
			case "3":
				Car myCar4 = new Car () ;
				myCar4 = myCar.CarSpeed() ;
				break;
			case "4":
				Car myCar3 = new Car();
				myCar3 = myCar.CarPic(pic) ;		
				break ;

			case "5":
				Car myCar5 = new Car () ;
				myCar5 = myCar.CarStop() ;
				break;
				

			}

		}

	}

}
