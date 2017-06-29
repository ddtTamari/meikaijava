/*
  演習14-3		クラスDVDPlayerを利用するプログラム例を作成
  演習日		6月29日
  製作者		玉利仁美
 */
package e_14_03;

//playerインターフェースのサブインターフェース
public interface ExPlayer extends Player {
	//スロー再生メソッドを追加
	void slow();
}
