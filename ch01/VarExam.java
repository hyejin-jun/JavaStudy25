package ch01;

public class VarExam {

	public static void main(String[] args) {
		// ���� ���� �׽�Ʈ
		
		int x = 1 ; // ���� Ÿ�� x ������ 1 ���� �ִ´�.
		
		char y = 65 ; // char�� ���� Ÿ���ε� ���ڷ� ��ȯ�Ǳ⵵ �Ѵ�.
		             // ��ǻ�ʹ� ���ڸ� �����ڵ�� ��ȯ�ؼ� ó���� �Ѵ�.
					 // �����ڵ� ǥ�� 65�� A�� �ǹ��Ѵ�.
		char z = 'A' ; // char Ÿ���� z ������ ���� A�� �ִ´�.
		
		System.out.println("int x = " + x);
		System.out.println("char y = " + y);
		System.out.println("char z = " + z);
		
		char z1 = 'b' ;  // ���ڷ� �� ���� ���ڿ��� �� ���� ������ �ؾ� �Ѵ�.
		
		// ������ ����
		
		int x1 ;  // �ʱ�ȭ �� �� ����
		x1 = 10 ;  // ������ �ʱⰪ�� 10���� �־���.
		System.out.println(x1);
		
		// ���� ���� ����
		
		int kor, mat, eng , total, avg ;
		
		kor = 91 ;
		mat = 80 ;
		eng = 70 ;
		total = kor + mat + eng ; // ����
		avg = total / 3 ;  // ���
		
		System.out.println("���� : " + total);
		System.out.println("vudrbs : " + avg); 
		// �ڵ���� ������ �ƴ����� ��հ��� �Ҽ����� �������.
		// ������ �����ϴ� �ڵ����� ������ ���� ���� �ִ�.
		
		// ���� �ۼ� ��Ģ
		// ������ ù ���ڰ� �����̾�߸� �Ǹ�, $�� _�� ����� �� �ִ�.
		// ���ʷ� ù ���� ������ �ҹ��ڷ�, �� ��° �ܾ���ʹ� �빮�ڷ� �����Ѵ�.
		
		int price, $price, _price ;  // �������̸� Ư������ ��� �����ϱ�
		//int 1v ;
		//int @speed ;
		//int $#value ;
		
		char firstname  = '��' ;
		char firstName = '��' ;
		
		System.out.println("�� : " + firstname);
		System.out.println("�� : " + firstName);
		// �������� ��ҹ��ڴ� �ٸ� ������ �ν��Ѵ�.
		
		// ������ ������ ����� �� ����.
		// ������ �ڹٿ��� �̹� ��� ���� ����(����, Ŭ����)�� ���Ѵ�.
		
		//int char ;
		
		// ���ͷ�: ���� �Էµ� ��
		
		int literal1 = 75 ;  // 10����
		int literal2 =  075 ;  // 8����
		int literal3 = 0b0011 ;  // 2����
		int literal4 = 0xA ;  // 16����
		
		System.out.println("10���� 75 : " + literal1);
		System.out.println("8���� 75 : " + literal2);
		System.out.println("2���� 0011 : " + literal3);
		System.out.println("16���� A : " + literal4);
		
		
		
		
		
		
	}

}
