/*
  演習7-18		配列aから要素a[idx]を削除するメソッドaryRmv
  演習日		6月17日
  製作者		玉利仁美
 */
package e_07_18;

import java.util.Scanner;

public class e_07_18 {
	public static void main(String[] args) {
		// キーボードから値を取得するためのスキャナー
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
		// 何個目の要素の値を消すか入力を求める
		System.out.print("何番目の要素の値を消しますか：");
		// 何個目の要素を消すのかキーボードからインデックス番号を取得
		int index = scan.nextInt();
		// 指定した要素の値を消すメソッド
		aryRmv(arrayA, index);

		// 配列の要素数分表示するために繰り返し行う
		for (int i = 0; i < elements; i++) {
			// 配列の各要素の値を表示する
			System.out.println("a[" + i + "]:" + arrayA[i]);
		}
		// ストリームを解放する
		scan.close();

	}

	// 指定した要素の値を消しその後方の値を一つずつ前に動かすメソッド
	static void aryRmv(int[] a, int idx) {
		// 引数として受け取った配列の長さの分だけ繰り返し行う
		for (int i = 0; i < a.length; i++) {
			// 消す要素より要素番号が大きくなった場合その値を一個前の要素に代入する
			if (i > idx) {
				// ひとつ前の要素に今の要素の値を代入する
				a[i - 1] = a[i];
			}
		}

	}

}
