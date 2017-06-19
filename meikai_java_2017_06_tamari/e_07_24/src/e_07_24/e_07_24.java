/*
  演習7-24		配列aから要素a[idx]を削除した配列を返却するメソッド
  演習日		6月17日
  製作者		玉利仁美
 */
package e_07_24;

import java.util.Scanner;

public class e_07_24 {
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

		// 何個目の要素の値を消すか入力を求める
		System.out.print("何個目の値を消しますか：");
		// 何個目の要素を消すのかキーボードからインデックス番号を取得
		int index = scan.nextInt();

		// 配列の要素数を表示するために繰り返し行う
		for (int i = 0; i < arrayRmvOf(arrayA, index).length; i++) {
			// 入力したindexの値を削除した配列を返却するメソッドを呼び出し、その値を表示する
			System.out.println("a[" + i + "]:" + arrayRmvOf(arrayA, index)[i]);
		}
		// ストリームを解放する
		scan.close();

	}

	//実引数のidx番目の要素を削除した配列を生成するメソッド
	static int[] arrayRmvOf(int[] a, int idx) {
		//配列aの長さを変数として保管
		int aLong = a.length;
		//配列arrayRemoveは配列aの要素を一つ削除しているので一つ少ない要素数になる
		int[] arrayRemove = new int[aLong - 1];

		// 配列の長さの分だけ繰り返し行う
		for (int i = 0; i < aLong; i++) {

			// 消す要素より要素番号が大きくなった場合その値を一個前の要素に代入する
			if (i > idx) {
				// ひとつ前の要素に今の要素の値を代入する
				arrayRemove[i - 1] = a[i];
			//消す要素より前の要素はそのままarrayRemoveに入る
			} else {
				//配列arrayRemoveに配列aのi番目の要素を代入する
				arrayRemove[i] = a[i];
			}
		}
		//配列arrayRemoveを返却する
		return arrayRemove;
	}
}
