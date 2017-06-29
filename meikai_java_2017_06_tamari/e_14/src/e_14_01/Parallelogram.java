/*
  演習13-1		図形クラス群をテストするプログラムを作成。個々の要素をキーボードから取得できるように
  演習日		6月29日
  製作者		玉利仁美
 */
package e_14_01;

//平行四辺形を描画するプログラム
public class Parallelogram extends Shape implements Plane2D {
	// 平行四辺形の穂小幅
	private int width;
	// 平行四辺形の高さ
	private int height;

	// どの大きさの平行四辺形を作るのか横幅と高さを引数として受け取る
	public Parallelogram(int width, int height) {
		// 横幅を引数で代入
		this.width = width;
		// 高さを引数で代入
		this.height = height;
	}

	// 文字列を表示する
	public String toString() {
		// 平行四辺形の横幅と高さを表示
		return "Parallelogram(width:" + width + ",height:" + height + ")";
	}

	// 平行四辺形を実際に生成するメソッド
	public void draw() {
		// 高さの分繰り返し表示する
		for (int i = 0; i < height; i++) {
			// だんだんずらしていきたいので高さを回数で引いた分繰り返す
			for (int j = 0; j < height - i; j++) {
				// 空白を生成
				System.out.print(' ');
			}
			// 横幅分＃を生成したいので横幅の値だけ繰り返す
			for (int j = 0; j < width; j++) {
				// ＃を生成
				System.out.print('#');
			}
			// 一行分表示し終えたので改行
			System.out.println();
		}
	}

	// 面積を求めるメソッド
	public int getArea() {
		// 面積を返す
		return width * height;
	}
}