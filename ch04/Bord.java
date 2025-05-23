package ch04;

import java.io.InputStream;
import java.nio.channels.MembershipKey;
import java.util.Iterator;
import java.util.Scanner;

public class Bord {

	// 필드, 생성자, 메서드

	public String bordName = null; // 게시판 제목
	public String bordData = null; // 게시판 내용
	// TODO Auto-generated method stub

	// Bord 필드

	public Bord() { // 생성자
		// new Scanner = new Bord()와 같음
	}

public Bord BordAdd (Member1[] members) {
	
	Bord bords = new Bord() ;  // 리턴용 객체
	Scanner input = new Scanner(System.in) ;
	
	   // << 땡겨와야 하는 방법 물어보기 !!!!!!!!!!!!!!!!!!

	System.out.println("엠비씨 회원인지 확인하겠습니다 ^~^ 회원이 아니시면 게시글 등록이 불가능하며 회원가입 부탁드립니다");
	System.out.println("1. 게시글 등록 / 2. 회원가입 / 3. 나가기");
	
	for (int i = 0 ; i < members.length ; i++) {

		if (members.equals(members[i].id) && members.equals(members[i].pw)) {
			System.out.println("회원이 맞습니다 게시글 등록 메뉴로 이동하겠습니다 ^~^");
		}  else {System.out.println("회원이 아닙니다 ㅠㅠ 회원가입을 해 주세요");
		}  // else 종료		
	}  // for문 종료
	System.out.print(" 입력하실 제목을 입력하세요 >> ");
	bords.bordName = input.next ( ) ;
	System.out.println(" 입력하실 내용을 입력하세요");
	System.out.print("내용 입력:  ");
	bords.bordData = input.next() ;
	System.out.println("게시글이 등록되었습니다");
	return bords;
	
	
	

	
	
	
	

} // 게시글 등록 메서드 종료

	public void BordList() {

	} // 게시글 전체 보기 메서드 종료

	public void BordEnl() {

	} // 게시글 하나 보기 메서드 종료

	public void BordUpd() {

	} // 게시글 수정 메서드 종료

	public void BordDel() {

	} // 게시글 삭제 메서드 종료

} // 클래스 종료
