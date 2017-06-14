/*
 	演習3-5	正の整数値が5で割り切れるかどうか判定
	制作日時	6月5日
	制作者	玉利仁美
*/
package e_03_05;

import java.util.Scanner;

public class e_03_05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 5の数字で割り切れる正の整数値かどうかの判定をする整数値の入力を促す
		System.out.print("整数値：");
		// 5の倍数であるかどうか判定する正の整数値の値をキーボードから取得する
		int integer = scan.nextInt();

		// 入力された整数値が正の値の時のみ、5で割り切れるか判定する
		if (integer > 0) {
			// 入力された整数値が5で割り切れるならば、5で割り切れると表示する
			if (integer % 5 == 0) {
				// 5で割り切れたので、5で割り切れますと表示
				System.out.print("その値は5で割り切れます。");
				// 5で割り切れないならば、5で割り切れないと表示
			} else {
				System.out.print("その値は5で割り切れません。");
			}
		// ｎが正の値でない時、5で割り切れるか判定はしないので、正の値ではありませんと表示、
		} else {
			//正の値ではないので、正ではない値が入力されたと表示
			System.out.print("正ではない値が入力されました。");
		}
		//ストリームを解放する
		scan.close();
	}
}
