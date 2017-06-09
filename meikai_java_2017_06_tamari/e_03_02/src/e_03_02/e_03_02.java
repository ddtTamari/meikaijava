/*
 	演習3-2	変数bが変数aの約数であるかどうか確かめる
	制作日時	6月5日
	制作者	玉利仁美

*/
package e_03_02;

import java.util.Scanner;

public class e_03_02 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		// 整数Aの入力を求める
		System.out.print("整数A:");
		// 変数aにキーボードから入力
		int a = stdIn.nextInt();
		// 整数Bの入力を求める
		System.out.print("整数B：");
		// 変数ｂにキーボードから入力
		int b = stdIn.nextInt();

		// aをbで割った余りが0ならば約数と表示
		if (a % b == 0)
			System.out.println("BはAの約数です。");
		// aをbで割った余りが0以外なら約数ではないと表示
		else
			System.out.println("BはAの約数ではありません");
	}
}
