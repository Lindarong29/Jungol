// 왜 모든 입력에 error 출력 나오는 지 모르겠음.. 

import java.util.*;


/*영문 대문자를 입력받아 
'A'이면 “Excellent”, 
'B'이면 “Good”,
'C'이면 “Usually”, 
'D'이면 “Effort”, 
'F'이면 “Failure”, 
그 외 문자이면 “error” 라고 출력하는 프로그램을 작성하시오.*/

public class Selection_Control_Statement_7 {

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
