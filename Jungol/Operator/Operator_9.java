/*���� ���� ���� ��ǻ�� ������ ������ ������ �Է¹޾Ƽ� 
 * ������ ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�. 
 * (�� ����� �Ҽ��� ���ϴ� ���� �Ѵ�.)
 */

import java.util.*;
public class Operator_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int d = scanner.nextInt();
		
		int sum = a+b+c+d;
		int avg = sum / 4 ;
		
		System.out.printf("sum %d\navg %d",sum,avg);
	}

}
