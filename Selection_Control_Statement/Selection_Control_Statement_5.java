
/*�� ���� �Ǽ��� �Է¹޾� ��� 4.0 �̻��̸� "A", 
 * ��� 3.0 �̻��̸� "B", �ƴϸ� "C" ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.*/

import java.util.Scanner;
public class Selection_Control_Statement_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Double A = scanner.nextDouble();
		Double B = scanner.nextDouble();
		
		if (A>=4.0 && B>= 4.0) {
			System.out.println("A");
		}
		
		else if (A>=3.0 && B>=3.0) {
			System.out.println("B");
		}
		
		else {
			System.out.println("C");
		}
	}

}
