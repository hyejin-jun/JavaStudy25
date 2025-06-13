package test;

import java.util.Scanner;

import ch05.lineage.Account;
import ch05.lineage.ElfDTO;
import ch05.lineage.HumanDTO;
import ch05.lineage.KinghtDTO;
import ch05.lineage.LoginService;

public class ScorExam {
	
	
	public static Scanner inputInt = new Scanner(System.in) ;
	public static Scanner inputStr = new Scanner(System.in);
	public static MemberDTO[] memberDTOs = null;
	public static ScorDTO[] scorDTOs = null ;

	
	static {
		memberDTOs = new MemberDTO[10] ;
		scorDTOs = new ScorDTO[10];
		
	}


	public static void main(String[] args) {
		
		

		
		boolean run = true ;
		while (run) {
		System.out.println("========================================================================================================");
		System.out.println("1. 학생 입력 | 2. 성적 입력 | 3. 학생 정보 보기 | 4. 학생 전체 보기 | 5. 정보 수정 | 6. 정보 삭제 | 7. 나가기");
		System.out.println("========================================================================================================");
		System.out.print("번호 입력 >>> ");
		String select = inputStr.next() ;
		switch(select) {
		case "1":
			System.out.println("1. 학생 입력 메뉴입니다");
			MemberDTO[] memberDTOs1 = new MemberDTO[10];
			memberDTOs1 = Sevice.Add(inputStr, inputInt, memberDTOs);
			break;
		
		case "2":
			System.out.println("2. 성적 입력 메뉴입니다");
			ScorDTO[] scorDTOs1 = new ScorDTO[10];
			Sevice.tjdwjr (inputStr, inputInt, memberDTOs, scorDTOs);
			break;
		case "3":
			System.out.println("3. 학생 정보 보기 메뉴입니다");
			Sevice.qhrl (inputInt, inputStr, memberDTOs, scorDTOs);
			break;
		case "4":
			System.out.println("4. 학생 전체 보기 메뉴입니다");
			Sevice.all (inputInt, inputStr, memberDTOs, scorDTOs);
			break;
		case "5":
			System.out.println("5. 정보 수정 메뉴입니다");
			Sevice.tnwjd (inputInt, inputStr, memberDTOs, scorDTOs);
			break;
		case "6":
			System.out.println("6. 정보 삭제 메뉴입니다");
			Sevice.del (inputInt, inputStr, memberDTOs, scorDTOs);
			break;
		case "7":
			System.out.println("7. 나가기 메뉴입니다");
			run = false ;
			break;
		default:
			System.out.println("번호를 잘못 입력하였습니다");
			break ;

		
		} // 스위치 종료
	 
		} // 와일 종료
	}
}



