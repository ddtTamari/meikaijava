/*
  演習6-5		配列の要素数と個々の要素の値を読み込んで、
  				右のように各要素の値を表示するプログラムを作成せよ
  演習日		6月8日
  製作者		玉利仁美
 */
package e_06_05;

import java.util.Scanner;

public class e_06_05 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		// 要素の数の入力を求める
		System.out.print("要素数：");
		// 要素数の数
		int x = stdIn.nextInt();

		// 配列を作成
		int[] a = new int[x];

		// 要素数の数だけ繰り返し行う
		for (int i = 0; i < x; i++) {
			// 配列の番号を表示
			System.out.print("a[" + i + "] = ");
			// 各要素の値を入力
			a[i] = stdIn.nextInt();

		}
		// aの配列であることを表示
		System.out.print("a = {");
		// 要素の数だけ繰り返し行う
		for (int i = 0; i < x; i++) {

			// 最後の要素の値を表示するときではないとき
			if (i != x - 1) {
				// 値とコンマを表示
				System.out.print(a[i] + ",");
			// 最後の要素の時
			} else {
				//要素の値と閉じ括弧を表示
				System.out.print(a[i] + "}");
			}
		}
		//ストリームの解放
		stdIn.close();
	}
}
