package ch02;

import java.util.Scanner;

public class ForExam {

	public static void main(String[] args) {
		// for���� �ݺ������� �ʱ�ȭ��, ���ǽ�, ���������� �����.
		// for(int i = 0 ; �� < 10 ; i++) { �ݺ� ���๮ ; }
		// i�� 0���� 10 �������� 1�� �ݺ��ϴ� ���๮
		// for������ ����ϴ� i �ʱⰪ�� for{} ������ �������.

		Scanner inputInt = new Scanner(System.in);
		System.out.println("Ȯ���� max ���� �Է��ϼ���!! ");
		System.out.print("���� �Է� >>>  ");
		int max = inputInt.nextInt(); // Ű����� �Է��� ���ڸ� max ������ ����
		System.out.println("Ȯ���� min ���� �Է��ϼ���!! >>>  ");
		System.out.print("���� �Է� >>>  ");
		int min = inputInt.nextInt(); // Ű����� �Է��� ���ڸ� min ������ ����

		System.out.println("Ȯ���� ������ ���� �Է��ϼ���!! >>>  ");
		System.out.print("���� �Է� >>>  ");
		int add = inputInt.nextInt(); // Ű����� �Է��� ���ڸ� add ������ ����

		System.out.println(min + " ~ " + max + " ����" + add + "�������� ����� ����!!");

		int total = 0;
		// total = total1 + 1 ; // * 100 ���� ��� �Ѵ�

		for (total = min; total <= max; total = total + add) {
			// total += total = add
			System.out.println("��� �׽�Ʈ: " + total);

		} // for�� ����

	} // main �޼��� ����

} // class ���Ṯ
