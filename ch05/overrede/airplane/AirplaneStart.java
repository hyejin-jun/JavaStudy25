package ch05.overrede.airplane;

public class AirplaneStart {

	public static void main(String[] args) {	// 비행기 운행
		SonicAirplane sa = new SonicAirplane() ;
		sa.takeOff();	// 이륙
		sa.fly();		// 일반 비행
		sa.flyMode = SonicAirplane.SUPERSONIC ;	// 수퍼소닉 모드로 변경
		sa.fly(); 		// 초음속 모드
		sa.flyMode = SonicAirplane.NORMAL ;		// 일반 비행 모드로 변경
		sa.fly(); 		// 일반 비행
		sa.land(); 		// 착륙
		
	}

}
