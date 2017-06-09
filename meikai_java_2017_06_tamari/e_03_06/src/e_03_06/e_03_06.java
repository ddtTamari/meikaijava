/*
 	演習3-6	10の倍数かどうか判定
	制作日時	6月5日
	制作者	玉利仁美

*/
package e_03_06;

import java.util.Scanner;

public class e_03_06 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		// 整数値の入力を促す
		System.out.print("整数値：");
		// 変数ｎにキーボードから入力
		int n = stdIn.nextInt();

		// ｎが正の数字の時
		if (n > 0)
			// ｎを10で割った余りが0ならば、10の倍数と表示
			if (n % 10 == 0)
				System.out.print("その値は10の倍数です。");
			// 10で割り切れないならば、10の倍数でないと表示
			else
				System.out.print("その値は10の倍数ではありません。");
		// ｎが正の数字でない時、正ではない値が入力されたと表示
		else
			System.out.print("正ではない値が入力されました。");

	}
}
