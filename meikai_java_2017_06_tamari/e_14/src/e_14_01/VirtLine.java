/*
  演習13-1		図形クラス群をテストするプログラムを作成。個々の要素をキーボードから取得できるように
  演習日		6月27日
  製作者		玉利仁美
 */
package e_14_01;

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
