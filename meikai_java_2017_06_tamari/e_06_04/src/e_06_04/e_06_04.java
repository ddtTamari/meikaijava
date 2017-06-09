/*
  演習6-4		立て向きの棒グラフで表示するプログラム
  演習日		6月8日
  製作者		玉利仁美
 */
package e_06_04;

import java.util.Random;
import java.util.Scanner;

public class e_06_04 {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);

		// 要素数の入力を促す
		System.out.print("要素数：");
		// 要素数をキーボードから取得
		int n = stdIn.nextInt();
		// n個の要素を持った配列aを作成
		int[] a = new int[n];

		// n回繰り返す
		for (int i = 0; i < n; i++) {
			// 1～10のランダムな数を各要素に代入
			a[i] = 1 + rand.nextInt(10);
		}
		// 10回繰り返し行う
		for (int i = 10; i > 0; i--) {
			// 要素の値の数だけ繰り返す
			for (int j = 0; j < n; j++) {
				// もし配列の数値がiより大きければ
				if (i <= a[j]) {
					// *を表示
					System.out.print('*');
					// そうでなければ
				} else {
					// 空白を表示
					System.out.print(" ");
				}
				// 間をそろえる
				System.out.print(" ");
			}
			// 改行
			System.out.println();
		}

		// 要素数だけ繰り返す
		for (int i = 0; i < n; i++)
			// --を表示
			System.out.print("--");
		// 改行
		System.out.println();

		// 要素数だけ繰り返す
		for (int i = 0; i < n; i++)
			// インデックスを10で割った剰余を表示
			System.out.print(i % 10 + " ");

	}
}
