package ch02;

import java.util.Scanner;

public class SwitchExam {

	public static void main(String[] args) {
		// Switch�� ���� ����̴�.
		// ������ ������ case�� �ִ� ���๮�� ����ȴ�.
		// if���� true�� false�� ������ 2 �� ������ Switch���� ���� ���� ���� ����� �޴´�.
		
		// ���� ó�� ���α׷� �����
		// key point: C(����) R(�б�) U(����) D(����)
		// ������:
		// �л�: 
		// ����:
		// ���α׷� ����:
		
		
		// �޴� ���� (���ĺ��� ������ �޴��� ����)
		
		Scanner input = new Scanner (System.in) ;
		System.out.println("==============================");
		System.out.println("=========���� ��ī����==========");
		System.out.println("=======���� ó�� ���α׷�=========");
		System.out.println("==============================");
		System.out.println("A: ������ ����");
		System.out.println("B: �л� ����");
		System.out.println("C: ���� ����");
		System.out.println("Z: ���α׷� ����");
		System.out.print("(A ~ Z) >>>>> ");
		
		char select = input.next().charAt(0);
		// System.out.print("������ ����: " + select);
		
		switch (select) {
		
		case 'a':
		case 'A':
			System.out.println("������ ���� �޴��� �����Ͽ����ϴ�!!"); 
			System.out.println("1: ������ ���");
			System.out.println("2: ������ ����");
			System.out.println("3: ������ ����");
			System.out.println("4: ������ ����");
			System.out.print("(1 ~ 4)  >>>> ");
			int subSelect = input.nextInt();
			switch (subSelect) {
			
				case 1:
				System.out.println("������ ��� �޴��Դϴ�!!"); break;
				case 2:
				System.out.println("������ ���� �޴��Դϴ�!!"); break;
				case 3:
				System.out.println("������ ���� �޴��Դϴ�!!"); break;
				case 4:
				System.out.println("������ ���� �޴��Դϴ�!!"); break;
				default:
				System.out.println("���ڸ� �߸� �Է��Ͽ����ϴ�!! 1 ~ 4�� �Է� �����մϴ�!!");
				System.out.println("���α׷��� �ٽ� �����ϼ���!!");	}  // ������ ����ġ�� ����
			break;
			
					case 'b':	
					case 'B':
						System.out.println("�л� ���� �޴��� �����Ͽ����ϴ�!!"); break;
					case 'c':
					case 'C':
						System.out.println("���� ���� �޴��� �����Ͽ����ϴ�!!"); break;
					case 'z':
					case 'Z':
						System.out.println("���α׷��� �����մϴ�!!"); break;
					default: System.out.println("�޴��� ���� ���ڸ� �־����ϴ�!!"); 
					System.out.println("���α׷��� �ٽ� ������ �ּ���!!"); break; }  // switch�� ����
		
		

	}

}
