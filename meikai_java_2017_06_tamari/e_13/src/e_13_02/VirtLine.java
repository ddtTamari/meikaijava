/*
  演習13-2		図形クラス群に対して、直角二等辺三角形を表すクラス群を追加せよ。
  				直角二等辺三角形を表す抽象クラスを作りそこから個々のクラスを派生して作ること。
  演習日		6月30日
  製作者		玉利仁美
 */
package e_13_02;

//垂直線を生成するクラス
public class VirtLine extends AbstLine {
	// 長さを引数として受け取るコンストラクタ
	public VirtLine(int length) {
		// 長さを引数で受け取った値にする
		super(length);
	}

	// 垂直線であることと長さを表示するメソッド
	public String tostring() {
		// 垂直線であることと長さの値を返却する
		return "VirtLine(length:" + getLength() + ")";
	}

	// 垂直線を表示する
	public void draw() {
		// 長さの分だけ表示を行うので長さ数分繰り返し行う
		for (int i = 0; i < getLength(); i++) {
			// 一行ごとに｜を表示する
			System.out.println('|');
		}
	}

}
