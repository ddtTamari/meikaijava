/*
  演習15-8		コマンドライン引数で指定された月のカレンダーを表示するプログラムを作成せよ。コマンドラインから年のみが与えられた場合は、その年の1月から１２月までの
  				カレンダーを表示して、年と月が与えられた場合は、その月のカレンダーを表示して、年も月も与えられなかったら、現在の月のカレンダーを表示すること。
  演習日		7月28日
  製作者		玉利仁美
 */
package e_15_08;

import java.util.Calendar;

//カレンダーを表示させるクラス
public class DisplayCalendar {
	// カレンダークラス型の変数を用意し、カレンダークラスのメソッドを使えるようにする
	Calendar calenderDisplay = Calendar.getInstance();
	// 任意の年のフィールド
	private int mImputYear;
	// 任意の月のフィールド
	private int mImputMonth;

	// コンストラクタ
	public DisplayCalendar() {
		// 現在の月を取得する
		this.mImputMonth = calenderDisplay.get(Calendar.MONTH);
		// 現在の年を取得する
		this.mImputYear = calenderDisplay.get(Calendar.YEAR);
	}

	// 引数がないときは現在日時でのカレンダーを表示するメソッド
	public void whatTypeCalendarPrint() {
		// 現在の月を設定する
		calenderDisplay.set(Calendar.MONTH, mImputMonth);
		// 現在の年を設定する
		calenderDisplay.set(Calendar.YEAR, mImputYear);
		// 現在の月を表示する、その時カレンダーを見やすくするために日付の真ん中の位置になるよう調整
		System.out.printf("%11d\n", (mImputMonth + 1));
		// 日付を表示させるメソッドを呼び出す
		printCalenderDate();
	}

	// 年のみ与えられた時のメソッド
	public void whatTypeCalendarPrint(int imputYear) {
		// カレンダークラスの年を与えられた年で設定させる
		calenderDisplay.set(Calendar.YEAR, imputYear);
		// 1月から12月まで表示させたいので12回繰り返す
		for (int i = 0; i < Constant.HOW_MANY_MONTH_IN_YEAR; i++) {
			// 1月から表示させたいのでインデックス番号で月を設定させる
			calenderDisplay.set(Calendar.MONTH, i);
			// 何月のカレンダーなのか表示させる、その時カレンダーを見やすくするために日付の真ん中の位置になるよう調整
			System.out.printf("%11d\n", (i + Constant.ARRAY_NUMBER_ADJUSTMENT_REAL_NUMBER));
			// 日付を表示させるメソッドを呼び出す
			printCalenderDate();
		}
	}

	// 年と月を与えられた時のメソッド
	public void whatTypeCalendarPrint(int mImputYear, int mImputMonth) {
		// 与えられた引数の年を設定する
		calenderDisplay.set(Calendar.YEAR, mImputYear);
		// 与えられた引数の月を設定する
		calenderDisplay.set(Calendar.MONTH, mImputMonth);
		// 表示するカレンダーの月を表示させる、その時日付の中心に月が表示するよう11桁で表示
		System.out.printf("%11d\n", (mImputMonth + Constant.ARRAY_NUMBER_ADJUSTMENT_REAL_NUMBER));
		// 日付を表示するメソッドを呼び出す
		printCalenderDate();

	}

	// 日付を表示させるメソッド
	public void printCalenderDate() {
		// 現在の日付だと、指定した月の最大日より多い日付の時、月が替わってしまうので日付を１日で設定する
		calenderDisplay.set(Calendar.DATE, Constant.THE_FIRST_DAY_OF_MONTH);
		// 指定した月の最初の日が何曜日なのか求める
		int whatFirstWeekThisMonth = calenderDisplay.get(Calendar.DAY_OF_WEEK);
		// その月の最大日は何日なのか求める
		int theMonthLastDay = calenderDisplay.getActualMaximum(Calendar.DATE);
		// 日付を入れておく配列を指定した月の日付分の要素数で生成
		int[] howManyDay = new int[theMonthLastDay];

		// 各要素に日付を入れたいので日付分繰り返す
		for (int i = 0; i < theMonthLastDay; i++) {
			// 各要素に日付を代入
			howManyDay[i] = i + 1;
		}
		// 曜日を合わせたいので月始まりの曜日までの日付分の空白を生成するため繰り返す
		for (int i = 0; i < whatFirstWeekThisMonth - Constant.ARRAY_NUMBER_ADJUSTMENT_REAL_NUMBER; i++) {
			// 日付を3桁で表しているので繰り返すたび3つの空白を生成
			System.out.print("   ");
		}
		// 最大日まで表示したいので最大日分繰り返す
		for (int i = 0; i < theMonthLastDay; i++) {
			// 日付を一日ずつ設定しなおす
			calenderDisplay.set(Calendar.DATE, howManyDay[i]);
			// 日付を表示、その時そろえるため最低でも3桁で表示
			System.out.printf("%3d", howManyDay[i]);
			// 曜日が土曜日まで来たら改行を行う
			if (calenderDisplay.get(Calendar.DAY_OF_WEEK) == Constant.THE_LAST_WEEK_DATE) {
				// 改行する
				System.out.println();
			}
		}
		// すべての日付を表示したら改行を行う
		System.out.println();
	}

}