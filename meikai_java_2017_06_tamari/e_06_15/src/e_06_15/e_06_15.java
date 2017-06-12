
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

		String[] weekAnswer = { "monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday" };
		int weekQue;
		int retry = 1;
		int question = 0;

		String Answer;
		System.out.print("英語の曜日名を小文字で入力してください。\n");

		while (retry == 1) {
			do {
				weekQue = rand.nextInt(7);

			} while (weekQue == question);

			switch (weekQue) {
			case 0:
				System.out.print("月曜日：");
				break;
			case 1:
				System.out.print("火曜日：");
				break;
			case 2:
				System.out.print("水曜日：");
				break;
			case 3:
				System.out.print("木曜日：");
				break;
			case 4:
				System.out.print("金曜日：");
				break;
			case 5:
				System.out.print("土曜日：");
				break;
			case 6:
				System.out.print("日曜日：");
				break;

			}
			Answer = stdIn.next();
			question = weekQue;

			if (Answer.equals(weekAnswer[weekQue])) {
				// System.out.println(monthAnswer[monthQue]);
				System.out.println("正解です。");
			} else if (Answer.equals(weekAnswer[weekQue]) == false) {
				// System.out.println(weekAnswer[weekQue]);
				System.out.println("違います。");
			}

			System.out.print("もう一度？　1…Yes / 0…No :");
			retry = stdIn.nextInt();

		}
	}
}
