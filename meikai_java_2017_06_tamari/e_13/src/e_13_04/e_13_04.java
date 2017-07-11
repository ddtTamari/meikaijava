/*
 *演習13-4		演習9－4で作成した人間クラスにjavadocコメントを与えるとともに、javadocツールによってドキュメントを作成せよ
 *演習日		7月10日
 * 製作者		玉利仁美
 *
 * @author 玉利仁美
 */
package e_13_04;

public class e_13_04 {


	/**
	 * メインメソッド
	 */
	public static void main(String[] args) {
		/**
		 * 畠山のインスタンスを以下の値で生成する
		 */
		HumanClass hatakeyama = new HumanClass("畠山和洋", 34, "男", "日本", 180.0f, 96.0f, new Day(1982, 9, 13));
		/**
		 * バレンティンのインスタンスを以下の値で生成する
		 */
		HumanClass balentien = new HumanClass("ウラディミール・バレンティン", 32, "男", "オランダ", 185.0f, 100.0f, new Day(1984, 7, 2));
		/**
		 * 吉田のインスタンスを以下の値で生成する
		 */
		HumanClass yoshida = new HumanClass("吉田沙保里", 34, "女", "日本", 156.0f, 55.0f, new Day(1982, 10, 5));

		/**
		 * hatakeyamaのインスタンス変数の値を表示するメソッドを呼び出す
		 */
		hatakeyama.putHumanSpec();
		/**
		 * balentienのインスタンス変数の値を表示するメソッドを呼び出す
		 */
		balentien.putHumanSpec();
		/**
		 * yoshidaのインスタンス変数の値を表示するメソッドを呼び出す
		 */
		yoshida.putHumanSpec();
	}
}
