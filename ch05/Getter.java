package ch05;

public class Getter {
	private int speed;		// 개인적인 필드 선언

	double getSpeed() {	// 게터 설정
		double km = speed * 1.6;
		return km ;			// 마일을 km로 환산하는 결과
		

	}


	
}
