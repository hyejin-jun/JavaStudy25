package ch01;

public class CompareExam {

	public static void main(String[] args) {
		// �� �����ڴ� ���� �񱳿� ũ�� �񱳰� �ִ�.
		// ==�̸� ���İ� ���� �ڵ�
		// !=�̸� �ٸ��İ� ���� �ڵ�
		// >�̸� �ʰ� Ȥ�� ũ�İ� ���� �ڵ�
		// >=�̸� �̻��̰ų� ũ�ų� ���İ� ���� �ڵ�
		// <�̸� �̸� Ȥ�� �۳İ� ���� �ڵ�
		// <=�̸� ���� Ȥ�� �۰ų� ���İ� ���� �ڵ�
		
		int num1 = 10 ;
		int num2 = 10 ;
		boolean result1 = (num1 == num2) ;
		// boolean Ÿ���� true�� false ���� ���� �� �ִ�.
		//                ��     ����
		
		System.out.println(result1);
		
		char char1 = '1' ;  // char�� �����ڵ��̸� A�� 65, B�� 66�� ���ڰ��̴�.
		char char2 = 1 ;  // Java�� ���ڿ� ���ڸ� ���� ó���ϸ�, ��ҹ��ڸ� ���� �����Ѵ�.
		boolean result2 = (char1 == char2) ;
		
		System.out.println(result2);
		
		int v2 = 1 ;  // ���� Ÿ���� 1
		double v3 = 1.0 ;  // �Ǽ� Ÿ���� 1.0
		System.out.println(v2 == v3);
		// ���� �� �����ڿ� Ÿ���� �ٸ� ������ ���ϸ� �ڵ� Ÿ�� ��ȯ�� �Ͼ��.
		// �̶� �ڵ� Ÿ�� ��ȯ�� ū������ Ÿ���� ��Ī�Ѵ�.
		
		double  v4 = 0.1 ;
		float v5 = 0.1F ;
		System.out.println("=======================");
		System.out.println(v4 == v5);  // �����: false
		// �Ǽ���(�Ҽ���)�� �ε� �Ҽ��� ������ �����ؼ� �ٻ簪���� ǥ����
		// true�� ó���Ϸ��� ���� Ÿ�� ��ȯ�� �ؾ� �Ѵ�.
		System.out.println((float)v4 == v5);  // v4�� float������ ��ȯ�Ѵ�.
		System.out.println(v4 == (double) v5);  // �ڵ� Ÿ�� ��ȯ�̴�. ���� false�� ���� �ڵ��.
		
		System.out.println((int)(v4*10) == (int)(v5*10));  // int�� �Ҽ����� ������ 0�� 0�� ���Ѵ�.
		System.out.println(v4);  // �����: 0.1
		System.out.println(v5);  // �����: 0.1
		// print������ ����� �� ���� ������ ������� �ʴ´�.
		
		
		
		
	}

}
