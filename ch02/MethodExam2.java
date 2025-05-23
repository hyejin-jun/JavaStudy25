package ch02;

import java.util.Scanner;

public class MethodExam2 {

	public static void main(String[] args) {
		// 만든 프로그램 응용하기

		Scanner inputchar = new Scanner(System.in); // 유니코드
		Scanner inputInt = new Scanner(System.in); // 정수
		Scanner inputString = new Scanner(System.in); // 문자열

		boolean run = true; // 무한 반복 코드

		while (run) { // 메뉴 while
			System.out.println(" ====== 엠비씨 엔터테인먼트에 오신 것을 환영합니다 ♡ ======");
			System.out.println(" ====== A를 누르시면 로그인 및 회원가입 메뉴로 이동합니다 !! ♡ ======");
			System.out.println(" ====== B를 누르시면 아티스트 메뉴로 이동합니다 !! ♡ ======");
			System.out.println(" ====== C를 누르시면 상품 메뉴로 이동합니다 !! ♡ ======");
			System.out.println(" ====== D를 누르시면 노래 듣기 메뉴로 이동합니다 !! ♡ ======");
			System.out.println(" ====== Z를 누르시면 프로그램을 종료합니다 !! ♡ ======");
			System.out.print(" ====== A부터  Z까지 입력해 주세요 !! ♡ ====== >>>>>> "); // 메뉴
			char menu = inputchar.next().charAt(0);

			switch (menu) { // 메뉴 switch

			case 'a':
			case 'A':
				boolean Loginrun = true;
				while (Loginrun) {
					System.out.println(" ====== 1을 누르시면 로그인 메뉴로 이동합니다 !! ♡ ======");
					System.out.println(" ====== 2를 회원가입 메뉴로 이동합니다 !! ♡ ======");
					System.out.println(" ====== 3을 누르시면 아이디 및 패스워드 찾기 메뉴로 이동합니다 !! ♡ ======");
					System.out.println(" ====== 4를 누르시면 이전 메뉴로 이동합니다 !! ♡ ======");
					System.out.print(" ====== 1부터 4까지 번호를 입력해 주세요 !! ♡  ====== >>>>>> "); // 로그인 및 회원가입 메뉴
					int Login11 = inputInt.nextInt();

					switch (Login11) {
					case 1:
						System.out.println("로그인 메뉴로 이동하였습니다 !! ♡   ");

						boolean A = true; // boolean은 참이다
						String id = "jjj";
						String pw = "1234";
						boolean session = false; // boolean은 거짓이다

						session = loginOK(id, pw, session);

						if (session == true) {
							System.out.println("로그인에 성공하였습니다!! ");
							System.out.println(id + " 님 환영합니다 !! ♡ ");
						} else {
							System.out.println("로그인에 실패하였습니다 ㅠ_ㅠ");
						} // else 종료
						break; // D - case 2 종료 (회원가입)

					case 2:
						System.out.println("회원가입 메뉴로 이동하였습니다 !! ♡   ");
						
						
						break;

					case 3:
						System.out.println("아이디 및 패스워드 찾기 메뉴로 이동하였습니다 !! ♡   ");
						break;
					case 4:
						System.out.println("이전 메뉴로 이동합니다 !! ♡    ");
						Loginrun = false;
						break;
					default:
						System.out.println("문자를 잘못 입력하였습니다 ㅠ_ㅠ 확인해 주세요 !! ♡   ");
					} // A while 종료
				} // A switch 종료
				break;

			case 'B':
			case 'b':
				boolean artRun = true; // 아티스트 메뉴 무한 반복
				while (artRun) { // 아티스트 while
					System.out.println("아티스트 관리 메뉴에 오신 것을 환영합니다 !! ♡ ");
					System.out.println(" ====== 1을 누르시면 아티스트 등록 메뉴로 이동합니다 !! ♡ ======");
					System.out.println(" ====== 2를 누르시면 아티스트 보기 메뉴로 이동합니다 !! ♡ ======");
					System.out.println(" ====== 3을 누르시면 아티스트 수정 메뉴로 이동합니다 !! ♡ ======");
					System.out.println(" ====== 4를 누르시면 이전 메뉴로 이동합니다 !! ♡ ======");
					System.out.print(" ====== 1부터 4까지 번호를 입력해 주세요 !! ♡ ====== >>>>>> "); // 아티스트 관리 메뉴
					int artist = inputInt.nextInt();

					switch (artist) {
					case 1:
						System.out.println("아티스트 등록 메뉴로 이동하였습니다 !! ♡ ");

						System.out.print("등록하실 아티스트 성함을 입력해 주세요 !! ♡ >> ");
						String sss = inputInt.next();

						System.out.println("아티스트가 등록되었습니다 !! ♡ "); // 아티스트 등록 메뉴 종료 (A - 1)
						break;

					case 2:
						System.out.println("아티스트 보기 메뉴로 이동하였습니다 !! ♡  ");

						String art1 = "배수지";
						String art2 = "박은빈";
						String art3 = "한지민";

						System.out.print("보고 싶은 아티스트 성함을 입력해 주세요 !! ♡ >> ");
						String name = inputString.next();

						if (art1.equals(name) || art2.equals(name) || art3.equals(name)) {
							System.out.println("아티스트의 정보로 이동하였습니다 !! ♡");
						} else {
							System.out.println("해당하는 아티스트가 없습니다 ㅠ_ㅠ!! ♡"); // 아티스트 보기 메뉴 종료 (A - 2)
						}
						break;

					case 3:
						System.out.println("아티스트 수정 메뉴로 이동하였습니다 !! ♡  ");
						break;
					case 4:
						System.out.println("이전 메뉴로 이동합니다 !! ♡  ");
						artRun = false;
						break;
					default:
						System.out.println("문자를 잘못 입력하였습니다 ㅠ_ㅠ 확인해 주세요 !! ♡ ");
						break;
					} // B while 종료

				} // B switch 종료
				break;

			case 'C':
			case 'c':
				boolean mdRun = true;
				while (mdRun) {
					System.out.println(" ====== 1을 누르시면 상품 등록 메뉴로 이동합니다 !! ♡ ======");
					System.out.println(" ====== 2를 누르시면 상품 보기 메뉴로 이동합니다 !! ♡ ======");
					System.out.println(" ====== 3을 누르시면 상품 수정 메뉴로 이동합니다 !! ♡ ======");
					System.out.println(" ====== 4를 누르면 이전 메뉴로 이동합니다 !! ♡ ======");
					System.out.print(" ====== 1부터 4까지 번호를 입력해 주세요 !! ♡ ====== >>>>>> "); // 상품 메뉴
					int md = inputInt.nextInt();

					switch (md) {
					case 1:
						System.out.println("상품 등록 메뉴로 이동하였습니다 !! ♡ ");
						break;

					case 2:
						System.out.println("상품 보기 메뉴로 이동하였습니다 !! ♡  ");

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

									System.out.println("회원님의 등급은 다이아입니다!! ♡ "); // 두 번째 if 종료
								} else if (total >= 80) {
									System.out.println("회원님의 등급은 골드입니다!! ♡");
								} else if (total >= 70) {
									System.out.println("회원님의 등급은 실버입니다!! ♡ ");
								} else { // 첫 else 시작
									System.out.println("회원님의 등급은 브론즈입니다!! ♡ ");
								} // else 종료
						} // 첫 번째 if 종료
						else { // 두 번째 else 시작
							System.out.println("문자를 잘못 입력하였습니다 ㅠ_ㅠ 확인해 주세요 !! ♡ "); // false
						} // 두 번째 else 종료
							// 랜덤이라는 글자 입력하면 인식되는 if 코드 (false일 경우 문자 오류라고 뜬다)
						break;

					case 3:
						System.out.println("상품 수정 메뉴로 이동하였습니다 !! ♡ ");
						break;
					case 4:
						System.out.println("이전 메뉴로 이동합니다 !! ♡  ");
						mdRun = false;
						break;
					default:
						System.out.println("문자를 잘못 입력하였습니다 ㅠ_ㅠ 확인해 주세요 !! ♡ ");
						break;
					}// C while 종료
				} // C switch 종료
				break;

			case 'D':
			case 'd':
				boolean songRun = true;
				while (songRun) {
					System.out.println(" ====== 1을 누르시면 노래 듣기 등록 메뉴로 이동합니다 !! ♡ ======");
					System.out.println(" ====== 2를 누르시면 노래 듣기 보기 메뉴로 이동합니다 !! ♡ ======");
					System.out.println(" ====== 3을 누르시면 노래 듣기 수정 메뉴로 이동합니다 !! ♡ ======");
					System.out.println(" ====== 4를 누르시면 이전 메뉴로 이동합니다 !! ♡ ======");
					System.out.print(" ====== 1부터 4까지 번호를 입력해 주세요 !! ♡  ====== >>>>>> "); // 노래 듣기 메뉴
					int song = inputInt.nextInt();

					switch (song) {
					case 1:
						System.out.println("노래 듣기 등록 메뉴로 이동하였습니다 !! ♡   ");
						break;
					case 2:
						System.out.println("노래 듣기 보기 메뉴로 이동하였습니다 !! ♡   ");

						System.out.print("ss 문구를 입력하시면 노래가 재생이 됩니다 !! ♡>> ");
						String ovv = inputInt.next();
						ovv.equalsIgnoreCase("ss"); // (C - 2 종료)

						break;

					case 3:
						System.out.println("노래 듣기 수정 메뉴로 이동하였습니다 !! ♡   ");
						break;
					case 4:
						System.out.println("이전 메뉴로 이동합니다 !! ♡    ");
						songRun = false;
						break;

					default:
						System.out.println("문자를 잘못 입력하였습니다 ㅠ_ㅠ 확인해 주세요 !! ♡   ");
					} // D while 종료

				} // D switch 종료
				break;

			case 'Z':
			case 'z':
				System.out.println("프로그램을 종료합니다 !! ♡");
				run = false;
				break;

			default:
				System.out.println("문자를 잘못 입력하였습니다 ㅠ_ㅠ 확인해 주세요 !! ♡ ");
				break;

			} // Z switch 종료

		} // 메인 switch 종료

	} // main 메서드 종료

	static boolean loginOK(String id, String pw, boolean session) {

		Scanner inputStr = new Scanner(System.in); // 문자열

		System.out.print("로그인할 아이디를 입력해 주세요 !! >>>  ");
		String loginid = inputStr.next(); // 로그인할 객체 생성
		System.out.print("로그인할 패스워드를 입력해 주세요 !! >>  ");
		String loginpw = inputStr.next(); // 패스워르 입력할 객체 생성

		if (loginid.equals(id) & loginpw.equals(pw)) {
			System.out.println("로그인에 성공하였습니다!! ♡");
			session = true;
		} else {
			System.out.println("로그인에 실패하였습니다 ㅠ_ㅠ");
			session = false;

		} // else 종료

		return session;

	} // 보조 메서드 종료
} // class 종료
