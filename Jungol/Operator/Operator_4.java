/* �� ���� ������ �Է¹޾Ƽ�
 * ù ��° ���� ��ġ ���� �����ڸ� ����ϰ�
 * �� ��° ���� ��ġ ���� �����ڸ� ����Ͽ�
 * �� ���� ���� ���� �� ������ ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */

import java.util.*;
public class Operator_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = A++;
		int D = --B;
		
		System.out.printf("%d %d %d",A,B,C*D);
	}
}
