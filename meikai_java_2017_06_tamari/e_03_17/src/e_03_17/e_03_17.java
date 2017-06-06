/*
  演習3－17　	0，1，2のいずれかの値の乱数を生成、その値によってグーチョキパーいずれかを表示させる
  演習日		6月6日
  製作者		玉利仁美
 */
package e_03_17;
import java.util.Random;
public interface e_03_17 {

	public static void main(String[] args){
		Random rand = new Random();

		//0～2の数字をランダムに生成
		int x = rand.nextInt(3);
		//xの値によってグーチョキパーのいずれかが表示される
		switch(x){
		case 0 : System.out.print("グー"); 	break;
		case 1 : System.out.print("チョキ"); 	break;
		case 2 : System.out.print("パー");		break;
		}
	}


}
