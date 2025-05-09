package ch01;

public class Code8 {

	public static void main(String[] args) {
		// 홀수 짝수 구분하기
		
		int aa = 22 ;
		int ss = aa % 2 ; // An의 숫자에 2를 나누었을 때 1이 남으면 홀수다
		String dd = (ss == 1) ? "홀수" : " 짝수" ;
		
		System.out.println("회원의 나이는: "+ dd) ;
		
		// 홀수 짝수 응용하기    *** 주민 등록 번호로 남자인지 여자인지 구분하기 *** // 성별 구분 코드만 적으면 되나 주민 등록 번호를 다 치면 안 됨!!
		int girl = 19930101-1 ;
		int boy = girl % 2 ;
		String S = (boy == 0) ? "남자" : "여자" ;
		System.out.println("지금 회원가입한 사람은: " + S);
		
		// 배수 참인지 연습하기
		int qq = 50 ;
		int ww = qq % 5 ;  // 5의 배수인지 찾기
		String ee = (ww == 1) ? "배수가 맞습니다" : "배수가 아닙니다" ;
		
		System.out.println("숫자는: " + ee);
		
		
		
		int AA = 201205-3 ;
		int BB = (AA % 2) ;
		String CC = (BB == 0) ? "남자" : "여자" ;
		
		System.out.println("회원님의 성별은: " + CC);
		
		
		
		
		
		


	}

}
