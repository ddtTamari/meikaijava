/*
  演習9-5		開始日と終了日とから構成される《期間》を表すクラスPeriodを作成せよ。
  演習日		6月23日
  製作者		玉利仁美
 */
package e_09_05;

import java.util.Scanner;

public class e_09_05 {
	// メインメソッド
	public static void main(String[] args) {
		// キーボードから値を取得するために宣言
		Scanner scan = new Scanner(System.in);

		// 開始日のデータを入力してもらえるように表示
		System.out.println(Constant.START_COUNT_FROM);
		// 開始日の年を入力してもらえるように表示
		System.out.print(Constant.IMPUT_YEAR);
		// 開始の年をキーボードから取得
		int startYear = scan.nextInt();
		// 開始日の月を入力してもらえるように表示
		System.out.print(Constant.IMPUT_MONTH);
		// 開始の月をキーボードから取得
		int startMonth = scan.nextInt();
		// 開始日の日にちを入力してもらえるように表示
		System.out.print(Constant.IMPUT_DAY);
		// 開始の日をキーボードから取得
		int startDay = scan.nextInt();

		// 終了日のデータを入力してもらえるように表示
		System.out.println(Constant.START_COUNT_TO);
		// 終了日の年を入力してもらえるように表示
		System.out.print(Constant.IMPUT_YEAR);
		// 終了の年をキーボードから取得
		int finishYear = scan.nextInt();
		// 終了日の月を入力してもらえるように表示
		System.out.print(Constant.IMPUT_MONTH);
		// 終了の月をキーボードから取得
		int finishMonth = scan.nextInt();
		// 終了日の日を入力してもらえるように表示
		System.out.print(Constant.IMPUT_DAY);
		// 終了の日をキーボードから取得
		int finishDay = scan.nextInt();

		// 開始日の年月日を入れたDaySetting型のインスタンスを生成
		DaySetting startDate = new DaySetting(startYear, startMonth, startDay);
		// 終了日の年月日を入れたDaySetting型のインスタンスを生成
		DaySetting finishDate = new DaySetting(finishYear, finishMonth, finishDay);
		// 終了日のほうが開始日より早い場合入れ替えるので入れ替えるため、開始日を保管しておく
		DaySetting copyStartDate = startDate;

		// ピリオド型のインスタンスを生成
		Period fromTo = new Period(startDate, finishDate);

		// 開始日と終了日を引数として渡した結果finishDateのほうが早い日付の時行われる
		if (!fromTo.overStart(startDate, finishDate)) {
			// 開始日を終了日の値にする
			startDate = finishDate;
			// 終了日を先に保管しておいた開始日にし、日付が遅いほうが終了日になるようにする
			finishDate = copyStartDate;
		}

		// 入力された日付が期間であることを表示
		System.out.println(Constant.DISPLAY_TERM);
		// 開始日と終了日を表示する
		System.out.println(startDate + "～" + finishDate);

		// ストリームを解放する
		scan.close();

	}
}
