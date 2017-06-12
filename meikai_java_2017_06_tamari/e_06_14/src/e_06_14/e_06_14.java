/*
  演習6-14		月を1～12の数値として表示、その英語表現を入力させる英単語学習プログラムの作成
  				・出題する月はランダムに・学習社が望む限り何度でも繰り返す・同一月を連続して出さない
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

		String[] monthAnswer = { "January", "February", "March", "April", "May", "Jun", "July", "August", "September",
				"Octorber", "November", "December" };
		int monthQue;
		int retry = 1;
		int question=0;
		String Answer;
		System.out.print("英語の月名を入力してください。\nなお、先頭は大文字で、2文字目以降は小文字とします。\n");

		while (retry == 1) {
			do {
				monthQue = rand.nextInt(12);

			}while(monthQue == question);
			System.out.print(monthQue + 1 + "月：");
			Answer = stdIn.next();
			question = monthQue;
			if (Answer.equals(monthAnswer[monthQue])) {
				// System.out.println(monthAnswer[monthQue]);
				System.out.println("正解です。");
			} else if (Answer.equals(monthAnswer[monthQue]) == false) {
				System.out.println("違います。");
			}

			System.out.print("もう一度？　1…Yes / 0…No :");
			retry = stdIn.nextInt();

		}
	}

}
