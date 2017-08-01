/*
  演習15-8		コマンドライン引数で指定された月のカレンダーを表示するプログラムを作成せよ。コマンドラインから年のみが与えられた場合は、その年の1月から１２月までの
  				カレンダーを表示して、年と月が与えられた場合は、その月のカレンダーを表示して、年も月も与えられなかったら、現在の月のカレンダーを表示すること。
  演習日		7月28日
  製作者		玉利仁美
 */
package e_15_08;

//メインクラス
public class e_15_08 {

	// メインメソッド
	public static void main(String[] args) {
		// DisplayCalendar型のクラス型変数を用意し引数を与えられるようにする
		DisplayCalendar calender = new DisplayCalendar();

		// コマンドラインが何も与えられてないときは引数なし
		if (args.length == Constant.NO_RECIVE_ARGUMENT) {
			// 引数を渡さない場合の、現在日時のカレンダーを表示するメソッドを呼び出す
			calender.whatTypeCalendarPrint();
			// コマンドライン引数が1つの時はそれを年としてカレンダーを表示する
		} else if (args.length == Constant.RECIVE_ARGUMENT_YEAR) {
			// 引数として受け取った年のカレンダーを表示するメソッドを呼び出す
			calender.whatTypeCalendarPrint(Integer.parseInt(args[Constant.COMAND_LINE_ARGUMENT_YEAR]));
			// コマンドライン引数が2つの時はそれを年と月としてカレンダーを表示する
		} else if (args.length == Constant.RECIVE_ARGUMENT_YEAR_MONTH) {
			// 受け取ったコマンドライン引数の月の値をとっておく
			int whatCalendarDisplayMonth = Integer.parseInt(args[Constant.COMAND_LINE_ARGUMENT_MONTH])
					- Constant.ARRAY_NUMBER_ADJUSTMENT_REAL_NUMBER;
			// 受け取ったコマンドライン引数の年の値をとっておく
			int whatCalendarDisplayYear = Integer.parseInt(args[Constant.COMAND_LINE_ARGUMENT_YEAR]);
			// 引数として受け取った年の月のカレンダーを表示するメソッドを呼び出す
			calender.whatTypeCalendarPrint(whatCalendarDisplayYear, whatCalendarDisplayMonth);
		}

	}

}
