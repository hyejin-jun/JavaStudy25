package ch05.lineage;

import java.util.Scanner;

public class CharacterService {

	public static void menu(Scanner scanner, Account loginAccount, KinghtDTO kinghtDTO, ElfDTO elfDTO) {
		// 객체를 이용하여 캐릭터 선택 부메뉴
		
		
		System.out.println("1. 기사 | 2. 요정 | 3. 마법사 | 4. 도적 | 5. 군주 | 6. 총사 | 7. 종료");
		System.out.print("번호 입력 >>> ");
		int select = scanner.nextInt() ;
		switch(select) {
		case 1:
			System.out.println("기사를 선택하셨습니다");
			loginAccount.setKinghtDTO(kinghtDTO) ;
			System.out.println(loginAccount.getNick() + " 님 " + loginAccount.getKinghtDTO() + " 캐릭터를 선택하셨습니다");
			System.out.println("기사가 되고 싶은 자는 나에게..");
			break ;
		case 2:
			System.out.println("요정을 선택하셨습니다");
			loginAccount.setElfDTO(elfDTO) ;
			System.out.println(loginAccount.getNick() + " 님 " + loginAccount.getElfDTO() + " 캐릭터를 선택하였습니다");
			System.out.println("마법의 열쇠를 찾아서..");
			break ;
		case 3:
			System.out.println("마법사를 선택하셨습니다");
			break ;
		case 4:
			System.out.println("도적을 선택하셨습니다");
			break ;
		case 5:
			System.out.println("군주를 선택하셨습니다");
			break ;
		case 6:
			System.out.println("총사를 선택하셨습니다");
			break ;
		case 7:
			System.out.println("게임을 종료합니다");
			break ;
			default:
				System.out.println("번호를 잘못 입력하였습니다");
		}	// 스위치 종료
		
	}	// 메인 메서드 종료

}	// 클래스 종료
