package ch01;

public class Code8 {

	public static void main(String[] args) {
		// Ȧ�� ¦�� �����ϱ�
		
		int aa = 22 ;
		int ss = aa % 2 ; // An�� ���ڿ� 2�� �������� �� 1�� ������ Ȧ����
		String dd = (ss == 1) ? "Ȧ��" : " ¦��" ;
		
		System.out.println("ȸ���� ���̴�: "+ dd) ;
		
		// Ȧ�� ¦�� �����ϱ�    *** �ֹ� ��� ��ȣ�� �������� �������� �����ϱ� *** // ���� ���� �ڵ常 ������ �ǳ� �ֹ� ��� ��ȣ�� �� ġ�� �� ��!!
		int girl = 19930101-1 ;
		int boy = girl % 2 ;
		String S = (boy == 0) ? "����" : "����" ;
		System.out.println("���� ȸ�������� �����: " + S);
		
		// ��� ������ �����ϱ�
		int qq = 50 ;
		int ww = qq % 5 ;  // 5�� ������� ã��
		String ee = (ww == 1) ? "����� �½��ϴ�" : "����� �ƴմϴ�" ;
		
		System.out.println("���ڴ�: " + ee);
		
		
		
		int AA = 201205-3 ;
		int BB = (AA % 2) ;
		String CC = (BB == 0) ? "����" : "����" ;
		
		System.out.println("ȸ������ ������: " + CC);
		
		
		
		
		
		


	}

}
