/*
 	演習3-5	正の整数値が5で割り切れるかどうか判定
	制作日時	6月5日
	制作者	玉利仁美
*/
package e_03_05;

import java.util.Scanner;

public class e_03_05 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		// 整数値の入力を促す
		System.out.print("整数値：");
		// 変数ｎにキーボードから入力
		int n = stdIn.nextInt();

		// ｎが正の数字の時
		if (n > 0)
			// ｎを5で割った余りが0ならば、5で割り切れますと表示
			if (n % 5 == 0)
				System.out.print("その値は5で割り切れます。");
			// 5で割り切れないならば、5で割り切れないと表示
			else
				System.out.print("その値は5で割り切れません。");
		// ｎが正の数字でない時、正ではない値が入力されたと表示
		else
			System.out.print("正ではない値が入力されました。");

	}
}
