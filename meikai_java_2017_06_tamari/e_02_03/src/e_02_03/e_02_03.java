/*
 	演習2-3	キーボードから読み込んだ整数値をそのまま反復表示する
	制作日時	6月5日
	制作者	玉利仁美

*/
package e_02_03;

import java.util.Scanner;

public class e_02_03 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		// 表示する整数値の入力を促す
		System.out.print("整数値：");

		// 表示する整数値の値をキーボードから取得する
		int integer = stdIn.nextInt();

		// 入力された値をそのまま表示する
		System.out.println(integer + "と入力しましたね。");

		//ストリームを解放する
		stdIn.close();
	}
}
