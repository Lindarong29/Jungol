/*3���� ������ �Է� �޾� 
 * ù ��° ���� ���� ũ�� 1 �ƴϸ� 0�� ����ϰ� 
 * �� ���� ���� ��� ������ 1 �ƴϸ� 0�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * (JAVA�� 1�̸� true, 0�̸� false�� ����Ѵ�.)
*/
import java.util.*;
public class Operator_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();
		
		if ((A>B)&&(A>C)) {
			System.out.printf("%s ","true");
		}
		else {
			System.out.printf("%s ","false");
		}
		
		if ((A==B)&&(B==C)) {
			System.out.printf("%s ","true");
		}
		else {
			System.out.printf("%s ","false");
		}
	}

}
