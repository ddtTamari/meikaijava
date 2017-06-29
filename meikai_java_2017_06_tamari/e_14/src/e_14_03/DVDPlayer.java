/*
  演習14-3		クラスDVDPlayerを利用するプログラム例を作成
  演習日		6月29日
  製作者		玉利仁美
 */
package e_14_03;

//インターフェースを実装しているクラス
public class DVDPlayer implements ExPlayer {

	// インターフェースに定義されてるメソッドの実装部分
	@Override
	public void play() {
		// 再生したことを表示
		System.out.println("■DVD再生開始！");
	}

	// インターフェースに定義されてるメソッドの実装部分
	public void stop() {
		//終了させたことを表示
		System.out.println("■DVD再生終了！");
	}

	// インターフェースに定義されてるメソッドの実装部分
	public void slow() {
		//スローで再生したことを表示
		System.out.println("■DVDスロー再生開始！");
	}

}
