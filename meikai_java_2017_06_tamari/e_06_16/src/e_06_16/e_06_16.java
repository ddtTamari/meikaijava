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

		// 2つの計算する行列の積の配列のうち4行3列の配列arrayAを作成
		int[][] arrayA = new int[4][3];
		// 2つの計算する行列の積の配列のうち3行4列の配列arrayBを作成
		int[][] arrayB = new int[3][4];
		// 行列の積の値を代入する配列cを作成
		int[][] arrayC = new int[4][4];

		// 4行3列のarrayAの4行分を表示するために4回繰り返す
		for (int i = 0; i < 4; i++) {
			// 4行3列のarrayAの3列分の表示するために3回繰り返す
			for (int j = 0; j < 3; j++) {
				// arrayA配列の何行何列目なのかを表示し、その要素の値の入力を促す
				System.out.print("a[" + i + "][" + j + "] = ");
				// arrayA配列のi行j列目の値をキーボードから取得
				arrayA[i][j] = scan.nextInt();
			}
		}

		// 3行4列分の配列arrayBの3行分を表示するため3回繰り返す
		for (int i = 0; i < 3; i++) {
			// 3行4列の配列arrayBの4列分を表示するため4回繰り返す
			for (int j = 0; j < 4; j++) {
				// 配列arrayBの何行何列目なのかを表示し、その要素の値の入力を促す
				System.out.print("b[" + i + "][" + j + "] = ");
				// arrayB配列のi行j列目の値をキーボードから取得
				arrayB[i][j] = scan.nextInt();
			}
		}

		// 配列arrayCの4行4列の4行分を表示できるよう一行ずつ4回繰り返し行う
		for (int i = 0; i < 4; i++) {
			// 配列arrayCの4行4列の4列分を表示できるよう、一列分ずつ表示を4回繰り返す
			for (int j = 0; j < 4; j++) {
				// 配列arrayAの3列分と配列arrayBの4行分の表示ができるよう、3回繰り返す。
				for (int k = 0; k < 3; k++) {
					// 配列arrayCの各要素には、arrayAのi行目のk列とarrayBのj列目k行をかけた数を足した値が入る
					arrayC[i][j] += arrayA[i][k] * arrayB[k][j];
				}
			}
		}

		// 配列arrayAであることを表示し、以下に書かれる要素がarrayAのものであると表現する
		System.out.println("配列a");
		// 配列arrayAの4行分のi行目を表示するために、４回繰り返し行う
		for (int i = 0; i < 4; i++) {
			// 配列arrayBの3列分のj列目を表示するために3回繰り返しを行う
			for (int j = 0; j < 3; j++) {
				// 値の位置を揃えるために最低でも4桁で表示するようにし、arrayAのi行j列の値を表示
				System.out.printf("%4d", arrayA[i][j]);
			}
			// i行目が表示し終わったら、次の行に表示するよう改行する
			System.out.println();
		}
		// 配列arrayBであることを表示し、以下に書かれる要素がarrayBのものであると表現する
		System.out.println("配列b");
		// 配列arrayBの3行分のi行目を表示するために、3回繰り返し行う
		for (int i = 0; i < 3; i++) {
			// 配列arrayBの4列分のj列目を表示するために4回繰り返しを行う
			for (int j = 0; j < 4; j++) {
				// 値の位置を揃えるために最低でも4桁で表示するようにし、arrayBのi行j列の値を表示
				System.out.printf("%4d", arrayB[i][j]);
			}
			// i行目が表示し終わったら、次の行に表示するよう改行する
			System.out.println();
		}
		// arrayAとarrayBの行列の積を以降に書いていくことを表示
		System.out.println("行列の積");
		//arrayAとarrayBの行列の積の行列は4行4列のためi行目を4回繰り返し行う
		for (int i = 0; i < 4; i++) {
			// 4行4列のj列目を4回繰り返し行う
			for (int j = 0; j < 4; j++) {
				// 値の位置を揃えるため、最低でも4桁で表示するようにし、arrayCのi行j列目の値を表示
				System.out.printf("%4d", arrayC[i][j]);
			}
			// i行目のj列をすべて終わったら、i+1行目を次の行に表示するよう改行する
			System.out.println();
		}

		// ストリームの解放
		scan.close();
	}
}
