package test;

import java.util.Scanner;

public class Sevice {


		public static ScorDTO tjdwjr(Scanner inputStr, Scanner inputInt, MemberDTO[] memberDTO, ScorDTO[] scorDTO) { // 성적 입력 메서드

			for (int i = 0 ; i < memberDTO.length ; i++ ) {
				
				
			
			
			System.out.print("성적 입력할 학생의 이름을 입력하세요 >>> ");
			String name = inputStr.next() ;
			if (memberDTO[i] != null && memberDTO[i].getName().equals(name))
			
			
			System.out.println("입력할 학생의 국어 성적을 입력하세요 >>> ");
			int tjdwjr1 = inputInt.nextInt() ;
			System.out.println("입력할 학생의 국어 성적을 입력하세요 >>> ");
			int tjdwjr2 = inputInt.nextInt() ;
			
			int total = tjdwjr1 + tjdwjr2 ;
			
			if (total >= 200 & total == 0) {
				System.out.println("해당하는 점수는 입력 불가능입니다");
			} if (total >= 180) {
				System.out.println("학생 등급은 A입니다");
			} if (total >= 160)  {
				System.out.println("학생 등급은 B입니다");
			} if (total >= 140 ) {
				System.out.println("학생 등급은 C입니다");
			} if (total >= 120) {
				System.out.println("학생 등급은 D입니다");
			} if (total >= 100 & total == 0)
			{System.out.println("학생 등급은 F입니다");
			}
			else {System.out.println("해당하는 학생이 없습니다");
			}
			
			}
			return null;
				
			
	
		}



		public static MemberDTO[] Add(Scanner inputStr, Scanner inputInt, MemberDTO[] memberDTO) { // 학생 등록 메뉴 메소드
			
			MemberDTO newmem = new MemberDTO() ;
			System.out.print("등록할 학생 이름을 입력하세요 >>> ");
			newmem.setName(inputStr.next());
			System.out.print("등록할 학생 성별을 입력하세요 >>> ");
			newmem.setSex(inputStr.next());
			System.out.print("등록할 학생 학년을 입력하세요 >>> ");
			newmem.setGkrqjs(inputStr.next());
			System.out.print("등록할 학생 반을 입력하세요 >>> ");
			newmem.setQks(inputStr.next());
			System.out.println("학생이 등록되었습니다");
			boolean added = false;
		    for (int i = 0; i < memberDTO.length; i++) {
		        if (memberDTO[i] == null) {
		            memberDTO[i] = newmem;
		            added = true;
		            break;
		        }
		    }

		    if (added) {
		        System.out.println("학생이 등록되었습니다");
		    } else {
		        System.out.println("학생 등록 공간이 부족합니다.");
		    }

		    return memberDTO;
		
		
		
		}


		
		public static void qhrl(Scanner inputInt, Scanner inputStr, MemberDTO[] memberDTOs, ScorDTO[] scorDTOs) { // 학생 정보 보기
			
			MemberDTO memberDTOs1 = new MemberDTO() ;
			ScorDTO scorDTOs1 = new ScorDTO() ;
			
			System.out.print("정보를 볼 학생의 이름을 입력하세요 >>> ");
			String name = inputStr.next() ;
			
			for (int i = 0 ; i < name.length() ; i++) {
				if (name.equals(memberDTOs1.getName())){
					System.out.println("학생 정보를 입력합니다");
					System.out.println("학생 이름: " + memberDTOs[i].getName());
					System.out.println("학생 성별: " + memberDTOs[i].getSex());
					System.out.println("학생 학년: " + memberDTOs[i].getGkrqjs());
					System.out.println("학생 반: " + memberDTOs[i].getQks());
					System.out.println("학생 국어 점수: " + scorDTOs[i].getKor());
					System.out.println("학생 수학 점수: " + scorDTOs[i].getEng());
					} else {System.out.println("해당하는 학생이 없습니다");
					}
				
			}	
	
	}



	
		public static void all(Scanner inputInt, Scanner inputStr, MemberDTO[] memberDTOs, ScorDTO[] scorDTOs) { // 전체 보기
			
			for (int i = 0 ; i < memberDTOs.length + scorDTOs.length  ; i++) {
				if (memberDTOs[i] != null) {
					System.out.println("---------------");
					System.out.println(memberDTOs);
				}
				
			}
			
			
		}



		
		public static void tnwjd(Scanner inputInt, Scanner inputStr, MemberDTO[] memberDTOs, ScorDTO[] scorDTOs) { // 멤버 수정
			
			MemberDTO memberDTOs1 = new MemberDTO() ;
			ScorDTO scorDTOs1 = new ScorDTO() ;
			
			System.out.print("수정할 학생의 이름을 입력하세요 >>> ");
			String name = inputStr.next() ;
			
			for (int i = 0 ; i < name.length() ; i++) {
				if (name.equals(memberDTOs1.getName())){
					
			System.out.print("변경할 정보를 수정하세요 >>> ");
			System.out.println("학생 이름: " ) ;
			memberDTOs[i].setName(inputStr.next());
			System.out.println("학생 성별: ");
			memberDTOs[i].setSex(inputStr.next());
			System.out.println("학생 학년: ");
			memberDTOs[i].setGkrqjs(inputInt.nextInt());
			System.out.println("학생 반: ");
			memberDTOs[i].setQks(inputInt.nextInt());
			System.out.println("학생 국어 점수: ");
			scorDTOs[i].setKor(inputInt.nextInt());
			System.out.println("학생 수학 점수: ");
			scorDTOs[i].setEng(inputInt.nextInt());
			
			System.out.println("변경되었습니다");
			} else {System.out.println("해당하는 학생이 없습니다");
			}
		
	
			
			
		
		}
}



		public static void del(Scanner inputInt, Scanner inputStr, MemberDTO[] memberDTOs, ScorDTO[] scorDTOs) { // 삭제
			
			
			MemberDTO memberDTOs1 = new MemberDTO() ;
			ScorDTO scorDTOs1 = new ScorDTO() ;
			
			System.out.print("삭제할 학생의 이름을 입력하세요 >>> ");
			String name = inputStr.next() ;
			
			for (int i = 0 ; i < name.length() ; i++) {
				if (name.equals(memberDTOs1.getName())){
					memberDTOs[i] = null ;
					scorDTOs = null ;		
		}
		 else {System.out.println("해당하는 학생이 없습니다");
}
			}
		}
}

