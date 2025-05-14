package ch02;

import java.util.Scanner;

public class SwitchExam {

	public static void main(String[] args) {
		// switch문 및 if문 활용

		Scanner input = new Scanner(System.in);

		System.out.println(" ====== 엠비씨 엔터테인먼트에 오신 것을 환영합니다 ♡ ======");
		System.out.println(" ====== A를 누르시면 아티스트 관리로 이동합니다 !! ♡ ======");
		System.out.println(" ====== B를 누르시면 상품 관리로 이동합니다 !! ♡ ======");
		System.out.println(" ====== C를 누르시면 노래 듣기 관리로 이동합니다 !! ♡ ======");
		System.out.println(" ====== Z를 누르시면 프로그램을 종료합니다 !! ♡ ======");
		System.out.print(" ====== A부터  Z까지 입력해 주세요 !! ♡ ====== >>>>>> ");  // 메뉴 
		char menu = input.next().charAt(0);
		switch (menu) { // ��ü �޴�

		case 'A':
		case 'a':
			System.out.println("아티스트 관리 메뉴에 오신 것을 환영합니다 !! ♡ ");
			System.out.println(" ====== 1을 누르시면 아티스트 등록 메뉴로 이동합니다 !! ♡ ======");
			System.out.println(" ====== 2를 누르시면 아티스트 보기 메뉴로 이동합니다 !! ♡ ======");
			System.out.println(" ====== 3을 누르시면 아티스트 수정 메뉴로 이동합니다 !! ♡ ======");
			System.out.println(" ====== 4를 누르시면 프로그램을 종료합니다 !! ♡ ======");
			System.out.print(" ====== 1부터 4까지 번호를 입력해 주세요 !! ♡ ====== >>>>>> "); // 아티스트 관리 메뉴
			int artist = input.nextInt();

			switch (artist) {
			case 1:
				System.out.println("아티스트 등록 메뉴로 이동하였습니다 !! ♡ ");
				
				System.out.print("등록하실 아티스트 성함을 입력해 주세요 !! ♡ >> ");
				String sss = input.next() ;
				
				System.out.println("아티스트가 등록되었습니다 !! ♡ ");  // 아티스트 등록 메뉴 종료 (A - 1)
				break;
				
			case 2:
				System.out.println("아티스트 보기 메뉴로 이동하였습니다 !! ♡  ");

				String art1 = "배수지";
				String art2 = "박은빈";
				String art3 = "한지민";
				
				System.out.print("보고 싶은 아티스트 성함을 입력해 주세요 !! ♡ >> ");
				String name = input.next();
				
				if (art1.equals(name) || art2.equals(name) || art3.equals(name)) {
					System.out.println("아티스트의 정보로 이동하였습니다 !! ♡");
				} else {
					System.out.println("해당하는 아티스트가 없습니다 ㅠ_ㅠ!! ♡");  // 아티스트 보기 메뉴 종료 (A - 2) 
				} 
				break;
				
			case 3:
				System.out.println("아티스트 수정 메뉴로 이동하였습니다 !! ♡  ");
				break;
			case 4:
				System.out.println("프로그램을 종료합니다 !! ♡  ");
				break;
			default:
				System.out.println("문자를 잘못 입력하였습니다 ㅠ_ㅠ 확인해 주세요 !! ♡ ");
				break;
			} // A switch 종료
			break;

		case 'B':
		case 'b':
			System.out.println(" ====== 1을 누르시면 상품 등록 메뉴로 이동합니다 !! ♡ ======");
			System.out.println(" ====== 2를 누르시면 상품 보기 메뉴로 이동합니다 !! ♡ ======");
			System.out.println(" ====== 3을 누르시면 상품 수정 메뉴로 이동합니다 !! ♡ ======");
			System.out.println(" ====== 4를 누르면 프로그램을 종료합니다 !! ♡ ======");
			System.out.print(" ====== 1부터 4까지 번호를 입력해 주세요 !! ♡ ====== >>>>>> ");  // 상품 메뉴
			int md = input.nextInt();

			switch (md) {
			case 1:
				System.out.println("상품 등록 메뉴로 이동하였습니다 !! ♡ ");
				break;
			case 2:
				System.out.println("상품 보기 메뉴로 이동하였습니다 !! ♡  ");
				
						
				System.out.print("1부터 100까지의 숫자를 입력하시면 랜덤 박스가 지정이 됩니다! >> ");
				double total = input.nextDouble() ;
				
				double tot1 = Math.random() * 5 + 1 ;
				double tot2 = Math.random() * 5 + 1 ;
				double tot3 = Math.random() * 5 + 1 ;
				
				
				if ((total > 0 && total <= 100)) 
				if (total >= 90 ){System.out.println("회원님의 등급은 다이아입니다!! ♡ ");
				} else if (total >= 80) {
					System.out.println("회원님의 등급은 골드입니다!! ♡");
				} else if (total >= 70) {
					System.out.println("회원님의 등급은 실버입니다!! ♡ ");
				} else {System.out.println("회원님의 등급은 브론즈입니다!! ♡ ");  // else문 종료 (B - 2)
				
				} // if 종료
				break; 

			case 3:
				System.out.println("상품 수정 메뉴로 이동하였습니다 !! ♡ ");
				break;
			case 4:
				System.out.println("프로그램을 종료합니다 !! ♡  ");
				break;
			default:
				System.out.println("문자를 잘못 입력하였습니다 ㅠ_ㅠ 확인해 주세요 !! ♡ ");
				break;
			} // B switch 종료
			break;

		case 'C':
		case 'c':
			System.out.println(" ====== 1을 누르시면 노래 듣기 등록 메뉴로 이동합니다 !! ♡ ======");
			System.out.println(" ====== 2를 누르시면 노래 듣기 보기 메뉴로 이동합니다 !! ♡ ======");
			System.out.println(" ====== 3을 누르시면 노래 듣기 수정 메뉴로 이동합니다 !! ♡ ======");
			System.out.println(" ====== 4를 누르시면 프로그램이 종료합니다!! ♡ ======");
			System.out.print(" ====== 1부터 4까지 번호를 입력해 주세요 !! ♡  ====== >>>>>> ");  // 노래 듣기 메뉴
			int song = input.nextInt();

			switch (song) {
			case 1:
				System.out.println("노래 듣기 등록 메뉴로 이동하였습니다 !! ♡   ");
				break;
			case 2:
				System.out.println("노래 듣기 보기 메뉴로 이동하였습니다 !! ♡   ");
				
				System.out.print("ss 문구를 입력하시면 노래가 재생이 됩니다 !! ♡>> ");
				String ovv = input.next();
				ovv.equalsIgnoreCase("ss") ;   // (C - 2 종료)
				
				break; 

			case 3:
				System.out.println("노래 듣기 수정 메뉴로 이동하였습니다 !! ♡   ");
				break;
			case 4:
				System.out.println("프로그램을 종료합니다 !! ♡    ");
				break;
			default:
				System.out.println("문자를 잘못 입력하였습니다 ㅠ_ㅠ 확인해 주세요 !! ♡   ");
				break; } 	 // C switch 종료

			case 'Z':
			case 'z':
				System.out.println("프로그램을 종료합니다 !! ♡"); break;
			default: System.out.println("문자를 잘못 입력하였습니다 ㅠ_ㅠ 확인해 주세요 !! ♡ ");
			break; 
			
			} // Z switch 종료
			


	} // main 메서드 종료
} // class 종료
