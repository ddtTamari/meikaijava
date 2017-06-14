/*
 	演習2-5	二つの実数値をキーボードから読み込みその和と平均を求める
	制作日時	6月5日
	制作者	玉利仁美

*/
package e_02_05;

import java.util.Scanner;

public class e_02_05 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		// 合計と平均を求める2値のうち一つ目の値の入力を促す
		System.out.print("xの値：");
		// 2値のうちの一つ目の値をキーボードから取得
		double decimalX = stdIn.nextDouble();
		// 合計と平均を求める2値のうち二つ目の値の入力を促す
		System.out.print("yの値：");
		// 2値のうちの二つ目の値をキーボードから取得
		double decimalY = stdIn.nextDouble();

		// キーボードから得た2値の合計を求め表示
		System.out.println("合計は" + (decimalX + decimalY) + "です。");
		// キーボードから得た2値の平均を計算し表示
		System.out.println("平均は" + (decimalX + decimalY) / 2 + "です。");
		//ストリームを解放する
		stdIn.close();
	}
}
