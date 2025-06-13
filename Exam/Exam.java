package Exam;

import java.sql.SQLException;
import java.util.Scanner;

import dto.MemberDTO;
import service.Boardservice;
import service.LoginService;
import service.MemberService;

public class Exam {
	
	MemberDTO session = null; 
	
	public static Scanner inputStr = new Scanner(System.in);


	public static void main(String[] args) throws SQLException {
		boolean run = true;

		while (run) {
			System.out.println("MBC 자유 게시판입니다");
			System.out.println("1. 회원가입 | 2. 로그인 | 3. 종료");
			System.out.print("번호 입력 >>> ");
			String select = inputStr.next();
			
			switch(select) {
			
			case "1":
				System.out.println("회원가입 서비스로 진입합니다");
				LoginService loginService = new LoginService() ;
				loginService.subMenu(inputStr);
				break;
			case "2":
				System.out.println("로그인 메뉴로 진입합니다");
				LoginService loginService2 = new LoginService() ;
				MemberDTO session = loginService2.login(inputStr);
				
				break;
			case "3":
				System.out.println("프로그램을 종료합니다");
				run = false;
				break;
			default:
				System.out.println("1에서 3까지만 입력해 주세요");

			}	// 스위치(셀렉트) 종료
		}	// 와일문 종료
	} 	// 메인 종료
}	// 클래스 종료



		
	

	

