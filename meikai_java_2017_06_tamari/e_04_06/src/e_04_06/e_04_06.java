/*
  ���K4-6�@		�ꖢ���̎����s�������o�͂��Ȃ��悤�ɏ����������v���O�����̍쐬
  ���K��		6��6��
  �����		�ʗ��m��
 */
package e_04_06;
import java.util.Scanner;
public interface e_04_06 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		System.out.print("����*��\�����܂����F");
		int n = stdIn.nextInt();

		int i = 0;

			while(i < n && i > 0){
				System.out.print('*');
				i++ ;
			}

	}
}
