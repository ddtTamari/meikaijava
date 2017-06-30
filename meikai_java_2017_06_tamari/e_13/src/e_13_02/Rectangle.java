/*
  演習13-1		図形クラス群をテストするプログラムを作成。個々の要素をキーボードから取得できるように
  演習日		6月27日
  製作者		玉利仁美
 */
package e_13_02;

//四角形を生成するクラス
public class Rectangle extends Shape {
	// 横の長さを格納するフィールド
	private int width;
	// 縦の長さを格納するフィールド
	private int height;

	// 引数として生成する際長さと高さを引数として受け取るコンストラクタ
	public Rectangle(int width, int height) {
		// 横幅フィールドを引数を代入する
		this.width = width;
		// 縦フィールドを引数を代入する
		this.height = height;
	}

	// 四角であることと縦横の値を返すメソッド
	public String toString() {
		// 四角の図形で縦横の値を返却するメソッド
		return "Rectangle(width:" + width + ",height:" + height + ")";
	}

	// 長方形を表示する
	public void draw() {
		// 高さの分だけ繰り返し行う
		for (int i = 1; i <= height; i++) {
			// 横の分だけ繰り返し行う
			for (int j = 1; j <= width; j++) {
				// ＊を表示する
				System.out.print('*');
			}
			// 改行する
			System.out.println();
		}
	}

}
