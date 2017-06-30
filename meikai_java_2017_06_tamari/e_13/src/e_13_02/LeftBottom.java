/*
  演習13-2		図形クラス群に対して、直角二等辺三角形を表すクラス群を追加せよ。
  				直角二等辺三角形を表す抽象クラスを作りそこから個々のクラスを派生して作ること。
  演習日		6月30日
  製作者		玉利仁美
 */
package e_13_02;

//左下が直角の二等辺三角形を生成するクラス
public class LeftBottom extends AbstractIsoscelesRightTriangle {
	// 左下が直角の二等辺三角形を生成するためのコンストラクタ
	public LeftBottom(int length) {
		// 親クラスのメンバ
		super(length);
	}

	// 左下が直角の二等辺三角形であると表示するメソッド
	public String toString() {
		// 左下が直角の二等辺三角形であることと辺の長さを表示
		return "LeftButtom(length:" + getLength() + ")";
	}

	// 左下が直角の二等辺三角形を生成するメソッド
	public void draw() {
		// iがｎ以下の時繰り返し、一つずつ増やす
		for (int i = 0; i < getLength(); i++) {
			// 空白をｎ－1個生成する
			for (int j = 0; j < i + 1; j++) {
				// 空白を生成
				System.out.print("*");
			}
			// 改行する
			System.out.println();
		}

	}
}
