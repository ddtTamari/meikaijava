/*
  演習7-32		p241のメソッドprintBitsをint型だけではなくほかの整数型に対しても同様の働きを行うメソッド群の作成
  演習日		6月20日
  製作者		玉利仁美
 */
package e_07_32;

import java.util.Scanner;

public class e_07_32 {
	public static void main(String[] args) {
		// 絶対値を求める整数や実数の値をキーボードから取得するため宣言
		Scanner scan = new Scanner(System.in);

		// 絶対値を求めるbyte型の整数の入力を促す
		System.out.print("byte型の整数：");
		// byte型の整数の値をキーボードから取得
		byte byteInteger = scan.nextByte();
		// 絶対値を求めるshort型の整数の入力を促す
		System.out.print("short型の整数：");
		// short型の整数の値をキーボードから取得
		short shortInteger = scan.nextShort();
		// 絶対値を求めるint型の実数の入力を促す
		System.out.print("int型の実数：");
		// int型の実数の値をキーボードから取得
		int intInteger = scan.nextInt();
		// 絶対値を求めるlong型の実数の入力を促す
		System.out.print("long型の実数：");
		// long型の実数の値をキーボードから取得
		long longInteger = scan.nextLong();

		// 入力されたbyte型の内部ビットであると明示する
		System.out.println("byte型の内部のビット表示");
		// 入力されたbyte型の内部ビットを表示するメソッドを呼び出す
		printBits(byteInteger);

		// 入力されたshort型の内部ビットであると明示する
		System.out.println("short型整数の絶対値は");
		// 入力されたshort型の内部ビットを表示するメソッドを呼び出す
		printBits(shortInteger);

		// 入力されたint型の内部ビットであると明示する
		System.out.println("int型実数の絶対値は");
		// 入力されたint型の内部ビットを表示するメソッドを呼び出す
		printBits(intInteger);

		// 入力されたlong型の内部ビットであると明示する
		System.out.println("long型実数の絶対値は");
		// 入力されたlong型の内部ビットを表示するメソッドを呼び出す
		printBits(longInteger);

		// ストリームを解放
		scan.close();
	}

	// byte型の整数を8ビットで表示するメソッド
	static void printBits(byte x) {
		// 8ビットで表現するので8回繰り返す
		for (int i = 7; i >= 0; i--) {
			// 第iビット目の値が1ならば1を0ならば0を表示する
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
		}
		// 全ビット表示し終えたので改行する
		System.out.println();
	}

	// int型の整数を16ビットで表示するメソッド
	static void printBits(short x) {
		// 16ビットで表現するので16回繰り返す
		for (int i = 15; i >= 0; i--) {
			// 第iビット目の値が1ならば1を0ならば0を表示する
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
		}
		// 全ビット表示し終えたので改行する
		System.out.println();
	}

	// int型の整数を32ビットで表示するメソッド
	static void printBits(int x) {
		// 32ビットで表現するので32回繰り返す
		for (int i = 31; i >= 0; i--) {
			// 第iビット目の値が1ならば1を0ならば0を表示する
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
		}
		// 全ビット表示し終えたので改行する
		System.out.println();
	}

	// int型の整数を64ビットで表示するメソッド
	static void printBits(long x) {
		// 64ビットで表現するので64回繰り返す
		for (int i = 63; i >= 0; i--) {
			// 第iビット目の値が1ならば1を0ならば0を表示する
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
		}
		// 全ビット表示し終えたので改行する
		System.out.println();
	}
}
