/*�μ��� �⿵���� Ű�� �����Ը� �Է¹޾� 
 * �μ��� Ű�� ũ�� �����Ե� ũ�� 1 �׷��� ������ 0�� 
 * ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * (JAVA�� 1 �̸� true, 0 �̸� false�� ����Ѵ�.)
 */

import java.util.*;
public class Operator1_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int minsu_cm = scanner.nextInt();
		int minsu_kg = scanner.nextInt();
		int giyoung_cm = scanner.nextInt();
		int giyoung_kg = scanner.nextInt();
		
		if ((minsu_cm>giyoung_cm)&&(minsu_kg>giyoung_kg)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}

}
