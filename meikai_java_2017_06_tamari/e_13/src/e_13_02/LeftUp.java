/*
  演習13-2		図形クラス群に対して、直角二等辺三角形を表すクラス群を追加せよ。
  				直角二等辺三角形を表す抽象クラスを作りそこから個々のクラスを派生して作ること。
  演習日		6月30日
  製作者		玉利仁美
 */
package e_13_02;

//左上が直角の二等辺三角形を生成するクラス
public class LeftUp extends AbstractIsoscelesRightTriangle {
	// 左上が直角の二等辺三角形を生成するためのコンストラクタ
	public LeftUp(int length) {
		// 親クラスのメンバを参照
		super(length);
	}

	// 左上が直角の二等辺三角形であることを表示するメソッド
	public String toString() {
		// 左下が直角の二等辺三角形であることと、一辺の長さを表示
		return "LeftUp(length:" + getLength() + ")";
	}

	// 左上が直角の二等辺三角形を生成する
	public void draw() {
		{// 直角が左上の三角
			// iがｎ以下の時繰り返す、そのたびiは1増える
			for (int i = 1; i <= getLength(); i++) {
				// jがiより大きい時繰り返す、そのたびjは1減る
				for (int j = getLength(); j >= i; j--) {
					System.out.print('*');
				}
				// 改行する
				System.out.println();
			}
		}

	}
}
