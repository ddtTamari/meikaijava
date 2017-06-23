/*
  演習10-1		連番クラスIDに最後に与えた識別番号を返すクラスメソッドgitMaxIdを追加。
  演習日		6月23日
  製作者		玉利仁美
 */
package e_10_01;

//識別番号を確認するクラス
public class Id {
	// 何番の識別番号を与えたかを判定する
	static int counter = 0;

	// 識別番号を格納するフィールド
	private int id;

	// 識別番号フィールドに呼び出されるたび識別番号を増やしていくコンストラクタ
	public Id() {
		// idに1から識別番号を代入していく
		id = ++counter;
	}

	// idの番号を返すメソッド
	public int getId() {
		// そのインスタンスが作られた番号を返す
		return id;
	}

	// 今何個のインスタンスが作られているのかを返すメソッド
	static int getMaxId() {
		// インスタンスが作られるたびにcounterが増えていくのでcounterの値が最大の識別番号なのでcounterを返す
		return counter;
	}

}
