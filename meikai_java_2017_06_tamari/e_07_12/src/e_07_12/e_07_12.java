/*
  演習7-12		整数を左右にシフトした値が、2のべき乗での乗算や除算と等しくなることを確認するプログラムの作成
  演習日		6月16日
  製作者		玉利仁美
 */
package e_07_12;

import java.util.Scanner;

public class e_07_12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 整数ｘをnビット回転した値を返すメソッドを作るための整数ｘの値の入力を促す
		System.out.print("整数x：");
		// nビット回転させる整数ｘの値をキーボードから取得する
		int integerX = scan.nextInt();
		// 何ビット左右に回転させるか入力を促す
		System.out.print("何ビット回転させる：");
		// 何ビット左右に回転させるかキーボードから取得する
		int integerN = scan.nextInt();

		// 整数xを32ビットで表させるメソッドを呼び出し表示する
		printBits(integerX);
		// 32ビット表示をし終えたので改行して見やすくする
		System.out.println();

		// これ以下の数字は整数xをnビット右に回転した値とその32ビット表示であると明示
		System.out.println("整数xをnビット右に回転した数と32ビット表示は：");
		// 整数xをｎビット右にシフトした値を表示するメソッドを呼び出しその値を表示
		System.out.println(rRotate(integerX, integerN));
		// 整数xをｎビット右にシフトした値を、32ビットで表示するメソッドで呼び出し32ビットで表示する
		printBits(rRotate(integerX, integerN));

		// 右に回転した値を表示し終わったので改行して見やすくする
		System.out.println();
		// 整数xをnビット左に回転した数とその値を32ビットで表現したものを表示すると明示
		System.out.println("整数xをnビット左に回転した数と32ビット表示は：");
		// 整数xをｎビット左に回転させた値を表示するメソッドをよびだしその値を表示
		System.out.println(lRotate(integerX, integerN));
		// 整数xをnビット左に回転させた値を、32ビットで表現するメソッドを呼び出し32ビットで表示
		printBits(lRotate(integerX, integerN));
		//
		scan.close();
	}

	// 整数の引数を32ビットで表示するメソッド
	static void printBits(int x) {
		// 32ビットで表現するので32回繰り返し値を求める
		for (int i = 31; i >= 0; i--) {
			// 整数xの第iビットが1ならば1をそれ以外ならば0を返す
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');

		}

	}

	// 整数xと何個右に回転させるかのｎを引数として、回転した整数の値を返すメソッド
	static int rRotate(int x, int n) {
		// 右にｎ回シフトした値を初期値としたkeepを生成
		int keep = x >>> n;
		// 残った部分を逆方向に32－ｎ個シフトすることで、前に右にシフトして消えた分を取っておく
		x = x << 32 - n;
		// keepした32ビットとxの32ビットどちらかが1の時はその値を1にして表示
		x = x | keep;
		// 求められたxの値を呼び出し元に返す
		return x;

	}

	// 整数xと何個左に回転させるかのｎを引数として、回転した整数の値を返すメソッド
	static int lRotate(int x, int n) {
		// 左にｎ回シフトした値を初期値としたkeepを生成
		int keep = x << n;
		// 残った部分を逆方向に32－ｎ個シフトすることで、前に左にシフトして消えた分を取っておく
		x = x >>> 32 - n;
		// keepした32ビットとxの32ビットどちらかが1の時はその値を1にして表示
		x = x | keep;
		// 求められたxの値を呼び出し元に返す
		return x;
	}

}
