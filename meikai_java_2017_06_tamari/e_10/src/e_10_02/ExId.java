/*
  演習10-2		連番クラスIDに最後に与えた識別番号を返すクラスメソッドgitMaxExIdを追加。
  演習日		6月23日
  製作者		玉利仁美
 */
package e_10_02;

//識別番号を求めるクラス
public class ExId {

	private int id; // 識別番号を入れておくインスタンス変数
	private static int Counter = 0; // 何番までの識別番号を与えたかカウントしている変数
	private static int add = 1; // いくつずつ加えていくかの変数

	// インスタンスを生成する毎に識別番号を与えるコンストラクタ
	public ExId() {
		// idに識別番号を加えていくaddに何も変更がなければ1から与えられる
		id = Counter + add;
		// 何番までの識別番号を持っているのか求める
		Counter = Counter + add;
	}

	// 加えていく識別番号の値を設定するメソッド
	public void setAddIdNumber(int n) {
		// 識別番号に加える値を引数に受け取った値にする
		add = n;
	}

	// 識別番号の値を返すメソッド
	public int getId() {
		// 呼び出されたときidの値を返す
		return id;
	}

}
