/*
  ���K4-1�@		10~99�̐����ăQ�[���𐻍�
  ���K��		6��6��
  �����		�ʗ��m��
 */
package e_04_02;
import java.util.Random;
import java.util.Scanner;
public interface e_04_02 {

	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();

		//10~99�̐����������_���ɐݒ�
		int no = rand.nextInt(90) + 10;
		System.out.println("�����ăQ�[���J�n�I�I");
		System.out.println("10�`99�̐��𓖂ĂĂ��������B");

		int x ;
		do {
			System.out.println("�������ȁH");
			//x�̒l���L�[�{�[�h�������
			x= stdIn.nextInt();

			//�������͂���������������菬����������A�����������ł��ƕ\��
			if(x > no) System.out.println("�����Ə����Ȑ����ł��B");
			//�������͂����������������傫��������A�傫�������ł��ƕ\��
			else if(x < no) System.out.println("�����Ƒ傫�Ȑ����ł��B");
		}while (x != no); //���͂��������������Ɠ����ɂȂ�܂ŌJ��Ԃ�
		//�����Ɛ������ꏏ�̏ꍇ�A�����ł��ƕ\��
		System.out.println("�����ł��B");
	}

}
