/*�Ʒ��� ���α׷��� �ۼ��Ͽ� ������� �ϸ鼭 ����� â���� �� ��ġ������ a�� ���� ������ ���Ͽ� �� ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * #include <stdio.h>
 * int main()
 * {
 * 		int a=5;
 * 		a+=10;
 * 		a = a-1;  --��
 * 		ptintf("%d\n",1); //���⿡�� ��µ� 1�� ����ġ������ a������ �ٲپ��ش�.
 * 		return 0;
 */ 
public class Debugging_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		a += 10; // a=15
		a = a-1; // --�� �� ������ ���� ���� �ٿ����� a=14����, 
				 // ���� ��ġ�� �� ���忡���� a=15
		System.out.printf("%d\n",15);
	}

}
