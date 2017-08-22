/*
  演習10-4		Dayクラスに14個のメソッドを追加しなさい。
  演習日		8月22日
  製作者		玉利仁美
 */
package e_10_04;

import java.util.Scanner;

//メインクラス
public class e_10_04 {
	//メインメソッド
	public static void main(String[] args) {
		//キーボード入力を行うために宣言
		Scanner scan = new Scanner(System.in);

		//任意の日付でDayクラス型変数を作る
		Day noArgment = new Day(2017, 8, 45);
		//任意の日付でDayクラス型変数を作る
		Day noArgment2 = new Day(2017, 8, 1);
		//任意の日付でDayクラス型変数を作る
		Day noArgment3 = new Day(2020, 12, 31);
		//任意の日付でDayクラス型変数を作る
		Day noArgment4 = new Day(2020, 12, 4);
		//任意の日付でDayクラス型変数を作る
		Day noArgment6 = new Day(2017, 422, 3);
		//任意の日付でDayクラス型変数を作る
		Day noArgment5 = new Day();

		//何日後の日にちを表示するのか入力を促す
		System.out.print("何日後の日にちを表示しますか：");
		//キーボードから値を取得
		int afterArgument = scan.nextInt();
		//何日後の日付を表示するのかをDayクラスに渡しておく
		Day.setHowManyAfterDay(afterArgument);
		//何日前の日にちを表示するのか入力を促す
		System.out.print("何日前の日にちを表示しますか：");
		//キーボードから値を取得
		int beforeArgument = scan.nextInt();
		//何日前の日付を表示するのかをDayクラスに渡しておく
		Day.setHowManyBeforeDay(beforeArgument);

		//日付表示と分けるため改行する
		System.out.println();

		//前後関係を求めるメソッドで前後関係を求める
		Day.checkBeforeAfterSame(noArgment);
		//与えた日付のそれぞれの情報を表示するメソッドを呼び出す
		noArgment.print();
		//与えた日付のそれぞれの情報を表示するメソッドを呼び出す
		noArgment2.print();
		//与えた日付のそれぞれの情報を表示するメソッドを呼び出す
		noArgment3.print();
		//与えた日付のそれぞれの情報を表示するメソッドを呼び出す
		noArgment4.print();
		//与えた日付のそれぞれの情報を表示するメソッドを呼び出す
		noArgment5.print();
		//与えた日付のそれぞれの情報を表示するメソッドを呼び出す
		noArgment6.print();

		//ストリームを開放する
		scan.close();
	}
}
