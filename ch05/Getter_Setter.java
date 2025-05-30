package ch05;

public class Getter_Setter {
	// 필드
	
	private int speed ;
	private boolean stop ;	// 공용 메소드
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		if (speed <0) {
		this.speed = 0;
		return ;
	} else {
		this.speed = speed ;
	}	// speed 입력값이 음수면 0으로 입력
	}
	public boolean isStop() {
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0 ;
	}	// stop 값이 true면 스톱을 진행하고 스피드 0으로 조절
	

	
}
