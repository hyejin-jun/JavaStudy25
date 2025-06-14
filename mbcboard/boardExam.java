package mbcboard;

import java.sql.SQLException;
import java.util.Scanner;

import mbcboard.service.BoardService;

public class boardExam {
	
	public static Scanner inputStr = new Scanner(System.in);
	
	// 생성자
	
	// 메서드
		
	public static void main(String[] args) throws SQLException {  // 메인
		
		boolean run = true ;	
		while(run) {
		System.out.println("엠비씨에 오신 것을 환영합니다");
		System.out.println("1. 회원 | 2. 게시판 | 3. 종료");
		System.out.print("번호 입력 >>> ");
		String select = inputStr.next() ;
		
		switch (select) {
		
		case "1":
			System.out.println("회원 메뉴입니다");
			break;
		case "2":
			System.out.println("게시판 메뉴입니다");
			BoardService boardService = new BoardService();
			boardService.subMenu(inputStr);
			break;
		case "3":
			System.out.println("종료합니다");
			run = false ;
			break;
		default:
			System.out.println("번호 입력을 제대로 해 주세요");
			break;
		}
		}


	}

}
