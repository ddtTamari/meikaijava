/*
  演習13-3 		じゃんけんのプレーヤを表す抽象クラスを定義せよ。そのクラスから以下のクラスを派生すること。
  演習日		6月30日
  製作者		玉利仁美
 */
package e_15_05;

//人やコンピューターを表す抽象クラス
public abstract class AllPlayer {

	// 手の形をとる抽象メソッド
	public abstract int getHandShape();

	// 何の手が出されたか表示する抽象メソッド
	public abstract void displayHandShape();

}
