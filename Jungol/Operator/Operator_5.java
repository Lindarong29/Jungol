/* �� ���� ������ �Է¹޾Ƽ�, 
ù ��° �ٿ��� �� ������ ���� ������ 1 �ƴϸ� 0�� ����ϰ�, 
�� ��° �ٿ��� ���� ������ 1 ������ 0�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
(JAVA�� 1�̸� true, 0�̸� false�� ����Ѵ�.)
*/

import java.util.*;
public class Operator_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		
		//������ 
		if (A==B) {
			System.out.printf("%s\n","true");
		}		
		else {
			System.out.printf("%s\n","false");
		}
		
		//�ٸ���
		if (A!=B) {
			System.out.printf("%s\n","true");
		}
		else {
			System.out.printf("%s\n","false");
		}
	}

}
