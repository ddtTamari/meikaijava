/*
  演習4-23		n段の数字ピラミッドを表示するプログラムを生成
  演習日		6月7日
  製作者		玉利仁美
 */
package e_04_23;

import java.util.Scanner;

public class e_04_23 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		// ｎ段の入力を促す
		System.out.print("n段：");
		// nの値をキーボードから取得
		int n = stdIn.nextInt();

		// ｎ回繰り返す
		for (int i = 0; i < n; i++) {

			// n-1回空白を生成する
			for (int j = 0; j < n - i; j++) {
				// 空白を生成
				System.out.print(" ");
			}
			//(i-1)*2+1回、iを10で割った剰余の数字を表示する
			for (int t = 0; t < (i - 1) * 2 + 1; t++) {
				// iを10で割った剰余を表示する
				System.out.print(i % 10);

			}

			// 改行を生成する
			System.out.println();

		}

	}

}
