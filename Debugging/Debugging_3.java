/*������ �� 3������ ������ �Է¹޾� ����� ���� �� 
 * �ݿø��Ͽ� �Ҽ� ù°�ڸ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */

import java.util.*;
public class Debugging_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		//int�� �޾ƹ����� avg�� int�� ����� ��. int�� ���� ���� ���¸� double�� �����ϴ� �� ���̾�.
		//�׷��� �ƿ� double�� �޾Ƽ� double�� ����ϰ� double�� ����!
		double a = scanner.nextDouble(); 
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();
		
		double avg = (a+b+c)/3 ;
		
		System.out.printf("%.1f",avg);
	}

}
