package ch02;

public class MultiForExam { // class ����
 
	public static void main(String[] args) {  // main ����
		// for�� ���ʿ� �Ǵٸ� for���� �־� �׽�Ʈ�Ѵ�.
		// �������� ����� ����.
		// ó���� 2 * 1 = 2 ~ 2 * 9 = 18
		// ���������� 9 * 1 = 9 ~ 9 * 9 = 81
		
		// �մܿ� for�� ����
		for (int m = 2 ; m <= 9 ; m++) { // 2���� 9���� 1�� ����
			System.out.println("=========" + m + " �� ======"); 
			
			// �ڴܿ� for�� ����
			for (int n = 1 ; n <= 9 ; n++) { // 1���� 9���� 1�� ����
				System.out.println(m + " X " + n + " = " + (m*n));  }
			
		}
		

	}  // main �޼��� ����

}  // class ����
