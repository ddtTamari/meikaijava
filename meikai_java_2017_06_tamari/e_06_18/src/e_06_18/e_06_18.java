/*
  演習6-18		行数・各行の列数・各要素の値をキーボードから読み込む
  演習日		6月15日
  製作者		玉利仁美
 */
package e_06_18;

import java.util.Scanner;

public class e_06_18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int arrayA[][]; // 凹凸した二次元配列を作成するための配列変数を作成
		// arrayAという配列変数の構成要素数の入力を求める
		System.out.print("行数：");
		// arrayAの行数をキーボードから取得
		int lineCount = scan.nextInt();
		// arrayAの配列本体を作るとともにいくつの要素があるのかキーボードから読みっとった値を代入
		arrayA = new int[lineCount][];
		int columnCount = 0; // arrayAの何行目にいくつの構成要素があるのかという値を初期値0で生成
		int arrayALong = arrayA.length; // arrayAの長さを取っておく

		// arrayA[lineCount]の各行の中にいくつの要素があるのかを入れる
		for (int i = 0; i < arrayALong; i++) {
			// i行目の構成要素がいくつあるのか代入を促す
			System.out.print(i + "行の列数：");
			// 構成要素数をキーボードから取得する
			columnCount = scan.nextInt();
			// arrayAのi行目にはキーボードから入力された値の数だけ要素を生成
			arrayA[i] = new int[columnCount];
		}

		// arrayAの各行各列の中にどんな値を入れるのかを求めるため、0行目からarrayAの構成要素数まで繰り返す
		for (int i = 0; i < arrayALong; i++) {
			// i行目の各列に値を入れていくので、i行目の構成要素数まで繰り返す
			for (int j = 0; j < arrayALong; j++) {
				// arrayAのi行目j列目にいくつの値を入れるのか入力を促す
				System.out.print("配列a[" + i + "][" + j + "]の値：");
				// 各行列の要素の値をキーボードから入力
				int elements = scan.nextInt();
				// 各行列にキーボード入力された値を代入
				arrayA[i][j] = elements;
			}

		}
		// 最後に生成されたarrayAの多次元配列を表示するため、i行分繰り返す
		for (int i = 0; i < arrayALong; i++) {
			// i行目のj列分繰り返し値を表示するため、arrayAのi行の要素数分繰り返す
			for (int j = 0; j < arrayA[i].length; j++) {
				// i行j列の値を、間隔を揃えるため最低でも3桁で表示する
				System.out.printf("%3d", arrayA[i][j]);
			}
			// i行目の値をすべて表示したので、改行する
			System.out.println();
		}
		// ストリームを解放
		scan.close();
	}

}
