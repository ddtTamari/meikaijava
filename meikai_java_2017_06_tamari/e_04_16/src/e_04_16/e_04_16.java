/*
  演習4-16		読み込んだ個数*を表示、5個表示ごとに改行
  演習日		6月7日
  製作者		玉利仁美
 */
package e_04_16;

import java.util.Scanner;

public class e_04_16 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		// *を何個表示するか促す
		System.out.print("何個*を表示しますか：");
		// nにキーボードから入力
		int n = stdIn.nextInt();

		int i = 0; // 何回目か
		// iが入力されたnより小さい間繰り返す
		while (i < n) {
			// もしiを割った数の余りが四ならば次の行に移行
			if (i % 5 == 4) {
				// *を表示し改行する
				System.out.println('*');
				// iを一つずつ増やす
				i++;
			} else {
				// *を表示する
				System.out.print('*');
				// iを一つずつ増やす
				i++;
			}
		}

	}
}
