/*
  演習15-6		コマンドライン引数で与えられた半径をもつ円の円周の長さと面積を求めて表示するプログラム
  演習日		6月29日
  製作者		玉利仁美
 */
package e_15_06;

//メインクラス
public class e_15_06 {

	// メインメソッド
	public static void main(String[] args) {
		double[] circumference = new double[args.length];// 円周の長さ
		double[] circleArea = new double[args.length];// 円の面積

		// コマンドライン引数に与えられた長さだけ繰り返しを行う
		for (int i = 0; i < args.length; i++) {
			// 円周の配列i番目にコマンドライン引数から与えられた数値を使って円周を求める
			circumference[i] = (Float.parseFloat(args[i]) * 2) * Math.PI;
			// 面積の配列i番目にコマンドライン引数から与えられた数値を使って面積を求める
			circleArea[i] = (Float.parseFloat(args[i]) * Float.parseFloat(args[i])) * Math.PI;
		}
		// すべての入力された円の半径から求められた円周と面積を表示する
		for (int i = 0; i < args.length; i++) {
			// 円周の値を表示
			System.out.println("円周" + (i + 1) + "：" + circumference[i]);
			// 面積の値を表示
			System.out.println("面積" + (i + 1) + "：" + circleArea[i]);
		}
	}
}
