/*
  演習4-17		整数値のすべての約数を表示するプログラムを書き換えて、約数の個数を表示するプログラムを作成
  演習日		6月7日
  製作者		玉利仁美
 */
package e_04_17;

import java.util.Scanner;

public class e_04_17 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		// 整数の入力を求める
		System.out.print("整数値：");
		// nをキーボードから入力
		int n = stdIn.nextInt();
		// 約数の個数を数える
		int count = 0;
		// iがn以下の時繰り返し、iは一つずつ増やす
		for (int i = 1; i <= n; i++) {
			// ｎをiで割った余りが０の時
			if (n % i == 0) {
				// その時のiを表示
				System.out.println(i);
				// countを一つ増やす
				count++;
			}
		}
		// カウントされた約数の数を表示
		System.out.println("約数は" + count + "個です。");
	}
}
