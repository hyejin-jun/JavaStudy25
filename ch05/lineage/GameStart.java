package ch05.lineage;

import java.util.Scanner;

public class GameStart {

	private static final int getHp = 0;

	public static void menu(Scanner scanner, Account loginAccount, KinghtDTO kinghtDTO, ElfDTO elfDTO, HumanDTO humanDTO) {
		// 게임을 만들어 보자
		boolean run = true;
		while (run) {

			System.out.println("1. 공격하기 | 2. 빨간 포션 | 3. 파란 포션 | 4. 퀘스트 | 5. 표정 | 6. 대화하기 | 7. 종료");
			System.out.print("번호 입력 >>> ");
			int select = scanner.nextInt();
			switch (select) {
			case 1:
				System.out.println("몬스터를 공격하였습니다");
				moster(scanner, loginAccount);
				break;
			case 2:
				System.out.println("빨간 포션을 먹었습니다");
				break;
			case 3:
				System.out.println("퀘스트를 접수하였습니다");
				break;
			case 4:
				System.out.println("표정을 지었습니다");
				break;
			case 6:
				System.out.println("유저와 대화를 실행합니다");
				break;
			case 7:
				System.out.println("게임을 종료합니다");
				System.out.println("나약한 자는 떠나지 않는다");
				run = false;
				break;
			default:
				System.out.println("번호를 잘못 입력하였습니다");

			} // 스위치 종료
		} // 와일 종료
	} // 메인 종료

	private static void moster(Scanner scanner, Account loginAccount) { // 몬스터 공격 메서드

		int monsterHp = 50000; // 몬스터 초기 체력
		int elfDamge = LineageExam.elfDTO.getHp(); 	// 엘프 초기 체력

			System.out.println("딱딱한 슬라임이 나타났습니다!!");
			System.out.println("딱딱한 슬라임 체력: 50000!!!");

			while (monsterHp > 0) {
			System.out.println("1. 공격하기 | 2. 피하기");
			System.out.print("번호 입력 >>> ");
			int select = scanner.nextInt();
			switch (select) {
			case 1:

				System.out.println("몬스터를 공격합니다");
				int damge = (int) (Math.random() * 2000) + 3000 ;	// 몬스터 데미지 랜덤
			
				if (Math.random() < 1.0) {
					int summm = monsterHp -= damge;
					System.out.println("명중!! " + damge + " 데미지를 입혔습니다");
					System.out.println("지독한 슬라임 체력: " + summm + " 입니다");
				
					int elfDamge11 = (int) (Math.random() * 50) + 10;		// 내 피 랜덤
					int sum = elfDamge -= elfDamge11 ; // 체력 감소 적용
					System.out.println("따끔!! " + elfDamge11 + " 데미지를 입었습니다" );
					System.out.println("현재 내 체력: " + sum + " 입니다");
				
						if (LineageExam.elfDTO.getHp() <=0) {
							System.out.println("캐릭터가 죽었습니다");	// 캐릭터 사망 체크
							System.out.println("주변 마을에서 부활합니다");
							
							return;
						}
						if (monsterHp <= 0) {
							System.out.println("몬스터를 처치하였습니다");	// 몬스터 사망 체크
							System.out.println("아이템 획득!! 딱딱한 슬라임의 방울");
					}
				}
				break;
			case 2:
				System.out.println("나약한 자는 내 제자로 두지 않았다");
				return;
			default:
				System.out.println("번호를 잘못 입력하였습니다");
			} // 이프 종료
		} // 스위치 종료
	} // 와일 종료
} // 몬스터 공격 메서드 종료
