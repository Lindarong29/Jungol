import java.util.*;


/*���� �빮�ڸ� �Է¹޾� 
'A'�̸� ��Excellent��, 
'B'�̸� ��Good��,
'C'�̸� ��Usually��, 
'D'�̸� ��Effort��, 
'F'�̸� ��Failure��, 
�� �� �����̸� ��error�� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.*/

public class Selection_Control_Statement_7{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String A = scanner.next();
		
		switch (A){
			case "A":
				System.out.println("Excellent");
				break;
				
			case "B":
				System.out.println("Good");
				break;	
				
			case "C":
				System.out.println("Usually");
				break;
				
			case "D":
				System.out.println("Effort");
				break;
				
			case "F":
				System.out.println("Failure");
				break;
				
			default:
				// ��� ���ǿ��� ��ġ���� �ʾ��� ��쿡 ����
				System.out.println("error");
				break;
	
		}


	
	}

}