
import java.util.Scanner;

/*�� ���� ������ �Է¹޾� ���(positive integer)���� 
 * ����(negative number)���� ����ϴ� �۾��� �ݺ��ϴٰ� 
 * 0�� �ԷµǸ� �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */

public class Repetitive_Control_Statement_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int num = -1;
		
		while (num != 0) { //num�� 0�� �ƴ� �� ����. 0�̸� ����
			
			System.out.printf("number? ");
			num = scanner.nextInt();
			
			if (num < 0) {
				System.out.println("negative number");
			}
			
			else if (num >0) {
				System.out.println("positive integer");
			}
			
		}

	}
}