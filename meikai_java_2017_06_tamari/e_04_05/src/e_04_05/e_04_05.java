/*
  ���K4-�@		x--��--x�Ə�����������ǂ̂悤�Ȍ��ʂɂȂ邩�m�F����B
  ���K��		6��6��
  �����		�ʗ��m��
 */
package e_04_05;
import java.util.Scanner;
public interface e_04_05 {
	public static void main (String[] args){
		Scanner stdIn = new Scanner(System.in);

		System.out.println("�J�E���g�_�E�����܂��B");
		int x;
		do{
			System.out.print("���̐����l�F");
			x = stdIn.nextInt();
		}while (x <= 0);

		while (x >= 0)
			//System.out.println(x--);
			System.out.println(--x);

	}

}
//--x�ɂ���ƌ�����̐��������������̂��I��-1�ɂȂ��Ă����-1�̒l���\�������B