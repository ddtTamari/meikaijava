/*
  演習9-3		第8章で作成した銀行口座クラスに口座開設日のフィールドとtoStringメソッドを追加
  演習日		6月22日
  製作者		玉利仁美
 */
package e_09_03;

//日付のデータなどを入れているクラス
public class Day {
	// 年のフィールドを初期化子の値で初期化する
	private int year = 1;
	// 月のフィールドを初期化子の値で初期化する
	private int month = 1;
	// 日のフィールドを初期化子の値で初期化する
	private int date = 1;

	// 引数がない場合のコンストラクタ
	public Day() {
	}

	// 引数が年だけの場合のコンストラクタ
	public Day(int year) {
		// 年のフィールドに引数のyearを代入
		this.year = year;
	}

	// 引数が年と月だけだった場合のコンストラクタ
	public Day(int year, int month) {
		// 引数が年だけの時の年の値を呼び出している
		this(year);
		// 月のフィールドに引数のmonthを代入
		this.month = month;
	}

	// 年月日が引数の時のコンストラクタ
	public Day(int year, int month, int date) {
		// 引数が年と月だけの時の年と月の値を呼び出している
		this(year, month);
		// 日のフィールドに引数のdateを代入
		this.date = date;
	}

	// 引数にインスタンスを持つコンストラクタ
	public Day(Day d) {
		// ほかのインスタンスのフィードの値を呼び出している
		this(d.year, d.month, d.date);
	}

	// 年を取得するメソッド
	public int getYear() {
		// 年の値を返す
		return year;
	}

	// 月を取得するメソッド
	public int getMonth() {
		// 月の値を返す
		return month;
	}

	// 日を取得するメソッド
	public int getDate() {
		// 日の値を返す
		return date;
	}

	// 年の値を設定するメソッド
	public void setYear(int year) {
		// 年のフィールドに引数を代入
		this.year = year;
	}

	// 月の値を設定するメソッド
	public void setMonth(int month) {
		// 月のフィールドに引数を代入
		this.month = month;
	}

	// 日の値を設定するメソッド
	public void setDate(int date) {
		// 日のフィールドに引数を代入
		this.date = date;
	}

	// 年月日すべてまとめて設定するメソッド
	public void set(int year, int month, int date) {
		// 年のフィールドに引数を代入
		this.year = year;
		// 月のフィールドに引数を代入
		this.month = month;
		// 日のフィールドに引数を代入
		this.date = date;
	}

	// 曜日を判定するメソッド
	public int dayOfWeek() {
		// 繰り返し呼び出すことのないようyearの値を変数に保管しておく
		int y = year;
		// 繰り返し呼び出すことのないようmonthの値を変数に保管しておく
		int m = month;
		// もし月の値が1または2の時
		if (m == 1 || m == 2) {
			// 年を減らす
			y--;
			// 月に12をプラスする
			m += 12;
		}
		// ツェラーの公式によって求められた値を返却する
		return (y + y / 4 - y / 100 + y / 400 + (13 * m + 8) / 5 + date) % 7;
	}

	// 引数に受け取ったインスタンスの値が等しいかどうか判定するメソッド
	public boolean equalTo(Day d) {
		// それぞれのフィールドの値が等しいか等しくないかtrueかfalseで結果を返す
		return year == d.year && month == d.month && date == d.date;
	}

	// 年月日と曜日をまとめて表示するメソッド
	public String toString() {
		// 曜日が入った配列を用意
		String[] wd = { "日", "月", "火", "水", "木", "金", "土" };
		// 各フィールドに入った値と曜日を判定するメソッドの値の配列の要素の値を表示する
		return String.format("%04d年%02d月%02d日(%s)", year, month, date, wd[dayOfWeek()]);
	}

}
