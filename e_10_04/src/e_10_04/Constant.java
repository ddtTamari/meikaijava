/*
  演習10-4		Dayクラスに14個のメソッドを追加しなさい。
  演習日		8月22日
  製作者		玉利仁美
 */
package e_10_04;

//定数クラス
public class Constant {
	// CalendarクラスのMonthは実際の月ー1の値なのでその調整のための定数
	public static final int ADJUST_MONTH = 1;
	// 月の初日の定数
	public static final int FIRST_DAY_OF_MONTH = 1;
	// ストリング型配列の、前の日付であることを表す要素番号
	public static final int STRING_INDEX_NUMBER_DATE_BEFORE = 0;
	// ストリング型配列の、同じ日付であることを表す要素番号
	public static final int STRING_INDEX_NUMBER_DATE_SAME = 1;
	// ストリング型配列の、後の日付であることを表す要素番号
	public static final int STRING_INDEX_NUBER_DATE_AFTER = 2;
	// 要素番号の初期値などに使用する定数
	public static final int INDEX_NUMBER_DEFAULT = 0;
	// 年の最大月の定数
	public static final int MAX_MONTH_OF_YEAR = 12;
	// 年の最小月の定数
	public static final int MIN_MONTH_OF_YEAR = 1;
	// 1日後を求めるとき用の定数
	public static final int ADD_ONE_DAY = 1;
	// 1日前を求めるとき用の定数
	public static final int SUBSTRACT_ONE_DAY = 1;
	// 変数の初期値として使う定数
	public static final int DEFAULT_NUMBER = 0;

}
