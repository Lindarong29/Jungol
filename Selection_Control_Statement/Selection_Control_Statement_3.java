/*나이를 입력받아 20살 이상이면 "adult"라고 출력하고 
 * 그렇지 않으면 몇 년후에 성인이 되는지를 "○ years later"라는 메시지를 출력하는 프로그램을 작성하시오.*/

import java.util.*;
public class Selection_Control_Statement_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		
		if (age >= 20) {
			System.out.println("adult");
		}

		else {
			System.out.printf("%d years later", 20-age);
		}
		
	}

}
