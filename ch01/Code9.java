package ch01;

public class Code9 {

	public static void main(String[] args) {
		// ���ڿ��� ���� ���� �����ϱ�
		
		String str1 = "A �л��� ������ " + 25 ;
		String str2 = "��" ;
		String str3 = str1 + str2 ;
		System.out.println(str3);
		
		String str4 = "B �л��� ������ " + 5 + 2 ;
		System.out.println(str4);
		
		String str5 = 8 + 5 + " ���� C �л��� ������" ;
		System.out.println(str5);
		
		// �� ������ �����ϱ�
		
		int in1 = 465 ;
		int in2 = 454 ;
		boolean in3 = (in1 == in2) ;
		boolean in4 = (in1 != in2) ;
		boolean in5 = (in1 <= in2) ;
		System.out.println(in3);
		System.out.println(in4);
		System.out.println(in5);
		
		// �ٸ� ��ü �����ϱ�
		
		String str6 = "Ŭ����" ;
		String str7 = "Ŭ����" ;
		String str8 = new String ("Ŭ����") ;
		
		System.out.println(str6 == str7);
		System.out.println(str7 == str8);
		System.out.println(str6.equals(str8));
		
		
		

	}

}
