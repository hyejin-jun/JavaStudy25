package ch01;

import java.util.Scanner;

public class LogicalOrXExam {

	public static void main(String[] args) {
		// ���� �׽�Ʈ��
		// & ������ ��κ� ������ 2 �� �̻��� ��� �Ǵ��ϴ� �뵵�� ����Ѵ�.
		// ���� ��� id�� pw�� �� �� �ϳ��� �¾ƾ� id ã�⳪ pw ã��� ���� ���
		// (������ �մ� id == Ű����� �Է��� id) | (������ �ִ� pw == Ű����� �Է��� pw)
		//                           false            false               =  false
		//                            true          false                 =  false
		//                           false            true                =  false
		//                           true            true                 =  true
		
		// Ű����� �Է¹��� ���ڰ� 2�� ����̰ų� 3�� ����� ���� ó���� ����
		
		Scanner input = new Scanner (System.in) ;  // Ű����� �Է¹��� ��ü��
		System.out.println("2�� ����� 3�� ����� ���� Ȯ���� �����?");
		System.out.print(">>>> ");
		
		int value = input.nextInt();  // ������ �Է¹޾� ������ ����
		if ((value % 2 == 0) || (value % 3 == 0)) {
			// �Է°��� 2�� ���� �������� 0�̸� true
			//           �̰ų�
			//                 �Է°��� 3���� ���� �������� 0�̸� true
			
			System.out.println("2�� ��� �Ǵ� 3�� ����Դϴ�.: " + value);
		} else { System.out.println("2�� ��� �Ǵ� 3�� ����� �ƴմϴ�.: " + value);
		
		}

	}

}
