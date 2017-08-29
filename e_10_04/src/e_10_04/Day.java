/*
  演習10-4		Dayクラスに14個のメソッドを追加しなさい。
  演習日		8月22日
  製作者		玉利仁美
 */
package e_10_04;

import static java.util.Calendar.*;

import java.util.Calendar;
import java.util.GregorianCalendar;

//日付を扱うクラス
public class Day {
	// 日付についてのメソッドを作るのでカレンダークラスを準備する
	GregorianCalendar calendarDate = new GregorianCalendar();

	// 現在の年でフィールドを初期化しておく
	private int mYear = calendarDate.get(YEAR);
	// 現在の月でフィールドを初期化しておく
	private int mMonth = calendarDate.get(MONTH);// + Constant.ADJUST_MONTH;
	// 現在の日にちでフィールドを初期化しておく
	private int mDate = calendarDate.get(DATE);

	// 次の日の年を格納するためのフィールドを準備する
	private int mNextDayYear;
	// 次の日の月を格納するためのフィールドを準備する
	private int mNextDayMonth;
	// 次の日の日付を格納するためのフィールドを準備する
	private int mNextDayDate;

	// 前日の年を格納するためのフィールドを準備する
	private int mYesterDayYear;
	// 前日の月を格納するためのフィールドを準備する
	private int mYesterDayMonth;
	// 前日の日付を格納するためのフィールドを準備する
	private int mYesterDayDate;

	// 特定の日付後の年を格納するためのフィールドを準備する
	private int mAfterArgumentYear;
	// 特定の日付後の月を格納するためのフィールドを準備する
	private int mAfterArgumentMonth;
	// 特定の日付後の日を格納するためのフィールドを準備する
	private int mAfterArgumentDate;
	// 何日後の日付なのかすべての与えられた年月日に適用するため静的フィールドで準備する
	static private int sHowManyAfterDay;

	// 特定の日付前の年を格納するためのフィールドを準備する
	private int mBeforeArgumentYear;
	// 特定の日付前の月を格納するためのフィールドを準備する
	private int mBeforeArgumentMonth;
	// 特定の日付前の日を格納するためのフィールドを準備する
	private int mBeforeArgumentDate;
	// 何日前の日付なのかすべての与えられた年月日に適用するため静的フィールドで準備する
	static private int sHowManyBeforeDay;

	//////////////////// コンストラクタ/////////////////////
	// 引数が何も与えられてない場合は、初期化子のまま
	public Day() {
	}

	// 年だけを与えられた場合はその年のみで他は現在の日付で行う
	public Day(int year) {
		// フィールドを与えられた年に変える
		this.mYear = year;
	}

	// 年と月のみ与えられた場合その年と月に変える
	public Day(int year, int month) {
		// 与えられた年をフィールドに代入
		this(year);
		// もし与えられた月が12より大きければ
		if (month > Constant.MAX_MONTH_OF_YEAR) {
			// 12を代入
			this.mMonth = Constant.MAX_MONTH_OF_YEAR - Constant.ADJUST_MONTH;
			// 与えられた月が1より小さければ
		} else if (month < Constant.MIN_MONTH_OF_YEAR - Constant.ADJUST_MONTH) {
			// 1を代入
			this.mMonth = Constant.MIN_MONTH_OF_YEAR - Constant.ADJUST_MONTH;
			// それ以外ならば
		} else {
			// 与えられた月をそのまま代入
			this.mMonth = month - Constant.ADJUST_MONTH;
		}
	}

	// 年月日すべて与えられた場合のコンストラクタ
	public Day(int year, int month, int date) {
		// 与えられた年月を代入
		this(year, month);
		// もし与えられた日付が1より小さければ
		if (date < Constant.FIRST_DAY_OF_MONTH) {
			// 日付に1を代入
			this.mDate = Constant.FIRST_DAY_OF_MONTH;
			// もし与えられた日付がその月の最大日よりも大きければ
		} else if (date > getMonthMaxDate(month)) {
			// その月の最大日を代入
			this.mDate = getMonthMaxDate(month);
			// それ以外ならば
		} else {
			// 与えられた日付そのまま代入
			this.mDate = date;
		}
	}

	// Dayクラスが引数の時のコンストラクタ
	public Day(Day d) {
		// それぞれの年月日で代入
		this(d.mYear, d.mMonth, d.mDate);
	}

	///////////////////////////////////////////////////////

	// 作ったメソッドの結果を表示するメソッド
	public void print() {
		// 入力された日付を表示する
		System.out.println("日にち：" + mYear + "/" + mMonth + "/" + mDate);
		// 年内の経過日数を表示する
		System.out.println("年内経過日数：" + elapsedDays(mMonth));
		// 年内の残り日数を表示する
		System.out.println("年内残り日数：" + remainingDays());
		// 次の日に日付を表示するメソッドを呼び出す
		whatNextDate();
		// 前日の日付を表示するメソッド
		whatYesterDate();
		// 入力された数字後の日付を表示するメソッド
		whatAfterArgumentDate();
		// 入力された数字分前の日付を表示するメソッド
		whatBeforeArgumentDate();
		// 見やすくするために改行する
		System.out.println();
	}

	// 指定された月の最大日を返すメソッド
	public int getMonthMaxDate(int month) {
		// 年をフィールドの年に設定する
		calendarDate.set(YEAR, this.mYear);
		// 月を引数として与えられた月で設定する
		calendarDate.set(MONTH, month + Constant.ADJUST_MONTH);
		// 現在の日付が与えられた月の最大日数より多きい場合次の月になってしまうので1日に設定する
		calendarDate.set(DATE, Constant.FIRST_DAY_OF_MONTH);
		// 与えられた月の最大日数を求める
		int theMaxDayOfMonth = calendarDate.getActualMaximum(DATE);
		// 与えられた月の最大日数を返す
		return theMaxDayOfMonth;
	}

	// その年の経過日数を返すメソッド
	public int elapsedDays(int month) {
		// 現在の日付を代入する
		int howManyDaysElapsed = mDate;
		// 12月じゃないとき
		if (month != Constant.MAX_MONTH_OF_YEAR) {
			// 与えられた月の分繰り返す
			for (int i = Constant.INDEX_NUMBER_DEFAULT; i < month; i++) {
				// 与えられた月－1の月までその月々の最大日を加える
				howManyDaysElapsed += getMonthMaxDate(i);
			}
			// 12月の時
		} else {
			// 11月分まで繰り返したいので月の値を調整し繰り返す
			for (int i = Constant.INDEX_NUMBER_DEFAULT; i < month - Constant.ADJUST_MONTH; i++) {
				// 11月までの与えられた月の最大日を加える
				howManyDaysElapsed += getMonthMaxDate(i);
			}
		}
		// 経過日数を返す
		return howManyDaysElapsed;
	}

	// 指定された年の最大日数を求める返すメソッド
	public int howManyTheYearMaxDate() {
		// 指定された年の合計日数を入れるための変数を準備する
		int howManyTheYearAllDate = Constant.DEFAULT_NUMBER;
		// 12月分繰り返す
		for (int i = Constant.INDEX_NUMBER_DEFAULT; i < Constant.MAX_MONTH_OF_YEAR; i++) {
			// インデックスナンバーの月の最大日数を加える
			howManyTheYearAllDate += getMonthMaxDate(i);
		}
		// その年の合計日数を返す
		return howManyTheYearAllDate;
	}

	// 残り日数を返すメソッド
	public int remainingDays() {
		// どれだけ残っているかを表す変数
		int howManyRemainingDays;
		// 年の合計日数から経過日数を引く
		howManyRemainingDays = howManyTheYearMaxDate() - elapsedDays(mMonth);
		// 残り日数を返す
		return howManyRemainingDays;
	}

