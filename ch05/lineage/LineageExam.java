package ch05.lineage;

import java.util.Scanner;

public class LineageExam {
	
	public static Scanner scanner = new Scanner(System.in);
	public static Account[] accounts = new Account[10];
	public static Account loginAccount ; 	// 로그인 성공시 객체 (세션 역할)
	public static KinghtDTO kinghtDTO = new KinghtDTO() ;
	public static ElfDTO elfDTO = new ElfDTO() ;
	public static HumanDTO humanDTO = new HumanDTO() ;
	
	static {	// 사용자 지정 생성자
		
	kinghtDTO.setSword("에너지 소드");
	kinghtDTO.setArmor("흑룡포");
	kinghtDTO.setShield("용맹의 소울 실드");
	kinghtDTO.setName("전사");
	kinghtDTO.setSex("여성");
	kinghtDTO.setLevel("250");
	kinghtDTO.setHp(50000);
	kinghtDTO.setMp(1000);
	kinghtDTO.setMoney(500000000);
	
	elfDTO.setBow("데스티니 보우");
	elfDTO.setDress("아케인셰이드 메이지슈트");
	elfDTO.setArrow("티타늄 화살");
	elfDTO.setName("요정");
	elfDTO.setSex("여성");
	elfDTO.setLevel("280");
	elfDTO.setHp(2000);
	elfDTO.setMp(50000);
	elfDTO.setMoney(500000000);
	
	Account account = new Account() ;	// 테스트용 계정 생성
	
	account.setId("jjj");
	account.setPw("1234");
	account.setNick("zl존법nr");
	accounts[0] = account ;	// 배열 0 번째에 계정 객체를 연결
		
	}	// db 대신 초기값 지정 (생성자 대신)
	
	public static void main(String[] args) {	// 리니지 게임 만들기
		// 객체 간의 상속 알아보기
		// 부모 객체는 자식 객체에게 모든 정보 상속
		
		System.out.println("리니지 게임에 오신 것을 환영합니다 ^~^");
		boolean run = true ;
		while(run) {
			System.out.println("1. 로그인 | 2. 캐릭터 선택 | 3. 게임 실행 | 4. 종료");
			System.out.print("번호 입력 >>> ");
			int select = scanner.nextInt() ;
			switch (select) {
			case 1:
				System.out.println("로그인을 시작합니다");
				loginAccount = LoginService.menu(scanner, accounts, loginAccount);
				break ;
			case 2:
				System.out.println("캐릭터를 선택합니다");
				CharacterService.menu (scanner, loginAccount, kinghtDTO, elfDTO);
				
				break ;
			case 3:
				System.out.println("게임을 시작합니다");
				GameStart.menu (scanner, loginAccount, kinghtDTO, elfDTO, humanDTO);
				break ;
			case 4:
				System.out.println("종료합니다");
				break ;
				default:
					System.out.println("숫자를 잘못 입력하였습니다");
			}	// 스위치 종료
		}	// 와일 종료
	}	// 메인 종료
}	// 클래스 종료
