
import java.util.Scanner;

/*������ ��� �Է¹޴ٰ� 100 �̻��� ���� �Է��� �Ǹ� 
������ �Էµ� ���� �����Ͽ� �հ�� ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
(����� �ݿø��Ͽ� �Ҽ� ù°�ڸ����� ����Ѵ�.)
 */

public class Repetitive_Control_Statement_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int A = 0 ;
		int sum = 0 ;
		int i = 0 ;
		double avg ;
		
		while (A <= 99) {
			A = scanner.nextInt();
			sum = sum + A ;
			i++ ;
		}

		avg = (double)sum / i ;
		
		System.out.println(""+sum+"");
		System.out.printf("%.1f",avg);
	}
}