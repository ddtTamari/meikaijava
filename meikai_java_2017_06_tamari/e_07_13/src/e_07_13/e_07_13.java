/*
  演習7-13		整数xのposビット目(最下位から0,1,2…)を、
  				1にした値を返すメソッド、0にした値を返すメソッド、反転した値を返すメソッドの作成
  演習日		6月17日
  製作者		玉利仁美
 */
package e_07_13;
//キーボード入力をするためにスキャナークラスをインポート
import java.util.Scanner;

//メインクラス
public class e_07_13 {
	//メインメソッド
	public static void main(String[] args) {
		//キーボード入力を可能にするために宣言
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
		// 変える位置で1を使って論理和にするために1を準備する
		int doChangePosBits = 1;
		// posビット目を1に変えた値を返す変数
		int returnChangeValue;
		// posビット目だけが1の値にする
		returnChangeValue = doChangePosBits << pos;

		// posビット目が1になるよう論理和を使いポスビット目を1にする
		returnChangeValue = (returnChangeValue | x);
		// 32ビットで表示するメソッドでポスビット目を1にした値を32ビットで表示する
		printBits(returnChangeValue);

		// 32ビット分を表示し終えたので改行する
		System.out.println();
		// posビット目を1にした値を返す
		return returnChangeValue;
	}

	// pos個目を0に変えるメソッド
	static int reset(int x, int pos) {
		// 変える位置で1を使って論理積するために1を準備する
		int doChangePosBits = 1;
		// posビット目を0に変えた値を返す変数
		int returnChangeValue;
		// posビット目だけが1の値の補数を行いposビット目だけが0の値にする
		returnChangeValue = ~(doChangePosBits << pos);
		// posビット目が0になるよう論理積を使いポスビット目を1にする
		returnChangeValue = (returnChangeValue & x);
		// 32bitでposビット目が0になった値を表示する
		printBits(returnChangeValue);
		// 32ビット分を表示し終えたので改行する
		System.out.println();
		// posビット目を0にした値を返す
		return returnChangeValue;
	}

	// pos個目を反転させるメソッド
	static int inverse(int x, int pos) {
		// 変える位置で1を使って排他的論理和にするために1を準備する
		int doChangePosBits = 1;
		// posビット目を1に変えた値を返す変数
		int returnChangeValue;
		// posビット目だけが1の値にする
		returnChangeValue = doChangePosBits << pos;
		// posビット目が反転した値になるよう排他的論理和を使いポスビット目を反転した値にする
		returnChangeValue = (returnChangeValue ^ x);
		// 32bitでposビット目が反転した値を表示する
		printBits(returnChangeValue);
		// 32ビット分を表示し終えたので改行する
		System.out.println();
		// posビット目を1にした値を返す
		return returnChangeValue;
	}

}

