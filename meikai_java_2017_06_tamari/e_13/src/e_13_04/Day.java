/*
  演習13-4		演習9－4で作成した人間クラスにjavadocコメントを与えるとともに、javadocツールによってドキュメントを作成せよ
  演習日		7月10日
  製作者		玉利仁美
 */
package e_13_04;

//日付のデータなどを入れ、曜日を判定するクラス
public class Day {
	/**
	 * @param 年のフィールドを初期化子の値で初期化する
	 */
	private int year = 1;
	/**
	 * @param 月のフィールドを初期化子の値で初期化する
	 */
	private int month = 1;
	/**
	 * @param 日のフィールドを初期化子の値で初期化する
	 */
	private int date = 1;

	/**
	 *  引数がない場合のコンストラクタ
	 */
	public Day() {
	}

	/**
	 *  引数が年だけの場合のコンストラクタ
	 * @param year 生年月日の年
	 */
	public Day(int year) {
		/**
		 *  年のフィールドに引数のyearを代入
		 */
		this.year = year;
	}

	/**
	 *  引数が年と月だけだった場合のコンストラクタ
	 * @param year 生年月日の年
	 * @param month 生年月日の月
	 */
	public Day(int year, int month) {
		/**
		 *  引数が年だけの時の年の値を呼び出している
		 */
		this(year);
		/**
		 *  月のフィールドに引数のmonthを代入
		 */
		this.month = month;
	}

	/**
	 *  年月日が引数の時のコンストラクタ
	 * @param year 生年月日の年
	 * @param month 生年月日の月
	 * @param date 生年月日の日
	 */
	public Day(int year, int month, int date) {
		/**
		 *  引数が年と月だけの時の年と月の値を呼び出している
		 */
		this(year, month);
		/**
		 *  日のフィールドに引数のdateを代入
		 */
		this.date = date;
	}

	/**
	 *  引数にインスタンスを持つコンストラクタ
	 *@param d 引数がDay型変数のコンストラクタ
	 */
	public Day(Day d) {
		/**
		 *  ほかのインスタンスのフィードの値を呼び出している
		 */
		this(d.year, d.month, d.date);
	}

	/**
	 *  年を取得するメソッド
	 * @return 年
	 */
	public int getYear() {
		/**
		 *  年の値を返す
		 */
		return year;
	}

	/**
	 *  月を取得するメソッド
	 * @return 月
	 */
	public int getMonth() {
		/**
		 *  月の値を返す
		 */
		return month;
	}

	/** 日を取得するメソッド
	 * @return 日
	 */
	public int getDate() {
		/**
		 *  日の値を返す
		 */
		return date;
	}

	/**
	 *  年の値を設定するメソッド
	 * @param year 年を設定
	 */
	public void setYear(int year) {
		/**
		 *  年のフィールドに引数を代入
		 */
		this.year = year;
	}

	/** 月の値を設定するメソッド
	 * @param month 月を設定
	 */
	public void setMonth(int month) {
		/**
		 * 月のフィールドに引数を代入
		 */
		this.month = month;
	}

	/** 日の値を設定するメソッド
	 * @param date 日を設定
	 */
	public void setDate(int date) {
		/**
		 * 日のフィールドに引数を代入
		 */
		this.date = date;
	}

	/**
	 *  年月日すべてまとめて設定するメソッド
	 * @param year 生年月日の年
	 * @param month 生年月日の月
	 * @param date 生年月日の日
	 */
	public void set(int year, int month, int date) {
		/** 年のフィールドに引数を代入
		 *
		 */
		this.year = year;
		/** 月のフィールドに引数を代入
		 *
		 */
		this.month = month;
		/** 日のフィールドに引数を代入
		 *
		 */
		this.date = date;
	}

	/**
	 *  曜日を判定するメソッド
	 * @return 曜日の値を返す
	 */
	public int dayOfWeek() {
		/**
		 *  繰り返し呼び出すことのないようyearの値を変数に保管しておく
		 */
		int y = year;
		/**
		 * 繰り返し呼び出すことのないようmonthの値を変数に保管しておく
		 */
		int m = month;
		/**
		 *  もし月の値が1または2の時
		 */
		if (m == 1 || m == 2) {
			/**
			 *  年を減らす
			 */
			y--;
			/** 月に12をプラスする
			 *
			 */
			m += 12;
		}
		/**
		 *  ツェラーの公式によって求められた値を返却する
		 */
		return (y + y / 4 - y / 100 + y / 400 + (13 * m + 8) / 5 + date) % 7;
	}

	/**
	 *  引数に受け取ったインスタンスの値が等しいかどうか判定するメソッド
	 * @param d 同じ日付かどうか判定する
	 * @return 正しいかどうか判定した結果を返す
	 */
	public boolean equalTo(Day d) {
		/**
		 *  それぞれのフィールドの値が等しいか等しくないかtrueかfalseで結果を返す
		 */
		return year == d.year && month == d.month && date == d.date;
	}

	/**
	 *  年月日と曜日をまとめて表示するメソッド
	 */
	public String toString() {
		/**
		 *  曜日が入った配列を用意
		 */
		String[] wd = { "日", "月", "火", "水", "木", "金", "土" };
		/**
		 *  各フィールドに入った値と曜日を判定するメソッドの値の配列の要素の値を表示する
		 */
		return String.format("%04d年%02d月%02d日(%s)", year, month, date, wd[dayOfWeek()]);
	}

}
