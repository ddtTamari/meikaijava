/*
  ���K4-1�@		�����̔��������v���O���������x�ł��J��Ԃ��Ăł���悤��
  ���K��		6��6��
  �����		�ʗ��m��
 */
package e_04_01;

import java.util.Scanner;
public interface e_04_01 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		int retry;
		//retry��1�̊ԌJ��Ԃ�
		do{
			//�����̓��͂��L�[�{�[�h�ōs��
			System.out.print("�����l�F");		int n = stdIn.nextInt();
			//n��0���傫���Ƃ��A�l�͐��ƕ\��
			if(n > 0)	System.out.println("���̒l�͐��ł��B");
			//n��0��菬�����Ƃ��A�l�͕��ƕ\��
			else if(n < 0)	System.out.println("���̒l�͕��ł��B");
			//n������ȊO�̎��A���̒l��0�ƕ\��
			else System.out.println("���̒l��0�ł��B");
			//retry��1����
			retry = 1;
			//System.out.print("������x�H�@1...yes/0...no");
			//retry = stdIn.nextInt();
		}while(retry == 1);

	}
}
