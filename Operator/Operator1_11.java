import java.util.Scanner;

/*두 정수를 입력받아서 나눈 몫과 나머지를 
 * 다음과 같은 형식으로 출력하는 프로그램을 작성하시오.
 * 입력 : 35 10
 * 출력 : 35 / 10 = 3...5
 */

public class Operator1_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		int c = a/b ;
		int d = a%b ;
		
		System.out.printf ("%d / %d = %d...%d",a,b,c,d);
	}

}
