/*
  演習4-1		符号の判定をするプログラムを何度でも繰り返してできるように
  演習日		6月6日
  製作者		玉利仁美
 */
package e_04_01;

import java.util.Scanner;

public class e_04_01 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int retry;
		// retryが1の間繰り返す
		do {
			// 整数の入力をキーボードで行う
			System.out.print("整数値：");
			int n = stdIn.nextInt();
			// nが0より大きいとき、値は正と表示
			if (n > 0)
				System.out.println("その値は正です。");
			// nが0より小さいとき、値は負と表示
			else if (n < 0)
				System.out.println("その値は負です。");
			// nがそれ以外の時、その値は0と表示
			else
				System.out.println("その値は0です。");
			// retryに1を代入
			retry = 1;
			System.out.print("もう一度？ 1...yes/0...no");
			retry = stdIn.nextInt();
		} while (retry == 1);

	}
}
