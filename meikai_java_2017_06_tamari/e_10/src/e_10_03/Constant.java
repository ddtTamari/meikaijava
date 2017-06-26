/*
  演習10-3		二値／三値／配列の最小値を求めるメソッドや災害地を求めるメソッドを集めたユーティリティクラスMinMaxを作成
  演習日		6月26日
  製作者		玉利仁美
 */
package e_10_03;

//文字列などの定数を格納しておくためのクラス
public class Constant {
	// 3値入力する整数のうち一つ目の整数の入力を求める
	public static final String INTEGER_ONE = new String("整数１：");
	// 3値入力する整数のうち二つ目の整数の入力を求める
	public static final String INTEGER_TWO = new String("整数２：");
	// 3値入力する整数のうち三つ目の整数の入力を求める
	public static final String INTEGER_THREE = new String("整数３：");
	// 生成する配列の要素の数の入力を求める
	public static final String ARRAY_ELEMENTS_NUMBER = new String("配列の要素数は：");
	// 2値の最小値の値を表示する時呼び出す定数
	public static final String TWO_NUMBER_MIN_DISPLAY = new String("2値の最小値は：");
	// 3値の最小値の値を表示する時呼び出す定数
	public static final String THREE_NUMBER_MIN_DISPLAY = new String("3値の最小値は：");
	// 配列の要素の値の最小値の値を表示する時呼び出す定数
	public static final String ARRAY_NUMBER_MIN_DISPLAY = new String("配列の最小値は：");
	// 2値の最大値の値を表示するとき呼び出す定数
	public static final String TWO_NUMBER_MAX_DISPLAY = new String("2値の最大値は：");
	// 3値の最大値の値を表示するとき呼び出す定数
	public static final String THREE_NUMBER_MAX_DISPLAY = new String("3値の最大値は：");
	// 配列の要素の値の最大値の値を表示するとき呼び出す定数
	public static final String ARRAY_NUMBER_MAX_DISPLAY = new String("配列の最大値は：");
}
