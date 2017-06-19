/*
  演習7-22		配列aと配列bの全要素の値を交換するメソッドaryExchngの作成
  演習日		6月17日
  製作者		玉利仁美
 */
package e_07_22;

import java.util.Scanner;

public class e_07_22 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		//クローンを作るもととなる配列aの要素の数の入力を求める
		System.out.print("要素数：");
		//要素数をキーボードから取得
		int elementsA = scan.nextInt();
		//入力された要素数を持った配列aを生成
		int[] arrayA = new int[elementsA];

		//すべての要素を表示するため要素数回分繰り返し行う
		for (int i = 0; i < elementsA; i++) {
			//i個目の要素の値の入力を促す
			System.out.print("a[" + i + "]:");
			//要素の値をキーボードから取得する
			arrayA[i] = scan.nextInt();
		}
		//すべての要素を表示するために要素数分繰り返し行う
		for (int i = 0; i < elementsA; i++) {
			//配列aのクローンを作るメソッドから生成されたクローンを表示する
			System.out.println("copy[" + i + "]:" + arrayClone(arrayA)[i]);
		}
		//ストリームを解放する
		scan.close();

	}

	//実引数に渡された配列aのクローンを作るメソッド
	static int[] arrayClone(int[] a) {
		//配列の長さを変数にとっておく
		int aLong = a.length;
		//配列aと同じ長さの配列copyを生成
		int[] copy = new int[aLong];
		//すべての要素の値をコピーするため配列の長さ分繰り返しを行う
		for (int i = 0; i < aLong; i++) {
			//配列copyに配列aの値を代入
			copy[i] = a[i];
		}
		//配列copyを呼び出し元に返す
		return copy;
	}

}
