/*
  ���K4-11�@	���̐����l��0�܂ŃJ�E���g�_�E������v���O������for�����g���č쐬
  ���K��		6��6��
  �����		�ʗ��m��
 */
package e_04_11;
import java.util.Scanner;
public interface e_04_11 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		int x;
		//���̒l�������͂ł��Ȃ��悤�ɂ���
		do{
			System.out.print("���̐����l�F");	 x= stdIn.nextInt();
		}while(x <= 0);
		//i��x�����Ai��0�ȏ�̂Ƃ��J��Ԃ��Ai��1�����炵�Ă���
		for(int i = x; i >= 0 ; i--){
			//i��\��
			System.out.println(i);

		}
	}

}
