package service;

import java.sql.SQLException;
import java.util.Scanner;

import dao.MemberDAO;
import dto.MemberDTO;

public class MemberService {
	// 필드
	public MemberDAO memberDAO = new MemberDAO();

	public void subMenu(Scanner inputStr) throws SQLException  {
		
		boolean run = true ;
		while(run) {
			System.out.println("MBC 아카데미 멤버 서비스입니다");
			System.out.println("1. 모두 보기 | 2. 멤버 입력 | 3. 멤버 자세히 보기 | 4. 멤버 수정 | 5. 멤버 삭제 | 6. 종료");
			System.out.print("번호 입력 >>> ");
			String select = inputStr.next() ;
			
			switch (select) {
			case "1":
				System.out.println("모든 멤버 보기 메뉴로 이동합니다");
				selectAll (memberDAO);
				break;
			case "2":
				System.out.println("멤버 입력 메뉴로 이동합니다");
				insertMember(memberDAO, inputStr);
				break;
			case "3":
				System.out.println("멤버 자세히 보기로 이동합니다");
				readOne (inputStr);
				break;
			case "4":
				System.out.println("멤버 수정으로 이동합니다");
				updateMember(inputStr);
				break;
			case "5":
				System.out.println("멤버 삭제로 이동합니다");
				break;
			case "6":
				System.out.println("멤버 메뉴를 종료합니다");
				memberDAO.connection.close();
				run = false;
				break;
			default:
				System.out.println("1 번부터 6 번까지 입력해 주세요");
				break;

			}  // 스위치 종료
		} // 와일 종료

	} // 메인 종료


	

	private void updateMember(Scanner inputStr) throws SQLException { // 멤버 수정 메서드
		
		System.out.print("수정하고 싶은 멤버를 검색하세요 >>> ");
		String upMem = inputStr.next();
		
		MemberDAO memberDAO = new MemberDAO();
		memberDAO.updateMember(upMem, inputStr);
		System.out.println("================= 끝 =====================");
		
		
	}

	private void readOne(Scanner inputStr) throws SQLException {
		
		System.out.print("보고 싶은 회원의 이름을 검색하세요 >>> ");
		String memname = inputStr.next();
		
		memberDAO.readOne(memname);
		System.out.println("=================== 끝 ===================");
	
	}

	private void insertMember(MemberDAO memberDAO, Scanner inputStr) throws SQLException {
	
		MemberDTO memberDTO = new MemberDTO() ;
		System.out.print("이름: ");
		memberDTO.setBwriter(inputStr.next());
		System.out.print("아이디: ");
		memberDTO.setId(inputStr.next());
		System.out.print("비밀번호: ");
		memberDTO.setPw(inputStr.next());
		
		memberDAO.insertMember(memberDTO);
		System.out.println("===================== 종료 ===================");
	}

	private void selectAll(MemberDAO memberDAO) throws SQLException { // 멤버 모두 보기 메서드
		
		System.out.println("============= 멤버 모두 보기입니다 ===========");
		memberDAO.selectAll ();
		System.out.println("==========================================");
		
		
	}


} // 클래스 종료
