package ch01;

import java.util.Scanner;  // 외부 라이브러리


public class LogicalExam {

	public static void main(String[] args) {
		// 논리적인 연산자는 크게 5 가지 유형이 있다.
		// &: 논리 곱 > ~이고 (2 가지 변수가 모두 참일 경우 참)
		// |: 논리 합 > ~이거나 (2 가지 중 한 개라도 참이면 참)
		// !: 논리 부정 > 참과 거짓을 반전한다.
		// ^: 베타적 논리 합 > 논리 합의 마지막인 1 + 1 = 0으로 결론이 남
		
		String loginid = "kkw" ;
		String loginpw = "1234" ;
		
		Scanner input = new Scanner(System.in);
		// 콘솔에 키보드로 값을 밀어 넣을 객체를 생성함
		
		System.out.print("로그인할 ID를 입력하세요: ");  // 우리가 직접 입력한다.
		String id = input.nextLine();
		System.out.println("입력하신 ID는: " + id + "입니다.");  
		
		System.out.print("로그인할 암호를 입력하세요: ") ;
		String pw = input.nextLine();
		System.out.println("== 검증 중입니다. ==") ;
		
		if((loginid.equals(id)) & loginpw.equals(pw) ) {
			// 가지고 있던 ID와 키보드로 입력한 ID가 같은지
			// 이거나 or
			// 가지고 있던 PW와 키보드로 입력한 PW가 같은지
			System.out.println("ID나 PW가 일치합니다.") ;
			System.out.println("로그인 성공!!!!");
		} else {
			System.out.println("ID나 PW가 다릅니다.") ;
			System.out.println("로그인 실패!!!!");
		} // if문 중료


		
		
	}  // main 메서드 종료

}  // class 종료
