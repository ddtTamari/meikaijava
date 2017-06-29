/*
  演習13-1		図形クラス群をテストするプログラムを作成。個々の要素をキーボードから取得できるように
  演習日		6月29日
  製作者		玉利仁美
 */
package e_14_01;

//sharpクラスから派生した平行線か垂直線どちらかで定義される抽象クラス
public abstract class AbstLine extends Shape {
	// 平行線でも垂直線でも長さが必要なのでフィールドを準備しておく
	private int length;

	// 直線を生成するコンストラクタ
	public AbstLine(int length) {
		// 引数に渡された値で長さを設定する
		setLength(length);
	}

	// 長さの値を取得するメソッド
	public int getLength() {
		// 長さを返す
		return length;
	}

	// 引数に渡された値で長さを設定するメソッド
	public void setLength(int length) {
		// フィールドに引数に渡された長さを代入する
		this.length = length;
	}

	// 直線の長さを表示するメソッド
	public String toString() {
		// 直線であることと長さの値を表示する
		return "AbstLine(length:" + length + ")";
	}
}
