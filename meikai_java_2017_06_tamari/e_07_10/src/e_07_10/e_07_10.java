/*
  演習7-10		x+y+z , x+y-z , x-y+z , x-y-zの四つの問題をランダムに出題するプログラムを作成せよ
  演習日		6月16日
  製作者		玉利仁美
 */
package e_07_10;

import java.util.Random;
import java.util.Scanner;

public class e_07_10 {
	static Scanner scan = new Scanner(System.in);
	static Random rand = new Random();

	public static void main(String[] args) {
		// 暗算で答えてもらうために、暗算のトレーニングであることを表示
		System.out.println("暗算力トレーニング！！");
		// 続けるかどうかを判断を求めるメソッドがtrue(1を入力する限り)の間実行し続ける
		do {
			// 足し算引き算を行う3桁の3値のうちの一つ目に3桁のランダムな値を代入
			int integerX = rand.nextInt(900) + 100;
			// 足し算引き算を行う3桁の3値のうちの二つ目に3桁のランダムな値を代入
			int integerY = rand.nextInt(900) + 100;
			// 足し算引き算を行う3桁の3値のうちの三つ目に3桁のランダムな値を代入
			int integerZ = rand.nextInt(900) + 100;

			// ランダムで4種の計算を求める問題を出題し、正解するまで繰り返すメソッドに引数として先ほど3桁のランダムな値を代入した3値を渡して実行
			switchQuestion(integerX, integerY, integerZ);

			// confirmRetryメソッドがtrueの間繰り返して実行し続ける
		} while (confirmRetry());

	}

	// 4種の問題をランダムに出題するメソッド、問題に使う値を引数として渡される
	static void switchQuestion(int x, int y, int z) {
		// 4つの問題をswitch文でランダムに表示したいので0～3の値をランダムに代入
		int question = rand.nextInt(4);
		// questionの値によって問題を表示し正解するまで問題を繰り返し表示し続ける
		switch (question) {

		// questionの値が0だった時以下の処理をする
		case 0:
			// 正解してbreakするまで繰り返し続ける
			while (true) {
				// 3値の合計を求める式を表示し答えの入力を促す
				System.out.print(x + "+" + y + "+" + z + "=");
				// 答えはキーボードから取得する
				int Answer = scan.nextInt();
				// もし答えがあってるならwhile文から抜け出し、その後switch文からも抜け出し呼び出し元に戻る
				if (Answer == x + y + z) {
					// while文から抜け出す
					break;
				}
				// 答えがあっていなければ、違いますよ！と表示しwhile文先頭に戻る
				System.out.println("違いますよ！！");
			}
			// switch文から抜け出し呼び出し元に戻る
			break;

		// questionの値が1だった時以下の処理をする
		case 1:
			// 正解してbreakするまで繰り返し続ける
			while (true) {
				// x+y-zの値を求める式を表示し答えの入力を促す
				System.out.print(x + "+" + y + "-" + z + "=");
				// 答えはキーボードから取得する
				int Answer = scan.nextInt();
				// もし答えがあってるならwhile文から抜け出し、その後switch文からも抜け出し呼び出し元に戻る
				if (Answer == x + y - z) {
					break;
				}
				// 答えがあっていなければ、違いますよ！と表示しwhile文先頭に戻る
				System.out.println("違いますよ！！");
			}
			// switch文から抜け出し呼び出し元に戻る
			break;

		// questionの値が2だった時以下の処理をする
		case 2:
			// 正解してbreakするまで繰り返し続ける
			while (true) {
				// x-y+zの値を求める式を表示し答えの入力を促す
				System.out.print(x + "-" + y + "+" + z + "=");
				// 答えはキーボードから取得する
				int Answer = scan.nextInt();
				// もし答えがあってるならwhile文から抜け出し、その後switch文からも抜け出し呼び出し元に戻る
				if (Answer == x - y + z) {
					break;
				}
				// 答えがあっていなければ、違いますよ！と表示しwhile文先頭に戻る
				System.out.println("違いますよ！！");
			}
			// switch文から抜け出し呼び出し元に戻る
			break;

		// questionの値が3だった時以下の処理をする
		case 3:
			// 正解してbreakするまで繰り返し続ける
			while (true) {
				// x-y-zの値を求める式を表示し答えの入力を促す
				System.out.print(x + "-" + y + "-" + z + "=");
				// 答えはキーボードから取得する
				int Answer = scan.nextInt();
				// もし答えがあってるならwhile文から抜け出し、その後switch文からも抜け出し呼び出し元に戻る
				if (Answer == x - y - z) {
					break;
				}
				// 答えがあっていなければ、違いますよ！と表示しwhile文先頭に戻る
				System.out.println("違いますよ！！");
			}
			// switch文から抜け出し呼び出し元に戻る
			break;

		// questionの値が0～3ではなかったとき呼び出し元に戻る
		default:
			// switch文から抜け出し呼び出し元に戻る
			break;
		}

	}

	// 続行するか否かを判定するメソッド
	static boolean confirmRetry() {
		// trueかfalseかを判断するのに使う
		int cont;
		// 0か1かを与えられるまで続行するかどうか質問を繰り返す
		do {
			// もう一度問題を解くか否か0か1かで答えるよう促す
			System.out.print("もう一度？＜Yes...1/No...0＞:");
			// 続行するか否かキーボードから入力
			cont = scan.nextInt();
			// 0と1ではない値の時はdo文先頭に戻る
		} while (cont != 0 && cont != 1);
		// カウントの値が1の時は呼び出し元に戻ってconfirmRetryがtrueであったと伝える
		return cont == 1;
	}

}
