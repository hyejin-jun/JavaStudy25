package ch01;

public class StringEqualsExam {

	public static void main(String[] args) {
		// ���ݱ��� ��� ���� Ÿ���� �⺻ Ÿ������ �ڹٿ��� ��ü ���� ���ȴ�. (�ڹٴ� ��ü ���� ����̴�.)
		// String�� ���� ��ü�� �����ϰ� ������ ������ ���ǻ� �����ؼ� ����Ѵ�.
		
		String strval1 = "����" ;
		String strval2 = "����" ;
		String strval3 = new String("����") ;  // ��ü ���� ���� new String�� ���� ��ü�� �ϳ� �����ȴ�.
		
		System.out.println(strval1 == strval2 );  // �����: true
		System.out.println(strval1 == strval3);  // �����: false
		
		// ��ü�� �ּҸ� �Ǵ��� ���� ==�� ��������� ��ü�� ���� ���� ���� ���� ���� ����� �޼��带 ����ؾ� �Ѵ�.
		// String�� ��ü�̰� ��ü ���ʿ��� �޼������ ����ִ�.
		// �޼��尡 ���� ������ .�� ������ ���δ�.
		boolean eq1 = strval1.equals(strval3);
		System.out.println("1�� 3 ���� equals �޼��� ��� ���: " + eq1);  // equals�� ���� ������ ���Ѵ�. ���� �񱳴� equals
		
		
		
		

	}

}
