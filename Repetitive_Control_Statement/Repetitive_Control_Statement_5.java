
import java.util.Scanner;

/*������ �Է¹޾Ƽ� 3�� ����� �ƴ� ��쿡�� �ƹ� �۾��� ���� �ʰ� 
3�� ����� ��쿡�� 3���� �������� ����ϴ� �۾��� �ݺ��ϴٰ�
-1�� �ԷµǸ� �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */

public class Repetitive_Control_Statement_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int A = 0 ;

		
		while (A != -1) {
			A = scanner.nextInt();
			
			if (A%3 == 0){ //A�� 3�� ����̸�
				System.out.printf("%d\n", (A/3));
			}
			
			
		}

		
	}
}