//�� �Է��� �� ���� error ��µǴ��� �˾ƺ���//

import java.util.*;


/*���� �빮�ڸ� �Է¹޾� 
'A'�̸� ��Excellent��, 
'B'�̸� ��Good��,
'C'�̸� ��Usually��, 
'D'�̸� ��Effort��, 
'F'�̸� ��Failure��, 
�� �� �����̸� ��error�� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.*/

public class Selection_Control_Statement_7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String A = scanner.next();
		
		if (A=="A") {
			System.out.printf("Excellent");
		}
		
		else if (A=="B") {
			System.out.println("Good");
		}
		
		else if (A=="C") {
			System.out.println("Usually");
		}
		
		else if (A=="D") {
			System.out.println("Effort");
		}
		
		else if (A=="F") {
			System.out.println("Failure");
		}
		
		else {
			System.out.println("error");
		}
	}

}
