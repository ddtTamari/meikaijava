/*
  演習13-1		図形クラス群をテストするプログラムを作成。個々の要素をキーボードから取得できるように
  演習日		6月27日
  製作者		玉利仁美
 */
package e_13;

//図形を表示させる抽象クラス
public abstract class Shape {
	// 各サブクラスのtoStringメソッドで定義してもらう
	public abstract String toString();

	// 各サブクラスのdrawメソッドで定義してもらう
	public abstract void draw();

	// それぞれ定義してもらったものを表示するメソッド
	public void print() {
		// 定義されたtoStringの値を表示
		System.out.println(toString());
		// 各サブクラスで生成された図形を呼び出す
		draw();
	}
}
