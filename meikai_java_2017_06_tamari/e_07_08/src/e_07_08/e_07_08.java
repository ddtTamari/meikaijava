/*
  演習7-8		a以上b未満の乱数を生成して、その値を返却するメソッドrandomを作成、内部で乱数を生成する標準ライブラリを呼び出し
  				int random(int a,int b)、bの値がaより小さい場合にはaの値をそのまま返却
  演習日		6月16日
  製作者		玉利仁美
 */
package e_07_08;

import java.util.Random;
import java.util.Scanner;

public class e_07_08 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// どんなプログラムなのか説明する
		System.out.println("a以上b未満の乱数を作成");
		// a以上b未満の乱数を生成する2値のうちの1つ目aの値の入力を促す
		System.out.print("a:");
		// a以上b未満の乱数を生成する2値のうちの1つ目aの値をキーボードから取得
		int integerA = scan.nextInt();
		// a以上b未満の乱数を生成する2値のうちの2つ目bの値の入力を促す
		System.out.print("b:");
		// a以上b未満の乱数を生成する2値のうちの2つ目bの値をキーボードから取得
		int integerB = scan.nextInt();
		// a以上b未満の乱数を生成するメソッドrandomに入力した値であるa,bを実引数として受け渡し、メソッドを通して出た値を表示する
		System.out.print(random(integerA, integerB));
		// ストリームを解放する
		scan.close();
	}

	static int random(int a, int b) {
		Random rand = new Random();
		// a以上b未満のランダムな値を入れるための変数valueを作成
		int value;
		// bがa以下の場合aの値を変数valueに代入する
		if (b <= a) {
			value = a;
			// bがaより大きい場合はbまでのランダムな値を変数valueに代入
		} else {
			// 変数valueに0～bまでのランダムな値を代入
			value = rand.nextInt(b);
			// valueがaより小さい間、繰り返しランダムな値を代入する
			while (value < a) {
				// valueにbまでのランダムな値を代入
				value = rand.nextInt(b);
			}
		}
		// valueの値を返却する
		return value;
	}

}
