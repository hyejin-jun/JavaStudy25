package ch05.overrede.airplane;

public class SonicAirplane extends Airplane{	// 자식 클래스
	public static final int NORMAL = 1 ; // 일반 비행
	public static final int SUPERSONIC = 2 ; // 초음속 비행
	
	public int flyMode = NORMAL ;	// 기본 비행 모드는 일반 비행

	@Override
	public void fly() {	// 오버레이드
		if (flyMode == SUPERSONIC) {
			System.out.println("초음속 비행합니다");
		} else {
		super.fly();	// 부모에서 제공하는 fly 메소드 호출
	}
	}
}
	


