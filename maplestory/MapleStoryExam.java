package maplestory;

import java.util.Scanner;

public class MapleStoryExam {


	
	public static void main (String[] args) {
		// 1. 로그인 
		// 2. 캐릭터 선택 (직업마다 닉네임 설정)
		// 3. 게임 실행  (1. 사냥터 / 2. 마을 / 3. 캐시샵)
		// 3-1. (1. 사냥하기(공격,포션,튀기) / 2. 레벨업 / 3. 스텍 올리기 /
		// 3-2. (1. 퀘스트(랜덤) / 2. 마을 이동 / 3. 수다 떠는 곳(대화, 표정)
		// 3-3. (1. 코디 / 2. 구매 / 3. 판매 / 4. 충전 / 5. 나가기)
		
		
		Scanner inputInt = new Scanner(System.in);
		Scanner inputStr = new Scanner(System.in);
		
		MemberDTO[] memberDTO = new MemberDTO[10];	// 회원가입 10 명만 가능함
		CharacterDTO characterDTO = new CharacterDTO() ;
		
		
		System.out.println("메이플스토리 월드로 진입합니다");
		
		boolean run = true ;	
		while (run) {
			System.out.println("GAME START");
			System.out.println("1. 회원가입 | 2. 로그인 | 3. 게임 실행 | 4. 나가기");
			System.out.print("번호 입력 >>>>>>>>>> ");
			String select = inputStr.next();
			switch (select) {
			
			case "1":
				System.out.println("회원가입 메뉴로 진입하였습니다");
				memberShipJoin (inputInt, inputStr, memberDTO);
				break ;
			case "2":
				System.out.println("로그인 메뉴로 진입하였습니다");
				login (inputInt, inputStr, memberDTO);
				break ;
			case "3":
				System.out.println("게임 실행 메뉴로 진입하였습니다");
				Game.menu (inputInt, inputStr, memberDTO, characterDTO) ;
				break ;
			case "4":
				System.out.println("홈페이지를 종료합니다");
				run = false;
				break ;
				default:
					System.out.println("번호를 잘못 입력하였습니다");
			}
			

		}
	

	}

	private static void login(Scanner inputInt, Scanner inputStr, MemberDTO[] memberDTO) {	// 로그인 메뉴 메서드
		
		System.out.print("로그인할 아이디를 입력하세요 >>> ");
		String id = inputStr.next();
		System.out.print("로그인할 비밀번호를 입력하세요 >>> ");
		String pw = inputStr.next() ;
		
		boolean login = false ;
		
		for (int i = 0 ; i < memberDTO.length ; i++) {
			if (memberDTO[i] != null && memberDTO[i].getId().equals(id) && memberDTO[i].getPw().equals(pw)) {
				System.out.println("로그인에 성공하였습니다!!");
				login = true ;
				break ;
			} else {System.out.println("로그인에 실패하였습니다 ㅠㅠ");
			break ;
			
			}
		}

			
	
	}

	private static void memberShipJoin(Scanner inputInt, Scanner inputStr, MemberDTO[] memberDTO) {// 회원가입 메서드 (10 명 가입 가능)
	
			
			MemberDTO memberDTO1 = new MemberDTO(); // 객체 입력할 곳 만들기
			
			System.out.print("회원가입할 아이디를 입력하세요 >>> ");
			String id = inputStr.next();
			System.out.print("회원가입할 비밀번호를 입력하세요 >>> ");
			String pw = inputStr.next();
			MemberDTO member = new MemberDTO() ;
			member.setId(id);
			member.setPw(pw);
			
			System.out.println("회원가입이 완료되었습니다");
			boolean join = false ;
			for (int i = 0 ; i < memberDTO.length; i++) {
				
				if (memberDTO[i] == null) {
					memberDTO[i] = member ;
					join = true ;
					break;	
			}
	

	}

	}
}



