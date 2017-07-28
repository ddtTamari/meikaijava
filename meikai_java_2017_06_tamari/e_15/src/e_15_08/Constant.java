/*
  演習15-8		コマンドライン引数で指定された月のカレンダーを表示するプログラムを作成せよ。コマンドラインから年のみが与えられた場合は、その年の1月から１２月までの
  				カレンダーを表示して、年と月が与えられた場合は、その月のカレンダーを表示して、年も月も与えられなかったら、現在の月のカレンダーを表示すること。
  演習日		7月28日
  製作者		玉利仁美
 */
package e_15_08;

//定数クラス
public class Constant {
	// 年と月が与えられた時の配列の要素数
	public final static int RECIVE_ARGUMENT_YEAR_MONTH = 2;
	// 年だけが与えられた時の配列の要素数
	public final static int RECIVE_ARGUMENT_YEAR = 1;
	// 何も与えられなかった時の配列の要素数
	public final static int NO_RECIVE_ARGUMENT = 0;
	// 配列と実際表示させたい数字が1ずれているときに使う定数
	public final static int ARRAY_NUMBER_ADJUSTMENT_REAL_NUMBER = 1;
	// コマンドライン引数に与えられた月の要素番号
	public final static int COMAND_LINE_ARGUMENT_MONTH = 1;
	// コマンドライン引数に与えられた年の要素番号
	public final static int COMAND_LINE_ARGUMENT_YEAR = 0;
	// カレンダークラス内の曜日を表す配列の土曜日の要素番号
	public final static int THE_LAST_WEEK_DATE = 7;
	// 1年に何月分あるかの定数
	public final static int HOW_MANY_MONTH_IN_YEAR = 12;
	// 月の初日を表す定数
	public final static int THE_FIRST_DAY_OF_MONTH = 1;
}
