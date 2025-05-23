package ch04;

import java.nio.channels.Pipe;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicMenuBarUI;

public class Car<Pic> {

	private static final int myCar3 = 0;
// 필드

	public String company; // 회사 종류
	public String model; // 차량 모델
	public String color; // 색상
	public String oilType; // 기름 종류

	public int speed;
	public int rpm;
	public int oil;

	public Car() { // 생성자는 필드와 이름이 같아야 함
		speed = 50;
		rpm = 0;
	}

	public Car(String company, String model, String color) {
		this.company = company;
		this.model = model;
		this.color = color;
	} // 사용자 지정 생성자

	public void Start() {
		System.out.println("차량 정보를 입력합니다 ^~^");
		System.out.println("회사명: " + this.company);
		System.out.println("모델명: " + this.model);
		System.out.println("색상명: " + this.color);
	} // 시작 메서드 종료

	public Car CarList(Scanner input) {
		System.out.println("차량 정보를 확인합니다");

		System.out.println("차량 정보를 확인합니다 ^~^:   " + this.company);
		System.out.println("차량 모델를 확인합니다 ^~^:   " + this.model);
		System.out.println("차량 정보를 확인합니다 ^~^:   " + this.color);
		System.out.println("차량 정보를 확인하였습니다");
		return null;
	} // 차량 정보 메서드 종료

	public Car CarStart() { // 시동 걸기 메서드
		System.out.println("시동을 걸겠습니다");
		Car mycar2 = new Car();
		int maxSpeed11 = 500;

		int total = (int) (Math.random() * 1000) + 1;
		System.out.println("랜덤 번호를 출력 중입니다!! ♡ "); // true
		System.out.println("회원님의 랜덤 숫자는 " + total + " 입니다");

		if (total <= maxSpeed11) {
			System.out.println("시동이 걸렸습니다");
		} else if (total >= maxSpeed11) {
			System.out.println("시동이 되지 않습니다");
		} // 시동 걸기 메서드 종료
		return null;

	}

	public Car CarSpeed() {
		Scanner inputInt = new Scanner(System.in);
		Car myCar3 = new Car();

		System.out.println("속도를 충전합니다 ^~^ 스피드를 눌러 주세요 ^~^");
		System.out.println("충전 속도를 입력하세요:  50 / 100 / 150 / 0");
		System.out.print("번호를 입력해 주세요 >>>>>>>> ");
		int speed1 = inputInt.nextInt();
		
		switch (speed1) {
		
	
		
		case 50:
			System.out.println("50 을 충전하였습니다");
			break;
			
		case 100:
			System.out.println("100 을 충전하였습니다");
			break;
			
		case 150:
			System.out.println("150 을 충전하였습니다");
			break;
			
		case 0:
			System.out.println("충전을 중단합니다");
			break;
		default:
			System.out.println("번호를 잘못 입력하였습니다");
			break;
		}
		return myCar3 ;
	}  // 충전 메서드 종료

	public Car CarPic(String[] pic) {
		Scanner inputInt = new Scanner (System.in);
			
		if (myCar3 >= 300  && myCar3 <= 300) {
			System.out.println("차량 운행을 시작하겠습니다 ^~^");
			System.out.println("여행지는 랜덤으로 지정하겠습니다 ^~^");
			System.out.print("1에서 7까지의 숫자를 입력해 주세요 >>>   ");}
			int pic1 = inputInt.nextInt () ;
			  // 랜덤 숫자 입력할 객체
			String rr = pic[pic1] ;
			for (int i = 0 ; i <= 6 ; i++) {
			System.out.println("추천 여행지는 " + rr + " 입니다");
			break;
}   // 운행 메서드 종료
		return null;
	}// 운행 메서드 종료
	
	
	
		public  Car CarStop() {
			Scanner inputStr = new Scanner(System.in);
		
			
			System.out.println("운행을 종료하시려면 1 번 / 하지 않으시면 2 번을 눌러 주세요!!");
			String stop = inputStr.next () ;
			
			switch (stop) {
			case "1":
				System.out.println("운행을 종료합니다");
				int myCar3 = 0 ;
				break ;
			case "2" :
				System.out.println("운행을 종료하지 않겠습니다");
				break;
				
				default:
					System.out.println("번호를 잘못 입력하였습니다");			
					}  // 스위치 종료
			return null;
		} // 운행 종료 메서드 종료




}  // 메서드 종료
			
		


	
	// System.out.println("4. 차량 주행 종료");
