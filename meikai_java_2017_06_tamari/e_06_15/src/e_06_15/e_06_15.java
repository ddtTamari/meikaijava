
/*
  演習6-15		曜日を表示し、その英語表現を入力させるプログラム
  				出題する曜日は乱数で生成・何度も繰り返しできる・同一曜日を連続して出題しない
  演習日		6月9日
  製作者		玉利仁美
 */
package e_06_15;

import java.util.Random;
import java.util.Scanner;

public class e_06_15 {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);

		//曜日の英語表現を入れる配列を作成
		String[] weekAnswer = { "monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday" };
		int weekQue;//問題の番号
		int retry = 1;//繰り返すかどうかの判定に使う
		int question = 7;//前問の値を保管、要素の値と同じの場合一問目にその問題が出なくなってしまうので、7を代入

		//答えを入れる変数
		String Answer;
		//答えの入力を促す表示
		System.out.print("英語の曜日名を小文字で入力してください。\n");

		//入力されたリトライの値が1の時繰り返す
		while (retry == 1) {
			//同じ問題を繰り返さないようする
			do {
				//0～6の数字をランダムに出す
				weekQue = rand.nextInt(7);
				//前問と同じ問題が出たとき繰り返す
			} while (weekQue == question);
			//要素の値が入ったとき、それに対応する曜日を表示
			switch (weekQue) {
			//ランダムで出た数字が0ならば月曜日を表示
			case 0:
				System.out.print("月曜日：");
				break;
			//ランダムで出た数字が1ならば火曜日を表示
			case 1:
				System.out.print("火曜日：");
				break;
			//ランダムで出た数字が2ならば水曜日を表示
			case 2:
				System.out.print("水曜日：");
				break;
			//ランダムで出た数字が3ならば木曜日を表示
			case 3:
				System.out.print("木曜日：");
				break;
			//ランダムで出た数字が4ならば金曜日を表示
			case 4:
				System.out.print("金曜日：");
				break;
			//ランダムで出た数字が5ならば土曜日を表示
			case 5:
				System.out.print("土曜日：");
				break;
			//ランダムで出た数字が6ならば日曜日を表示
			case 6:
				System.out.print("日曜日：");
				break;

			}
			//答えを入力してもらう
			Answer = stdIn.next();
			//前問として問題の数値を代入
			question = weekQue;

			//答えが入力した値と同じならば
			if (Answer.equals(weekAnswer[weekQue])) {
				//正解であると表示
				System.out.println("正解です。");
			//答えが入力した値と違ったならば
			} else if (Answer.equals(weekAnswer[weekQue]) == false) {
				//正解でないと表示
				System.out.println("違います。");
			}
			//もう一度問題を繰り返すか聞く
			System.out.print("もう一度？　1…Yes / 0…No :");
			//入力した値によって終了させるか続けるか決める
			retry = stdIn.nextInt();

		}
	}
}
