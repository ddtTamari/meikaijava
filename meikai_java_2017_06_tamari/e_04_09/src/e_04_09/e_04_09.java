/*
  ���K4-9�@		���̐����ln��ǂݍ���ŁA1����n�܂ł̐ς����߂�v���O�������쐬
  ���K��		6��6��
  �����		�ʗ��m��
 */
package e_04_09;
import java.util.Scanner;
public interface e_04_09 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		int n;
		//���̐���������܂ŌJ��Ԃ����͂����߂�
		do {
			System.out.print("n�̒l:");
			n = stdIn.nextInt();
		}while (n <= 0);

		int pro = 1;  //��
		int i = 1;

		//i�����ȉ��̏ꍇ�Apro��i�������Ai��1�������Ă���
		while(i <= n){
			pro *= i;
			i++;

		}
		//�ς�\��
		System.out.println("1����"+ n + "�܂ł̐ς�"+ pro + "�ł��B");
	}

}
