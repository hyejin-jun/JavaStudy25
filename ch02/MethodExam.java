package ch02;

import java.util.Scanner;

public class MethodExam {

	public static void main(String[] args) {
		// 로그인창을 만들자 대신 메인 메서드와 리드 메서드를 활용하기

		Scanner inputInt = new Scanner(System.in); // 정수 입력 키보드

		boolean run = true;
		String id = "jjj";
		String pw = "1234";
		boolean session = false; // 로그인 저장용

		System.out.println("======= 엠비씨 엔터테인먼트에 오신 것을 환영합니다 =======");
		System.out.println("1 번을 누르시면 로그인 화면으로 이동합니다!!");
		System.out.println("2 번을 누르시면 아티스트 메뉴로 이동합니다!!");
		System.out.println("3 번을 누르시면 상품 메뉴로 이동합니다!!");
		System.out.println("4 번을 누르시면 상품 메뉴로 이동합니다!!");
		System.out.println("5 번을 누르시면 프로그램을 종료합니다!!");
		System.out.print("이용하고 싶은 번호를 입력해 주세요 >>>>  ");
		int menu = inputInt.nextInt(); // 메뉴 번호를 입력할 수 있는 객체 생성 (정수)

		while (run) {
			switch (menu) {
			case 1:
				System.out.println("로그인 화면으로 이동하였습니다!! ♡ ");

				session = LoginOk(id, pw, session);
				if (session) {
					System.out.print("로그인에 성공하였습니다!! 2 번부터 4 번 번호를 입력 후 메뉴를 이용해 주세요!!  >>  ");
				} else {
					System.out.println("로그인에 실패하였습니다 ㅠ_ㅠ !!");
				}  // else 종료
				break;

			case 2:
				System.out.println("아티스트 메뉴로 이동하였습니다!! ♡ ");
				break;

			case 3:
				System.out.println("상품 메뉴로 이동하였습니다!! ♡ ");
				break;

			case 4:
				System.out.println("노래 듣기 메뉴로 이동하였습니다!! ♡ ");
				break;

			case 5:
				System.out.println("프로그램을 종료합니다!! ♡ ");
				default:
					System.out.println("번호를 잘못 입력하였습니다 ㅠ_ㅠ!!");
				break;
			} // switch 종료
		} // while 종료

	} // main 메서드 종료

	static boolean LoginOk(String id, String pw, boolean session) {

		Scanner inputStr = new Scanner(System.in); // 문자 입력 키보드

		System.out.print("로그인할 아이디를 입력하세요  >>> ");
		String Loginid = inputStr.next(); // 아이디 입력할 창 생성 (문자)
		System.out.print("로그인할 패스워드를 입력하세요 >>> ");
		String Loginpw = inputStr.next(); // 패스워드를 입력할 창 생성 (문자)

		if (Loginid.equals(id) & Loginpw.equals(pw)) {
			System.out.println("로그인에 성공하였습니다!!! ");
			session = true; // session은 참이다
		} else {
			System.out.println("로그인에 실패하였습니다 ㅠ_ㅠ!!!");
			session = false; // session은 거짓이다
		} // else 종료 (case 1 종료)
		return session; // 리턴은 다시 시작한다는 뜻

	}  // 보조 메서드 종료

} // class 종료
