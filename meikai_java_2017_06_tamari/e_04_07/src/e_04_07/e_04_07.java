/*
  ���K4-7�@		�ǂݍ��񂾒l�̌������L��������\������v���O�������쐬(�\����*+�����݂�)
  ���K��		6��6��
  �����		�ʗ��m��
 */
package e_04_07;

import java.util.Scanner;

public interface e_04_07 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		System.out.print("����*��\�����܂����F");
		int n = stdIn.nextInt();

		int i = 0;
		//���͂��ꂽn���i���������Ƃ��J��Ԃ�
		while(i < n){
			//i�������̎�*��\��
			if(i%2 == 0)
			System.out.print('*');
			//����ȊO�̎�+��\��
			else
			System.out.print('+');
			//i���������
			i++;
		}
		//System.out.println();
	}
}
