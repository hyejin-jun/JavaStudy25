package ch04.mariocrat;

import java.util.Scanner;
import java.util.jar.Attributes.Name;

import ch02.RandumExam;
import ch04.Car;
import dto.CartDTO;
import dto.CharacterDTO;
import dto.GliderDTO;
import dto.ItemDTO;
import dto.MemberDTO;
import dto.TireDTO;

public class MarioCharacterSevrvice {



	public MarioCharacterSevrvice marioCharacterSevrvice(Scanner input, CharacterDTO[] characterDTOs, MemberDTO loginStart, CharacterDTO generation, CartDTO[] cartDTOs, ItemDTO[] itemDTOs, String[] cartName) { // 캐릭터 서비스 메서드

		System.out.println("========== 카드 관리 메서드에 진입하였습니다 ============");
		boolean run = true;
		while (run) { // while 시작
			System.out.println("1. 캐릭터 관리 | 2. 카트 관리 | 3. 아이템 관리 | 9. 종료");
			System.out.print("번호를 입력해 주세요 >>>> ");
			String select = input.next();

			switch (select) {

			case "1": // 캐릭터 관리 메뉴 스위치
				boolean chrun = true;
				System.out.println("캐릭터 관리 메서드에 진입합니다");
				System.out.println("1. 캐릭터 선택 | 2. 캐릭터 변경 | 3. 종료");
				System.out.print("번호를 입력해 주세요 >>> ");
				String characterMenu = input.next();

				switch (characterMenu) {
				case "1":
					System.out.println("캐릭터 선택 메뉴로 이동하였습니다");
					characterSelect(input, characterDTOs, null, null, 0.0, 0.0, 0.0, 0.0);
					break;
				case "2":
					System.out.println("캐릭터 변경 메서드에 진입하였습니다");
					characterCh(input, characterDTOs, null, null, 0.0, 0.0, 0.0, 0.0); 
					break;
				case "3":
					System.out.println("프로그램을 종료합니다");
					chrun = false;
					break;
				default:
					System.out.println("번호를 잘못 입력하였습니다");
					break;
				} // switch (charactermenu) 종료

			case "2": // 카드 관리 메뉴 스위치
				boolean cartrun = true;
				System.out.println("카트 관리 메서드에 진입하였습니다");
				System.out.println("1. 랜덤 카트 선택 | 2. 종료");
				System.out.print("번호를 입력해 주세요 >>> ");
				String cartMenu = input.next();

				switch (cartMenu) {
				case "1":
					System.out.println("카트 선택 메뉴로 이동하였습니다");
					cartSelect(input, cartDTOs, cartName);
					break;
				case "2":
					System.out.println("프로그램을 종료합니다");
					chrun = false;
					break;
				default:
					System.out.println("번호를 잘못 입력하였습니다");
					break ;
				}
					return null;
				
		
			case "3":
				boolean itemrun = true ;
				System.out.println("아이템 관리 메서드에 진입하였습니다");
				System.out.println("1. 아이템 구매 | 2. 아이템 판매 | 4. 종료");
				String itemss = input.next() ;
				switch (itemss) {
				case "1":
					System.out.println("아이템 구매 메뉴로 진입하였습니다");
					itemrnao (input, itemDTOs);
					break ;
				case "2":
					System.out.println("아이템 판매 메뉴로 진입하였습니다");
					itemvksao (input, itemDTOs) ;
					break;
				case "9":
					System.out.println("프로그램을 종료합니다");
					break ;
				default:
					System.out.println("번호를 잘못 입력하였습니다");
					break ;
				}	// 아이템 구매 메서드 종료
				break ;

			case "9":
				System.out.println("시스템을 종료하겠습니다");
				run = false;
				break;

			default:
				System.out.println("번호를 잘못 입력하였습니다");
				break;
			} // switch 종료
		} // whlie 종료
		return null;
	}

	private void itemvksao(Scanner input, ItemDTO[] itemDTOs) {	// 아이템 판매 메서드
		System.out.println("모든 아이템 다 200 루찌로 판매됩니다");
		System.out.println("1. 꽃 | 2. 선글라스 | 3. 클로버 | 4. 리본 | 5. 별 | 9. 종료");
		System.out.print("번호를 입력하세요 >>>  ");
		String itenn = input.next() ;
		System.out.println("아이템이 판매되었습니다 ^~^ + 200 루찌");
		return ;
	}

	private void itemrnao(Scanner input, ItemDTO[] itemDTOs) {	// 아이템 구매 메서드
		boolean itemww = true ;
		System.out.println("모든 아이템 400 루찌입니다");
		System.out.println("1. 꽃 | 2. 선글라스 | 3. 클로버 | 4. 리본 | 5. 별 | 9. 종료");
		System.out.print("번호를 입력하세요 >>>  ");
		String itemm = input.next() ;
		
		switch (itemm) {
		case "1":
			
			System.out.println("꽃을 구매하였습니다 🌸 ⸜(｡˃ ᵕ ˂ )⸝♡");
			break ;
		case "2":
			System.out.println("헤드셋을 구매하였습니다 🎧 ✮˚.⋆｡˚ ☁︎ ˚｡⋆｡˚☽˚｡⋆");
			break;
		case "3":
			System.out.println("클로버를 구매하였습니다 🍀 (づ｡◕‿◕｡)づ");
			break;
		case "4": 
			System.out.println("리본을 구매하였습니다 🎀 ﮩـﮩﮩ٨ـ♡ﮩ٨ـﮩﮩ٨ـ");
			break;
		case "5":
			System.out.println("별을 구매하였습니다 ⭐ 𓇼 ⋆.˚ 𓆉 𓆝 𓆡⋆.˚ 𓇼");
			break;
		case "9":
			System.out.println("프로그램을 종료합니다");
			itemww = false ;
			break ;
			default:
				System.out.println("번호를 잘못 입력하였습니다");
				break ;
		}	// switch (itemm) 종료
		
	}

