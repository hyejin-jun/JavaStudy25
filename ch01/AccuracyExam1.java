package ch01;

public class AccuracyExam1 {

	public static void main(String[] args) {
		// ��� 1 ���� 10 �������� �ɰ��� 1 ������ 0.1�� 1 ���� �ȴ�.
		
		int apple = 1 ;  // ��� 1 ��
		double pieceUint = 0.1 ;  // ���� ����
		int number = 7 ;  // 7 ���� ����
		
		double result = apple - number*pieceUint ;
		System.out.println("��� 7 ������ �� ��: " + result);  // �����: 0.29999999999999993
		
		System.out.println("7 ������ ��: " + number * pieceUint );  // �����: 0.7000000000000001
		
		// ���: ��Ȯ�� ����� ���ؼ��� �Ǽ� Ÿ���� ������� �ʴ� ���� ����.
		
		
		

	}

}
