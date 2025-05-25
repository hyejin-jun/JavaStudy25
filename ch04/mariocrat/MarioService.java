package ch04.mariocrat;

import java.util.Scanner;

import javax.swing.text.AbstractDocument.BranchElement;

import dto.MemberDTO;

public class MarioService {

	private MarioService run;

	// 필드

	// 생성자

	// 메서드

	public MarioService marioServiceMenu(Scanner input, MemberDTO[] memberDTOs, MemberDTO loginstste) { // 회원 관리 메뉴 메서드

		System.out.println("=============== 회원 관리 메뉴에 진입하셨습니다 ==============");
		boolean subrun = true;
		while (subrun) {

			System.out.println("1. 가입 | 2. 로그인 | 3. 수정 | 4. 삭제 | 5. 종료");
			System.out.print(" 번호 입력 >>>>>>>>>>> ");
			String select = input.next();
			switch (select) {

			case "1":
				System.out.println("계정을 생성합니다");
				create(input, memberDTOs);
				break;
			case "2":
				System.out.println("로그인을 진행합니다");
				loginstste = loginstste(input, memberDTOs, loginstste);
				break;
			case "3":
				System.out.println("계정을 수정합니다");
				hwch(input, memberDTOs);
				break;
			case "4":
				System.out.println("계정을 삭제합니다");
				hwNull(input, memberDTOs);
				break;
			case "5":
				System.out.println("프로그램을 종료합니다");
				System.out.println("메인 메뉴로 복귀합니다");
				subrun = false;
				break;

			case "99":
				System.out.println("히든 메뉴로 진입하였습니다");
				System.out.println("캐릭터 해킹을 진행합니다");
				break;

			default:
				System.out.println("1 번부터 5 번까지 번호만 입력해 주세요");
			} // switch 선택문 종료

		} // while 종료

		return run;
	} // 메뉴 메서드 종료

	

	public void hwNull(Scanner input, MemberDTO[] memberDTOs) { // 회원 계정 삭제 메서드

		System.out.println("회원 계정 삭제 메서드에 진입하였습니다");

		System.out.print("삭제하실 회원 계정 아이디를 입력해 주세요 >>>> ");
		String hwNull = input.next();
		for (int i = 0; i < memberDTOs.length; i++) {

			if (memberDTOs[i].id.equals(hwNull)) {
				System.out.println("삭제하실 계정의 회원 아이디를 확인해 주세요: " + memberDTOs[i].id);
				System.out.print("삭제하실 거면 1 번 | 삭제 취소를 하실 거면 2 번을 눌러 주세요!!  >>>> ");

			} else {
				System.out.println("계정을 확인해 주세요");
			}	// else 종료

			String del = input.next();
			switch (del) {
			case "1":
				System.out.println("계정을 삭제하였습니다");
				memberDTOs[i].id = null;
				memberDTOs[i].pw = null;
				memberDTOs[i].nick = null;
				memberDTOs[i].email = null;
				break;

			case "2":
				System.out.println("계정을 삭제하지 않겠습니다");
				break;

			} // switch 종료
			return;
		} // else 종료

	} // 회원 계정 삭제 메서드 종료

	public String hwch(Scanner input, MemberDTO[] memberDTOs) {// 회원 계정 수정 메서드

		System.out.println("회원 계정 수정 메서드입니다");

		System.out.print("변경하실 회원의 아이디를 입력해 주세요 >>>> ");
		String chid = input.next();

		for (int i = 0; i < memberDTOs.length; i++) {
			if (memberDTOs[i].id.equals(chid)) {
				System.out.println("변경하실 회원님의 아이디를 확인해 주세요:  " + memberDTOs[i].id);
				System.out.println("=======================");
				System.out.print("변경하실 아이디를 입력해 주세요 >>> ");
				memberDTOs[i].id = input.next();
				System.out.print("변경하실 패스워드를 입력해 주세요 >>> ");
				memberDTOs[i].pw = input.next();
				System.out.println("변경되었습니다 !!");
			} else {
				System.out.println("입력하신 회원이 없습니다");
			} // else 종료
			break;
		} // for 종료

		return null;

	} // 회원 계정 수정 메서드 종료

	public MemberDTO loginstste(Scanner input, MemberDTO[] memberDTOs, MemberDTO loginstste) { // 로그인 메서드


		System.out.println("로그인 메서드로 진입하였습니다");
		boolean login = true;

		while (login) {
			System.out.print("로그인을 위한 아이디를 입력하세요 >>> ");
			String loginid = input.next();
			System.out.print("로그인을 위한 패스워드를 입력하세요 >>> ");
			String loginpw = input.next(); // 키보드 입력 완료

			MemberDTO loginhw = new MemberDTO(); // 새로운 입력 객체 생성

			loginhw.id = loginid; // MemberDTO에 입력된 객체와 로그인을 위해 입력한 아이디랑 같은지 확인한다
			loginhw.pw = loginpw;

			for (int i = 0; i < memberDTOs.length; i++) {
				if (memberDTOs[i] != null && memberDTOs[i].id.equals(loginhw.id)
						&& memberDTOs[i].pw.equals(loginhw.pw)) {
					System.out.println("로그인을 성공하였습니다!!");
					loginstste = memberDTOs[i]; // loginstste 객체에 방금 입력한 값을 입력
					System.out.println(loginstste.nick + " 님 환영합니다!!");
				} else {
					System.out.println("로그인을 실패하였습니다 다시 확인해 주세요!!");
					login = false;
					break;
				}

			} // for 종료
		} // whlie 종료
		return loginstste;

	} // 로그인 메서드 종료


	public void create(Scanner input, MemberDTO[] memberDTOs) { // 회원가입용 메서드
		System.out.println("회원가입용 메서드에 오신 것을 환영합니다");
		MemberDTO memberDTO = new MemberDTO();

		System.out.print("사용하실 아이디를 입력하세요 >>  ");
		memberDTO.id = input.next();
		System.out.print("사용하실 패스워드를 입력하세요 >>  ");
		memberDTO.pw = input.next();
		System.out.print("사용하실 닉네임을 입력하세요 >>  ");
		memberDTO.nick = input.next();
		System.out.print("사용하실 이메일을 입력하세요 >>  ");
		memberDTO.email = input.next(); // 빈 MemberDTo 객체에 필드값 입력 완료
		boolean member11 = false ;

		// 배열의 0에서 null 값이면 삽입 (exam)

		for (int i = 0; i < memberDTOs.length; i++) {
			if (memberDTOs[i] == null) { // null이면 값이 없음
				memberDTOs[i] = memberDTO;
				member11 = true ;
				
				break;
			} // if 종료
		} // for 종료
		
		System.out.println(memberDTO.nick + " 님 회원가입을 축하드립니다!!");
		return ;
	} // 회원가입용 메서드 종료
	
	
} // class 종료
