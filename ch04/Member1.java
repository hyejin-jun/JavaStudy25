package ch04;

import java.io.InputStream;
import java.nio.channels.MembershipKey;
import java.util.Scanner;

public class Member1 { // 필드

	// 필드, 생성자, 메서드 만들어야 함

	public int mmo;
	public String id;
	public String pw;

	public Member1() { // 생성자
		// Member member = new Member () ; << 과도 같다

	}

	public Member1 memberAdd(Scanner input) { // CURD를 생성하는 메서드
		// 회원가입 메서드 생성

		Member1 member = new Member1(); // 리턴용 객체

		System.out.println("회원가입용 메서드입니다 ^~^");
		System.out.print("회원 번호를 입력하세요 >>  ");
		member.mmo = input.nextInt();

		System.out.print("회원 아이디를 입력하세요 >> ");
		member.id = input.next();

		System.out.print("회원 비밀번호를 입력하세요 >> ");
		member.pw = input.next();
		return member;

	} // 회원가입 메서드 종료

	public Member1 memberList(Member1[] members) { // CURD를 생성하는 메서드

		System.out.println("회원 보기용 메서드입니다 ^~^");
		for (int i = 0; i < members.length; i++) {
			System.out.print("회원 번호: " + members[i].mmo);
			System.out.print("회원 번호: " + members[i].id);
			System.out.print("회원 번호: " + members[i].pw);
			System.out.println("=========================");
		} // 폴 종료
		return null;

	} // 회원 보기 메서드 종료

	public Member1 memberLogin(Member1[] members) { // CURD를 생성하는 메서드
		Member1 member1 = new Member1();
		Scanner inputStr = new Scanner(System.in);

		System.out.print("로그인할 아이디를 입력하세요 >>> ");
		String logid = inputStr.next();
		System.out.print("로그인할 패스워드를 입력하세요 >>> ");
		String logpw = inputStr.next();

		for (int i = 0; i < members.length; i++) {
			if (members[i].id.equals(logid) && members[i].pw.equals(logpw)) {
				System.out.println("로그인에 성공하였습니다 ^~^");
			} else {
				System.out.println("로그인에 실패하였습니다");
			} // else 종료
		} // for 종료
		return member1;

	} // 로그인 메서드 종료

	public Member1 memberUpdate(Member1[] members) { // CURD를 생성하는 메서드
		Member1 member = new Member1();

		Scanner inputStr = new Scanner(System.in);
		Scanner inputInt = new Scanner(System.in);

		System.out.print("변경할 회원의 회원 번호를 입력하세요 >> ");
		int chmno = inputInt.nextInt();

		for (int i = 0; i < members.length; i++) {
			if (members[i].mmo == chmno) {
				System.out.println("변경하실 회원의 아이디가 맞으실까요 >> " + members[i].id);
				System.out.println("변경하실 회원의 비밀번호가 맞으실까요 >> " + members[i].pw);
				System.out.println("====================================");
				System.out.print("변경하실 회원의 아이디: " + members[i].id + " 변경 아이디 입력 >>>>>> ");
				members[i].id = inputStr.next();
				System.out.print("변경하실 회원의 비밀번호: " + members[i].pw + " 변경할 패스워드 입력 >>>> ");
				members[i].pw = inputStr.next();
				System.out.println("변경되었습니다 ^~^");
				break;
			} else {
				System.out.println("찾으시는 회원이 없습니다");
			} // 엘스 종료
		
		} // 폴 종료
		return member;
	} // 회원 변경 메서드 종료

	public Member1 memberDet(Member1[] members) { // CURD를 생성하는 메서드
		Member1 member = new Member1();
		Scanner inputInt = new Scanner(System.in);

		System.out.print("탈퇴할 회원의 회원 번호를 입력하세요 >> ");
		int byemno = inputInt.nextInt();
	
		for (int i = 0; i < members.length; i++) {
			

			
			if (members[i].mmo == byemno) {
				System.out.println("삭제하실 회원의 아이디가 맞으실까요 >> " + members[i].id);
				System.out.println("삭제하실 회원의 비밀번호가 맞으실까요 >> " + members[i].pw);
				System.out.println("====================================");
				System.out.println("삭제를 원하시면 1 번을 누르시고 원하시지 않으시면 2 번을 눌러 주세요"); 
				}else {System.out.println("번호를 잘못 입력하였습니다");
			
			int del = inputInt.nextInt() ;
				
				switch (del) {
			
				case 1:
					
				members[i].mmo = 0 ;
				members[i].id = null ;
				members[i].pw = null ;
				System.out.println("삭제되었습니다 ^~^");
				break;

				case 2:
					System.out.println("삭제를 하지 않겠습니다!! ");
					break ;}
				
	
		

			}
		}
		return null;
	}
}
