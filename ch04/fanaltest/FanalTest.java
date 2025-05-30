package ch04.fanaltest;

public class FanalTest {
	
	final String nation = "대한민국" ;	// 초기값 있음
	final String old ;					// 초기값 없음 (생성자로 받음)
	String name = "이지은" ;
	

	public FanalTest (String old, String name) {	// 위에 필드를 아래 생성자에 넣었다
	
		this.old = old ;
		this.name = name ;
				
		
	}
}


