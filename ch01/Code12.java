package ch01;

import java.util.Scanner;

public class Code12 {

	public static void main(String[] args) {
		// �б� �������� �ѹ� ����� ����
		// else if�� ������ ����
		
		Scanner input = new Scanner (System.in) ; // input�� ������ �ʾҴٰ� �� �׷��ٰ� ȭ��ǥ ������ try�� �ߴ��� �ڵ尡 �ٲ�� ������ ������ ����
		
		System.out.print("������ �Է��� �ּ���: ");
		
		int vall = input.nextInt() ;
		
		if ((vall <= 100) & (vall >= 90)) {
			System.out.println("A�Դϴ�");}   
	
			else if ((vall <= 89) && (vall >= 80))
			{System.out.println("B�Դϴ�");   }
		
				else if ((vall <= 79) && (vall >= 70)) 
				{System.out.println("C�Դϴ�");   }
			
					  else {System.out.println("F�Դϴ�");  }  // if ���� ����
		


	}  // main ����

}  // class ����
