/*
  演習7-28		行列ｘとｙの和を格納した2次元配列を返すメソッドを作成(行数および列数が同一の配列)
  演習日		6月20日
  製作者		玉利仁美
 */
package e_07_28;

import java.util.Scanner;

public class e_07_28 {
	public static void main(String[] args) {
		// 行数列数やその個々の値をキーボードから取得するために宣言
		Scanner scan = new Scanner(System.in);

		// 和を求める2つの行列の行数の入力を促す
		System.out.print("各行列の行数：");
		// 和を求める2つの行列の行数の長さをキーボードから取得する
		int matrixLineNum = scan.nextInt();
		// 和を求める2つの行列の列数の入力を促す
		System.out.print("各行列の列数：");
		// 和を求める2つの行列の列数の長さをキーボードから取得する
		int matrixColumnNum = scan.nextInt();

		// 入力された行数列数を持った行列1を生成
		int[][] matrix1 = new int[matrixLineNum][matrixColumnNum];
		// 入力された行数列数を持った行列2を生成
		int[][] matrix2 = new int[matrixLineNum][matrixColumnNum];

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
		// 行列の値をそれぞれ入れていくので、行列2の行数分繰り返す
		for (int i = 0; i < matrixLineNum; i++) {
			// 行列の値をそれぞれ入れていくので、行列2の列数分だけ繰り返す
			for (int j = 0; j < matrixColumnNum; j++) {
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

		// 2つの行列の和を格納した行列を表示し返すメソッドを呼び出す
		addMatrix(matrix1, matrix2);

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

	//2つの行列の和を格納した行列を表示し返却するメソッド
	static int[][] addMatrix(int[][] x, int[][] y) {
		//引数の2つの行列は行数列数がそれぞれ同じ値なので、初期値として行列xの行数を取っておく
		int matrixLineLong = x.length;
		//引数の2つの行列は行数列数がそれぞれ同じ値なので、初期値として行列xの列数を取っておく
		int matrixColumnLong = x[0].length;
		//2つの行列と同じ行数、列数の和を格納する行列を生成
		int addMatrix[][] = new int[matrixLineLong][matrixColumnLong];

		// 行列xと行列yの行列の合計であることを明示
		System.out.println("行列の合計");
		// 2つの行列の行数は変わらないので行列xの長さ分繰り返す
		for (int i = 0; i < matrixLineLong; i++) {
			// 2つの行列の列数は変わらないので行列xの長さ分繰り返す
			for (int j = 0; j < matrixColumnLong; j++) {
				// 合計を入れる行列i行j列目に、行列xと行列yのi行j列の値を足した値を代入
				addMatrix[i][j] = x[i][j] + y[i][j];
				// 合計を入れた行列の各要素を表示
				System.out.print(addMatrix[i][j] + " ");
			}
			// i行目を表示し終えたので改行する
			System.out.println();
		}
		//2つの行列の和が入った行列を返却
		return addMatrix;
	}
}
