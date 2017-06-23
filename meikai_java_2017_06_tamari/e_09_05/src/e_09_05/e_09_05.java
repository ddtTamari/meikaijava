/*
  演習9-5		開始日と終了日とから構成される《期間》を表すクラスPeriodを作成せよ。
  演習日		6月23日
  製作者		玉利仁美
 */
package e_09_05;

import java.util.Scanner;

public class e_09_05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 開始日のデータをを入力してもらえるように表示
		System.out.println(Constant.START_COUNT_FROM);
		System.out.print(Constant.IMPUT_YEAR);
		int startYear = scan.nextInt();
		System.out.print(Constant.IMPUT_MONTH);
		int startMonth = scan.nextInt();
		System.out.print(Constant.IMPUT_DAY);
		int startDay = scan.nextInt();
		System.out.print(Constant.START_COUNT_TO);
		System.out.print(Constant.IMPUT_YEAR);
		int finishYear = scan.nextInt();
		System.out.print(Constant.IMPUT_MONTH);
		int finishMonth = scan.nextInt();
		System.out.print(Constant.IMPUT_DAY);
		int finishDay = scan.nextInt();

		Period fromTo = new Period(new DaySetting(startYear, startMonth, startDay),
				new DaySetting(finishYear, finishMonth, finishDay));
		DaySetting copyDay = new DaySetting(fromTo.getFrom());
		if (!fromTo.overStart(fromTo.getFrom(), fromTo.getTo())) {
			fromTo.getFrom() = fromTo.getTo();
		}

		// ストリームを解放する
		scan.close();

	}
}
