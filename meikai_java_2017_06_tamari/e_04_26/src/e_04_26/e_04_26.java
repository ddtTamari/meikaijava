/*
  演習4-26		合計だけでなく平均も求めるようプログラムを書き換える
  				負の数の個数は平均を求める際の分母から除外させる
  演習日		6月7日
  製作者		玉利仁美
 */
package e_04_26;

import java.util.Scanner;

public class e_04_26 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		// 整数を加算と平均を出すプログラムだと表示
		System.out.println("整数を加算し、平均もだします。");
		// 何個加算するのか入力を促す
		System.out.print("何個加算しますか：");
		// nの値をキーボードから取得
		int n = stdIn.nextInt();

		int sum = 0; // 合計
		int ave = 0; // 平均
		int x = 0; // 負の数が入った回数
		// ｎ回繰り返す
		for (int i = 1; i <= n; i++) {
			// 整数の入力を促す
			System.out.print("整数：");
			// 足す値をキーボードから取得
			int t = stdIn.nextInt();
			// tが負の数だった時
			if (t < 0) {
				// 負の数は加算しないと表示
				System.out.println("負の数は加算しません。");
				// 負の数が入力された回数をカウント
				x += 1;
				// これから先の処理をせずにfor文の頭へ
				continue;
			}
			// 合計を出す
			sum += t;
			// 平均を出す
			ave = sum / (i - x);
		}
		// 合計値を表示
		System.out.println("合計は" + sum + "です。");
		// 平均を表示
		System.out.println("平均は" + ave + "です。");
	}
}
