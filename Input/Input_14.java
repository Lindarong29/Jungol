/* �Ǽ��� yard(�ߵ�)�� �Է¹޾� cm(��Ƽ����)�� ȯ���Ͽ� �Է°��� ȯ���� ���� 
 * ��� ���� ���� �Ҽ� ��°�ڸ����� �ݿø��Ͽ� ù°�ڸ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
 * (�� 1�ߵ� = 91.44cm�� �Ѵ�.)
 * ��¿� : 10.1yard = 923.5cm 
 * �Է��� "yard? "��� ���� ����ϰ�, �Ǽ��� �Է¹޴´�.  �Ǽ��� "double"�� �Ѵ�. 
 */

 

import java.util.*;
public class Input_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("yard? ");
		
		Scanner scanner = new Scanner(System.in);
		double yard = scanner.nextDouble();
		
		double cm = yard*91.44;
		
		System.out.printf("%.1fyard = %.1fcm\n",yard,cm);
	}

}
