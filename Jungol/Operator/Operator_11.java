import java.util.Scanner;

/*�� ������ �Է¹޾Ƽ� ���� ��� �������� 
 * ������ ���� �������� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * �Է� : 35 10
 * ��� : 35 / 10 = 3...5
 */

public class Operator_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		int c = a/b ;
		int d = a%b ;
		
		System.out.printf ("%d / %d = %d...%d",a,b,c,d);
	}

}
