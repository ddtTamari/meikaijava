/*
  ���K4-8�@		���̐����l��ǂݍ���ŁA���̌������o�͂���
  ���K��		6��6��
  �����		�ʗ��m��
 */
package e_04_08;
import java.util.Scanner;
public interface e_04_08 {

	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		//�C�ӂ̐����I�ƌ�����\��y
		int x;
		int y = 0;
		//1�ȏ�̐��������͂����܂ŌJ��Ԃ���������
		do {
			System.out.print("�����l�F");
			x = stdIn.nextInt();
		}while(x <= 0);
		//x��0�ȉ��ɂȂ�܂ŏ\�Ŋ���A���̊�y���ꂸ�������Ƃɂ���Č��������߂�
		while (x > 0){
			x /= 10;
			y++;
		}
		//������\������
		System.out.println("���̒l��" + y + "���ł��B");

	}

}