	// 二つの日付の前後関係を求めるメソッド
	public void checkBeforeAfterSame(Day checkDateAfterOrBeforeOne, Day checkDateAfterOrBeforeTwo) {
		// ストリング配列を準備して前の日付か、同じ日付か、後の日付かの文言を準備しておく
		String checkDateAfterOrBeforeString[] = { "より前の日付", "と同じ日付", "より後の日付" };
		// ストリングの要素番号を入れておくための変数
		int checkIndexNumber = Constant.INDEX_NUMBER_DEFAULT;
		// 一つ目の日付の年を入れておく変数
		int checkYearOne = checkDateAfterOrBeforeOne.mYear;
		// 一つ目の日付の月を入れておく変数
		int checkMonthOne = checkDateAfterOrBeforeOne.mMonth;
		// 一つ目の日付の日を入れておく変数
		int checkDateOne = checkDateAfterOrBeforeOne.mDate;
		// 二つ目の日付の年を入れておく変数
		int checkYearTwo = checkDateAfterOrBeforeTwo.mYear;
		// 二つ目の日付の月を入れておく変数
		int checkMonthTwo = checkDateAfterOrBeforeTwo.mMonth;
		// 二つ目の日付の日を入れておく変数
		int checkDateTwo = checkDateAfterOrBeforeTwo.mDate;

		// 一つ目の年のほうが二つ目の年が大きいとき
		if (checkYearOne > checkYearTwo) {
			// 一つ目の日付のほうが後の日付と表す要素番号を代入
			checkIndexNumber = Constant.STRING_INDEX_NUBER_DATE_AFTER;
			// 一つ目の年より二つ目の年が同じ年の時
		} else if (checkYearOne == checkYearTwo) {
			// 一つ目の月が二つ目の月より多きとき
			if (checkMonthOne > checkMonthTwo) {
				// 一つ目の日付のほうが後の日付と表す要素番号を代入
				checkIndexNumber = Constant.STRING_INDEX_NUBER_DATE_AFTER;
				// 一つ目と二つ目の月が同じ月の時
			} else if (checkMonthOne == checkMonthTwo) {
				// 一つ目の日が二つ目の日より大きいとき
				if (checkDateOne > checkDateTwo) {
					// 一つ目の日付のほうが後の日付と表す要素番号を代入
					checkIndexNumber = Constant.STRING_INDEX_NUBER_DATE_AFTER;
					// 一つ目と二つ目の日が同じの時
				} else if (checkDateOne == checkDateTwo) {
					// 二つの日付が同じことを表す要素番号を代入
					checkIndexNumber = Constant.STRING_INDEX_NUMBER_DATE_SAME;
					// 二つ目の日付のほうが大きい場合
				} else {
					// 一つ目の日付のほうが前の日付とあらわす要素番号を代入
					checkIndexNumber = Constant.STRING_INDEX_NUMBER_DATE_BEFORE;
				}
			}
			// 一つ目の年のほうが二つ目の年より小さいとき
		} else {
			// 一つ目の日付のほうが前の日付と表す要素番号を代入
			checkIndexNumber = Constant.STRING_INDEX_NUMBER_DATE_BEFORE;
		}

		// 一つ目の日付を表示する、一行にすると長くなるので二行で表す
		System.out.println(checkYearOne + "," + checkMonthOne + "," + checkDateOne + "は");
		// 二つ目の日付を表示し、前後同じのどれかの文言を表示する
		System.out.println(checkYearTwo + "," + checkMonthTwo + "," + checkDateTwo
				+ checkDateAfterOrBeforeString[checkIndexNumber]);
	}

