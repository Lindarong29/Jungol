/*�� ���� ������ �Է¹޾Ƽ� ������ ���� 4���� ���迬������ ����� ����Ͻÿ�.
�̶� �Է¹��� �� ������ �̿��Ͽ� ����Ͻÿ�.
(JAVA�� 1�̸� true, 0�̸� false�� ����Ѵ�.)*/
/* 4 > 5 --- 0
4 < 5 --- 1
4 >= 5 --- 0
4 <= 5 --- 1 */

import java.util.*;
public class Operator_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		
		System.out.printf("%d > %d --- ",A,B);
			if (A>B) {
				System.out.println("true");
			}
			else {
				System.out.println("false");
			}
			
		System.out.printf("%d < %d --- ",A,B);
			if (A<B) {
				System.out.println("true");
			}
			else {
			System.out.println("false");
			}
			
		System.out.printf("%d >= %d --- ",A,B);
			if (A>=B) {
				System.out.println("true");
			}
			else {
				System.out.println("false");
			}
			
		System.out.printf("%d <= %d --- ",A,B);
			if (A<=B) {
				System.out.println("true");
			}
			else {
				System.out.println("false");
			}
	}
}
