package ch01;

public class PromotionExam {

	public static void main(String[] args) {
		// �ڵ� Ÿ�� ��ȯ ����
		// : ���� Ÿ�� ���� �ս� ���� ū Ÿ�� ������ ��ȯ�Ѵ�.
		// byte (1 byte : 8 bit)
		// short (2 byte : 16 bit) & char (�����ڵ��: ����ǥ�� �ڵ�)
		// int (4 byte : 32 bit)
		// long (8 byte : 64 bit) // ���̻� L
		// float (4 byte : 32 bit) // �Ǽ��� ���̻� F
		// double (8 byte : 64 bit) 
		
		byte byteValue = 10 ; // byte Ÿ���� ������ 10 ���� �ִ´�.
		int intValue = byteValue ; // �ڵ� Ÿ�� ��ȯ��.
		
		System.out.println("�ڵ� Ÿ�Ե� int : " + intValue);
		
		char charValue = '��' ;
		intValue = charValue;
		System.out.println("�ڵ� Ÿ�Ե� int : " + intValue );
		
		intValue = 500 ;
		long longValue = intValue ;
		System.out.println("�ڵ� Ÿ�Ե� long : " + longValue);
		
		double doubleValue = intValue ;
		System.out.println("�ڵ� Ÿ�Ե� double : " + doubleValue);
		

	}

}
