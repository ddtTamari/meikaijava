/*
  ���K4-12�@	���̐����l��0�܂ŃJ�E���g�A�b�v����v���O������for�����g���č쐬
  ���K��		6��6��
  �����		�ʗ��m��
 */
package e_04_12;

import java.util.Scanner;

public interface e_04_12 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		int x;
		//���̒l�������͂ł��Ȃ��悤�ɂ���
		do{
			System.out.print("���̐����l�F");	 x= stdIn.nextInt();
		}while(x <= 0);
		//i��0�����Ai���I�ȉ��̊ԌJ��Ԃ��Ai��1�����₵�Ă���
		for(int i = 0; i <= x ; i ++ ){
			//i��\��
			System.out.println(i);

		}
	}
}
