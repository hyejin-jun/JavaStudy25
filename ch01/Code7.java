package ch01;

public class Code7 {

	public static void main(String[] args) {
		// ���� Ÿ�� ��ȯ
		
		int in1 = 500 ;
		byte by1 = (byte) in1 ; // int(4) Ÿ���� byte(1) ���� Ÿ������ ��ȯ
		System.out.println(in1); 
		System.out.println(by1);
		
		in1 = 7851685 ;
		char ch1 = (char) in1 ; // int(4) Ÿ���� char(2) ���� Ÿ������ ��ȯ
		System.out.println(ch1); 
		
		double do1 = 754.715 ;
		in1 = (int) do1 ; // double(8) Ÿ���� int(4) ���� Ÿ�� ��ȯ
		System.out.println(in1); // �����: 754 > ū �Ϳ��� ���� ������ �� �ս��� �Ͼ
		
		int no1 = 445454515 ;
		int no2 = 445454515 ;
		
		// float no3 = no2 ; // �����: -13 > ���� Ÿ���� �Ǽ��� ��ȯ�Ͽ� �ս��� �ִ�. 
		double no3 = no2 ; // �����: 0
		no2 = (int) no3 ;
		
		System.out.println(no1) ;
		System.out.println(no2) ;
		System.out.println(no3) ;
		
		int res = no1 - no2 ;
		System.out.println(res) ;
		
		
		
				

	}

}
