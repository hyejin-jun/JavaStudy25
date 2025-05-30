package ch05.lineage;

import java.util.Scanner;

public class LoginService {
	
	public static Account menu(Scanner scanner, Account[] accounts, Account loginAccount) {
		// 로그인 서비스 메뉴
		
		System.out.println("1. 로그인 | 2. 회원가입 | 3. 회원 수정 | 4. 나가기");
		System.out.print("번호 입력 >>> ");
		int select = scanner.nextInt() ;
		
		switch (select) {
		case 1: 
			System.out.println("로그인을 시작합니다");
			System.out.print("아이디: ");
			String id = scanner.next() ;
			System.out.print("패스워드: ");
			String pw = scanner.next() ;
			Account account = new Account() ;
			account.setId(id);
			account.setPw(pw); 	// 새로 만든 account 객체에 id와 pw 삽입
			
			// 배열에 있는 값과 비교
			for(int i = 0 ; i < accounts.length ; i++) {
				if(accounts[i] != null) {	// 배열에 있는 게 null이 아니다
					if (accounts[i].getId().equals(account.getId())) {	// 아까 입력한 accounts에 있는지 확인
						System.out.println("해당 아이디가 있습니다");
					if (accounts[i].getPw().equals(account.getPw())) {
						System.out.println("해당하는 패스워드가 있습니다");
						loginAccount = accounts[i] ;
						System.out.println("로그인 성공");
						break;
					} else {
						System.out.println("해당하는 패스워드가 없습니다");
					}
					} else {System.out.println("해당하는 아이디가 없습니다");
					
				}
			} else {System.out.println("해당하는 정보가 없습니다");
			break;
			}	// 빈 객체 비교
		}	// for 종료
		
			} // 스위치 종료
		return loginAccount;
	}	// 메인 종료

}
