package ch02;

import java.util.Scanner;

public class IfExam {

	public static void main(String[] args) {
		// If(���ǹ�) {���๮}
		// ���ǹ��� true�� ó���Ǹ� �߰�ȣ ������ ����ȴ�
		// ���ǹ��� false�� ó���Ǹ� �߰�ȣ ������ ������� �ʴ´�
	
		Scanner input = new Scanner (System.in) ;
		// Ű����� �Է¹��� �� �ִ� ��ü�� �����Ͽ� input ������ ����
		
		System.out.print("������ ������ �Է��ϼ���!! ");
		System.out.print(">>> ");
		String name = input.next() ;  // Ű����� �Է¹��� �̸��� name ������ ����
		
		
		System.out.print("������ ������ �Է��ϼ���!! ");
		System.out.print(">>> ");
		
		int score = input.nextInt() ; // Ű����� �Է¹��� ������ score�� ����
		
		if (score > 0 && score <= 100) {  // 0���� ũ�ų� 100 �����̸� true
			if (score >= 90) { // score ������ �Էµ� ���� 90 �̻����� ���� �ڵ�
				System.out.println(name + " ���� �ӷ��Ͻ� ������ 90 �� �̻��Դϴ�.");
				System.out.println("����: " + score + " �� ��� A");
			}

			else if (score >= 80) {
				System.out.println(name + " ���� �ӷ��Ͻ� ������ 89 ~ 80 �� �̻��Դϴ�.");
				System.out.println("����: " + score + " �� ��� B");
			}

			else if (score >= 70) {
				System.out.println(name + " ���� �ӷ��Ͻ� ������ 79 ~ 70 �� �̻��Դϴ�.");
				System.out.println("����: " + score + " �� ��� C");
			}

			else if (score >= 60) {
				System.out.println(name + " ���� �ӷ��Ͻ� ������ 69 ~ 60 �� �̻��Դϴ�.");
				System.out.println("����: " + score + " �� ��� D");
			}

			else {
				System.out.println(name + " ���� �Է��Ͻ� ������ ���� ����� F�� ����Ǿ����ϴ�.");
				System.out.println("����: " + score + " �� ��� F");
			}  // ������ �ԷµǾ��� �� ���๮
		} 
		else { System.out.println(name + " �� �Է°��� Ȯ���� �ּ���!!");
		System.out.println("���� �Է°��� " + score + " ���Դϴ�" );
		}
		System.out.println("���α׷��� ����Ǿ����ϴ�!!"); 
		
		

	}  // main �޼��� ���� > ����(input, name, score)�� �����

}  // class ���� > �޼��尡 ����� > ���α׷� ����
