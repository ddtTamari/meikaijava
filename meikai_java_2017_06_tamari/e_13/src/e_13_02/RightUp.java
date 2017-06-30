/*
  演習13-2		図形クラス群に対して、直角二等辺三角形を表すクラス群を追加せよ。
  				直角二等辺三角形を表す抽象クラスを作りそこから個々のクラスを派生して作ること。
  演習日		6月30日
  製作者		玉利仁美
 */
package e_13_02;

//右上が直角の二等辺三角形を生成するクラス
public class RightUp extends AbstractIsoscelesRightTriangle {
	// 右上が直角の二等辺三角形を生成するためのコンストラクタ
	public RightUp(int length) {
		// 親クラスのメンバを参照
		super(length);
	}

	// 右上が直角の二等辺三角形であることを表示するメソッド
	public String toString() {
		// 右上が直角の二等辺三角形であることと長さの値を表示する
		return "RightUp(length:" + getLength() + ")";
	}

	// 右上が直角の二等辺三角形を生成する
	public void draw() {
		{// 直角が右上の三角
			// n回繰り返す
			for (int i = 1; i <= getLength(); i++) {
				// jがiより少ないとき空白を生成
				for (int j = 1; j < i; j++) {
					// 空白を生成する
					System.out.print(' ');
				}
				// *をjがｎより小さい間生成する
				for (int j = i; j <= getLength(); j++) {
					// *を生成する
					System.out.print("*");
				}
				// 改行する
				System.out.println();
			}
		}
	}
}
