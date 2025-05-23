package ch03;

import java.util.Scanner;

public class ProExam {


	public static void main(String[] args) { // 메인 메서드
		// 배열을 이용하여 자판기 프로그램을 구현하자
		
		Scanner inputInt = new Scanner(System.in);
		Scanner inputStr = new Scanner(System.in);
		Scanner inputChar = new Scanner(System.in);

		String[] menuName = null; // 메뉴 이름
		int[] menuS = null; // 메뉴 수량
		int[] menuww = null; // 메뉴 가격
		
		int[] juJoin = null ; // 로그인 아이디
		int sum23 = 0 ;
		int sum55 = 0 ;

		System.out.println("========== 자판기를 이용하세요 =========");
		System.out.println("A 누르면 관리자 모드로 이동합니다 !! ♡ ");
		System.out.println("B 누르면 사용자 이용 모드로 이동합니다 !! ♡ ");
		System.out.println("C 누르면 프로그램 종료로 이동합니다 !! ♡ ");
		System.out.print("번호를 입력해 주세요 >>>>>> ");
		char jp = inputChar.next().charAt(0); // 메뉴 입력 모드 키보드 생성

		boolean run = true;

		while (run) { // pp 와일 시작

			switch (jp) { // 자판 스위치 시작

			case 'A':
			case 'a':
				boolean jprun = true;
				while (jprun) { // 관리자 메뉴 와일 시작

					System.out.println("===== A.관리자 모드로 진입하였습니다 =====");
					System.out.println("1 번 누르면 관리자 로그인 메뉴로 이동합니다 !! ♡ ");
					System.out.println("2 번 누르면 메뉴 등록 메뉴로 이동합니다 !! ♡");
					System.out.println("3 번 누르면 메뉴 변경 메뉴로 이동합니다 !! ♡");	
					System.out.println("9 번 누르면 이전 메뉴로 이동합니다 !! ♡");
					System.out.print("번호를 입력하세요 !! ♡ >>>>>> ");
					int menu = inputInt.nextInt();

					switch (menu) { // 메뉴 스위치 시작

					case 1:
						System.out.println("관리자 로그인 메뉴로 이동합니다 !! ♡ ");

						String joinId = "jjj";
						String joinPw = "1234";

						boolean session = false; // boolean은 거짓이다

						session = loginOK(joinId, joinPw, session);

						if (session == true) {
							System.out.println(joinId + " 님 환영합니다 !! ♡ ");
						} else {
							System.out.println("로그인에 실패하였습니다 ㅠ_ㅠ");
						} // else 종료
						break; 

					case 2:
						System.out.println("피자 메뉴 입력으로 이동하였습니다 !! ♡ ");
						System.out.print("피자 등록할 메뉴의 수량을 입력해 주세요 !! ♡ >>>  ");
						int dd = inputInt.nextInt();

						menuName = new String[dd]; // 피자 수량 배열
						menuS = new int[dd]; // 피자 수량 배열
						menuww = new int[dd]; // 피자 수량 배열

						menuJoin(menuName, menuS, menuww); {
						System.out.println("피자가 등록되었습니다!! ♡ ");
					} // 자판기 메뉴 메서드 생성
						break;

					case 3:
						System.out.println("피자 메뉴 변경 메뉴로 이동하였습니다 !! ♡ ");
						meunCh(menuName, menuS, menuww); {
						System.out.println("피자 메뉴를 변경하였습니다 !! ♡ ");
					} // 자판기 메뉴 변경 메서드 생성
						break;


					case 9:
						System.out.println("이전 메뉴로 이동합니다 !! ♡ ");
						jprun = false;
						break;

					default:
						System.out.println("프로그램을 종료합니다 !! ♡ ");
						break;
					} // 관리자 메뉴 스위치 종료
				} // 관리자 메뉴 와일 종료

			case 'B':
			case 'b':
				System.out.println("B. 사용자 이용 모드로 진입하였습니다 !! ♡ ");

				boolean pmrun = true;

				while (pmrun) {// 와일 시작

					System.out.println("1. 피자 구매 메뉴로 이동하겠습니다 !! ♡ ");
					System.out.println("2. 관리자 호출 메뉴로 이동하겠습니다 !! ♡ ");
					System.out.println("3. 랜덤 박스 메뉴로 이동하겠습니다 !! ♡ ");
					System.out.println("4. 장바구니 메뉴로 이동합니다 !! ♡");
					System.out.println("9. 이전 메뉴로 이동하겠습니다 !! ♡ ");
					System.out.print("번호를 입력해 주세요 !! ♡  >>>>> ");
					int pm = inputInt.nextInt();

					switch (pm) {

					case 1:
						boolean ioi = true ;
						
						if (ioi == true) {
						System.out.println("피자 구매 메뉴로 이동하였습니다 !! ♡ ");
						juiceJoin(menuName, menuS, menuww, juJoin, ioi);}
						
						
						break;

					case 2:
						System.out.println("관리자 호출 메뉴로 이동하였습니다 !! ♡ ");
						System.out.println(" ");
						System.out.println("관리자 번호는 010-1234-5678입니다 !! ♡ ");
						break;

					case 3:

						String totalnn = "랜덤"; // 랜덤 글자를 입력하면 랜덤 박스가 나오게 인식

						Scanner inputString1 = new Scanner(System.in);

						System.out.print("랜덤 글자를 입력하시면 랜덤 박스가 지정이 됩니다! >> ");
						String ovv = inputString1.next(); // 글자 적을 수 있는 칸을 생성

						if (totalnn.equals(ovv)) { // 첫 번째 if문
							// 랜덤이라는 글자가 맞아야 함!! (자꾸 아래에 다른 게 출력이 되면 아래로 보낸다고 생각!!
							int total = (int) (Math.random() * 100) + 1;
							System.out.println("랜덤 번호를 출력 중입니다!! ♡ "); // true
							System.out.println("회원님의 랜덤 숫자는 " + total + " 입니다");

							if ((total > 0 && total <= 100))
								if (total >= 90) { // 두 번째 if 시작

									System.out.println("회원님의 공짜 불고기 피자입니다!! ♡ "); // 두 번째 if 종료
								} else if (total >= 80) {
									System.out.println("회원님의 공짜 포테이토 피자입니다!! ♡");
								} else if (total >= 70) {
									System.out.println("회원님의 공짜 콜라입니다!! ♡ ");
								} else { // 첫 else 시작
									System.out.println("회원님의 꽝입입니다!! ♡ ");
								} // else 종료
						} // 첫 번째 if 종료
						else { // 두 번째 else 시작
							System.out.println("문자를 잘못 입력하였습니다 ㅠ_ㅠ 확인해 주세요 !! ♡ "); // false
						} // 두 번째 else 종료
							// 랜덤이라는 글자 입력하면 인식되는 if 코드 (false일 경우 문자 오류라고 뜬다)
						break;

						
					case 4:
						System.out.println("장바구니 메뉴로 이동하였습니다 !! ♡ ");
						meunsum(menuName, menuS, menuww, juJoin);
						break;
						

					case 9:
						System.out.println("프로그램을 종료합니다 !! ♡ ");
						pmrun = false;
						break;

					default:
						System.out.println("번호를 잘못 입력하였습니다 !! ♡ ");
						break;
					} // 관리자 스위치 종료
				} // 관리자 와일 종료
				break;

			case 'C':
			case 'c':
				System.out.println("이전 메뉴로 이동합니다 !! ♡ ");
				run = false;
				break;

			default:
				System.out.println("번호를 잘못 입력하였습니다 !! ♡ ");
				break;
			} // jp 자판 스위치 종료
			break;
		} // jp 자판 와일 종료

	} // 메인 메서드 종료


	






