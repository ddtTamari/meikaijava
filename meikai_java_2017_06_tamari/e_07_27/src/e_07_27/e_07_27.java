/*
  演習7-27		3つの配列のx、y、zの行数列数が同一ならば加算を行いtrueを、
  				等しくなければ加算を行わずfalseを返すメソッド
  演習日		6月20日
  製作者		玉利仁美
 */
package e_07_27;

import java.util.Scanner;

public class e_07_27 {
	public static void main(String[] args) {
		// 行数列数やその個々の値をキーボードから取得するために宣言
		Scanner scan = new Scanner(System.in);

		// 行列1の行数の入力を促す
		System.out.print("行列1の行数：");
		// 行列1の行数の長さをキーボードから取得する
		int matrix1LineNum = scan.nextInt();
		// 行列1の列数の入力を促す
		System.out.print("行列1の列数：");
		// 行列1の列数の長さをキーボードから取得する
		int matrix1ColumnNum = scan.nextInt();
		// 行列2の行数の入力を促す
		System.out.print("行列2の行数：");
		// 行列2の行数の長さをキーボードから取得する
		int matrix2LineNum = scan.nextInt();
		// 行列2の列数の入力を促す
		System.out.print("行列2の列数：");
		// 行列2の列数の長さをキーボードから取得する
		int matrix2ColumnNum = scan.nextInt();

		// 入力された行数列数を持った行列1を生成
		int[][] matrix1 = new int[matrix1LineNum][matrix1ColumnNum];
		// 入力された行数列数を持った行列2を生成
		int[][] matrix2 = new int[matrix2LineNum][matrix2ColumnNum];
		// 行列1と行列2の行数列数が一緒の時に合計を入れる行列Sumを生成
		int[][] matrixSum = new int[matrix1LineNum][matrix1ColumnNum];

		// 行列の値をそれぞれ入れていくので、行列1の行数分繰り返す
		for (int i = 0; i < matrix1.length; i++) {
			// 行列の値をそれぞれ入れていくので、行列1の列数分だけ繰り返す
			for (int j = 0; j < matrix1[i].length; j++) {
				// 行列i行j列目の値の入力を促す
				System.out.print("a[" + i + "][" + j + "]:");
				// 行列i行j列目の値をキーボードから取得する
				matrix1[i][j] = scan.nextInt();
			}
		}
		// 行列の値をそれぞれ入れていくので、行列2の行数分繰り返す
		for (int i = 0; i < matrix2.length; i++) {
			// 行列の値をそれぞれ入れていくので、行列2の列数分だけ繰り返す
			for (int j = 0; j < matrix2[i].length; j++) {
				// 行列i行j列目の値の入力を促す
				System.out.print("b[" + i + "][" + j + "]:");
				// 行列i行j列目の値をキーボードから取得する
				matrix2[i][j] = scan.nextInt();
			}
		}

		// 行列1の各要素の値であることを明示する
		System.out.println("行列１");
		// 行列の要素を一つずつ表示してくれるメソッドを呼び出し、行列1を表示
		printMatrix(matrix1);
		// 行列2の各要素の値であることを明示する
		System.out.println("行列２");
		// 行列の要素を一つずつ表示してくれるメソッドを呼び出し、行列2を表示
		printMatrix(matrix2);

		// addMatrixの値がtrueならばtrueと合計結果を表示し、そうでなければfalse表示する
		if (addMatrix(matrix1, matrix2, matrixSum)) {
			// 返却値がtrueだったのでtrueと表示
			System.out.println("true");
			// trueじゃなければfalseと表示
		} else {
			// trueではなかったのでfalseと表示
			System.out.println("false");
		}

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

	// 仮引数に受け取った2つの行列の長さが等しいとき加算しtrueを返し、等しくなければfalseのみ返すメソッド
	static boolean addMatrix(int[][] x, int[][] y, int[][] z) {
		// 行列xの行数を変数にとっておく
		int matrix1LineNumLong = x.length;
		// 今回は、各行によって列の長さは変わらないため、0行目の列の長さを変数に取っておく
		int matrix1ColumnNumLong = x[0].length;
		//// 行列yの行数を変数にとっておく
		int matrix2LineNumLong = y.length;
		// 今回は、各行によって列の長さは変わらないため、0行目の列の長さを変数に取っておく
		int matrix2ColumnNumLong = y[0].length;

		// 行列xと行列yの行数、列数が両方とも同じの時加算を行う
		if (matrix1LineNumLong == matrix2LineNumLong && matrix1ColumnNumLong == matrix2ColumnNumLong) {
			// 行列xと行列yの行列の合計であることを明示
			System.out.println("行列の合計");
			// 2つの行列の行数は変わらないので行列xの長さ分繰り返す
			for (int i = 0; i < matrix1LineNumLong; i++) {
				// 2つの行列の列数は変わらないので行列xの長さ分繰り返す
				for (int j = 0; j < matrix1ColumnNumLong; j++) {
					//合計を入れる行列i行j列目に、行列xと行列yのi行j列の値を足した値を代入
					z[i][j] = x[i][j] + y[i][j];
					//合計を入れた行列の各要素を表示
					System.out.print(z[i][j] + " ");
				}
				//i行目を表示し終えたので改行する
				System.out.println();
			}
			//行列xと行列yの行数・列数が同じだったのでtrueを返す
			return true;
		//2つの行列の行数、列数が同じではなかったので何も行わずfalseを返す
		} else {
			//2つの行列の行数、列数が異なっていたのでfalseを返す
			return false;
		}
	}
}
