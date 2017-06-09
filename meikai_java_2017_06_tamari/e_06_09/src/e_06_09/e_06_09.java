/*
  演習6-9		要素型がint型である配列作り、全要素を1～10の乱数で埋めつくす
  演習日		6月9日
  製作者		玉利仁美
 */
package e_06_09;

import java.util.Random;
import java.util.Scanner;

public class e_06_09 {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);

		// 要素の数の入力を促す
		System.out.print("要素数：");
		// 要素数をキーボードから取得
		int x = stdIn.nextInt();

		// x個の要素を持つ配列aを作成
		int[] a = new int[x];

		// ｘ回繰り返す
		for (int i = 0; i < x; i++) {
			// 各要素に1～10のランダムな数字を代入する
			a[i] = rand.nextInt(10) + 1;
			// 各要素の値を表示
			System.out.println("a[" + i + "] =" + a[i]);
		}

	}
}