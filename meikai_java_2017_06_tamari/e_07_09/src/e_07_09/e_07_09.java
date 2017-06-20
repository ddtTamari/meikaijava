/*
  演習7-9		正の整数値：と表示してキーボードから正の整数値を読み込んで、
  				その値を返却させるメソッドreadPlusIntを作成せよ
  演習日		6月16日
  製作者		玉利仁美
 */
package e_07_09;

import java.util.Scanner;

public class e_07_09 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// 正の整数を返却できるまで再入力させるメソッドを呼び出し返却された値を表示する
		System.out.print("返却された整数：" + readPlusInt());
	}

	static int readPlusInt() {

		// 正の整数値を読み込む実数を用意する
		int integer = 0;
		// 入力される値が正の整数でない間繰り返し入力を求める
		do {
			// 正の整数値の入力を促す
			System.out.print("正の整数値：");
			// 変数にキーボードから入力
			integer = scan.nextInt();
			// 入力された値が正の整数ではない場合繰り返し入力を求める
		} while (integer <= 0);
		// 入力された正の整数値を返却する
		return integer;
	}

}
