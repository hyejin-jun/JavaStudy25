package ch05.dmb;

public class DmdCellPhone extends CellPhone{

	int channel;	// 자식 필드 추가

	public DmdCellPhone(String model, String color, int channel) {
			// 수퍼는 자동으로 받아진다
		
		this.model = model ;
		this.color = color ;
		this.channel = channel ;
		
	}

	void turnOnDmd () {
		System.out.println("채널 " + channel + " 번의 DMB 방송 수신을 시작합니다");
	}	// 방송 시작
	
	void changeChannelDmb (int channel) {
		this.channel = channel ;	// 채널 번호를 입력받아 채널 변경 진행
		System.out.println("채널을 " + channel + " 번으로 변경합니다");
	}	// DMB 채널 변경
	
	void turnOffDmb () {
		System.out.println("DMB 방송 수신을 중지합니다");
	}	// DMB 방송 종료
	
	

}
