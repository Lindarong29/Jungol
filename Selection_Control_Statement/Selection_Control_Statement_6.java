import java.util.Scanner;

/*남자는 'M' 여자는 'F'로 나타내기로 하고 18세 이상을 성인이라고 하자.
성별('M', 'F')과 나이를 입력받아 
"MAN"(성인남자), "WOMAN"(성인여자), 
"BOY"(미성년남자), "GIRL"(미성년여자)을 구분하여 출력하는 프로그램을 작성하시오.*/

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