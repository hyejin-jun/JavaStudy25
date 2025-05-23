package ch04;

import java.util.Scanner;

public class MemberExam {

	public static void main(String[] args) {
		// Member 클래스를 호출하여 처리하기
		
		Scanner input = new Scanner(System.in) ;
		Member1[] members = null ;
		Bord[] bords = null ;

		System.out.println("엠비씨에 오신 것을 환영합니다 ^~^!!!!!!!!!!!!! ");
		System.out.println("  ");   // 메인 홈페이지 (^~^)

		System.out.print("가입할 회원 수를 입력하세요 >>> ");
		
		int count = input.nextInt() ;  // 회원 수 입력 객체
		members = new Member1[count] ;  // 입력한 회원 수가 count 배열에 생성
		
		System.out.println("회원가입 프로그램을 실행합니다 ^~^");
		
		boolean run = true ;  // 전체 메인 리턴한다  (boolean이 true면 다시 돌아온다!!)
		
		while (run) {
			System.out.println("1. 회원가입");
			System.out.println("2. 회원 전체 보기");
			System.out.println("3. 로그인");
			System.out.println("4. 회원 수정");
			System.out.println("5. 회원 탈퇴");
			System.out.print("번호 입력 >>>>>>>>>>> ");
			int hhww = input.nextInt() ;

			switch (hhww) {  /// 회원에 대한 switch	
			case 1:  // 회원 등록
				Member1 member1 = new Member1();
				for (int i = 0 ; i < members.length ; i++) {		
					member1 = member1.memberAdd(input);  // 생성된 객체 메서드 호출 및 실행
					members[i] = member1 ;
				}  // case 1 for 종료
				break ;
					case 2:  // 회원 보기
						Member1 member2 = new Member1( ) ;
						member2 = member2.memberList(members);
						break ;
					case 3:  // 로그인
						Member1 member3 = new Member1( ) ;
						member3 = member3.memberLogin(members);
						break ;
					case 4:  // 회원 수정
						Member1 member4 = new Member1 ( ) ;
						member4 = member4.memberUpdate(members);
						break ;
					case 5: // 회원 삭제
						Member1 member5 = new Member1 () ;
						member5 = member5.memberDet(members);
						break ;
						default:
							System.out.println("번호를 잘못 입력하였습니다");
							break ;
			}   // hhww switch 종료
			
			System.out.println("1. 게시판 등록");
			System.out.println("2. 게시판 전체 목록 보기");
			System.out.println("3. 게시판 크게 보기");
			System.out.println("4. 게시판 수정");
			System.out.println("5. 게시판 삭제");
			System.out.print("번호 입력 >>>>>>>>>>> ");
			int noti = input.nextInt() ;

			switch (noti) {
			
			case 1:  // 회원 등록
				Member1 member1 = new Member1();
				for (int i = 0 ; i < members.length ; i++) {		
					member1 = member1.memberAdd(input);  // 생성된 객체 메서드 호출 및 실행
					members[i] = member1 ;
				}  // g
				break ;

					case 2:  // 회원 보기
						Member1 member2 = new Member1( ) ;
						member2 = member2.memberList(members);
						break ;

				
					case 3:  // 로그인
						Member1 member3 = new Member1( ) ;
						member3 = member3.memberLogin(members);
						break ;
					case 4:  // 회원 수정
						Member1 member4 = new Member1 ( ) ;
						member4 = member4.memberUpdate(members);
						break ;
					case 5: // 회원 삭제
						Member1 member5 = new Member1 () ;
						member5 = member5.memberDet(members);
						break ;
						default:
							System.out.println("번호를 잘못 입력하였습니다");
							break ;
		}
	}
	}
}

		
		