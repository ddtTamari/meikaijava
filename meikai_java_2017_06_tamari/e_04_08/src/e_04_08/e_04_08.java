/*
  演習4-8		正の整数値を読み込んで、その桁数を出力する
  演習日		6月6日
  製作者		玉利仁美
 */
package e_04_08;

import java.util.Scanner;

public class e_04_08 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		// 任意の数字ⅹと桁数を表すy
		int x;
		int y = 0;
		// 1以上の数字が入力されるまで繰り返し聞き直す
		do {
			System.out.print("整数値：");
			x = stdIn.nextInt();
		} while (x <= 0);
		// xが0以下になるまで十で割り、その間yを一ずつ足すことによって桁数を求める
		while (x > 0) {
			x /= 10;
			y++;
		}
		// 桁数を表示する
		System.out.println("その値は" + y + "桁です。");

	}

}
