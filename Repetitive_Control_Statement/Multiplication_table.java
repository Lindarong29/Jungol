import java.util.Scanner;

/*2���� 9������ �� �� 2���� �Է¹޾� 
 �Է¹��� �� ������ �������� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 �� �ݵ�� ���� �Էµ� ���� �����ܺ��� �Ʒ��� ���Ŀ� �°� ����Ͽ��� �Ѵ�.
 ������ ������ ������ 3ĭ�̴�.*/

public class Multiplication_table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int i,j ;
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		 if(a < b){
	         for(i=1;i<=9;i++){
	             for(j=a;j<=b;j++){
	              System.out.printf("%d * %d = %2d   ", j, i, j*i);
	             }
	             System.out.printf("\n");
	         }
	     }
	     else{
	        for(i=1;i<=9;i++){
	             for(j=a;j>=b;j--){
	              System.out.printf("%d * %d = %2d   ", j, i, j*i);
	             }
	             System.out.printf("\n");
	         }
	     }

	}

}
