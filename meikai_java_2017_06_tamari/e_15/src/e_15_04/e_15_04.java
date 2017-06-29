/*
  演習15-4		浮動小数点数値xを表数点以下の部分をｐ桁で全体を少なくともw桁で表示するメソッドprintDouble
  演習日		6月29日
  製作者		玉利仁美
 */
package e_15_04;

//キーボードから入力できるようスキャナークラスをインポート
import java.util.Scanner;

//メインクラス
public class e_15_04 {
	// メインメソッド
	public static void main(String[] args) {
		// キーボードから入力できるよう宣言
		Scanner scan = new Scanner(System.in);
		// 表示させる浮動小数の入力を求める
		System.out.print("浮動小数：");
		// 浮動小数をキーボードから取得
		double decimal = scan.nextDouble();
		// 小数点以下の部分を何桁で表示するかの入力を促す
		System.out.print("小数点以下の部分：");
		// 小数点以下の表示桁数をキーボードから取得
		int decimalPoint = scan.nextInt();
		// 浮動小数を全体で何桁で表示するのか入力を促す
		System.out.print("全体を何桁で：");
		// 全体の桁数をキーボードから取得
		int allDigits = scan.nextInt();

		// printDoubleのメソッドを引数を入力した値にして呼び出す
		printDouble(decimal, decimalPoint, allDigits);

		// ストリームを解放する
		scan.close();
	}

	// 浮動小数を小数点以下の桁数全体の桁数を指定して表示するメソッド
	public static void printDouble(double x, int p, int w) {
		// 最低でも小数点以下をpで全体をｗで浮動小数wを表示させる
		System.out.printf(String.format("%%%d.%df", w, p), x);
	}
}
