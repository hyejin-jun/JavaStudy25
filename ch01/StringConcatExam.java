package ch01;

public class StringConcatExam {

	public static void main(String[] args) {
		// ���ڿ� ���� �׽�Ʈ
		// print("�׽�Ʈ" + "�Դϴ�.") > +�� ���� ������
		// �ǿ����� �� ������ ���ڿ��̸� + �����ڴ� ���ڿ� ����� �����Ѵ�.
		
		String str1 = "JDK" + 17.0 ; //  17.0�� ���ڿ��� ����� �Ѵ�.
		System.out.println(str1);
		
		String str2 = str1 + "Ư¡" ;
		System.out.println(str2);
		
		String str3 = "JDK" + 3 + 3.0 ;
		System.out.println(str3);  // �����: JDK33.0 
		
		String str4 = 3 + 3.0 + "JDK" ;
		System.out.println(str4);  // �����: 6.0JDK
		// �ڵ��� �帧�� ������ �Ʒ���, �տ��� �ڷ� ��
		// 3 + 3.0�� ���� ����� �� �Ŀ� ���ڿ��� �����Ѵ�.
		
		

	}

}
