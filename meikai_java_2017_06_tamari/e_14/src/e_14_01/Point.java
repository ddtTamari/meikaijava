/*
  演習13-1		図形クラス群をテストするプログラムを作成。個々の要素をキーボードから取得できるように
  演習日		6月27日
  製作者		玉利仁美
 */
package e_14_01;

//ポイントを表示させるshapeのサブクラス
public class Point extends Shape {
	// 表示させるものは一つしかないので引数を受け取らない
	public Point() {
	}

	// Pointであることを明示するメソッド
	public String toString() {
		// Pointという文字列を返す
		return "Point";
	}

	// 図形を表示するメソッド
	public void draw() {
		// ＋を一つ表示する
		System.out.println('+');
	}
}
