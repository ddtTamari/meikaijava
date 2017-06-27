/*
  演習12-1		総走行距離を表すフィールドとその値を調べるメソッドを追加した自動車クラスを作成
  演習日		6月27日
  製作者		玉利仁美
 */
package e_12_01;

//文字列などの定数を格納しておくためのクラス
public class Constant {
	// 車のデータを入力してもらう際に呼び出す文字列
	public static final String INPUT_CAR_DATE = new String("車のデータを入力してください。");
	// 車の名前を入力してもらう際に呼び出す文字列
	public static final String CAR_NAME = new String("名前：");
	// 車の車幅を入力してもらう際に呼び出す文字列
	public static final String CAR_WEIGHT = new String("車幅：");
	// 車の高さを入力してもらう際に呼び出す文字列
	public static final String CAR_HEIGHT = new String("高さ：");
	// 車の長さを入力してもらう際に呼び出す文字列
	public static final String CAR_LENGTH = new String("長さ：");
	// 車のガソリン量を入力してもらう際に呼び出す文字列
	public static final String CAR_FUEL = new String("ガソリン量：");
	// 車の総走行距離数を入力してもらう際に呼び出す文字列
	public static final String CAR_TOTAL_DISTANCE = new String("総走行距離数：");
	// 車のX方向への移動距離を入力してもらう際に呼び出す文字列
	public static final String HOW_MANY_MOVE_X = new String("X方向への移動距離：");
	// 車のY方向への移動距離を入力してもらう際に呼び出す文字列
	public static final String HOW_MANY_MOVE_Y = new String("Y方向への移動距離：");
	// 車を移動するかどうかを入力してもらう際に呼び出す文字列
	public static final String ASK_CONTINUE_MOVE = new String("移動しますか[0...NO/1...YES]");
	// 車の燃料が足りないときに入力してもらう際に呼び出す文字列
	public static final String NO_MORE_FUEL = new String("燃料が足りません。");

}
