/*
 	演習2-3	キーボードから読み込んだ整数値をそのまま反復表示する
	制作日時	6月5日
	制作者	玉利仁美

*/
package e_02_03;
import java.util.Scanner;

public interface e_02_03 {
		public static void main(String[] args){
			Scanner stdIn = new Scanner(System.in);

			//整数値の入力を促す
			System.out.print("整数値：");

			//変数ｘにキーボードから読み込んだ数字を入れる
			int x = stdIn.nextInt();

			//入力した数字をそのまま返す
			System.out.println(x+"と入力しましたね。");


		}
	}



