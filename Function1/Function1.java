import java.util.Scanner;

/* ���ڿ� "~!@#$^&*()_+|" �� ����ϴ� �Լ��� �ۼ��ϰ� 
 * ������ �Է¹޾� �Է¹��� ����ŭ �Լ��� ȣ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */

public class Function1 {

	public static void print() {
		System.out.println("~!@#$^&*()_+|");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		if (num>0) {
			for (int i=0;  i<num; i++) {
				print();
		}
	}

}
}
