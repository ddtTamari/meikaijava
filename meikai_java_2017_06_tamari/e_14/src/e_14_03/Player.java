/*
  演習14-3		クラスDVDPlayerを利用するプログラム例を作成
  演習日		6月29日
  製作者		玉利仁美
 */
package e_14_03;
//再生と終了のインターフェース
public interface Player {
	//プレイメソッド、実態は各インターフェースを実装しているクラス内にある
	void play();
	//プレイメソッド、実態は各インターフェースを実装しているクラス内にある
	void stop();
}
