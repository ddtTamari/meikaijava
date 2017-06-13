/*
  演習6-16		4行3列と3行4列の席を求めるプログラム、各要素はキーボードから読み込み
  演習日		6月9日
  製作者		玉利仁美
 */
package e_06_16;

import java.util.Scanner;

public class e_06_16 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		// 要素の数の入力を求める

		// 2つのかける配列のうち4行3列の配列aを作成
		int[][] a = new int[4][3];
		// 2つのかける配列のうち3行4列の配列bを作成
		int[][] b = new int[3][4];
		// 積を代入する配列cを作成
		int[][] c = new int[4][4];

		// 4行分繰り返す
		for (int i = 0; i < 4; i++) {
			// 3列分繰り返す
			for (int j = 0; j < 3; j++) {

				// 配列aのインデックスを表示する
				System.out.print("a[" + i + "][" + j + "] = ");
				// 各要素の値を入力
				a[i][j] = stdIn.nextInt();
			}
		}

		// 3行4列分の3行分繰り返す
		for (int i = 0; i < 3; i++) {
			// 3行4列分の4列分繰り返す
			for (int j = 0; j < 4; j++) {
				// 配列bのインデックスを表示する
				System.out.print("b[" + i + "][" + j + "] = ");
				// 各要素の値を入力
				b[i][j] = stdIn.nextInt();
			}
		}

		// 二つの配列の値が入れるように4行4列分の4行分繰り返す
		for (int i = 0; i < 4; i++) {
			// 二つの配列の値が入れるよう、4行4列分の4列分繰り返す
			for (int j = 0; j < 4; j++) {
				// 両方とも値が入っている3行3列目までの積をそれぞれ出し、cの配列に代入
				if (i < 3 && j < 3) {
					// cにaとbの積を代入
					c[i][j] = a[i][j] * b[i][j];
				}
			}
		}
		// 4行目を表示するため4回繰り返す
		for (int i = 0; i < 4; i++) {
			// 4行3列の3列目を表示するため3回繰り返す
			for (int j = 0; j < 3; j++) {
				// 4行目の時
				if (i == 3) {
					// 配列aの値を配列cに代入
					c[i][j] = a[i][j];
				}
			}
		}
		// 3行4列の3行目を表示するため3回繰り返す
		for (int i = 0; i < 3; i++) {
			// 4列目を表示するため4回繰り返す
			for (int j = 0; j < 4; j++) {
				// 4列目の時
				if (j == 3) {
					// 配列bの4列目の値を配列cに代入
					c[i][j] = b[i][j];
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
				System.out.printf("%4d", a[i][j]);
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
				System.out.printf("%4d", b[i][j]);
			}
			// 改行
			System.out.println();
		}
		// 積の配列を表示
		System.out.println("積");
		// 4行分の繰り返しを行う
		for (int i = 0; i < 4; i++) {
			// 4列分の繰り返しを行う
			for (int j = 0; j < 4; j++) {
				// 最低でも4桁で積の値が入った配列cの値を表示
				System.out.printf("%4d", c[i][j]);
			}
			System.out.println();
		}

		// ストリームの解放
		stdIn.close();
	}
}
