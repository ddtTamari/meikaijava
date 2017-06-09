/*
  演習6-11		異なる要素が同じ値を持つことの内容に改良(要素数は10以下であるとする)
  演習日		6月9日
  製作者		玉利仁美
 */
package e_06_11;

import java.util.Random;
import java.util.Scanner;

public class e_06_11 {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);

		// 要素の数の入力を促す
		System.out.print("要素数：");
		// 要素数をキーボードから取得
		int x = stdIn.nextInt();

		// x個の要素を持つ配列aを作成
		int[] a = new int[x];
		int random = 0;

		// ｘ回繰り返す
		for (int i = 0; i < x; i++) {
			// ランダムという変数に1～10の値を入力
			random = rand.nextInt(10) + 1;
			// 各要素に生成した乱数を代入
			a[i] = random;

			// 2回目以降ならば
			if (i > 0) {
				// ラベルを付けてループできるようにする
				Outer: while (true) {
					// ランダムという変数に再度乱数を代入
					random = rand.nextInt(10) + 1;
					// i回繰り返す
					for (int j = 0; j < i; j++) {
						// j番目の要素がランダムと等しかったら
						if (a[j] == random) {
							// ラベルまで戻り繰り返す
							continue Outer;
						}

					}
					// i番目の要素にランダムを代入
					a[i] = random;
					// for分を終了させる
					break;
				}

			}
			// 配列の値を表示
			System.out.println("a[" + i + "] = " + a[i]);
		}
	}
}
