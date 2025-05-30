package maplestory;

import java.util.Scanner;

public class Game extends CharacterDTO{
	
	MemberDTO memberDTO = new MemberDTO() ;
	
	

	 void Gameee (String skin, String eyes, String head, String clothes, String weapon, String[] nick) {
	 this.skin = skin ;
	 this.eyes = eyes ;
	 this.head = head ; 
	 this.clothes = clothes ;
	 this.weapon = weapon ;	// 여기까지 부모 객체에서 가지고 옴
	 this.nick = nick ;	// 자식 객체
	 this.level = 1;	// 자식 객체
	 }
	 
	public static void menu(Scanner inputInt, Scanner inputStr, MemberDTO[] memberDTO, CharacterDTO characterDTO) { // 게임 실행 메서드
	
		// 2. 캐릭터 선택 (직업마다 닉네임 설정)
		// 3. 게임 실행  (1. 사냥터 / 2. 마을 / 3. 캐시샵)
		// 3-1. (1. 사냥하기(공격,포션,튀기) / 2. 레벨업 / 3. 스텍 올리기 /
		// 3-2. (1. 퀘스트(랜덤) / 2. 마을 이동 / 3. 수다 떠는 곳(대화, 표정)
		// 3-3. (1. 코디 / 2. 구매 / 3. 판매 / 4. 충전 / 5. 나가기)
		boolean run = true ;
		while (run) {
		System.out.println("메이플 월드에 오신 것을 환영합니다");
		System.out.println("서버를 선택하세요");
		System.out.println("1. 베라 | 2. 루나 | 3. 스카니아 | 4. 크로아 | 5. 종료");
		String seve = inputStr.next() ;
		switch (seve) {
		case "1":
			System.out.println("베라를 선택하셨습니다");
			characterDTO = new CharacterDTO() ;
			characterDTO.Option();
		     System.out.println("닉네임을 입력하세요");
		     String nick = inputStr.next() ;
			break ;
		case "2":
			System.out.println("루나를 선택하셨습니다");
			characterDTO.Option();
		     System.out.println("닉네임을 입력하세요");
		     String nick1 = inputStr.next() ;
			break ;
		case "3":
			System.out.println("스카니아를 선택하셨습니다");
			characterDTO.Option();
		     System.out.println("닉네임을 입력하세요");
		     String nick2 = inputStr.next() ;
			break ;
		case "4":
			System.out.println("크로아를 선택하셨습니다");
			characterDTO.Option();
		     System.out.println("닉네임을 입력하세요");
		     String nick3 = inputStr.next() ;
			break ;
		case "5":
			System.out.println("게임을 종료합니다");
			run = false ;
			break ;
		default:
			System.out.println("번호를 잘못 입력하였습니다");
		
		}
		}
	}
}


		
	

	



	
		
	
		

	


