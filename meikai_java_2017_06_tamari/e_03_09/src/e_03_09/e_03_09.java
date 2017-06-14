/*
 	演習3-9	2つの実数値の大きいほうの値を評価するプログラム
	制作日時	6月5日
	制作者	玉利仁美

*/
package e_03_09;

import java.util.Scanner;

public class e_03_09 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 2値のうち大きいほうの値を判定するプログラムの、一つ目の実数aの入力を促す
		System.out.print("実数a:");
		// 一つ目の実数の値をキーボードから取得する
		double decimalA = scan.nextDouble();
		// 2値のうち大きいほうの値を判定するプログラムの、二つ目の実数bの入力を促す
		System.out.print("実数b:");
		// 二つ目の実数の値をキーボードから取得する
		double decimalB = scan.nextDouble();


		//一つ目と二つ目の値を比べ一つ目が大きければ一つ目の値を、二つ目が大きければ二つ目の値を最大値という変数に代入する
		double max = decimalA > decimalB ? decimalA : decimalB;
		//大きいほうの値を表示する
		System.out.println(max);
		//ストリームを解放
		scan.close();
	}

}
