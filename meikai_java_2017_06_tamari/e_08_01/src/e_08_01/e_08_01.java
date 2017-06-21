/*
  演習8-1		名前・身長・体重などをメンバとして持つ《人間クラス》を作成せよ(フィールドやメソッドなどは自分で自由に設計すること)
  演習日		6月21日
  製作者		玉利仁美
 */
package e_08_01;

public class e_08_01 {
	// メインメソッド
	public static void main(String[] args) {

		// 畠山のインスタンスを以下の値で初期化する
		HumanClass hatakeyama = new HumanClass("畠山和洋", 34, "男", "日本", 180.0f, 96.0f);
		// バレンティンのインスタンスを以下の値で初期化する
		HumanClass balentien = new HumanClass("ウラディミール・バレンティン", 32, "男", "オランダ", 185.0f, 100.0f);
		// 吉田のインスタンスを以下の値で初期化する
		HumanClass yoshida = new HumanClass("吉田沙保里", 34, "女", "日本", 156.0f, 55.0f);

		// hatakeyamaのインスタンス変数の値を表示するメソッドを呼び出す
		hatakeyama.putHumanSpec();
		// balentienのインスタンス変数の値を表示するメソッドを呼び出す
		balentien.putHumanSpec();
		// yoshidaのインスタンス変数の値を表示するメソッドを呼び出す
		yoshida.putHumanSpec();

	}
}
