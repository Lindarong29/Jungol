import java.util.Scanner;

/*���ڴ� 'M' ���ڴ� 'F'�� ��Ÿ����� �ϰ� 18�� �̻��� �����̶�� ����.
����('M', 'F')�� ���̸� �Է¹޾� 
"MAN"(���γ���), "WOMAN"(���ο���), 
"BOY"(�̼��Ⳳ��), "GIRL"(�̼��⿩��)�� �����Ͽ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.*/

public class Selection_Control_Statement_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String sex = scanner.next();
		Double age = scanner.nextDouble();
		
		if(age>=18) {
			System.out.printf(sex.equals("F") ? "WOMAN" : "MAN");
		}
		
		else {
			System.out.printf(sex.equals("F") ? "GIRL" : "BOY");
		}
	}
	}