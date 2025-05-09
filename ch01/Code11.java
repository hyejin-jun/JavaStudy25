package ch01;

import java.util.Scanner;

public class Code11 {
	// else 응용해 보기

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in) ;  // 키보드에 입력할 객체 생성
		// input이 닫히지 않았다고 함 그렇다고 화살표 누르면 try가 뜨더니 코드가 바뀌며 오류가 뜨지는 않음
		
		System.out.print("숫자를 입력하세요!! >>  ");
		
		int vall = input.nextInt() ;
		
		if ((vall % 2 == 0) || (vall % 5 == 0)) {
			System.out.println("2의 배수 혹은 5의 배수입니다");
		} else { System.out.println("2의 배수 혹은 5의 배수가 아닙니다");
		
		}  // if 종료문
		
		
		
		
		

	}

}
