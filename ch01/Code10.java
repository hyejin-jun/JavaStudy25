package ch01;

import java.util.Scanner;

public class Code10 {

	public static void main(String[] args) {
		// �α��� ȭ�� ����� ����
		
		String loginid = "jhj1234" ;
		String loginpw = "12345678" ;
		
	    Scanner input = new Scanner (System.in);  // input�� ������ �ʾҴٰ� �� �׷��ٰ� ȭ��ǥ ������ try�� �ߴ��� �ڵ尡 �ٲ�� ������ ������ ����

			System.out.print("���̵� �Է��ϼ���: ");
			String id = input.nextLine() ;
			System.out.print("�н����带 �Է��ϼ���: ");
			String pw = input.nextLine() ;
			
			if((loginid.equals(id)) & loginpw.equals(pw))  
				{System.out.println("�α����� �����Ͽ����ϴ�!!");}
				else {
			System.out.println("�α����� �����Ͽ����ϴ�!!"); 
			} // if ����
	    
	    
	   

	
	 
} // main �޼��� ����
}  // class ����
