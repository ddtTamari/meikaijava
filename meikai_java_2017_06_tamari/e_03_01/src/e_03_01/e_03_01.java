/*
 	演習3-1	整数値を読み込みその絶対値を求めて表示する
	制作日時	6月5日
	制作者	玉利仁美

*/
package e_03_01;

import java.util.Scanner;

public class e_03_01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 絶対値を求める整数の値の入力を促す
		System.out.print("整数値：");
		// 絶対値を求める整数値をキーボードから取得する
		int integer = scan.nextInt();

		// 入力された整数値が0または正の値だった場合、入力された整数値は絶対値と同じ値になる
		if (integer >= 0) {
			// 入力された整数値をそのまま値を表示
			System.out.println("その絶対値は" + integer + "です。");
			// 入力された整数値が負の値であれば、絶対値は正の値なので、－1をかけて正の値に直す
		} else if (integer < 0) {
			//入力された整数値を正の値に直し表示する
			System.out.println("その絶対値は" + integer * (-1) + "です。");
		}
		//ストリームの解放をする
		scan.close();
	}

}
