/*
  ���K3�|18�@	0�C1�C2�̂����ꂩ�̒l�̗����𐶐��A���̒l�ɂ���ăO�[�`���L�p�[�����ꂩ��\��������
  ���K��		6��6��
  �����		�ʗ��m��
 */
package e_03_18;
import java.util.Scanner;
public interface e_03_18 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		System.out.print("���F"); int month = stdIn.nextInt();

		switch(month){
			case 1 :	System.out.println("�~"); break;
			case 2 :	System.out.println("�~"); break;
			case 3 :	System.out.println("�t"); break;
			case 4 :	System.out.println("�t"); break;
			case 5 :	System.out.println("�t"); break;
			case 6 :	System.out.println("��"); break;
			case 7 :	System.out.println("��"); break;
			case 8 :	System.out.println("��"); break;
			case 9 :	System.out.println("�H"); break;
			case 10 :	System.out.println("�H"); break;
			case 11:	System.out.println("�H"); break;
			case 12 :	System.out.println("�~"); break;
			default :  System.out.println("1�`12�̊Ԃ̐������Ă��������B"); break;
		}
	}
}
