/*���̸� �Է¹޾� 20�� �̻��̸� "adult"��� ����ϰ� 
 * �׷��� ������ �� ���Ŀ� ������ �Ǵ����� "�� years later"��� �޽����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.*/

import java.util.*;
public class Selection_Control_Statement_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		
		if (age >= 20) {
			System.out.println("adult");
		}

		else {
			System.out.printf("%d years later", 20-age);
		}
		
	}

}
