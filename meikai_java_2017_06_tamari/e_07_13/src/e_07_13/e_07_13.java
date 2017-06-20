/*
  演習7-13		整数xのposビット目(最下位から0,1,2…)を、
  				1にした値を返すメソッド、0にした値を返すメソッド、反転した値を返すメソッドの作成
  演習日		6月17日
  製作者		玉利仁美
 */
package e_07_13;

import java.util.Scanner;

public class e_07_13 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 整数ｘのnビット目を変える整数の値の入力を促す
		System.out.print("整数x：");
		// nビット目をかえる整数ｘの値をキーボードから取得する
		int integerX = scan.nextInt();
		// 整数xを32ビットで表させるメソッドを呼び出し表示する
		printBits(integerX);
		// 32ビット表示をし終えたので改行して見やすくする
		System.out.println();
		// 何ビット目を変えさせるか入力を促す
		System.out.print("何ビット目を変えるか：");
		// 何ビット目を変えさせるかキーボードから取得する
		int positionN = scan.nextInt();

		System.out.println("ｎビット目を1に変えた値を返します：");
		// integerXのpositionN個目を1に変えるメソッドを呼び出す
		System.out.print(set(integerX, positionN));
		// 32ビット表示し終えたので改行する
		System.out.println();
		System.out.println("ｎビット目を0に変えた値を返します：");
		// integerXのpositionN個目を0に変えるメソッドを呼び出す
		System.out.print(reset(integerX, positionN));
		// 32ビット表示し終えたので改行する
		System.out.println();
		System.out.println("ｎビット目を反転した値を返します：");
		// integerXのpositionN個目を反転した値にするメソッドを呼び出す
		System.out.print(inverse(integerX, positionN));
		// ストリームを解放
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

	// pos個目を1に変えるメソッド
	static int set(int x, int pos) {
		// 32ビットで表示するので32回繰り返す
		for (int i = 31; i >= 0; i--) {
			// 31から0までで表示し、i回目が指定したposと一緒の時1を表示する
			if (i == pos) {
				// posビット目なので1を表示
				System.out.print('1');
				// posビット目ではないとき
			} else {
				// 整数xの第iビットが1ならば0をそれ以外ならば1を返す
				System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
			}
		}
		// 32ビット分を表示し終えたので改行する
		System.out.println();

		return x;
	}

	// 2のshift乗を計算するメソッド
	static int power(int shift) {
		// 2のshift乗を入れておく変数を用意
		int power = 1;
		// shift回分繰り返し2をかけ続ける
		for (int i = 0; i < shift; i++) {
			// 2をi回分かける
			power *= 2;
		}
		// 返却値として２のshift乗を返す
		return power;
	}

	// pos個目を0に変えるメソッド
	static int reset(int x, int pos) {
		// 32ビットで表示するので32回繰り返す
		for (int i = 31; i >= 0; i--) {
			// 31から0までで表示し、i回目が指定したposと一緒の時0を表示する
			if (i == pos) {
				// posビット目なので0を表示
				System.out.print('0');
				// posビット目ではないとき
			} else {
				// 整数xの第iビットが1ならば1をそれ以外ならば0を返す
				System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
			}
		}
		// 32ビット分を表示し終えたので改行する
		System.out.println();
		return x;
	}

	// pos個目を反転させるメソッド
	static int inverse(int x, int pos) {
		// 32ビットで表示するので32回繰り返す
		for (int i = 31; i >= 0; i--) {
			// 31から0までで表示し、i回目が指定したposと一緒の時反転した2進数を表示する
			if (i == pos) {
				System.out.print(((x >>> i & 1) == 1) ? '0' : '1');
			} else {
				// 整数xの第iビットが1ならば1をそれ以外ならば0を返す
				System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
			}
		}
		// 32ビット分を表示し終えたので改行する
		System.out.println();
		// ｘの値を返す
		return x;
	}

}
// 自分の認識が間違えていました
