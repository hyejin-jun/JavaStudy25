package ch01;

import java.util.Scanner;

public class LogclaAndExam {

	public static void main(String[] args) {
		// ���� �׽�Ʈ��
		// & ������ ��κ� ������ 2 �� �̻��� ��� �Ǵ��ϴ� �뵵�� ����Ѵ�.
		// ���� ��� id�� pw�� �� �� �¾ƾ� �α����� �����ϴ� ���
		// (������ �մ� id == Ű����� �Է��� id) & (������ �ִ� pw == Ű����� �Է��� pw)
		//                           false            false               =  false
		//                            true          false                 =  false
		//                           false            true                =  false
		//                           true            true                 =  true
		
		
		Scanner input = new Scanner (System.in) ;  // Ű����� �Է��� �� �ִ� ��ü ������
		System.out.println("������ �Է��Ͻø� ��ҹ��ڳ� ���ڸ� �Ǵ��� �帱�Կ�!!");
		System.out.println("�����ڵ�ǥ�� �����Ͽ� ���α׷��� �����Ͽ����ϴ�.");
		System.out.print("���� �Է� >>> ");
		
		int charCode = input.nextInt() ;  // Ű����� �������� �Էµǰ� ������ ��
		
		// if (���Ǵܹ�) {���Ǵܹ��� true ���� �� ����Ǵ� ��}
		// else {���Ǵܹ��� false�� �� ����Ǵ� ��}
		if ((charCode >= 65) & (charCode <= 90)) {
			// �Էµ� ���� ���� 65 �̻��̰� 90 ���ϸ� �빮��
			System.out.println("���� �Էµ� ���ڴ� �빮���Դϴ�.: " + (char)charCode);
		} else if ((charCode >= 97) && (charCode <= 122)) { 
			// ������ ����� if ���� false�� ��� �� �񱳸� �Ѵ�.
			//�Էµ� ���� ���� 97 �̻��̰� 122 ���ϸ� �ҹ���
			// &&�� ����ϸ� ���� ó���� �Ѵ�.
			System.out.println("���� �Էµ� ���ڴ� �ҹ����Դϴ�.: " + (char)charCode);
		} else if (!(charCode < 48) && !(charCode > 57)) {
			// NAND ����  // ��𸣰��� ��Ģ�� �ľ��ϸ� NOR
			// 48���� ���� �ʰ�  57���� ũ�� ���� �񱳹� >> ! ����ǥ�� ���鼭 �����ϰ� �ȴ�.
			System.out.println("���� �Էµ� ���ڴ� �����ڵ��� ������ �����Դϴ�.: " + (char)charCode);
		} else {
			 System.out.println("�빮��, �ҹ���, ������ �����ڵ� ǥ�� ���� �����Դϴ�.");
			 System.out.println("���α׷��� �ٽ� ������ �ּ���!!");
			
		} // ���� if�� ����
		
	}  // main �޼��� ����

}  // class ����
