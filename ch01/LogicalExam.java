package ch01;

import java.util.Scanner;  // �ܺ� ���̺귯��


public class LogicalExam {

	public static void main(String[] args) {
		// ������ �����ڴ� ũ�� 5 ���� ������ �ִ�.
		// &: �� �� > ~�̰� (2 ���� ������ ��� ���� ��� ��)
		// |: �� �� > ~�̰ų� (2 ���� �� �� ���� ���̸� ��)
		// !: �� ���� > ���� ������ �����Ѵ�.
		// ^: ��Ÿ�� �� �� > �� ���� �������� 1 + 1 = 0���� ����� ��
		
		String loginid = "kkw" ;
		String loginpw = "1234" ;
		
		Scanner input = new Scanner(System.in);
		// �ֿܼ� Ű����� ���� �о� ���� ��ü�� ������
		
		System.out.print("�α����� ID�� �Է��ϼ���: ");  // �츮�� ���� �Է��Ѵ�.
		String id = input.nextLine();
		System.out.println("�Է��Ͻ� ID��: " + id + "�Դϴ�.");  
		
		System.out.print("�α����� ��ȣ�� �Է��ϼ���: ") ;
		String pw = input.nextLine();
		System.out.println("== ���� ���Դϴ�. ==") ;
		
		if((loginid.equals(id)) & loginpw.equals(pw) ) {
			// ������ �ִ� ID�� Ű����� �Է��� ID�� ������
			// �̰ų� or
			// ������ �ִ� PW�� Ű����� �Է��� PW�� ������
			System.out.println("ID�� PW�� ��ġ�մϴ�.") ;
			System.out.println("�α��� ����!!!!");
		} else {
			System.out.println("ID�� PW�� �ٸ��ϴ�.") ;
			System.out.println("�α��� ����!!!!");
		} // if�� �߷�


		
		
	}  // main �޼��� ����

}  // class ����
