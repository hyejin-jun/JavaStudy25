package mbcboard.service;

import java.sql.SQLException;
import java.util.Scanner;

import mbcboard.dao.BoardDAO;
import mbcboard.dto.BoardDTO;

public class BoardService {
	// 필드
	
	public BoardDAO boardDAO = new BoardDAO();  // 1 단계 2 단계 수행

	public void subMenu(Scanner inputStr) throws SQLException {
		boolean subRun = true ;
	
		while (subRun) {
			System.out.println("MBC 아카데미 게시판 서비스입니다");
			System.out.println("1. 모두 보기 | 2. 게시글 작성 | 3. 게시글 자세히 보기 | 4. 게시글 수정 | 5. 게시글 삭제 | 6. 종료");
			System.out.print("번호 입력 >>> ");
			String subSelect = inputStr.next();  // 키보드 입력 객체 생성
			
			switch(subSelect) {
			case "1":
				System.out.println("모든 게시글 보기로 진입합니다");
				selectAll (boardDAO);  // boradDAO의 정보를 가지고 오다
				break;
			case "2":
				System.out.println("게시글 작성으로 진입합니다");
				insertBoard(boardDAO, inputStr);
				break;
			case "3":
				System.out.println("게시글 자세히 보기로 진입합니다");
				readOne(inputStr);
				break;
			case "4":
				System.out.println("게시글 수정으로 진입합니다");
				break;
			case "5":
				System.out.println("게시글 삭제로 진입합니다");
				break;
			case "6":
				System.out.println("종료로 진입합니다");
				break;
			default:
				System.out.println("1 번에서 6 번만 입력하세요");
				break;
			} // 스위치 종료
		} // 와일 종료
	}

	private void readOne(Scanner inputStr) throws SQLException {
		System.out.print("보고 싶은 게시글의 제목을 입력하세요 >>> ");
		String title = inputStr.next() ;
		
		 boardDAO.readOne(title);
		System.out.println("================= 끝 ===============");
		
	}

	private void insertBoard(BoardDAO boardDAO, Scanner inputStr) throws SQLException {
		BoardDTO boardDTO = new BoardDTO() ; // 빈 객체 생성 (게터 세터 부르려면 필수)
		System.out.println("제목: ");
		boardDTO.setBtitle(inputStr.next());
		Scanner inputLine = new Scanner (System.in);
		System.out.println("내용: ");
		boardDTO.setBcontent(inputLine.nextLine());
		System.out.println("작성자: ");
		boardDTO.setBwriter(inputStr.next());
		
		boardDAO.insertBoard(boardDTO);  // 위에서 만든 객체를 dao에 전달
		System.out.println("=============== 종료 ====================");
		
	}

	private void selectAll(BoardDAO boardDAO2) throws SQLException {
		System.out.println("=============== MBC 게시판 목록입니다 ==============");
		boardDAO.selectAll();  // boardDAO에서 selectAll 정보를 가지고 온다 (selectAllDAO를 작성)
		System.out.println("============================");
		
	}
	}  

