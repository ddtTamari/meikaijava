/*
  演習15-7		List15-15のfor文を拡張for文で実現したプログラムを作成せよ。
  演習日		6月29日
  製作者		玉利仁美
 */
package e_15_07;

//メインクラス
public class e_15_07 {

	// メインメソッド
	public static void main(String[] args) {
		// 合計を入れておく変数
		double sum = 0.0;
		// argsの各要素を一つずつ走査していく
		for (String s : args) {
			// argsの各要素を足していく
			sum += Double.parseDouble(s);
		}
		// 合計を表示する
		System.out.println("合計は" + sum + "です。");
	}

}
