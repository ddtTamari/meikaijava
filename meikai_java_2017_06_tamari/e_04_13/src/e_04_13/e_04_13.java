/*
  演習4-13		正の整数値を0までカウントアップするプログラムをfor分を使って作成
  演習日		6月6日
  製作者		玉利仁美
 */
package e_04_13;

import java.util.Scanner;

public class e_04_13 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n; // 任意の値

		// 正の値が入力されるまで繰り返す
		do {
			System.out.print("nの値：");
			n = stdIn.nextInt();
		} while (n <= 0);

		int sum = 0; // 合計
		// iがｎを超えるまでiを足していく
		for (int i = 0; i <= n; i++) {
			sum += i;
		}
		// 合計を表示する
		System.out.println(sum);

	}
}
