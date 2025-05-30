package ch04.fanaltest;

public class FanalTestExam {

	public static void main(String[] args) {
		// 파이널값 공부
		
		
		FanalTest f1 = new FanalTest("20", "이지은");
		
		System.out.println(f1.nation);
		System.out.println(f1.old);
		System.out.println(f1.name);
		
		f1.name = "박보영" ;
		
		System.out.println(f1.name);
		System.out.println(f1.nation);
		System.out.println(f1.old);
		
		System.out.println("컴퓨터가 알고 있는 파이 값: " + Math.PI);
		System.out.println("컴퓨터가 알고 있는 E의 값: " + Math.E);
		

	}

}
