package ch02;

public class KeyBordExam {

	public static void main(String[] args) 
		// 키보드를 입력하고 숫자에 따라 속도 증감 확인 
		
		throws Exception { // throws Exception 적어야 인식이 된다
			
			boolean run = true ; // 실행여부 판단
			int speed = 50 ; // 현재 속도 50
			int keyCode = 0 ; // 키보드로 입력되는 값
			
			while (run) { // run 초기값이 true 때문에 주행 중이라는 것
				if (keyCode != 13 && keyCode != 10 ) { // 엔터가 아니면
					System.out.println("================");
					System.out.println("1. 엑셀  |  2. 브레이크  |  3. 중지  ");
					System.out.println("================");
					System.out.print("선택 번호를 입력하세요 >>> ");
					
				}
				keyCode = System.in.read();
				// System.out.println (keyCode);
				
				if (keyCode == 49) {
					speed += 5 ;
					System.out.println("현재 속도:  " + speed);
				} else if (keyCode  == 50) {
					speed -=5;
					System.out.println("현재 속도:   " + speed);
				} else if (keyCode == 51) {
					run = false ;
					System.out.println("크루즈 기능이 종료됩니다!! ");
					System.out.println("현재 속도:   " + speed);
					System.out.println("안전 운전하세요!!  ");
				}
			}
			System.out.println("프로그램을 종료합니다!! ");
	
				

		} // main 메서드 종료

}  // class 종료
