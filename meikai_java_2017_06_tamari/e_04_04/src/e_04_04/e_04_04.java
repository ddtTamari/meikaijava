/*
  ���K4-4�@		�J�E���g�_�E���̍Ō�ɕϐ�x�̒l��-1�ɂȂ邱�Ƃ��m�F
  ���K��		6��6��
  �����		�ʗ��m��
 */
package e_04_04;
import java.util.Scanner;

public interface e_04_04 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);


		System.out.println("�J�E���g�_�E�����܂��B");
		int x;
		//�}�C�i�X�l���^�����Ă���ԁA�l�̍ē��͂����߂�
		do {
			System.out.print("���̐����l�F");
			x = stdIn.nextInt();
		}while (x <= 0);
		//�^����ꂽ�l�����܂���0�̎��A���̐�����1�����炵�Ă���
		while (x >= 0){
			System.out.println(x);
			x--;
		}
		//while�����I���̂͏�������O���܂łȂ̂�-1�܂Ō����Ă���
		System.out.println("�����I�̒l��" + x + "�ł��B");

	}
}
