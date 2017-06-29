/*
  演習14-3		クラスDVDPlayerを利用するプログラム例を作成
  演習日		6月29日
  製作者		玉利仁美
 */
package e_14_03;

//メインクラス
public class e_14_03 {
	// メインメソッド
	public static void main(String[] args) {
		// インターフェース型変数をDVDPlayerクラスのインスタンスを参照できるようにする
		ExPlayer dvdPlayOrStop = new DVDPlayer();

		// 再生させるメソッドを表示
		dvdPlayOrStop.play();

		// スロー再生させるメソッドを表示
		dvdPlayOrStop.slow();

		// 再生を止めるメソッドを表示
		dvdPlayOrStop.stop();

	}
}
