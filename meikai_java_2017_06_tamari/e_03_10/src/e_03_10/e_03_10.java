/*
 	演習3-10	2つの整数値を読み込みそれらの差を表示する
	制作日時	6月6日
	制作者	玉利仁美

*/
package e_03_10;

import java.util.Scanner;

public class e_03_10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 値の差を求める2値のうちの一つ目の入力を促す
		System.out.print("実数a:");
		// 値の差を求める、2値のうちの一つ目の値をキーボードから取得
		int integerA = scan.nextInt();
		// 値の差を求める2値のうちの二つ目の入力を促す
		System.out.print("実数b：");
		// 値の差を求める、2値のうちの二つ目の値をキーボードから取得
		int integerB = scan.nextInt();

		// 二つの値の差を求めるため、2値を引き算し、差という変数に代入
		int difference = integerA - integerB;
		// 2値の差を表示する
		System.out.println(difference);
		// ストリームを解放する
		scan.close();

	}

}
