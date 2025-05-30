package ch05;

public class CarExam {

	public static void main(String[] args) {
		// 자동차를 만들어 보자
		Getter_Setter myCar = new Getter_Setter() ;
		
		myCar.setSpeed(-50);	// 잘못된 속도 제공
		System.out.println("현재 속도: " + myCar.getSpeed());
		// 값을 제공할 때는 setter
		// 값을 받을 때는 getter
		
		myCar.setSpeed(60);		// 정상 속도 제공
		System.out.println("현재 속도: " + myCar.getSpeed());
		
		// 멈춤 테스트
		if (!myCar.isStop()) {
			myCar.setStop(true); 
		}
		System.out.println("현재 중지 상태: " + myCar.getSpeed());
		

	}

}
