package ch02;

import java.util.Scanner;

public class WhileExam {

	public static void main(String[] args) {
		// while���� ���ǽ��� true�� ���� �ݺ��Ѵ�
		// while���� ����ó���ϰ� ������ false ó���ϸ� �ȴ�
		// ���ѹݺ��� �ڵ带 �ۼ��� �� ����Ѵ�

		Scanner inputInt = new Scanner(System.in); // ������
		Scanner inputChar = new Scanner(System.in); // ���ڿ�

		boolean run = true; // ���ѹݺ��� ����

		while (run) {
			System.out.println("======== ���� ���� ó�� ========");
			System.out.println("1 �� ������ ������ ������ �̵��մϴ� !! ");
			System.out.println("2 �� ������ �л� ������ �̵��մϴ� !! ");
			System.out.println("3 �� ������ ���� ������ �̵��մϴ� !! ");
			System.out.println("9 �� ������ ���α׷��� �����մϴ� !! ");
			System.out.print("1 ~ 9���� �Է��ϼ���  >> ");
			int selectInt = inputInt.nextInt(); // ���� �Է�

			switch (selectInt) { // Ű����� �Էµ� ���ڸ� �Ǵ��Ͽ� �б⸦ ����

			case 1: // C R U D ��� ���߱�
				boolean subRun = true;

				while (subRun) {
					System.out.println("������ ������ �̵��Ͽ����ϴ� !! �� ");
					System.out.println("A�� ������ ������� �̵��մϴ�!! �� "); // C
					System.out.println("B�� ������ �������� �̵��մϴ�!! �� "); // R
					System.out.println("C�� ������ �������� �̵��մϴ�!! �� "); // U
					System.out.println("D�� ������ �������� �̵��մϴ�!! �� "); // D
					System.out.println("Z�� ������ ���� �޴��� �����մϴ�!! ��");
					System.out.print("A ~ Z���� �Է��ϼ���  >>  ");
					char subSelect = inputChar.next().charAt(0);
					// ���ڿ��� �Էµ� �� �߿� �Ǿ� ���ڸ� subSelect ������ ����
					// ������ �Է¹��� ���ĺ��� ó��

					switch (subSelect) {

					case 'A':
					case 'a':
						System.out.println("������ ��� �޴��� �̵��Ͽ����ϴ�!! ��"); // ������ ��� �ڵ� �ۼ�
						break;

					case 'B':
					case 'b':
						System.out.println("������ ���� �޴��� �̵��Ͽ����ϴ�!! ��"); // ������ ���� �ڵ� �ۼ�
						break;

					case 'C':
					case 'c':
						System.out.println("������ ���� �޴��� �̵��Ͽ����ϴ�!! ��"); // ������ ���� �ڵ� �ۼ�
						break;

					case 'D':
					case 'd':
						System.out.println("������ ���� �޴��� �̵��Ͽ����ϴ�!! ��"); // ������ ���� �ڵ� �ۼ�
						break;

					case 'Z':
					case 'z':
						System.out.println("���α׷��� �����մϴ�!! ��"); // ���α׷� ���� �ڵ� �ۼ�
						subRun = false;
						break;

					default:
						System.out.println("���ڸ� �߸� �Է��Ͽ����ϴ� ��_��!!");
						break;

					} // ������ ������ switch�� ����

					// ������ ������ �ڵ� �Է�
				}
				break;

			case 2:
				System.out.println("�л� ������ �̵��Ͽ����ϴ� !! �� ");
				// �л� ������ �ڵ� �Է�
				break;

			case 3:
				System.out.println("���� ������ �̵��Ͽ����ϴ� !! �� ");
				// ���� ������ �ڵ� �Է�
				break;

			case 9:
				System.out.println("���α׷��� �����ϰڽ��ϴ� !! �� ");
				// ���α׷� ���� �ڵ� �Է�
				run = false;
				break;

			default: // �� ���ǿ� �ش����� �ʴ� ��
				System.out.println("���ڸ� �߸� �Է��Ͽ����ϴ� ��_��!!");
				break;

			} // switch�� ����

		} // while�� ����

	} // main �޼��� ����

} // class ����
