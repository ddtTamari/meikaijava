/*
  演習6-15		月を1～12の数値として表示。英語表現を入力させるプログラム
  				月は乱数で生成・何度も繰り返しできる・同一月を連続して出題しない
  演習日		6月9日
  製作者		玉利仁美
 */
package e_06_14;

import java.util.Random;
import java.util.Scanner;

public class e_06_14 {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);

		// 月の英語表記を入れるための配列を用意
		String[] monthAnswer = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"Octorber", "November", "December" };
		int monthQue; // 問題に出すのが何月かの変数
		int retry = 1;// 繰り返し行うかどうかの判定に利用
		int question = 12;// ひとつ前の問題を入れておくための変数、初回に1月が出るように12を代入
		String Answer; // 答えを入力するための変数
		// 問題文を表示
		System.out.print("英語の月名を入力してください。\nなお、先頭は大文字で、2文字目以降は小文字とします。\n");

		// 学習者が１を押す限り繰り返される
		while (retry == 1) {
			// whileの条件が満たされている間行う
			do {
				// 問題に出す月をランダムで表示
				monthQue = rand.nextInt(12);
				// 問題を出す月がひとつ前の問題と同じ間繰り返す
			} while (monthQue == question);


			while (true) {
				System.out.print(monthQue + 1 + "月：");
				// 答えをキーボードから取得
				Answer = stdIn.next();
				// 今出た問題をquestionとして保存
				question = monthQue;
				if (Answer.equals(monthAnswer[monthQue]) == false) {
					// 間違っていることを表示
					System.out.println("違います。");
				}else{
					break;
				}

			}

			// 正解したことを表示
			System.out.println("正解です。");

			// もう一度やるかどうかを聞く
			System.out.print("もう一度？　1…Yes / 0…No :");
			// リトライに入る数字によって繰り返すかどうか判断する
			retry = stdIn.nextInt();

		}
	}

}
