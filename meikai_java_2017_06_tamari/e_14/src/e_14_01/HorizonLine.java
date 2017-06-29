/*
  演習13-1		図形クラス群をテストするプログラムを作成。個々の要素をキーボードから取得できるように
  演習日		6月27日
  製作者		玉利仁美
 */
package e_14_01;

//横直線を生成するクラス
public class HorizonLine extends AbstLine {
	// 横直線を生成するためのコンストラクタ
	public HorizonLine(int length) {
		// 長さを引数として受け取る
		super(length);
	}

	// 水平直線であることとその長さの文字列を返すメソッド
	public String toString() {
		// 水平直線であること、長さの文字列を返却する
		return "HorizonLine(length:" + getLength() + ")";
	}

	// 横の直線を生成表示するメソッド
	public void draw() {
		// 長さに与えられた値の文だけ繰り返す
		for (int i = 0; i < getLength(); i++) {
			// ‐を表示する
			System.out.print('-');
		}
		// 改行する
		System.out.println();
	}
}
