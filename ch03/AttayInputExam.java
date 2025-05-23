package ch03;

import java.util.Scanner;

public class AttayInputExam {

	public static void main(String[] args) {
		// 인풋 및 메서드를 활용하여 성적 입력 및 성적 수정을 만들자!!

		Scanner inputInt = new Scanner(System.in);
		Scanner inputStr = new Scanner(System.in);

		System.out.println("========= 엠비씨 아카데미 ===========");
		System.out.print("학생 수 입력 >>   ");
		int counts = inputInt.nextInt();

		String[] names = new String[counts];
		int[] kors = new int[counts];
		int[] mats = new int[counts];
		int[] engs = new int[counts];

		boolean run = true; // 반복 재생문 실행

		while (run) {

			System.out.println("1 번: 성적 입력");
			System.out.println("2 번: 성적 수정");
			System.out.println("3 번: 성적 삭제");
			System.out.println("4 번: 종료");
			System.out.print("번호 입력  >>  ");
			int menu = inputInt.nextInt();

			switch (menu) {
			case 1:
				System.out.println("성적 입력 메뉴!!");
				conDown(names, kors, mats, engs);
				break;

			case 2:
				System.out.println("성적 수정 메뉴!!");
				couCr(names, kors, mats, engs);
				break;

			case 3:
				System.out.println("성적 삭제 메뉴!!");
				break;

			case 4:
				System.out.println("종료!!");
				break;

			default:
				System.out.println("잘못 입력하였습니다");
				break;

			} // 스위치 종료

		} // 와일 종료

	} // 메인 메서드 종료

	private static void couCr(String[] names, int[] kors, int[] mats, int[] engs) { // 성적 수정 메서드

		Scanner inputStr = new Scanner(System.in);
		Scanner inputInt = new Scanner(System.in);

		System.out.println("수정할 학생 이름 입력: ");
		String name = inputStr.next();

		boolean run = true; // 반복 재생문 실행

		for (int i = 0; i < names.length; i++) {
			if (names[i].equals(name)) {
				System.out.println("수정할 학생의 점수를 확인하세요");
				System.out.println("국어:  " + kors[i]);
				System.out.println("수학:  " + mats[i]);
				System.out.println("영어:  " + engs[i]);
				System.out.println("수정하려면 1 번 / 아니면 2 번 눌러 주세요");

			} else {
				System.out.println("학생이 없습니다 ^^");
			} // 엘스 긑
			int ss = inputInt.nextInt();

			switch (ss) {
			case 1:
				System.out.println("학생 점수를 수정하시려면 점수를 변경해 주세요");
				System.out.print("국어:  >>> ");
				kors[i] = inputInt.nextInt();
				System.out.print("수학: >>>  ");
				mats[i] = inputInt.nextInt();
				System.out.print("영어: >>>> ");
				engs[i] = inputInt.nextInt();
				System.out.println("변경 완료");
				break;
			case 2:

				System.out.println("뒤로 갑니다 ^^");
				break;

			default:
				System.out.println("번호를 잘못 입력하였습니다");
				run = false;
				break;

			} // 스위치 종료

		} // 폴 종료

	} // 성적 수정 메서드 종료

	private static void conDown(String[] names, int[] kors, int[] mats, int[] engs) { // 학생 성적 입력 메서드
		// 보조 메서드 생성

		Scanner inputStr = new Scanner(System.in);
		Scanner inputInt = new Scanner(System.in);

		for (int i = 0; i < names.length; i++) {
			System.out.print("성적 입력할 학생 이름 입력: ");
			names[i] = inputStr.next();
			System.out.print("국어 점수:  >>  ");
			kors[i] = inputInt.nextInt();
			System.out.print("수학 점수:  >>  ");
			mats[i] = inputInt.nextInt();
			System.out.print("영어 점수:  >>  ");
			engs[i] = inputInt.nextInt();

		} // 폴 종료

		System.out.println("점수 입력 완료 ^^~");

	} // 보조 메서드 종료 (학생 성적 입력 메서드 종료)

} // 클래스 종료
