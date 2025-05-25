package ch04.mariocrat;

import java.util.Scanner;


import dto.CartDTO;
import dto.CharacterDTO;
import dto.GliderDTO;
import dto.ItemDTO;
import dto.MemberDTO;
import dto.TireDTO;

public class MarioCartExam {
	
	// 필드

	public static Scanner input = new Scanner(System.in);

	public static MemberDTO[] memberDTOs = new MemberDTO[10]; // 회원 관리 필드
	public static CharacterDTO[] characterDTOs = new CharacterDTO[5]; // 캐릭터 관리 필드
	public static CartDTO[] cartDTOs = new CartDTO[11]; // 자동차 관리 필드
	public static GliderDTO[] gliderDTOs = new GliderDTO[7]; // 글라이더 관리 필드
	public static TireDTO[] tireDTOs = new TireDTO[8]; // 타이어 관리 필드
	public static ItemDTO[] itemDTOs = new ItemDTO[6]; // 아이템 관리 필드

	public static MemberDTO loginStart ;		// 로그인 세션과 같은 것
	private static CharacterDTO generation;		// 캐릭터 세선과 같은 것
	
	// 생성자
	
	static {
		CharacterDTO characterDTO0 = new CharacterDTO("0", "마리오", 1.0, 2.0, 3.0, 4.0, 5.0);
		CharacterDTO characterDTO1 = new CharacterDTO("1", "데이지", 1.2, 2.2, 3.2, 4.2, 5.2);
		CharacterDTO characterDTO2 = new CharacterDTO("2", "킹부끄", 1.4, 2.4, 3.4, 4.4, 5.4);
		CharacterDTO characterDTO3 = new CharacterDTO("3", "뻐끔왕", 1.6, 2.6, 3.6, 4.6, 5.6);		// 캐릭터 객체 생성 완료
		
		characterDTOs[0] = characterDTO0 ;
		characterDTOs[1] = characterDTO1 ;
		characterDTOs[2] = characterDTO2 ;
		characterDTOs[3] = characterDTO3 ;		// characterDTOs 객체 안에 내가 입력한 캐릭터 생성 객체가 입력
		
		cartDTOs[0] = new CartDTO();
		

	}		// 스태틱 블록 종료 (메인 때 리셋)
	

	public static void main(String[] args) { // 메서드

		System.out.println("============= 마리오 게임 입장을 환영합니다 ================");
		boolean run = true;

		while (run) {
			System.out.println("1. 회원 관리 | 2. 카트 관리 | 3. 게임 실행 | 4. 게임 종료");
			System.out.print("번호 입력 >>>>>>>> ");
			String select = input.next();		// 일부러 String 걸었음 

			switch (select) {
			case "1":
				System.out.println("회원 관리 메서드로 진입하였습니다");

				MarioService marioServiceMenu1 = new MarioService() ;
				marioServiceMenu1 =  marioServiceMenu1.marioServiceMenu(input, memberDTOs, loginStart) ;
				
				break;
			case "2":
				System.out.println("카트 관리 메서드로 진입하였습니다");
				MarioCharacterSevrvice marioCharacterSevrvice1 = new MarioCharacterSevrvice() ;
				marioCharacterSevrvice1 = marioCharacterSevrvice1.marioCharacterSevrvice(input, characterDTOs, loginStart, generation, cartDTOs, itemDTOs, args) ;
				
				
				break;
			case "3":
				System.out.println("게임 실행 메서드로 진입하였습니다");
				
				break;
				
			case "4":
				System.out.println("게임을 종료하겠습니다");
				run = false;
				break;
			case "99":
				System.out.println("히든 메뉴인 관리자 모드로 진입하였습니다");
			default:
				System.out.println("번호를 잘못 입력하였습니다");
				break;

			} // switch 종료
		} // while 종료
	} // main 메서드 종료
}


