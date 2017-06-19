/*
  演習7-21		配列aと配列bの全要素の値を交換するメソッドaryExchngの作成
  演習日		6月17日
  製作者		玉利仁美
 */
package e_07_21;

import java.util.Scanner;

public class e_07_21 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 二つの値を交換する配列のうちの一つ目の配列の要素の数の入力を求める
		System.out.print("配列aの要素数：");
		// 一つ目の配列の要素の数をキーボードから取得
		int elementsA = scan.nextInt();

		// 二つの値を交換する配列のうちの二つ目の配列の要素の数の入力を求める
		System.out.print("配列bの要素数：");
		// 二つ目の配列の要素の数をキーボードから取得
		int elementsB = scan.nextInt();

		// 入力された一つ目の配列の要素数の配列aを生成
		int[] arrayA = new int[elementsA];
		// 要素数分各要素に値の入力を求めるので要素数分繰り返す
		for (int i = 0; i < elementsA; i++) {
			// i個目の要素の値の入力を求める
			System.out.print("a[" + i + "]:");
			// i個目の要素の値をキーボードから取得
			arrayA[i] = scan.nextInt();
		}
		// 入力された一つ目の配列の要素数の配列bを生成
		int[] arrayB = new int[elementsB];
		// 要素数分各要素に値の入力を求めるので要素数分繰り返す
		for (int i = 0; i < elementsB; i++) {
			// i個目の要素の値の入力を求める
			System.out.print("b[" + i + "]:");
			// i個目の要素の値をキーボードから取得
			arrayB[i] = scan.nextInt();
		}
		// 配列の長さを変数に代入しておく
		int aLong = arrayA.length;
		// 配列の長さを変数に代入しておく
		int bLong = arrayB.length;
		// 二つの配列の要素の値を入れ替えるメソッドを呼び出し、実引数として配列aと配列bを渡す
		aryExchng(arrayA, arrayB);

		// 配列の全要素を表示したいので配列の長さ分だけ繰り返す
		for (int i = 0; i < aLong; i++) {
			// 配列aの各要素を表示する
			System.out.print("a[" + i + "]:" + arrayA[i] + " / ");
		}
		// 配列aの各要素を入れ替えたので見やすいよう改行する
		System.out.println();

		// 配列の全要素を表示したいので配列の長さ分だけ繰り返す
		for (int i = 0; i < bLong; i++) {
			// 配列bの各要素を表示する
			System.out.print("b[" + i + "]:" + arrayB[i] + " / ");
		}
		// ストリームを解放する
		scan.close();

	}

	// 配列aと配列bの各要素の値を入れ替えるメソッド
	static void aryExchng(int[] a, int[] b) {
		// 要素を取っておく変数を準備
		int copy = 0;
		// 配列の長さが短いほうの数にあわせて入れ替える
		for (int i = 0; i < ((a.length > b.length) ? b.length : a.length); i++) {
			// 要素に配列aの要素を取っておく
			copy = a[i];
			// 配列aの要素に配列bの要素を代入
			a[i] = b[i];
			// 配列bの要素にコピーしておいた配列aの値を代入
			b[i] = copy;
		}

	}
}
