/*
  演習4-12		正の整数値を0までカウントアップするプログラムをfor分を使って作成
  演習日		6月6日
  製作者		玉利仁美
 */
package e_04_12;

import java.util.Scanner;

public class e_04_12 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int x;
		// 正の値しか入力できないようにする
		do {
			System.out.print("正の整数値：");
			x = stdIn.nextInt();
		} while (x <= 0);
		// iに0を代入、iがⅹ以下の間繰り返す、iは1ずつ増やしていく
		for (int i = 0; i <= x; i++) {
			// iを表示
			System.out.println(i);

		}
	}
}
