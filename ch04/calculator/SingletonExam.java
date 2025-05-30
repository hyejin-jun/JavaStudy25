package ch04.calculator;

public class SingletonExam {

	public static void main(String[] args) {
		// 싱글톤 활용하기
		
		// Singleton obj1 = new Singleton() ;	// 프라이빗이 걸려서 땡겨와지지 않는다
		// Singleton obj2 = new Singleton() ; 

		Singleton obj3 = Singleton.getInstance() ;		// 싱글톤 안에 메서드를 만들어서 이건 가능하다
		Singleton obj4 = Singleton.getInstance() ;		// private static Singleton st이 
		
		
		if (obj3 == obj4) {
			System.out.println("같은 싱글톤 객체입니다");		// obj3과 obj4는 같은 객체라서 true라고 뜬다
		} else 
			System.out.println("다른 싱글톤 객체입니다");
	}

}
