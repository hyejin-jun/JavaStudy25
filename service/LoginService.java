package service;

import java.sql.SQLException;
import java.util.Scanner;

import dao.BoardDAO;
import dao.LoginDAO;
import dao.MemberDAO;
import dto.MemberDTO;
import oracle.net.ns.SessionAtts;

public class LoginService {
	
	public static Scanner inputStr = new Scanner(System.in);

	public static void main(MemberDTO session) throws SQLException {
		boolean run = true;

		while (run) {
			System.out.println("MBC 자유 게시판입니다");
			System.out.println("1. 회원 보기 | 2. 게시판 | 3. 종료");
			System.out.print("번호 입력 >>> ");
			String select = inputStr.next();
			
			switch(select) {
			
			case "1":
				System.out.println("회원용 서비스로 진입합니다");
				MemberService memberService = new MemberService();
				memberService.subMenu(inputStr);
				
				break;
			case "2":
				System.out.println("게시판 서비스로 진입합니다");
				Boardservice boardService = new Boardservice();
				boardService.subMenu(inputStr);
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

	
	
	
	
	
	
	

	public void subMenu(Scanner inputStr) throws SQLException { // 회원가입 메서드
		
			MemberDTO memberDTO = new MemberDTO() ; // 회원 정보 저장할 빈 객체 생성
			MemberDAO memberDAO = new MemberDAO() ;
		
			System.out.print("회원가입할 회원의 성함을 입력하세요 >>> ");
			memberDTO.setBwriter(inputStr.next());  // 이름 입력 받아서 저장하기
			
			String id = "";
			while (true) {
			System.out.print("회원가입할 아이디를 입력하세요 >>> ");
			id = inputStr.next();  // 아이디 입력
			
			if (memberDAO.isId(id)) {
				System.out.println("이미 존재하는 아이디입니다 다시 입력해 주세요");
			} else {
				break; // 중복 아니면 반복 탈출 (중복 아니면 while 멈춤)
			}
			}
			memberDTO.setId(id);  // 중복 아닌 아이디 저장
			System.out.print("비밀번호를 입력하세요 >>> ");
			memberDTO.setPw(inputStr.next());
			
			memberDAO.insertMember(memberDTO);  // DB에 저장하라고 DAO에게 전달함
			System.out.println("회원가입이 완료되었습니다!");
	}

	public MemberDTO login(Scanner inputStr) throws SQLException {  // 로그인 메뉴
		
		MemberDTO session = new MemberDTO();
		  
		System.out.print("로그인할 아이디를 입력하세요 >>> ");
		String id = inputStr.next();

		System.out.print("로그인할 비밀번호를 입력하세요 >>> ");
		String pw = inputStr.next();
		
		session.setId(id);    // 입력받은 id 저장
	    session.setPw(pw);    // 입력받은 pw 저장
		
		LoginDAO loginDAO = new LoginDAO();
		loginDAO.login(session);
		
	    if (session.getMno() != 0) {
	        System.out.println("로그인 성공! 환영합니다 " + session.getMno() + session.getBwriter() + session.getId() + session.getPw());
	       LoginService.main(session);
	        return session;
	    } else {
	        System.out.println("로그인 실패! 아이디 또는 비밀번호를 확인하세요."+ session.getMno());
	        return null ;
	    }


	}
}










