/*
  ���K3�|17�@	0�C1�C2�̂����ꂩ�̒l�̗����𐶐��A���̒l�ɂ���ăO�[�`���L�p�[�����ꂩ��\��������
  ���K��		6��6��
  �����		�ʗ��m��
 */
package e_03_17;
import java.util.Random;
public interface e_03_17 {

	public static void main(String[] args){
		Random rand = new Random();

		//0�`2�̐����������_���ɐ���
		int x = rand.nextInt(3);
		//x�̒l�ɂ���ăO�[�`���L�p�[�̂����ꂩ���\�������
		switch(x){
		case 0 : System.out.print("�O�["); 	break;
		case 1 : System.out.print("�`���L"); 	break;
		case 2 : System.out.print("�p�[");		break;
		}
	}


}
