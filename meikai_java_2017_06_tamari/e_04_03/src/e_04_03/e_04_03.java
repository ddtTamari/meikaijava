/*
  ���K4-3�@		2�̐����l�̊Ԃ̐����������ق����珇�ɕ\������v���O���������
  ���K��		6��6��
  �����		�ʗ��m��
 */
package e_04_03;
import java.util.Scanner;
public interface e_04_03 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		System.out.print("����A:"); int a = stdIn.nextInt();
		System.out.print("����B:"); int b = stdIn.nextInt();

		//a��b�̂ǂ��炪�傫�������m���߂�
		int min, max;
		if (a > b){
			max = a;
			min = b;
		}else{
			min =a;
			max =b;
		}
		//�ő�l�̒l�ɂȂ�܂ōŏ��l��1�������Ă���
		do{
			System.out.println(min);
			min ++;
		}while(min != (max + 1) );

	}
}
