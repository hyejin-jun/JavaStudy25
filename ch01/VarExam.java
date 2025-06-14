package ch01;

public class VarExam {

	public static void main(String[] args) {
		// 변수 선언 테스트
		
		int x = 1 ; // 정수 타입 x 변수에 1 값을 넣는다.
		
		char y = 65 ; // char는 문자 타입인데 숫자로 변환되기도 한다.
		             // 컴퓨터는 문자를 유니코드로 변환해서 처리를 한다.
					 // 유니코드 표에 65는 A를 의미한다.
		char z = 'A' ; // char 타입의 z 변수에 문자 A를 넣는다.
		
		System.out.println("int x = " + x);
		System.out.println("char y = " + y);
		System.out.println("char z = " + z);
		
		char z1 = 'b' ;  // 문자로 쓸 건지 문자열로 쓸 건지 결정을 해야 한다.
		
		// 변수의 선언
		
		int x1 ;  // 초기화 안 된 변수
		x1 = 10 ;  // 변수에 초기값을 10으로 넣었다.
		System.out.println(x1);
		
		// 다중 변수 선언
		
		int kor, mat, eng , total, avg ;
		
		kor = 91 ;
		mat = 80 ;
		eng = 70 ;
		total = kor + mat + eng ; // 총점
		avg = total / 3 ;  // 평균
		
		System.out.println("총점 : " + total);
		System.out.println("vudrbs : " + avg); 
		// 코드상의 문제는 아니지만 평균값에 소수점이 사라진다.
		// 석차를 구현하는 코딩에서 문제가 생길 수도 있다.
		
		// 변수 작성 규칙
		// 변수는 첫 글자가 영문이어야만 되며, $나 _을 사용할 수 있다.
		// 관례로 첫 글자 영문은 소문자로, 두 번째 단어부터는 대문자로 시작한다.
		
		int price, $price, _price ;  // 가급적이면 특수문자 사용 제외하기
		//int 1v ;
		//int @speed ;
		//int $#value ;
		
		char firstname  = '김' ;
		char firstName = '이' ;
		
		System.out.println("성 : " + firstname);
		System.out.println("성 : " + firstName);
		// 변수명의 대소문자는 다른 변수로 인식한다.
		
		// 변수명에 예약어는 사용할 수 없다.
		// 예약어는 자바에서 이미 사용 중인 영문(변수, 클래스)을 말한다.
		
		//int char ;
		
		// 리터럴: 직접 입력된 값
		
		int literal1 = 75 ;  // 10진수
		int literal2 =  075 ;  // 8진수
		int literal3 = 0b0011 ;  // 2진수
		int literal4 = 0xA ;  // 16진수
		
		System.out.println("10진수 75 : " + literal1);
		System.out.println("8진수 75 : " + literal2);
		System.out.println("2진수 0011 : " + literal3);
		System.out.println("16진수 A : " + literal4);
		
		
		
		
		
		
	}

}
