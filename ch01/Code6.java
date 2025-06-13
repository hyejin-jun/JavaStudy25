package ch01;

public class Code6 {

	public static void main(String[] args) {

		// RGB Ÿ�� �����ϱ�
		System.out.println("==== RBG Ÿ�� �����ϱ� byte �ڵ� ====");
		byte type1 = -128 ;
		byte type2 = -30 ;
		byte type3 = 0 ;
		byte type4 = 30 ;
		byte type5 = 127 ; 
		// byte type6 = 128 byte�� ���� ���� �ʰ��� ������ ��� 
		System.out.println(type1);
		System.out.println(type2);
		System.out.println(type3);
		System.out.println(type4);
		System.out.println(type5);
		
		
		System.out.println("==== �����ڵ� �����ϱ� char & int �ڵ� ====");
		char c1 = 85 ;
		char c2 = 125 ;
		char c3 = 109 ;
		 System.out.println(c1);
		 System.out.println(c2);
		 System.out.println(c3);
	
		 int code1 = 1 ;
		 int code2 = 2 ;
		 int code3 = 3 ;
		 
		 System.out.println(code1);
		 System.out.println(code2);
		 System.out.println(code3); // �����ڵ� ���ڰ� �Էµȴ� (51652)
		 
		 System.out.println("==== byte �����ϱ� ====");
		 long no1 = 50 ;
		 long no2 = 50L ;
		 // long no3 = 9999999999999 ; �ڿ� L�� �� ������ ������ ��
		 long no4 = 100000000000000000L ;
		 
		 System.out.println(no1);
		 System.out.println(no2);
		 System.out.println(no4);
		 
		 double bo1 = 3.14 ; 
		 float bo2 = 3.14F ;
		 
		 double bo3 = 0.8468468464684 ;
		 float bo4 = 0.8468468464684F ;
		 
		 System.out.println(bo1);
		 System.out.println(bo2);
		 System.out.println(bo3); // �����: 0.8468468464684
		 System.out.println(bo4); // �����: 0.8468468
		 
		 boolean stop = false ;
		 
		 if(stop) {
			 System.out.println("�����մϴ�");
			 }else {
				 System.out.println("����մϴ�");} // ���� ���� ���� �ƴϸ� �Ʒ��� �ν�
		 
		 System.out.println("==== Ÿ�� ��ȯ �����ϱ� ====");
		byte by1 = 10 ;
		int in1 = by1 ; // �ڵ� Ÿ�� ��ȯ
		System.out.println(in1); // 10�� ���
		// ū Ÿ�Կ��� ���� Ÿ������ ���� �ȴٸ� ���� �� (byte�� int���� �۾Ƽ� �׷��� �ϸ� ����)
		
		char ch1 = 'a' ;
		in1 = ch1 ;
		System.out.println("���� �����ڵ� �� = " + in1);
		
		in1 = 800 ;
		long lo1 = in1 ; // int�� ū Ÿ���� iong���� ��ȯ
		System.out.println(lo1);
		
		in1 = 400 ;
		double do1 = in1 ; // int ���� ū Ÿ���� double�� ��ȯ
		System.out.println(do1); // �����: 400.0
		
		int in2 = 815468 ;
		byte by2 = (byte) in2 ;
		System.out.println(in2);
		System.out.println(by2); // ū Ÿ���� int�� ���� byte�� ��Ƽ� �ս��� �Ͼ��.
		
		
		
		
		
		
		
		
		

	}

}
