package ch01;

import java.util.Scanner;

public class Code10 {

	public static void main(String[] args) {
		// 로그인할 수 있는 프로그램을 만들어 보자
		
		String loginid = "jhj1234" ;
		String loginpw = "12345678" ;
		
	    Scanner input = new Scanner (System.in);  // input 뒤에 넣는 것은 글자를 입력한다는 뜻

			System.out.print("로그인할 아이디를 입력하세요 >>> ");
			String id = input.nextLine() ;
			System.out.print("로그인할 패스워드를 입력하세요 >>> ");
			String pw = input.nextLine() ;
			
			if((loginid.equals(id)) & loginpw.equals(pw))  
				{System.out.println("로그인이 되었습니다!!! ");}
				else {
			System.out.println("로그인을 실패하였습니다!!! "); 
			} // if 종료
	    
	    
	   

	
	 
} // main 메서드 종료
}  // class 종료
