package ch01;

public class OperationExam {

	public static void main(String[] args) {
		// �����ڴ� ���α׷����� �����͸� ó���Ͽ� ����� �����Ѵ�.
		// �����ڴ� +, -, *, /, % (��Ģ������ + ������ ���)
		// �ǿ����ڴ� ����, ���� ���Ѵ�.
		
		// ���� ����(������ 1 ���� ��)
		
		int x = 10 ;
		x++ ; // x = x + 1
		
		x--; // x = x -1
		System.out.println("x�� -- ���� ������ ���: " + x);
		
		// ���� ���� (������ 2 ���� ��)
		int y = 20 ;
		int result = x + y ;
		//     30 = 10 + 20
		
		System.out.println("x + y = " + result);
		
		// ���� ���� (���� 3 ���� ��)
		boolean result1 = (result>10) ? true : false ;
		//                    ����         ��  :  ����
		
		System.out.println("result>10 ���: " + result1 );
		
		String result2 = (result>50) ? "ũ��" : "�۴�" ;
		System.out.println("result>50 ���: " + result2);
		
		
		
		int x1 = 10 * 10 ;  // ����
		System.out.println("10 x 10 = " + x1);
		int x2 = 10 / 3 ;  // ������
		System.out.println("10 / 5 = " + x2);
		int x3 = 10 % 3 ;  // ������
		System.out.println("10�� 5�� ���� ������ = " + x3);
		 
		// **** �̼� > Ȧ¦ ����� �� ���� ****
		int A1 = 35 ;
		int A2 = A1 % 2 ;  // 15�� 2�� �������� �� �������� A1�� �ִ´�.
		String A3 = (A2 == 1) ? "Ȧ��" : "¦��" ;
		System.out.println("15�� Ȧ¦ ��� ���: " + A3 );
		
		// **** �̼� > ���� �����ڸ� ����Ͽ� 4�� ����� ã�� ���� ****
		        int A4 = 24 ; 
				int A5 = A4 % 4 ;  
				boolean A6 = (A4 == 0) ? true : false ;  // String�� �־� ���ڿ��� �����ϴ� �� ���Ҵ�!!
				System.out.println("24�� 4�� ��� ���: " + A6 );
				
				// ������ ����
				int mut4 = 24 ;
				int div4 = mut4 % 4 ;  // 4�� ���� �������� div4�� �ִ´�.
				String resdiv4 = (div4 == 0) ? "4�� ����Դϴ�." : "�ƴմϴ�" ;
				System.out.println("4�� ��� �Ǵ� ���: " + resdiv4);
		
		// ���� ������ �׽�Ʈ
				
			System.out.println("----------���� ������ ��ġ�� ���� ��� ------------");
			int A = 10 ;		A++ ;
			++A ;
			System.out.println("10 > A++ > ++A�� ���: " + A);
			
			int B = 10 ;
			B-- ;
			--B ;
			System.out.println("10 > B-- > --B�� ���: " + B);
			
			int C ;
			C = A++ ;  // C = A > A + 1 (C�� A�� ���ڸ� ���� �ν��Ѵ�.)
			System.out.println("A�� ���: " + A);  // �����: 13
			System.out.println("C�� ���: " + C);  // �����: 12
			System.out.println("--------------------------");
			
			C = ++A ;  // C = A = 1 + A 
			System.out.println("A�� ���: " + A);  // �����: 14
			System.out.println("C�� ���: " + C);  // �����: 14
			System.out.println("--------------------------");
			
			C = ++A + B++ ;  // ����: ++ ���ϱ� A(14) = 15 ���ϱ� B(8) = 23(C) / B ���ϱ� ++ = 9 
			System.out.println("A�� ���: " + A);  // �����: 15
			System.out.println("B�� ���: " + B);  // �����: 9
			System.out.println("C�� ���: " + C);  // �����: 23
			System.out.println("--------------------------");
				
				
				
		
		
		
		
		
		

	}

}
