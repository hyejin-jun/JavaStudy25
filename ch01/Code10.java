package ch01;

import java.util.Scanner;

public class Code10 {

	public static void main(String[] args) {
		// 로그인 화면 만들어 보기
		
		String loginid = "jhj1234" ;
		String loginpw = "12345678" ;
		
	    Scanner input = new Scanner (System.in);  // input이 닫히지 않았다고 함 그렇다고 화살표 누르면 try가 뜨더니 코드가 바뀌며 오류가 뜨지는 않음

			System.out.print("아이디를 입력하세요: ");
			String id = input.nextLine() ;
			System.out.print("패스워드를 입력하세요: ");
			String pw = input.nextLine() ;
			
			if((loginid.equals(id)) & loginpw.equals(pw))  
				{System.out.println("로그인을 성공하였습니다!!");}
				else {
			System.out.println("로그인을 실패하였습니다!!"); 
			} // if 종료
	    
	    
	   

	
	 
} // main 메서드 종료
}  // class 종료
