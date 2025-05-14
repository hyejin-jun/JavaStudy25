package ch01;

import java.util.Scanner;

public class Code11 {
	// else를 활용해 보자

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in) ;  // Ű���忡 �Է��� ��ü ����
		// input�� ������ �ʾҴٰ� �� �׷��ٰ� ȭ��ǥ ������ try�� �ߴ��� �ڵ尡 �ٲ�� ������ ������ ����
		
		System.out.print("���ڸ� �Է��ϼ���!! >>  ");
		
		int vall = input.nextInt() ;
		
		if ((vall % 2 == 0) || (vall % 5 == 0)) {
			System.out.println("2�� ��� Ȥ�� 5�� ����Դϴ�");
		} else { System.out.println("2�� ��� Ȥ�� 5�� ����� �ƴմϴ�");
		
		}  // if ���Ṯ
		
		
		
		
		

	}

}