	static void menuJoin(String[] menuName, int[] menuS, int[] menuww) { // 메뉴 입력 메서드

			Scanner inputStr = new Scanner(System.in);
			Scanner inputInt = new Scanner(System.in);

			for (int i = 0; i < menuName.length; i++) {

				System.out.print("등록하실 메뉴의 이름을 입력하세요 !! ♡  >>> ");
				menuName[i] = inputStr.next();
				System.out.print("등록하실 메뉴의 수량을 입력하세요 !! ♡  >>> ");
				menuS[i] = inputInt.nextInt();
				System.out.print("등록하실 메뉴의 가격을 입력하세요 !! ♡  >>> ");
				menuww[i] = inputInt.nextInt();

			} // 폴 종료

			System.out.println("메뉴 등록이 되었습니다 !! ♡ ");

		} // 메뉴 입력 메서드 종료


	static void meunCh(String[] menuName, int[] menuS, int[] menuww) { // 메뉴 변경 메서드

	
			Scanner inputStr = new Scanner(System.in);
			Scanner inputInt = new Scanner(System.in);

			System.out.print("변경할 메뉴의 이름을 입력하세요 !! ♡  >>> ");
			String meunName11 = inputStr.next();

			for (int i = 0; i < menuName.length; i++) {

				if (menuName[i].equals(meunName11)) {
					System.out.println("변경할 메뉴의 항목을 확인하세요 !! ♡ ");
					System.out.println("변경할 메뉴:   " + menuName[i]);
					System.out.println("변경할 수량:  " + menuS[i]);
					System.out.println("변경할 가격:  " + menuww[i]);
					System.out.println("========================");
					System.out.print("변경할 메뉴:   " + menuName[i]);
					menuName[i] = inputStr.next();
					System.out.print("변경할 수량:   " + menuS[i]);
					menuS[i] = inputInt.nextInt();
					System.out.print("변경할 가격:   " + menuww[i]);
					menuww[i] = inputInt.nextInt();
					System.out.println("수정 완료 !! ♡ ");

					System.out.println("메뉴: " + menuName);
					System.out.println("수량: " + menuS);
					System.out.println("가격: " + menuww);
					System.out.println("============");
					break;
				} // 이프 종료
				else {
					System.out.println("찾는 메뉴가 없습니다 !! ♡ ");
				} // 엘스 종료

			} // 폴 종료

		} // 메뉴 수정 메서드 종료
		
	private static void meunsum(String[] menuName, int[] menuS, int[] menuww, int[] juJoin) {  // 장바구니 메뉴
		
		Scanner inputStr = new Scanner(System.in);
		Scanner inputInt = new Scanner(System.in);
		
		System.out.print("담으실 메뉴의 이름을 입력하세요 !! ♡  >>> ");
		String meunName11 = inputStr.next();
		System.out.print("담으실 수량을 입력하세요 !! ♡  >>> ");
		int meunS11 = inputInt.nextInt();

		for (int i = 0; i < menuName.length; i++) {

			if (menuName[i].equals(meunName11)) {
	
				System.out.println("장바구니에 담겼습니다 !! ♡ ");
				System.out.println("장바구니에 담긴 메뉴 " + meunName11);
				System.out.println("장바구니에 담긴 수량 " + meunS11);

				int ss = menuS[i] - meunS11 ;
				System.out.println("해당 상품의 재고: "  + ss   + "  개입니다 ");
				
			}	else {
					System.out.println("찾는 메뉴가 없습니다 !! ♡ ");

			} // 이프 종료
			
			}  // 폴 종료
} // 장바구니 메서드 종료
		

		
	static boolean juiceJoin(String[] menuName, int[] menuS, int[] menuww, int[] juJoin, boolean ioi) {  // 피자 구매 매서드
		
			Scanner inputStr = new Scanner(System.in);
			Scanner inputInt = new Scanner(System.in);

			
		
			System.out.print("구매하고 싶은 메뉴를 입력하세요  !! ♡ >>> ");
			String juiceJJ = inputStr.next();
			System.out.print("구매하고 싶은 메뉴의 수량을 입력하세요  !! ♡ >>> ");
			int juJoinkk = inputInt.nextInt();

			
			for (int i = 0; i < menuName.length; i++) {

				if (juiceJJ.equals(menuName[i])) {
					int sum11 =  juJoinkk * menuww[i];


					System.out.println("구매하고 싶은 메뉴의 가격은  " + sum11 + " 원입니다 !! ♡ ");
					int sum55 = menuS[i] - juJoinkk  ;
					System.out.println("해당 메뉴의 남은 수량은  " + sum55 + "   개입니다!! ♡ ");
				
					break;
					// 폴 종료
				} else {
					System.out.println("입력하신 메뉴는 자판기에 없습니다 ㅠㅠ !! ♡ ");
				} // 엘스 종료
			} // 폴 종료
			return ioi;

		} // 음료 구매 메서드 종료

	static boolean loginOK(String joinId2, String joinPw2, boolean session) { // 관리자 로그인 메서드

		Scanner inputStr = new Scanner(System.in); // 문자열

		System.out.print("로그인할 아이디를 입력해 주세요 !! >>>  ");
		String loginid = inputStr.next(); // 로그인할 객체 생성
		System.out.print("로그인할 패스워드를 입력해 주세요 !! >>  ");
		String loginpw = inputStr.next(); // 패스워르 입력할 객체 생성

		if (loginid.equals(joinId2) & loginpw.equals(joinPw2)) {
			System.out.println("로그인에 성공하였습니다!! ♡");
			session = true;
		} else {
			System.out.println("로그인에 실패하였습니다 ㅠ_ㅠ");
			session = false ;

		} // else 종료

		return session;
	} // 관리자 로그인 종료

	

	

} // 클래스 종료
