/*�Ǽ��� �� 3������ ������ �Է¹޾� 
 * ������ �����κ��� �հ踦 ����ϰ�, ����� �Ǽ��� ����� ���� �� 
 * �����κи� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */

import java.util.*;

public class Debugging_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		double a = scanner.nextDouble(); 
		double b = scanner.nextDouble(); 
		double c = scanner.nextDouble(); 
		
		int sum = ((int)a + (int)b + (int)c);
		double avg = (a+b+c)/3 ;
		
		System.out.printf("sum %d\n",sum);
		System.out.printf("avg %d",(int)avg);
	}

}
