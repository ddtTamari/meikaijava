<<<<<<< HEAD
package e_09_02;

public class e_09_02 {
=======
/*
  演習9-2		日付クラス第3版を利用するプログラムを作成せよ。すべてのコンストラクタの働きを確認できるようにすること。
  演習日		6月22日
  製作者		玉利仁美
 */
package e_09_02;

import java.util.Scanner;

//実際に日付などの入力・表示などをしているメインクラス
public class e_09_02 {
	// 実際に日付などの入力・表示などをしているメインメソッド
	public static void main(String[] args) {
		// 日付名などの値をキーボードから取得するために宣言
		Scanner scan = new Scanner(System.in);

		// 曜日を求める日付の入力を促す
		System.out.println(Constant.Imput_Date);
		// 曜日を求める日付の年の入力を促す
		System.out.print(Constant.What_Year);
		// 曜日を求める日付の年の値をキーボードから取得
		int whatYear = scan.nextInt();
		// 曜日を求める日付の月の入力を求める
		System.out.print(Constant.What_Year);
		// 曜日を求める日付の月の値をキーボードから取得する
		int whatMonth = scan.nextInt();
		// 曜日を求める日付の日にちの入力を促す
		System.out.print(Constant.What_Day);
		// 曜日を求める日付の日にちの値をキーボードから取得
		int whatDay = scan.nextInt();

		// 五つのコンストラクタの働きを確認するため5個のクラスの配列を生成
		Day day[] = new Day[5];
		// 5つ目のコンストラクタの働きを確認するためにコピーするインスタンスを生成
		Day dayArgument = new Day(1945, 7, 2);

		// コピー元のインストラクタの値を表示
		System.out.println(dayArgument);
		// 1個目のコンストラクタの働きを確認するため何も引数を渡さずにインスタンスを生成
		day[0] = new Day();
		// 2個目のコンストラクタの働きを確認するため年だけを引数として渡しインスタンスを生成
		day[1] = new Day(whatYear);
		// 3個目のコンストラクタの働きを確認するため年と月だけを引数として渡し、インスタンスを生成
		day[2] = new Day(whatYear, whatMonth);
		// 4個目のコンストラクタの働きを確認するため年月日を引数として渡し、インスタンスを生成
		day[3] = new Day(whatYear, whatMonth, whatDay);
		// 5個目のコンストラクタの働きを確認するため、引数として別に作ったインスタンスを渡し、インスタンスを生成
		day[4] = new Day(dayArgument);

		// 5個のコンストラクタの働きを表示するため5回繰り返す
		for (int i = 0; i < 5; i++) {
			// 何個目のコンストラクタの働きを確認しているか表示する
			System.out.println(i + 1 + Constant.What_Number_Constructor);
			// コンストラクタの働きを表示する
			System.out.println(day[i]);
		}

	}
>>>>>>> parent of b880497... e_09_02のコミット

}
