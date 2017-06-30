/*
  演習7-14		整数xのposビット目(最下位から0,1,2…)を、
  				最下位として連続するｎ個のビットを、1にした値、0にした値、反転した値を返すメソッド
  演習日		6月30日
  製作者		玉利仁美
 */
package e_07_14;

import java.util.Scanner;

public class e_07_14 {
	// メインメソッド
	public static void main(String[] args) {
		// キーボード入力を可能にするために宣言
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
		// 何個値を変えるか入力を促す
		System.out.print("何ビット連続でかえるか：");
		// キーボードから何個変えるかの値を取得する
		int howManyChangeBits = scan.nextInt();

		// posビット目からｎ個値を変えた数字を返すと表示
		System.out.println("posビット目からｎ個1に変えた値を返します：");
		// integerXのpositionN個目を1に変えるメソッドを呼び出す
		System.out.print(setN(integerX, positionN, howManyChangeBits));
		// 32ビット表示し終えたので改行する
		System.out.println();
		// posビット目からｎ個値を0に変えた数字であると表示
		System.out.println("posビット目からｎ個0に変えた値を返します：");
		// integerXのpositionN個目からhowManyChangeBits分変えるメソッドを呼び出す
		System.out.print(resetN(integerX, positionN, howManyChangeBits));
		// 32ビット表示し終えたので改行する
		System.out.println();
		// posビット目からｎ個反転させた値を返すと表示
		System.out.println("ｎビット目を反転した値を返します：");
		// integerXのpositionN個目からhowManyChangeBits分値を反転した値にするメソッドを呼び出す
		System.out.print(inverseN(integerX, positionN, howManyChangeBits));

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

	// pos個目からposbit分を1に変えるメソッド
	static int setN(int x, int pos, int n) {
		// 変える位置で1を使って論理和にするために1を準備する
		int doChangePosBits = 1;
		// posビット目を1に変えた値を返す変数
		int returnChangeValue;

		// posビット目からｎ個を1にし、指定した位置に1の群を動かす
		returnChangeValue = (~doChangePosBits >>> (31 - n + 1)) << pos - n + 1;
		// posビット目からｎ個が1になるよう論理和を使いポスビット目からを1にする
		returnChangeValue = (returnChangeValue | x);
		// 32ビットで表示するメソッドでポスビット目からを1にした値を32ビットで表示する
		printBits(returnChangeValue);
		// 32ビット分を表示し終えたので改行する
		System.out.println();
		// posビット目を1にした値を返す
		return returnChangeValue;
	}

	// pos個目からposbit分を0に変えるメソッド
	static int resetN(int x, int pos, int n) {
		// 変える位置で1を使って論理積にするために1を準備する
		int doChangePosBits = 1;
		// posビット目を1に変えた値を返す変数
		int returnChangeValue;

		// posビット目からｎ個を0にし、指定した位置に0の群を動かす
		returnChangeValue = ~(~doChangePosBits >>> (31 - n + 1) << pos - n + 1);
		// posビット目からｎ個が0になるよう論理積を使いポスビット目からを0にする
		returnChangeValue = (returnChangeValue & x);
		// 32ビットで表示するメソッドでポスビット目からを0にした値を32ビットで表示する
		printBits(returnChangeValue);
		// 32ビット分を表示し終えたので改行する
		System.out.println();
		// posビット目を1にした値を返す
		return returnChangeValue;
	}

	// pos個目からposbit分を値を反転させるメソッド
	static int inverseN(int x, int pos, int n) {
		// 変える位置で1を使って排他的論理和するために1を準備する
		int doChangePosBits = 1;
		// posビット目を1に変えた値を返す変数
		int returnChangeValue;

		// posビット目からｎ個だけが1の値にして、それを指定した位置に移動させる
		returnChangeValue = ~doChangePosBits >>> (31 - n + 1) << pos - n + 1;
		// posビット目からｎ個が1になるよう排他的論理和を使いポスビット目からｎ個を反転する
		returnChangeValue = (returnChangeValue ^ x);
		// 32ビットで表示するメソッドでポスビット目からｎ個を1にした値を32ビットで表示する
		printBits(returnChangeValue);
		// 32ビット分を表示し終えたので改行する
		System.out.println();
		// posビット目を反転した値を返す
		return returnChangeValue;
	}

}
