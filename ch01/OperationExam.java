package ch01;

public class OperationExam {

	public static void main(String[] args) {
		// 연산자는 프로그램에서 데이터를 처리하여 결과를 산출한다.
		// 연산자는 +, -, *, /, % (사칙연산자 + 나머지 계산)
		// 피연산자는 변수, 값을 말한다.
		
		// 단항 연산(변수가 1 개인 것)
		
		int x = 10 ;
		x++ ; // x = x + 1
		
		x--; // x = x -1
		System.out.println("x에 -- 단항 연산한 결과: " + x);
		
		// 이항 연산 (변수가 2 개인 것)
		int y = 20 ;
		int result = x + y ;
		//     30 = 10 + 20
		
		System.out.println("x + y = " + result);
		
		// 삼항 연산 (항이 3 개인 것)
		boolean result1 = (result>10) ? true : false ;
		//                    조건         참  :  거짓
		
		System.out.println("result>10 결과: " + result1 );
		
		String result2 = (result>50) ? "크다" : "작다" ;
		System.out.println("result>50 결과: " + result2);
		
		
		
		int x1 = 10 * 10 ;  // 곱셈
		System.out.println("10 x 10 = " + x1);
		int x2 = 10 / 3 ;  // 나눗셈
		System.out.println("10 / 5 = " + x2);
		int x3 = 10 % 3 ;  // 나머지
		System.out.println("10을 5로 나눈 나머지 = " + x3);
		 
		// **** 미션 > 홀짝 계산을 해 보자 ****
		int A1 = 35 ;
		int A2 = A1 % 2 ;  // 15를 2로 나누었을 때 나머지를 A1에 넣는다.
		String A3 = (A2 == 1) ? "홀수" : "짝수" ;
		System.out.println("15의 홀짝 계산 결과: " + A3 );
		
		// **** 미션 > 삼항 연산자를 사용하여 4의 배수를 찾아 보자 ****
		        int A4 = 24 ; 
				int A5 = A4 % 4 ;  
				boolean A6 = (A4 == 0) ? true : false ;  // String을 넣어 문자열로 배합하는 게 좋았다!!
				System.out.println("24의 4의 배수 결과: " + A6 );
				
				// 선생님 답지
				int mut4 = 24 ;
				int div4 = mut4 % 4 ;  // 4로 나눈 나머지를 div4에 넣는다.
				String resdiv4 = (div4 == 0) ? "4의 배수입니다." : "아닙니다" ;
				System.out.println("4의 배수 판단 결과: " + resdiv4);
		
		// 증감 연산자 테스트
				
			System.out.println("----------증감 연산자 위치에 따른 결과 ------------");
			int A = 10 ;		A++ ;
			++A ;
			System.out.println("10 > A++ > ++A의 결과: " + A);
			
			int B = 10 ;
			B-- ;
			--B ;
			System.out.println("10 > B-- > --B의 결과: " + B);
			
			int C ;
			C = A++ ;  // C = A > A + 1 (C는 A의 숫자를 먼저 인식한다.)
			System.out.println("A의 결과: " + A);  // 결과값: 13
			System.out.println("C의 결과: " + C);  // 결과값: 12
			System.out.println("--------------------------");
			
			C = ++A ;  // C = A = 1 + A 
			System.out.println("A의 결과: " + A);  // 결과값: 14
			System.out.println("C의 결과: " + C);  // 결과값: 14
			System.out.println("--------------------------");
			
			C = ++A + B++ ;  // 순서: ++ 더하기 A(14) = 15 더하기 B(8) = 23(C) / B 더하기 ++ = 9 
			System.out.println("A의 결과: " + A);  // 결과값: 15
			System.out.println("B의 결과: " + B);  // 결과값: 9
			System.out.println("C의 결과: " + C);  // 결과값: 23
			System.out.println("--------------------------");
				
				
				
		
		
		
		
		
		

	}

}
