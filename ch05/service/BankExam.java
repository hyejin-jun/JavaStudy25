package ch05.service;

import java.util.Scanner;

import ch05.dto.AccountDTO;

public class BankExam {

	public Scanner inpurInt = new Scanner(System.in);
	public Scanner inpurStr = new Scanner(System.in);

	public static AccountDTO[] hanaBank = new AccountDTO[10];
	public static AccountDTO[] woriBank = new AccountDTO[10];
	public static AccountDTO[] nhBank = new AccountDTO[10];

	static {
		AccountDTO accountDTO0 = new AccountDTO("1234", "전혜진", 50000, "하나은행");
		hanaBank[0] = accountDTO0;
		AccountDTO accountDTO1 = new AccountDTO("4567", "이지은", 800000, "우리은행");
		woriBank[0] = accountDTO1;
		AccountDTO accountDTO2 = new AccountDTO("9850", "배수지", 564517, "농협은행");
		woriBank[0] = accountDTO2;

	}

	public static void main(String[] args) { // 뱅크 메서드

		Scanner inputStr = new Scanner(System.in);
		Scanner inputInt = new Scanner(System.in);
		boolean run = true;
		while (run) {
			System.out.println("===============================================");
			System.out.println("=====엠비씨 은행 부서에 오신 것을 환영합니다=====");
			System.out.println("1. 하나은행 | 2. 우리은행 | 3. 농협은행 | 4. 종료");
			System.out.println("===============================================");
			System.out.print("번호 입력 >>  ");
			String subRun = inputStr.next();
			switch (subRun) {
			case "1":
				System.out.println("하나은행으로 이동하였습니다");
				HanaBank hanaBank1 = new HanaBank();
				hanaBank1.menu(inputInt, inputStr, hanaBank, woriBank, nhBank);
				break;
			case "2":
				System.out.println("우리은행으로 이동하였습니다");
		
				break;
			case "3":
				System.out.println("농협은행으로 이동하였습니다");
				break;
			case "4":
				System.out.println("프로그램을 종료합니다");
				run = false;
				break;
			default:
				System.out.println("번호를 잘못 입력하였습니다");
				break;
			}
		}
	}
}