	public void cartSelect(Scanner input, CartDTO[] cartDTOs, String[] cartName) {		// 카트 배정 메서드
		
		System.out.print(">> 카트 << 라는 단어를 입력하시면 랜덤으로 카트가 배정이 됩니다 | 입력해 주세요 >>> ");
		String ran = input.next() ;

				if (ran.equals("카트")) {
				int randomColor = (int) (Math.random() * 6);
				int randomCart = (int) (Math.random() * 12);
				System.out.println("회원님의 랜덤 카트를 출력 중입니다");
				CartDTO cart = new CartDTO(randomColor, randomCart);
				
				System.out.println("회원님의 랜덤 카트는 " + cart.cartName + " "+ cart.carColor + " " +" 입니다");
			
		 }	else {System.out.println("글자를 잘못 입력하였습니다");
		}	// else 종료
		
		System.out.println("안전 운행하세요 ^~^");
	return ;
	}	// 카트 배정 메서드 종료


	public void characterSelect(Scanner input, CharacterDTO[] characterDTOs, String no, String name, double anrp, double threh, double rkthr, double gosemffld)  { // 캐릭터 선택 메서드

				boolean select1 = true;
				System.out.println("0. 마리오 | 1. 데이지 | 2. 킹부끄 | 3. 뻐끔왕 | 0. 종료");
				System.out.print("번호를 입력해 주세요 >>> ");
				String sun = input.next();

				switch (sun) {

				case "0":
				case "마리오":
					System.out.println("마리오를 선택하였습니다 마리오 정보를 입력합니다");
					System.out.println("👲🏻: " + characterDTOs[0].no + " 번 | 이름: " + characterDTOs[0].name + " | 무게: "
							+ characterDTOs[0].anrp + " | 속도: " + characterDTOs[0].threh + " | 가속: " + characterDTOs[0].rkthr
							+ " | 핸들링: " + characterDTOs[0].gosemffld);
					break;

				case "1":
				case "데이지":
					System.out.println("데이지를 선택하였습니다 루이지 정보를 입력합니다");
					System.out.println("👸🏼: " + characterDTOs[1].no + " 번 | 이름: " + characterDTOs[1].name + " | 무게: "
							+ characterDTOs[1].anrp + " | 속도: " + characterDTOs[1].threh + " | 가속: " + characterDTOs[1].rkthr
							+ " | 핸들링: " + characterDTOs[1].gosemffld);
					break;

				case "2":
				case "킹부끄":
					System.out.println("킹부끄를 선택하였습니다 킹부끄 정보를 입력합니다");
					System.out.println("👻: " + characterDTOs[2].no + " 번 | 이름: " + characterDTOs[2].name + " | 무게: "
							+ characterDTOs[2].anrp + " | 속도: " + characterDTOs[2].threh + " | 가속: " + characterDTOs[2].rkthr
							+ " | 핸들링: " + characterDTOs[2].gosemffld);
					break;

				case "3":
				case "뻐끔왕":
					System.out.println("뻐끔왕를 선택하였습니다 뻐끔왕 정보를 입력합니다");
					System.out.println("🐲: " + characterDTOs[3].no + " 번 | 이름: " + characterDTOs[3].name + " | 무게: "
							+ characterDTOs[3].anrp + " | 속도: " + characterDTOs[3].threh + " | 가속: " + characterDTOs[3].rkthr
							+ " | 핸들링: " + characterDTOs[3].gosemffld);
					select1 = false;
					CharacterDTO seCharacterDTO ;	// 선택한 캐릭터 저장 변수
					break;

				default:
					System.out.println("번호를 잘못 입력하였습니다");
					break;
				} // switch (sun) 종료

				return;
			}		// 캐릭터 생성 메서드
	

	public void characterCh(Scanner input, CharacterDTO[] characterDTOs,  String no, String name, double anrp, double threh, double rkthr, double gosemffld) {	// 캐릭터 변경 메서드
			System.out.println("0. 마리오 | 1. 데이지 | 2. 킹부끄 | 3. 뻐끔왕 | 0. 종료 중 선택해 주세요");
			System.out.print("이름을 입력하세요 >>>>>>  ");
			String chString = input.next();

			for (int i = 0; i < characterDTOs.length; i++) {
				System.out.println(characterDTOs[i].name + " 로 변경합니다");
				if (characterDTOs[i].name.equalsIgnoreCase(name) || characterDTOs[i].no.equalsIgnoreCase(no)) {
					System.out.println("캐릭터를 변경하였습니다");
				break ;
				} else {
					System.out.println("캐릭터 변경에 실패하였습니다");
					break;
				} // else 종료
			} // for 종료
			return;
		} // 
}




	



