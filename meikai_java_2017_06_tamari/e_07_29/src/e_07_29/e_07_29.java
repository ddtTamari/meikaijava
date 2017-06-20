/*
  演習7-29		2次元配列aと同じ配列(要素数・すべての要素の値が同じ配列)を生成、返却するメソッドの作成
  演習日		6月20日
  製作者		玉利仁美
 */
package e_07_29;

import java.util.Scanner;

public class e_07_29 {
	public static void main(String[] args) {
		// 行数列数やその個々の値をキーボードから取得するために宣言
		Scanner scan = new Scanner(System.in);

		// copyを作る2次元配列の行数の入力を求める
		System.out.print("各行列の行数：");
		// copyを作る2次元配列の行数の値をキーボードから取得する
		int matrixLineNum = scan.nextInt();
		// copyを作る2次元配列の列数の入力を求める
		System.out.print("各行列の列数：");
		// copyを作る2次元配列の列数の長さをキーボードから取得する
		int matrixColumnNum = scan.nextInt();

		// 入力された行数列数を持った行列1を生成
		int[][] matrix1 = new int[matrixLineNum][matrixColumnNum];

		// 行列の値をそれぞれ入れていくので、行列1の行数分繰り返す
		for (int i = 0; i < matrixLineNum; i++) {
			// 行列の値をそれぞれ入れていくので、行列1の列数分だけ繰り返す
			for (int j = 0; j < matrixColumnNum; j++) {
				// 行列i行j列目の値の入力を促す
				System.out.print("a[" + i + "][" + j + "]:");
				// 行列i行j列目の値をキーボードから取得する
				matrix1[i][j] = scan.nextInt();
			}
		}

		// 行列1の各要素の値であることを明示する
		System.out.println("行列１");
		// 行列の要素を一つずつ表示してくれるメソッドを呼び出し、行列1を表示
		printMatrix(matrix1);
		//実引数で渡した2次元配列のクローンを返すメソッドを呼び出す
		aryClone2(matrix1);

		// ストリームを解放
		scan.close();
	}

	// 仮引数に受っとった行列の全要素を表示するメソッド
	static void printMatrix(int[][] m) {
		// 仮引数の行列の行の長さ分繰り返す
		for (int i = 0; i < m.length; i++) {
			// 仮引数の各行の列の長さ分繰り返す
			for (int j = 0; j < m[i].length; j++) {
				// i行j列目の要素の値を表示し、間隔をあける
				System.out.print(m[i][j] + " ");
			}
			// i行目が終わったので改行する
			System.out.println();
		}
	}

	//仮引数に渡された2次元配列のクローンを生成し、それを返すメソッド
	static int[][] aryClone2(int[][] a) {
		// 引数の2次元配列の行数の長さを変数に取っておく
		int matrixLineLong = a.length;
		// 引数の2次元配列の列数の長さを変数に取っておく
		int matrixColumnLong = a[0].length;
		//仮引数に渡された2次元配列と同じ行数・列数の2次元配列を生成
		int[][] arrayCopy = new int[matrixLineLong][matrixColumnLong];

		//配列1のクローンであることを明示
		System.out.println("配列1のクローン");
		//すべての要素を表示するために、行数分繰り返しおこなう
		for (int i = 0; i < matrixLineLong; i++) {
			//すべての要素を表示するために、列数分繰り返し行う
			for (int j = 0; j < matrixColumnLong; j++) {
				//クローンの各要素の中に、引数で渡された各要素を格納
				arrayCopy[i][j] = a[i][j];
				//格納された値を表示する
				System.out.print(arrayCopy[i][j] + " ");
			}
			//i行目を表示し終えたので改行する
			System.out.println();
		}
		//生成された2次元配列を返却する
		return arrayCopy;
	}

}
