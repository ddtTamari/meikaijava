/*
  演習13-2		図形クラス群に対して、直角二等辺三角形を表すクラス群を追加せよ。
  				直角二等辺三角形を表す抽象クラスを作りそこから個々のクラスを派生して作ること。
  演習日		6月30日
  製作者		玉利仁美
 */
package e_13_02;

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
