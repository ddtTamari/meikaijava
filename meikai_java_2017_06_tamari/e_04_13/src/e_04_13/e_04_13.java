/*
  ���K4-13�@	���̐����l��0�܂ŃJ�E���g�A�b�v����v���O������for�����g���č쐬
  ���K��		6��6��
  �����		�ʗ��m��
 */
package e_04_13;
import java.util.Scanner;
public interface e_04_13 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int n;	//�C�ӂ̒l

		//���̒l�����͂����܂ŌJ��Ԃ�
		do{
			System.out.print("n�̒l�F");
			n= stdIn.nextInt();
		}while(n <= 0);

		int sum =0;	//���v
		//i�����𒴂���܂�i�𑫂��Ă���
		for(int i = 0 ; i <= n ;i++ ){
			sum += i;
		}
		//���v��\������
		System.out.println(sum);

	}
}


