package ch04.calculator;

public class SticMethod {
	
	int fidld1 ;	// 인스턴트 필드
	void method1 () {	// 인스턴트 메소드
		
	}
	
	static int field2 ;		// 정적 필드
	static void method2 () {	// 정적 메소드
		
	}

	
	static {	// 정적 블록
		// field1 = 10 ;		<< 앞에 static이 붙지 않아 인식이 되지 않는다 (생성자)
		// method = 20 ;
		field2 = 20 ;
		method2 () ;
	}
	
	static void Method3 () {	// 정적 메소드
		// Television tel = new Television() ;
		// tel.field1 = 10 ;	// 객체를 생성하여 변수와 연결
		// tel.method1() ;		// 인스턴스 멤버는 객체가 필요
		field2 = 10 ;
		method2();
	}
	
	static void Method4 () {	// 정적 메소드
		// this.field1 = 10 ;		// this에서 불려와지지 않는다 (메소드)
		// this.method1 () ;
		field2 = 10 ;
		method2();
	}
}
		
