import java.util.Scanner;

/*100 ������ ���� ������ �Էµȴ�.
while ���� �̿��Ͽ� 1���� �Է¹��� ���������� 
���� ���Ͽ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. */

public class Repetitive_Control_Statement_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int i = 1;
		int sum = 0 ;
		
		while (i<=A) {
			sum = sum + i;
			i ++;
		}
		
		System.out.println(""+sum+"");

	}
}