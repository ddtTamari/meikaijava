/*
  演習7-25		配列aから要素a[idx]を削除した配列を返却するメソッド
  演習日		6月20日
  製作者		玉利仁美
 */
package e_07_25;

import java.util.Scanner;

public class e_07_25 {
	public static void main(String[] args) {
		// キーボードから要素数などの値を取得するために宣言
		Scanner scan = new Scanner(System.in);
		// これから生成する配列の要素数の入力を求める
		System.out.print("要素数：");
		// 要素の数をキーボードから取得
		int elements = scan.nextInt();
		// 要素数elementsの配列aを生成
		int[] array1 = new int[elements];

		// 要素の数だけ値の入力を求めるので、要素数分繰り返す
		for (int i = 0; i < elements; i++) {
			// i個目の要素の値の入力を求める
			System.out.print("a[" + i + "]:");
			// 配列のi個目の値をキーボードから取得
			array1[i] = scan.nextInt();
		}

		// 何個目の要素の値から消すか入力を求める
		System.out.print("何個目の要素から消しますか：");
		// 何個目の要素から消すのかキーボードからインデックス番号を取得
		int index = scan.nextInt();
		// 何個分の要素を消すのか値の入力を求める
		System.out.print("何個分の値を消しますか：");
		// いくつの要素分値を消すのかキーボードから取得
		int howManyRemove = scan.nextInt();

		// arrayRmvOfメソッドで作られた配列の長さを格納しておく
		int arrayRmvOfLong = arrayRmvOfN(array1, index, howManyRemove).length;

		// 返却された配列の要素数分、表示するために繰り返し行う
		for (int i = 0; i < arrayRmvOfLong; i++) {
			// 入力したindexの値からhowManyRemove分を削除した配列を返却するメソッドを呼び出し、その値を表示する
			System.out.println("a[" + i + "]:" + arrayRmvOfN(array1, index, howManyRemove)[i]);
		}

		// ストリームを解放する
		scan.close();
	}

	// 実引数のidx番目の要素を削除した配列を生成するメソッド
	static int[] arrayRmvOfN(int[] a, int idx, int n) {
		// 配列aの長さを変数として保管
		int aLong = a.length;
		// 配列arrayRemoveは配列aの要素を一つ削除しているので一つ少ない要素数になる
		int[] arrayNRemove = new int[aLong - n];
		int NRemoveNumber = arrayNRemove.length;

		// 配列の長さの分だけ繰り返し行う
		for (int i = 0; i < aLong; i++) {
			// 消す要素より要素番号が大きくなった場合その値を一個前の要素に代入する
			if (i >= idx) {
				// 仮引数aの配列からn個要素数を引いた数の配列arrayNRemoveの要素の数だけ繰り返す
				if (i < NRemoveNumber) {
					// i番目の要素に仮引数配列aのｎ個先の要素の値を代入することでn個前方にずらす
					arrayNRemove[i] = a[i + n];
				}
				// 消す要素より前の要素はそのままarrayRemoveに入る
			} else {
				// 配列arrayRemoveに配列aのi番目の要素を代入する
				arrayNRemove[i] = a[i];
			}
		}

		// 配列arrayRemoveを返却する
		return arrayNRemove;
	}
}
