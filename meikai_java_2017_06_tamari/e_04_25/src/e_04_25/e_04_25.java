/*
  演習4-25		合計だけでなく平均も求めるようプログラムを書き換える
  演習日		6月7日
  製作者		玉利仁美
 */
package e_04_25;

import java.util.Scanner;

public class e_04_25 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		// 何をするのか表示
		System.out.println("整数を加算、平均を出します。");
		// 何個の整数を足すのか入力を促す
		System.out.print("何個加算しますか：");
		// ｎの値をキーボード入力から取得
		int n = stdIn.nextInt();

		int sum = 0; // 合計
		double average = 0; // 平均

		// n回繰り返す
		for (int i = 1; i <= n; i++) {
			// 整数の入力を促す
			System.out.print("整数(0で終了):");
			// 足す整数をキーボード入力から取得
			int t = stdIn.nextInt();
			// 0が入力されたらfor分を終了させる
			if (t == 0)
				break;
			// tの値を加える
			sum += t;
			// 合計を繰り返した回数で割る
			average = sum / i;
		}


		// 合計を表示
		System.out.print("合計は" + sum + "です。");
		// 平均を表示
		System.out.print("平均は" + average + "です。");
	}
}
