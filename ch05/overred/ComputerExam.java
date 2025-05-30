package ch05.overred;

public class ComputerExam {

	public static void main(String[] args) {
		
		int r = 10 ;	// 10을 전달
		
		 Calculator cal = new Calculator() ;
		 System.out.println("원면적: " + cal.areaCircle(r));
		 System.out.println("=============================");
		 System.out.println("");
		 
		 Computer com = new Computer() ;
		 System.out.println("원면적: " + com.areaCircle(r));
		 System.out.println("============================");

	}

}
