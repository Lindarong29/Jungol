import java.util.Scanner;

//�� ���� ������ �Է¹޾� �հ� ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.(�� ����� �Ҽ� ���ϸ� �����Ͽ� ���� �κи� ����Ѵ�.)
public class Input_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		
		int sum = num1+num2+num3;
		System.out.println("sum = "+sum+"");
		System.out.printf("avg = %d",sum/3);
	}

}
