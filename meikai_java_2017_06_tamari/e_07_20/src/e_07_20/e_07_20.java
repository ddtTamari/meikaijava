/*
  演習7-20		配列a[idx]にxを挿入するメソッドaryInsを作成
  演習日		6月17日
  製作者		玉利仁美
 */
package e_07_20;

import java.util.Scanner;

public class e_07_20 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// これから生成する配列の要素数の入力を求める
		System.out.print("要素数：");
		// 要素の数をキーボードから取得
		int elements = scan.nextInt();
		// 要素数elementsの配列aを生成
		int[] arrayA = new int[elements];

		// 要素の数だけ値の入力を求めるので、要素数分繰り返す
		for (int i = 0; i < elements; i++) {
			// i個目の要素の値の入力を求める
			System.out.print("a[" + i + "]:");
			// 配列のi個目の値をキーボードから取得
			arrayA[i] = scan.nextInt();
		}
		// 何個目の要素に新たな値を入れるのか入力を求める
		System.out.print("何個目の要素に挿入しますか：");
		// 何個目の要素に新たな値を入れるのかキーボードからインデックス番号を取得
		int index = scan.nextInt();

		// いくつの値を挿入するのか値の入力を求める
		System.out.print("何の値を挿入しますか：");
		// いくつの値を挿入するのかキーボードから取得
		int howMany = scan.nextInt();

		// 指定した要素の場所に任意の値を挿入するメソッド
		aryIns(arrayA, index, howMany);

		// 配列の要素数分表示するために繰り返し行う
		for (int i = 0; i < elements; i++) {
			// 配列の各要素の値を表示する
			System.out.println("a[" + i + "]:" + arrayA[i]);
		}
		// ストリームを解放する
		scan.close();

	}

	static void aryIns(int[] a, int idx, int x) {

		for (int i = 0; i < a.length; i++) {

			if (i == idx) {
				a[i] = x;
			}
			a[i] = a[i + 1];
		}

	}
}
