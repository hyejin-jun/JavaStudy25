package ch05.dmb;

public class DmbCellPhoneExam extends CellPhone{



	public static void main(String[] args) { // 메인 메서드
		
		DmdCellPhone dmbPhone = new DmdCellPhone("디엠비폰", "빨강", 10);
		
		System.out.println("모델: " + dmbPhone.model);
		System.out.println("색상: " + dmbPhone.color);	// 부모로부터 받은 필드 활용
		System.out.println("채널 번호: " +dmbPhone.channel);
		System.out.println("-----------------------------------");	// 전화에 대한 부모 메서드 활용
		dmbPhone.powerOn(); // 전원 on
		dmbPhone.bell(); // 전화벨 on
		dmbPhone.SendVoice("여보세요");
		dmbPhone.receiveVoice("안녕하세요 전혜진입니다");
		dmbPhone.SendVoice("반갑습니다 ^~^");
		dmbPhone.receiveVoice("테스트를 종료합니다 안녕히 계세요");
		dmbPhone.hangup();	// 전화 종료
		System.out.println("---------------------------------");
		
		dmbPhone.turnOnDmd();	// dmb 전원 on
		dmbPhone.changeChannelDmb(12); 	// 채널 변경
		dmbPhone.turnOffDmb();	// dmb 전원 off
		
		
	}

}