	// 現在の日付と与えられたDayクラス型変数の日付の前後関係を求めるメソッド
	public static void checkBeforeAfterSame(Day checkDateAfterOrBeforeOne) {
		// ストリング配列を準備して前の日付か、同じ日付か、後の日付かの文言を準備しておく
		String checkDateAfterOrBeforeString[] = { "より前の日付", "と同じ日付", "より後の日付" };
		// ストリングの要素番号を入れておくための変数
		int checkIndexNumber = Constant.INDEX_NUMBER_DEFAULT;
		// 一つ目の日付の年を入れておく変数
		int checkYearOne = checkDateAfterOrBeforeOne.mYear;
		// 一つ目の日付の月を入れておく変数
		int checkMonthOne = checkDateAfterOrBeforeOne.mMonth;
		// 一つ目の日付の日を入れておく変数
		int checkDateOne = checkDateAfterOrBeforeOne.mDate;

		// 現在の日付をとるためのカレンダークラス型変数
		Calendar todaysCalendar = Calendar.getInstance();

		// 今日の日付の年をとっておく
		int checkYearToday = todaysCalendar.get(YEAR);
		// 今日の日付の月をとっておく
		int checkMonthToday = todaysCalendar.get(MONTH) + Constant.ADJUST_MONTH;
		// 今日の日付の日をとっておく
		int checkDateToday = todaysCalendar.get(DATE);

		// 一つ目の年のほうが現在の年が大きいとき
		if (checkYearOne > checkYearToday) {
			// 一つ目の日付のほうが後の日付と表す要素番号を代入
			checkIndexNumber = Constant.STRING_INDEX_NUBER_DATE_AFTER;
			// 一つ目の年より現在の年が同じ年の時
		} else if (checkYearOne == checkYearToday) {
			// 一つ目の月が現在の月より多きとき
			if (checkMonthOne > checkMonthToday) {
				// 一つ目の日付のほうが後の日付と表す要素番号を代入
				checkIndexNumber = Constant.STRING_INDEX_NUBER_DATE_AFTER;
				// 一つ目と現在の月が同じ月の時
			} else if (checkMonthOne == checkMonthToday) {
				// 一つ目の日が現在の日より大きいとき
				if (checkDateOne > checkDateToday) {
					// 一つ目の日付のほうが後の日付と表す要素番号を代入
					checkIndexNumber = Constant.STRING_INDEX_NUBER_DATE_AFTER;
					// 一つ目と現在のの日が同じの時
				} else if (checkDateOne == checkDateToday) {
					// 二つの日付が同じことを表す要素番号を代入
					checkIndexNumber = Constant.STRING_INDEX_NUMBER_DATE_SAME;
					// 現在の日付のほうが大きい場合
				} else {
					// 一つ目の日付のほうが前の日付とあらわす要素番号を代入
					checkIndexNumber = Constant.STRING_INDEX_NUMBER_DATE_BEFORE;
				}
			}
			// 一つ目の年のほうが現在の年より小さいとき
		} else {
			// 一つ目の日付のほうが前の日付と表す要素番号を代入
			checkIndexNumber = Constant.STRING_INDEX_NUMBER_DATE_BEFORE;
		}
		// 一つ目の日付を表示する、一行にすると長くなるので二行で表す
		System.out.println(checkYearOne + "," + checkMonthOne + "," + checkDateOne + "は");
		// 現在の日付を表示し、前後同じのどれかの文言を表示する
		System.out.println(checkYearToday + "," + checkMonthToday + "," + checkDateToday
				+ checkDateAfterOrBeforeString[checkIndexNumber]);
	}

	// 次の日の日付を表示するメソッド
	public void whatNextDate() {
		// 次の日を設定する
		setNextDate();
		// 次の日を取得する
		getNextDate();
		// 次の日を表示する
		System.out.println("nextday:" + mNextDayYear + "/" + mNextDayMonth + "/" + mNextDayDate);
	}

	// 次の日を設定するメソッド
	public void setNextDate() {
		// 次の日の年をセットする
		calendarDate.set(YEAR, mYear);
		// 次の日の月をセットする
		calendarDate.set(MONTH, mMonth - Constant.ADJUST_MONTH);
		// 入力された日付に1足した日でセットする
		calendarDate.set(DATE, (mDate + Constant.ADD_ONE_DAY));
	}

	// 次の日の値を取得するメソッド
	public void getNextDate() {
		// セットした次の日の年を代入する
		mNextDayYear = calendarDate.get(YEAR);
		// セットした次の日の月を代入する
		mNextDayMonth = calendarDate.get(MONTH) + Constant.ADJUST_MONTH;
		// セットした次の日の日を代入する
		mNextDayDate = calendarDate.get(DATE);

	}

	// 前日を表示するメソッド
	public void whatYesterDate() {
		// 前日の日付をセットするメソッドを呼び出す
		setYesterDate();
		// 前日の日付を取得するメソッドを呼び出す
		getYesterDate();
		// 前日の日付を表示する
		System.out.println("Yesterday:" + mYesterDayYear + "/" + mYesterDayMonth + "/" + mYesterDayDate);
	}

	// 前日の日付をセットするメソッド
	public void setYesterDate() {
		// 前日の年をセットする
		calendarDate.set(YEAR, mYear);
		// 前日の月をセットする
		calendarDate.set(MONTH, mMonth - Constant.ADJUST_MONTH);
		// 入力された日から1引いた値で日付けをセットする
		calendarDate.set(DATE, (mDate - Constant.SUBSTRACT_ONE_DAY));
	}

