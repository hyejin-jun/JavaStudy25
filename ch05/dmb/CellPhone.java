package ch05.dmb;

public class CellPhone {	// 부모 클래스
	
	String model ;
	String color ;


	
	void powerOn() {System.out.println("전원을 켭니다");}
	void powerOff() {System.out.println("전원을 켭니다");}
	void bell() {System.out.println("벨이 울립니다");}
	void SendVoice (String massage) {System.out.println("자기: " + massage);}
	void receiveVoice(String massage) {System.out.println("상대방: " + massage);}
	void hangup() {System.out.println("전화를 끊습니다");}
	
	

}
