package ch05.student;

import java.util.Scanner;

public class ScoresExam {
	
	private static Scanner input = new Scanner (System.in);	// 현 클래스에서 호출 예정
	private static Student[] st = new Student[5] ;	// st라는 배열에 5 명 주입
	
	public static void main(String[] args) {	// 주실행 메서드
		
		boolean run = true ;
		
		while (run) {
			
			System.out.println("============= 학생 관리 프로그램 ===============");
			System.out.println("1. 학생 관리 | 2. 성적 입력 | 3. 통계 | 4. 종료");
			System.out.println("==============================================");
			System.out.print("번호 입력 >> ");
			int select = input.nextInt() ;
			
			switch (select) {
			
			case 1:
				System.out.println("학생 관리 클래스로 진입");
				boolean strun = true ;
				while (strun) {
					System.out.println("1. 학생 등록 | 2. 학생 보기 | 3. 학생 수정 | 4. 학생 삭제 | 5. 메인 메뉴");
					System.out.print("번호 입력 >>>> ");
					int stSelect = input.nextInt() ;
					switch (stSelect) {
					case 1:
						System.out.println("학생 등록 메뉴입니다");
						Student regStudent = new Student() ;	// 객체 생성
						System.out.print("이름 >>> ");
						regStudent.name = input.next() ;	// 키보드로 입력받은 이름
						System.out.print("학번 >>> ");
						regStudent.num = input.nextInt() ;	// 키보드로 입력받은 학번
						System.out.print("성별 >>> ");
						regStudent.sex = input.next() ;	// 키보드로 입력받은 성별
						System.out.print("학년 >>> ");
						regStudent.grade = input.nextInt() ;	// 키보드로 입력받은 학년
						System.out.print("반 >>> ");
						regStudent.classroom = input.nextInt() ;	// 키보드로 입력받은 반
						System.out.println("===================================");
						System.out.println("======= 배열 빈칸 찾아 저장 ========");
						
						for (int i = 0 ; i < st.length ; i++) {
							if (st[i] == null) { 	// st 배열에 빈칸인지 찾음
								st[i] = regStudent ; 	// 위에서 만든 객체를 넣음
								System.out.println("저장 성공!!!");
								break;	// 저장 후 종료
							
						}	// if 종료
						}	// for 종료
						break ;	// 학생 등록용 정지
						
					case 2:
						System.out.println("전체 학생 보기 메뉴입니다");
						for (int i = 0 ; i < st.length ; i++) {
							if (st[i] != null) { // st 배열 칸이 null이 아니면!!
								System.out.println("-------------------");
								System.out.println("이름: " + st[i].name);
								System.out.println("학번: " + st[i].num);
								System.out.println("성별: " + st[i].sex);
								}	// if 종료
						}	// for 종료
						break ; // 학생 보기 정지
						
					case 3:
						System.out.println("학생 수정 메뉴입니다");
						System.out.print("수정할 학생명을 입력하세요 >>> ");
						String searchName = input.next() ;
						Student findStudent = find (searchName);	// 아래에 만든 메서드에서 불러옴
						
						if (findStudent == null) {	// null이면 찾는 학생이 없다 (아래에 학생이 없다)
							System.out.println("찾는 학생이 없습니다");
						} else {System.out.print("수정할 학생 번호를 입력하세요");
						findStudent.num = input.nextInt() ;
						System.out.println("학생 정보 수정 완료");
						}
						break ;
					case 4:
						System.out.print("삭제할 학생명을 입력하세요 >>> ");
						String deleteName = input.next() ;
						Student deStudent = find (deleteName) ;	// 아래에서 만든 메서드에서 찾아옴
						
						if (deStudent == null) {
							System.out.println("찾는 학생이 없습니다");
						} else {
							for (int i = 0 ; i < st.length ; i++) {
								System.out.println(st[i].name);
								System.out.println(deStudent.name);
								if (st[i].equals(deStudent.name)) {
									st[i] = null ; // 삭제
									System.out.println("삭제 완료!!!");
									break;
								}	// if 종료
							}	// for 종료
						}	// if 종료
					break ;
					case 5:
						System.out.println("메인 메서드로 복귀합니다");
					strun = false ;
					default:
						System.out.println("번호를 잘못 입력하였습니다");
					}	// 스위치 종료
					
				}	// 와일 종료
			run = false ;
			break ;
			default:
				System.out.println("번호를 잘못 입력하였습니다");
			}	// 스위치 종료
			
			
			
		}	// 와일 종료
		
		

	}	// 메인 종료

	private static Student find(String name) {	// 이름으로 객체를 찾아오는 메서드
		Student student = null ; // 빈 객체 생성
		for (int i = 0 ; i < st.length ; i++) {
			if (st[i] != null) {
				String arrayName = st[i].name ; // 배열에 있는 이름을 가지고 옴
				if (arrayName.equals(name)) {	// 배열 name과 키보드 name 비교
					student = st[i] ;
					break ;
					
				}
			}	// if 종료
		}	// for문 종료
		
		return student;
	}	// find 종료

}	// class 종료
