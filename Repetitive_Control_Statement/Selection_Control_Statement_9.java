import java.util.Scanner;

/*3���� ������ �Է¹޾� ���ǿ����ڸ� �̿��Ͽ� �Է¹��� ���� �� 
 * �ּҰ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.*/

public class Selection_Control_Statement_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();
		
		int min = (A < B) ? A : B ;
		min = (min < C ) ? min : C ;
		
		System.out.println(""+min+"");
	}

}
