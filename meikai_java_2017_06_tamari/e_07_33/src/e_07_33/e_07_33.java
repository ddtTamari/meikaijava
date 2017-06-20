/*
  演習7-33		int型の1次元配列と2次元配列(行によって列数が異なる可能性がある)の全要素の値を表示するメソッド群
  演習日		6月20日
  製作者		玉利仁美
 */
package e_07_33;

import java.util.Scanner;

public class e_07_33 {
	public static void main(String[] args) {
		// 1次元配列の要素数とか2次元配列の構成要素などをキーボードから取得できるよう宣言
		Scanner scan = new Scanner(System.in);

		// 表示する1次元配列の要素の数の入力を促す
		System.out.print("1次元配列の要素数：");
		// 要素の数をキーボードから取得
		int oneArrayElementsNum = scan.nextInt();
		// 入力された要素数の1次元の配列を生成する
		int[] oneDimensionalArray = new int[oneArrayElementsNum];

		// 要素数の数だけ要素の値の入力を求めるので、要素数分繰り返す
		for (int i = 0; i < oneArrayElementsNum; i++) {
			// i番目の要素の値の入力を促す
			System.out.print("a[" + i + "]:");
			// 要素の値をキーボードから取得
			oneDimensionalArray[i] = scan.nextInt();
		}

		// 表示する2次元配列の構成要素数の入力を促す
		System.out.print("2次元配列の構成要素数：");
		// 2次元配列の構成要素の数をキーボードから取得
		int twoArrayElementsNum = scan.nextInt();
		// 入力した構成要素の数を持つ2次元配列を生成する
		int[][] twoDimensionalArray = new int[twoArrayElementsNum][];
		// 2次元配列の各行の要素数を生成する
		int twoDimensionalArrayColumn = 0;

		// すべての構成要素に要素を入れるため、構成要素数分繰り返す
		for (int i = 0; i < twoArrayElementsNum; i++) {
			// i行目の要素数の入力を促す
			System.out.print("2次元配列b[" + i + "]" + "の要素数：");
			// i行目の要素数をキーボードから取得
			twoDimensionalArrayColumn = scan.nextInt();
			// i行目に入力した要素数を与える
			twoDimensionalArray[i] = new int[twoDimensionalArrayColumn];
		}

		// 各要素に値を入力するため各構成要素数分繰り返す
		for (int i = 0; i < twoArrayElementsNum; i++) {
			// 各要素に値を入力するため各行の要素数分繰り返す
			for (int j = 0; j < twoDimensionalArray[i].length; j++) {
				// i行j列目の値の入力を促す
				System.out.print("b[" + i + "][" + j + "]:");
				// i行j列目の値をキーボードから取得
				twoDimensionalArray[i][j] = scan.nextInt();
			}
		}

		// 配列を表示するメソッドで1次元配列を表示
		printArray(oneDimensionalArray);
		// 配列を表示するメソッドで2次元配列を表示
		printArray(twoDimensionalArray);

		// ストリームを解放
		scan.close();
	}

	// 引数に受け取った配列を表示するプログラム
	private static void printArray(int[] a) {
		// 仮引数の配列の長さを格納する
		int aLong = a.length;
		// これから表示されるのが1次元配列であると明示
		System.out.println("1次元配列の表示");

		// すべての要素を表示するので要素数分繰り返す
		for (int i = 0; i < aLong; i++) {
			// 見やすくするため各要素を表示した後に1文字分スペースを空ける
			System.out.print(a[i] + " ");
		}
		// 配列を表示し終えたので改行する
		System.out.println();

	}

	// 引数に受け取った配列を表示するプログラム
	private static void printArray(int[][] a) {
		// 仮引数の配列の長さを格納する
		int aLong = a.length;
		// 各構成要素の長さを格納しておく変数
		int aLineLong = 0;
		// これから表示されるのが2次元配列であると明示
		System.out.println("2次元配列の表示");

		// すべての要素を表示するため構成要素数分繰り返す
		for (int i = 0; i < aLong; i++) {
			// 各構成要素の要素数を格納
			aLineLong = a[i].length;
			// すべての要素を表示するため各構成要素の要素数分繰り返す
			for (int j = 0; j < aLineLong; j++) {
				// 一つ目の要素を表示するときはそのまま要素の値を表示
				if (j == 0) {
					// i行j列の要素の値を表示する
					System.out.print(a[i][j]);
					// それ以降の要素については、揃えるため最低でも5桁で表示
				} else {
					// 各要素の値を最低でも5桁で表示する
					System.out.printf("%5d", a[i][j]);
				}
			}
			// 配列を表示し終えたので改行する
			System.out.println();
		}
	}
}
