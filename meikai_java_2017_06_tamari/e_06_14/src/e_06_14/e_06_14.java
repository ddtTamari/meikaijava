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

		String[] monthAnswer = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"Octorber", "November", "December" };
		int monthQue;
		int retry = 1;
		int question = 0;
		String Answer;
		System.out.print("英語の月名を入力してください。\nなお、先頭は大文字で、2文字目以降は小文字とします。\n");

		while (retry == 1) {
			do {
				monthQue = rand.nextInt(12);

			} while (monthQue == question);
			System.out.print(monthQue + 1 +"月：");
			Answer = stdIn.next();
			question = monthQue;

			if (Answer.equals(monthAnswer[monthQue])) {
				// System.out.println(monthAnswer[monthQue]);
				System.out.println("正解です。");
			} else if (Answer.equals(monthAnswer[monthQue]) == false) {
				// System.out.println(monthAnswer[monthQue]);
				System.out.println("違います。");
			}

			System.out.print("もう一度？　1…Yes / 0…No :");
			retry = stdIn.nextInt();

		}
	}

}
