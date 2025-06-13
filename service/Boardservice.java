package service;


import java.sql.SQLException;
import java.util.Scanner;

import dao.BoardDAO;
import dao.MemberDAO;
import dto.BoardDTO;
import dto.MemberDTO;

public class Boardservice {

    private BoardDAO boardDAO;
	private MemberDTO session;


	// 생성자
	
	// 메서드 (부메뉴, 생성, 모두 보기, 하나 보기, 수정, 삭제)
	
	public void subMenu(Scanner inputStr) throws SQLException {
		boolean subRun = true ;
		while (subRun) {
			System.out.println("MBC 아카데미 게시판 서비스입니다");
			System.out.println("1. 모두 보기 | 2. 게시글 작성 | 3. 게시글 자세히 보기 | 4. 게시글 수정 | 5. 게시글 삭제 | 6. 종료");
			System.out.print("번호 입력 >> ");
			String subSelect = inputStr.next();
			
			switch(subSelect) {
			case "1":
				System.out.println("모든 게시물 보기로 진입합니다");
				selectAll (boardDAO);
				break;
			case "2":
				System.out.println("게시글 작성 메뉴로 진입합니다");
				insertBoard(session, inputStr);
				break;
			case "3":
				System.out.println("게시글 자세히 보기로 진입합니다");
				readOne(inputStr);
				break;
			case "4":
				System.out.println("게시글 수정 메뉴로 진입합니다");
				modify(inputStr);
				break;
			case "5":
				System.out.println("게시글 삭제 메뉴로 진입합니다");
				deleteOne();
				break;
			case "6":
				System.out.println("게시글 보기 종료합니다");
				boardDAO.connection.close();  // 게시판 종료시 connection 종료
				subRun = false ;
				break;
			default:
				System.out.println("1 번에서 6 번만 입력 가능합니다");
				break;
			} // 스위치 종료

			}  // 와일 종료
			

	}  // 메인 종료


	private void deleteOne() throws SQLException {  // 게시물의 번호를 받아 삭제
		
		Scanner inputInt = new Scanner(System.in);
		System.out.print("삭제하려는 게시글의 번호를 입력하세요 >>> ");
		int selectBno = inputInt.nextInt();
		boardDAO.deleteOne(selectBno);
	}

	private void modify(Scanner inputStr) throws SQLException { // 제목을 찾아서 내용을 수정
		
		System.out.print("수정하고 싶은 게시글의 제목을 입력하세요 >>> ");
		String title = inputStr.next();
		
		boardDAO.modify(title, inputStr);
		System.out.println("================끝======== ========");
		
	}

	private void readOne(Scanner inputStr) throws SQLException { // 제목을 입력하면 내용이 보이도록 select 처리
		
		System.out.print("보고 싶은 게시글의 제목을 입력하세요 >>> ");
		String title = inputStr.next();
		
		boardDAO.readOne(title);
		System.out.println("================끝================");
		
	}  // readOne 종료

	private void insertBoard(MemberDTO session, Scanner inputStr) throws SQLException {  // 키보드로 입력한 데이터를 dto를 사용하여 데이터베이스에 insert

		BoardDTO boardDTO = new BoardDTO();  // 빈 객체 생성
		
		
		System.out.println("session.getMno() = " + session.getId());	
		
		inputStr.nextLine();  // 버퍼 비우기
	    System.out.print("제목: ");
	    boardDTO.setBtitle(inputStr.nextLine()); 
	
	    System.out.print("내용: ");
	    boardDTO.setBcontent(inputStr.nextLine());
	    
	    boardDTO.setBwriter(session.getBwriter());  // 작성자 이름 혹은 아이디 넣기
	    
		boardDAO.insertBoard(boardDTO, session);  // 위에서 만든 객체를 dao에게 전달
		System.out.println("==================insertBoare 메서드 종료================");
	
	}  // insertBoard 메서드 종료

	private void selectAll(BoardDAO boardDAO) throws SQLException {	// DAO에게 전체 보기 하는 서비스를 제공
		System.out.println("=========================================");
		System.out.println("======== MBC 게시판 목록입니다 ===========");
		boardDAO.selectAll();
		System.out.println("=========================================");
		
	}

}


