package ch01;

import java.util.Scanner;

public class Code12 {

	public static void main(String[] args) {
		// 학교 성적으로 한번 만들어 보자
		// else if를 응용해 보자
		
		Scanner input = new Scanner (System.in) ; // input이 닫히지 않았다고 함 그렇다고 화살표 누르면 try가 뜨더니 코드가 바뀌며 오류가 뜨지는 않음
		
		System.out.print("점수를 입력해 주세요: ");
		
		int vall = input.nextInt() ;
		
		if ((vall <= 100) & (vall >= 90)) {
			System.out.println("A입니다");}   
	
			else if ((vall <= 89) && (vall >= 80))
			{System.out.println("B입니다");   }
		
				else if ((vall <= 79) && (vall >= 70)) 
				{System.out.println("C입니다");   }
			
					  else {System.out.println("F입니다");  }  // if 다중 종료
		


	}  // main 종료

}  // class 종료
