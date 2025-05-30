package ch05.service;

import java.util.Iterator;
import java.util.Scanner;

import ch05.dto.AccountDTO;

public class HanaBank {
// 필드

	public void menu(Scanner inputStr, Scanner inputInt, AccountDTO[] hanaBank, AccountDTO[] woriBank,
			AccountDTO[] nhBank) {
		boolean run = true;
		while (run) {
			System.out.println("-----------------------------------------------------------------");
			System.out.println("1. 계좌 생성 | 2. 계좌 목록 | 3. 입금 | 4. 출금 | 5. 해지 | 6. 이전");
			System.out.println("-----------------------------------------------------------------");
			System.out.print("번호 입력 >>> ");
			String select = inputStr.next();
			switch (select) {
			case "1":
				System.out.println("계좌를 생성합니다");
				sodtjd(inputInt, inputStr, hanaBank);
				break;
			case "2":
				System.out.println("계좌 목록을 확인합니다");
				lists(inputInt, inputStr, hanaBank);
				break;
			case "3":
				System.out.println("입금을 실행합니다");
				moneyplu(inputInt, inputStr, hanaBank);
				break;
			case "4":
				System.out.println("출금을 실행합니다");
				moneymun(inputInt, inputStr, hanaBank);
				break;
			case "5":
				System.out.println("계좌 해지를 실행합니다");
				delect(inputInt, inputStr, hanaBank) ;
				break;
			case "6":
				System.out.println("이전 페이지로 이동합니다");
				run = false;
				break;
			default:
				System.out.println("번호를 잘못 입력하였습니다");
				break;
			} // 스위치 종료
		} // 와일 종료
	} // 메서드 종료

	private void delect(Scanner inputInt, Scanner inputStr, AccountDTO[] hanaBank) {	// 계좌 해지 메서드
		
		System.out.println("------------- 계좌 해지 -----------------");
		System.out.print("해지할 계좌 입력: ");
		String ano = inputStr.next() ;
		for (int i = 0 ; i < hanaBank.length ; i++) {
			AccountDTO del = hanaBank[i];
			if (ano.equals(del.getAno())) {
				System.out.println("계좌를 해지하였습니다");
			hanaBank[i].setAno(null);
			hanaBank[i].setOwner(null);
			hanaBank[i].setBal(0);
			break;
			} 
		System.out.println("해당 계좌가 존재하지 않습니다");
		break;
		}
return ;	
}

	private void moneymun(Scanner inputInt, Scanner inputStr, AccountDTO[] hanaBank) { // 출금 실행 메서드

		System.out.println("---------------- 출금 -----------------");
		System.out.print("계좌번호 입력: ");
		String ano = inputStr.next();
		System.out.print("출금액 입력: ");
		int monn = inputInt.nextInt();
		System.out.println("출금을 실행합니다");

		AccountDTO aaa = findAccount(ano, hanaBank);
		if (aaa == null) {
			System.out.println("계좌가 존재하지 않습니다");
			return;
		}
		aaa.setBal(aaa.getBal()-monn) ;
		System.out.println(aaa.getOwner() + " 님 출금에 성공하였습니다");
		System.out.println("잔고: " + aaa.getBal() + " 원입니다");
		
		

	}

	private void moneyplu(Scanner inputInt, Scanner inputStr, AccountDTO[] hanaBank) { // 입금 실행 메서드

		System.out.println("------------- 입금 ------------");
		System.out.print("계좌번호 입력: ");
		String ano = inputStr.next();
		System.out.print("입금액 입력: ");
		int monn = inputInt.nextInt();
		AccountDTO accountinput = findAccount(ano, hanaBank);
		if (accountinput == null) {
			System.out.println("찾으시는 계좌가 없습니다");
			return;
		}
		accountinput.setBal(accountinput.getBal() + monn);
		System.out.println(accountinput.getOwner() + " 님 입금에 성공하였습니다");
		System.out.println("잔액은 금액은: " + accountinput.getBal() + " 원입니다");
	}

	private AccountDTO findAccount(String ano, AccountDTO[] hanaBank) { // 계좌 찾기 메서드
		AccountDTO ckwrl = null; // 입력할 빈 객체
		for (int i = 0; i < hanaBank.length; i++) {
			if (hanaBank[i] != null) {
				String db = hanaBank[i].getAno();
				if (db.equals(ano)) {
					ckwrl = hanaBank[i];
					break;
				} // if 종료
			} // if 종료
		} // for 종료
		return ckwrl;
	} // 계좌 찾기 메서드 종료

	private void lists(Scanner inputInt, Scanner inputStr, AccountDTO[] hanaBank) { // 계좌 목록 메서드
		System.out.println("----------- 계좌 목록 -----------");
		for (int i = 0; i < hanaBank.length; i++) {
			AccountDTO anoLists = hanaBank[i];
			if (anoLists != null)
				System.out.println("계좌번호" + "\t" + "잔액" + "\t" + "예금주");
			System.out.println(anoLists.getAno() + "\t" + anoLists.getBal() + "\t" + anoLists.getOwner());
			System.out.println("--------------------------------------------");
			break;
		} // for 종료
	} // 계좌 목록 메서드 종료

	private AccountDTO sodtjd(Scanner inputInt, Scanner inputStr, AccountDTO[] hanaBank) { // 계좌 생성 메서드
		System.out.println("----------- 계좌 생성 -------------");
		AccountDTO mymonay = new AccountDTO();
		System.out.print("계좌번호를 입력하세요: ");
		mymonay.setAno(inputStr.next());
		System.out.print("예금주를 입력하세요: ");
		mymonay.setOwner(inputStr.next());
		System.out.print("처음 잔액을 입력하세요: ");
		mymonay.setBal(inputInt.nextInt());
		for (int i = 0; i < hanaBank.length; i++) {
			if (hanaBank[i] != null) {
				hanaBank[i] = mymonay;
				System.out.println("계좌가 생성되었습니다");
				break;
			} else
				System.out.println("계좌 생성이 불가능합니다");
			break;
		} // else 종료
		return mymonay;
	} // for 종료
} // 계좌 생성 메서드 종료
