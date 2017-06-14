/*
  演習6-16		4行3列と3行4列の席を求めるプログラム、各要素はキーボードから読み込み
  演習日		6月13日
  製作者		玉利仁美
 */
package e_06_16;

import java.util.Scanner;

public class e_06_16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 要素の数の入力を求める

		// 2つの求める行列の積の配列のうち4行3列の配列arrayAを作成
		int[][] arrayA = new int[4][3];
		// 2つの求める行列の席の配列のうち3行4列の配列arrayBを作成
		int[][] arrayB = new int[3][4];
		// 積を代入する配列cを作成
		int[][] arrayC = new int[4][4];

		// 配列aの値を入力
		// 4行分繰り返す
		for (int i = 0; i < 4; i++) {
			// 3列分繰り返す
			for (int j = 0; j < 3; j++) {
				// 配列aのインデックスを表示する
				System.out.print("a[" + i + "][" + j + "] = ");
				// 各要素の値を入力
				arrayA[i][j] = scan.nextInt();
			}
		}

		// 配列bの値を入力
		// 3行4列分の3行分繰り返す
		for (int i = 0; i < 3; i++) {
			// 3行4列分の4列分繰り返す
			for (int j = 0; j < 4; j++) {
				// 配列bのインデックスを表示する
				System.out.print("b[" + i + "][" + j + "] = ");
				// 各要素の値を入力
				arrayB[i][j] = scan.nextInt();
			}
		}
//		 arrayA[0].length
//		 arrayB[0].length
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				for (int k = 0; k <3; k++) {
					arrayC[i][j] += arrayA[i][k] * arrayB[k][j];
				}
			}
		}

		// aの配列であることを表示
		System.out.println("配列a");
		// 4行分の繰り返しを行う
		for (int i = 0; i < 4; i++) {
			// 3列分の繰り返しを行う
			for (int j = 0; j < 3; j++) {
				// 最低でも4桁で配列aの値を表示
				System.out.printf("%4d", arrayA[i][j]);
			}
			// 改行
			System.out.println();
		}
		// bの配列であることを表示
		System.out.println("配列b");
		// 3行分の繰り返しを行う
		for (int i = 0; i < 3; i++) {
			// 4列分の繰り返しを行う
			for (int j = 0; j < 4; j++) {
				// 最低でも4桁で配列bの値を表示
				System.out.printf("%4d", arrayB[i][j]);
			}
			// 改行
			System.out.println();
		}
		// bの配列であることを表示
		System.out.println("行列の積");
		// 3行分の繰り返しを行う
		for (int i = 0; i < 4; i++) {
			// 4列分の繰り返しを行う
			for (int j = 0; j < 4; j++) {
				// 最低でも4桁で配列bの値を表示
				System.out.printf("%4d", arrayC[i][j]);
			}
			// 改行
			System.out.println();
		}

		// ストリームの解放
		scan.close();
	}
}
