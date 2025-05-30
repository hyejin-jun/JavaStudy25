package ch04.calculator;

public class Singleton {
	
	private static Singleton st = new Singleton() ;
	// 객체 한 개만 만들어지는 st 싱글톤 객체 생성
	
	private Singleton () {}	// 자동 생성자 생성
	
	
	static Singleton getInstance () {	// 정적 메서드 하나 생성
		return st ;
	}
	

}
