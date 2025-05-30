package test;

import java.util.Scanner;

import javax.swing.text.AbstractDocument.BranchElement;

public class tjdwjrExam {
// 필드
	private static Scanner inputInt = new Scanner(System.in);
	private static Scanner inputStr = new Scanner(System.in);

	private static ServiceDTO[] st = new ServiceDTO[5];

	ServiceDTO seviceDTO = new ServiceDTO();

	public static void main(String[] args) { // 성적 처리 프로그램 만들기

		boolean run = true;
		while (run) {
			System.out.println("============================= 엠비씨 성적 처리 프로그램 ==================================");
			System.out.println("1. 학생 입력 | 2. 학생 전체 보기 | 3. 학생 정보 보기 | 4. 학생 수정 | 5. 학생 삭제 | 6. 종료");
			System.out.print("번호 입력 >>>>> ");
			String select = inputStr.next(); // 키보드 객체 생성

			switch (select) {
			case "1":
				System.out.println("학생 입력 메뉴로 진입하였습니다"); // 학생 입력
				create(inputStr, inputInt, st);

				break;
			case "2":
				System.out.println("학생 전체 보기 메뉴로 진입하였습니다"); // 전체 보기
				readAll(inputInt, inputStr, st);
				break;
			case "3":
				System.out.println("학생 정보 보기 메뉴로 진입하였습니다");
				readOne(inputInt, inputStr, st);
				break;
			case "4":
				System.out.println("학생 수정 메뉴로 진입하였습니다");
				update(inputInt, inputStr, st);
				break;
			case "5":
				System.out.println("학생 삭제 메뉴로 진입하였습니다");
				delete(inputInt, inputStr, st);
				break;
			case "6":
				System.out.println("프로그램을 종료합니다");
				run = false;
				break;
			default:
				System.out.println("번호를 잘못 입력하였습니다");

			}

		}
	}

	private static void delete(Scanner inputInt, Scanner inputStr, ServiceDTO[] st) { // 학생 삭제 메뉴

		System.out.print("삭제할 학생 이름을 입력하세요 >>> ");
		String name1 = inputStr.next();

		for (int i = 0; i < st.length; i++) {
		if (st[i].name.equals(name1) && st[i].name.equals(name1)) {
			System.out.println("삭제를 진행하겠습니다");
		st[i] = null ;
			System.out.println("삭제되었습니다");
			break ;
		} else {System.out.println("해당하는 학생이 없습니다");
		break ;
		}
		}
		
	}
	



	private static ServiceDTO[] update(Scanner inputInt, Scanner inputStr, ServiceDTO[] st) { // 학생 수정 메뉴

		System.out.print("수정할 학생 이름을 입력하세요 >>> ");
		String name1 = inputStr.next();
		for (int i = 0; i < st.length; i++) {
			if (st[i].name.equals(name1) && st[i].name.equals(name1)) {
				System.out.print("변경할 학생 이름을 입력하세요 >>> ");
				st[i].name = inputStr.next();
				System.out.print("변경할 학생 점수를 입력하세요 >>> ");
				st[i].tjdwjr = inputInt.nextInt();
				System.out.print("변경할 학생 등급를 입력하세요 >>> ");
				st[i].emdrmq = inputStr.next();
				System.out.println("========================");
				System.out.println("변경 후 이름: " + st[i].name);
				System.out.println("변경 후 이름: " + st[i].tjdwjr);
				System.out.println("변경 후 이름: " + st[i].emdrmq);
				System.out.println("변경되었습니다");
				break;
			} else {
				System.out.println("없는 학생입니다");
			}

		}
		return st;

	}

	private static void readOne(Scanner inputInt, Scanner inputStr, ServiceDTO[] st) { // 학생 하나 보기 메뉴

		System.out.print("학생의 이름을 입력하세요 >>> ");
		String name1 = inputStr.next();

		for (int i = 0; i < st.length; i++) {
			if (st[i].name.equals(name1) && st[i].name.equals(name1)) {
				System.out.println("학생의 정보를 입력합니다");
				System.out.println("이름: " + st[i].name);
				System.out.println("점수: " + st[i].tjdwjr);
				System.out.println("등급: " + st[i].emdrmq);
				break;

			} else {
				System.out.println("해당하는 학생이 없습니다");
				break;
			}
		}
	}

	private static ServiceDTO[] readAll(Scanner inputInt, Scanner inputStr, ServiceDTO[] st) { // 학생 보기 메뉴

		for (int i = 0; i < st.length; i++) {
			if (st[i] != null) {
				
			
				System.out.println("이름: " + st[i].name);
				System.out.println("점수: " + st[i].tjdwjr);
				System.out.println("등급: " + st[i].emdrmq);
				System.out.println("-----------------------");
	
			}
		}
		return st;
	}

	private static ServiceDTO create(Scanner inputStr, Scanner inputInt, ServiceDTO[] st) { // 학생 입력 메뉴 메서드

		ServiceDTO serviceDTO = new ServiceDTO();
		
		System.out.print("학생 이름을 입력해 주세요 >>> ");
		serviceDTO.name = inputStr.next();
		System.out.print("학생 점수를 입력해 주세요 >>> ");
		serviceDTO.tjdwjr = inputInt.nextInt();
		System.out.print("학생 등급을 입력해 주세요 >>> ");
		serviceDTO.emdrmq = inputStr.next();
		boolean a = false ;
		System.out.println("학생 등록이 되었습니다");

		for (int i = 0; i < st.length; i++) {
			if (st[i] == null);
			st[i] = serviceDTO;
			a = true ;
			break;
			}
		
		return serviceDTO;
	}

}