	// 前日の日付を取得するメソッド
	public void getYesterDate() {
		// セットした前日の年を代入する
		mYesterDayYear = calendarDate.get(YEAR);
		// セットした前日の月を代入する
		mYesterDayMonth = calendarDate.get(MONTH) + Constant.ADJUST_MONTH;
		// セットした前日の日を代入する
		mYesterDayDate = calendarDate.get(DATE);
	}

	// 何日後の日にちを求めるのかセットするメソッド
	public static void setHowManyAfterDay(int howManyAfterDay) {
		// 引数に与えられた任意の数字を代入
		sHowManyAfterDay = howManyAfterDay;
	}

	// 任意の数字分後の日付を表示するメソッド
	public void whatAfterArgumentDate() {
		// 引数に渡した数字分だけ後ろにずらした日付をセットするメソッドを呼び出す
		setAfterArgumentDate(sHowManyAfterDay);
		// 後ろにずらした日付を取得するメソッドを呼び出す
		getAfterArgumentDate();
		// 後ろにずらした日付を表示する
		System.out.println(
				sHowManyAfterDay + "日後:" + mAfterArgumentYear + "/" + mAfterArgumentMonth + "/" + mAfterArgumentDate);
	}

	// 引数にわたした日数分だけ後ろにずらした日付をセットするメソッド
	public void setAfterArgumentDate(int howAfterDay) {
		// 任意の数字文後の年をセットする
		calendarDate.set(YEAR, mYear);
		// 任意の数字文後の月をセットする
		calendarDate.set(MONTH, mMonth - Constant.ADJUST_MONTH);
		// 引数分日付を後ろにずらした値で日付けをセットする
		calendarDate.set(DATE, (mDate + howAfterDay));
	}

	// 後ろにずらした日付を取得するメソッド
	public void getAfterArgumentDate() {
		// 任意の数字分後ろにずれた年を代入
		mAfterArgumentYear = calendarDate.get(YEAR);
		// 任意の数字分後ろにずれた月を代入
		mAfterArgumentMonth = calendarDate.get(MONTH) + Constant.ADJUST_MONTH;
		// 任意の数字分後ろにずれた日を代入
		mAfterArgumentDate = calendarDate.get(DATE);
	}

	// 何日前の日にちを求めるのかセットするメソッド
	public static void setHowManyBeforeDay(int howManyBeforeDay) {
		// 引数に与えられた任意の数字を代入
		sHowManyBeforeDay = howManyBeforeDay;
	}

	// 任意の数字分前の日付を表示するメソッド
	public void whatBeforeArgumentDate() {
		// 引数に渡した数字分だけ後ろにずらした日付をセットするメソッドを呼び出す
		setBeforeArgumentDate(sHowManyBeforeDay);
		// 前にずらした日付を取得するメソッドを呼び出す
		getBeforeArgumentDate();
		// 前にずらした日付を表示する
		System.out.println(sHowManyBeforeDay + "日前:" + mBeforeArgumentYear + "/" + mBeforeArgumentMonth + "/"
				+ mBeforeArgumentDate);
	}

	// 引数にわたした日数分だけ前にずらした日付をセットするメソッド
	public void setBeforeArgumentDate(int howManyBeforeDay) {
		// 任意の数字分前の日付の年をセットする
		calendarDate.set(YEAR, mYear);
		// 任意の数字分前の日付の月をセットする
		calendarDate.set(MONTH, mMonth - Constant.ADJUST_MONTH);
		// 任意の数字分前の日付の引数分日付を前にずらした値で日付けをセットする
		calendarDate.set(DATE, (mDate - howManyBeforeDay));
	}

	// 前にずらした日付を取得するメソッド
	public void getBeforeArgumentDate() {
		// 任意の数字分前にずれた年を代入
		mBeforeArgumentYear = calendarDate.get(YEAR);
		// 任意の数字分前にずれた月を代入
		mBeforeArgumentMonth = calendarDate.get(MONTH) + Constant.ADJUST_MONTH;
		// 任意の数字分前にずれた日を代入
		mBeforeArgumentDate = calendarDate.get(DATE);
	}

}