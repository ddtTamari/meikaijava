/*
  演習7-19		配列aから要素a[idx]を先頭とするn個の要素を削除するメソッドaryRmvNを作成
  演習日		6月17日
  製作者		玉利仁美
 */
package e_07_19;

import java.util.Scanner;

public class e_07_19 {
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
		// 何個目の要素の値から消すか入力を求める
		System.out.print("何個目からの値を消しますか：");
		// 何個目の要素から消すのかキーボードからインデックス番号を取得
		int index = scan.nextInt();

		// 何個分の要素を消すのか値の入力を求める
		System.out.print("何個分の値を消しますか：");
		// いくつの要素分値を消すのかキーボードから取得
		int howMany = scan.nextInt();

		// 指定した要素の値を消すメソッド
		aryRmvN(arrayA, index, howMany);

		// 配列の要素数分表示するために繰り返し行う
		for (int i = 0; i < elements; i++) {
			// 配列の各要素の値を表示する
			System.out.println("a[" + i + "]:" + arrayA[i]);
		}
		// ストリームを解放する
		scan.close();

	}

	// 引数の配列のidxからn個分値を消去するメソッド
	static void aryRmvN(int[] a, int idx, int n) {
		// 配列の長さの分だけ繰り返し行う
		for (int i = 0; i < a.length; i++) {
			// 消す数より要素番号のほうが大きいときに処理を行う
			if (i > n) {
				// iからn個引いたインデックスの配列に今の要素番号の値を代入する
				a[i - n] = a[i];

			}
		}
	}

}
