/*
  演習7-26		配列aの要素a[idx]にxを挿入した配列を返却するメソッドarrayInsOfを作成
  演習日		6月20日
  製作者		玉利仁美
 */
package e_07_26;

import java.util.Scanner;

public class e_07_26 {
	public static void main(String[] args) {
		// キーボードから要素数などの値を取得するために宣言
		Scanner scan = new Scanner(System.in);
		// これから生成する配列の要素数の入力を求める
		System.out.print("要素数：");
		// 要素の数をキーボードから取得
		int elementsNumber = scan.nextInt();
		// 要素数elementsNumberの配列aを生成
		int[] array1 = new int[elementsNumber];

		// 要素の数だけ値の入力を求めるので、要素数分繰り返す
		for (int i = 0; i < elementsNumber; i++) {
			// i個目の要素の値の入力を求める
			System.out.print("a[" + i + "]:");
			// 配列のi個目の値をキーボードから取得
			array1[i] = scan.nextInt();
		}

		// 何個目の要素のに挿入するのか入力を求める
		System.out.print("何個目要素に値をいれますか：");
		// 何個目の要素に挿入するのかキーボードからインデックス番号を取得
		int index = scan.nextInt();
		// 何の値を挿入するのか入力を求める
		System.out.print("何の値をいれますか：");
		// 何の値を挿入するのかキーボードからインデックス番号を取得
		int increaseValue = scan.nextInt();
		// arrayInsOfメソッドで作られた配列の長さを格納しておく
		int arrayInsOfLong = arrayInsOf(array1, index, increaseValue).length;

		// 返却された配列の要素数分を表示するために繰り返し行う
		for (int i = 0; i < arrayInsOfLong; i++) {
			// 入力したindexの要素にinvreaseValueの値を入れる配列を返却するメソッドを呼び出し、その値を表示する
			System.out.println("a[" + i + "]:" + arrayInsOf(array1, index, increaseValue)[i]);
		}

		// ストリームを解放する
		scan.close();
	}

	// 実引数のidx番目の要素を削除した配列を生成するメソッド
	static int[] arrayInsOf(int[] a, int idx, int x) {
		// 配列aの長さを変数として保管
		int aLong = a.length;
		// 配列arrayRemoveは配列aの要素を一つ削除しているので一つ少ない要素数になる
		int[] arrayIncrease = new int[aLong + 1];

		// 配列の長さの分だけ繰り返し行う
		for (int i = 0; i < aLong; i++) {
			// 挿入したい要素番号になったとき返却する配列に
			if (i == idx) {
				// idx番目の要素に挿入したい引数ｘの値を代入する
				arrayIncrease[i] = x;
				// 挿入した後は返却する配列の要素番号が一つずつずれて引数の配列の要素の値を入れる、
				// ずれたすぐ後の配列番号はiがidxの時にしなければ初期値のままになってしまう
				arrayIncrease[i + 1] = a[i];
				// 消す要素より前の要素はそのままarrayRemoveに入る
			} else if (i < idx) {
				// 配列arrayRemoveに配列aのi番目の要素を代入する
				arrayIncrease[i] = a[i];
			} else {
				// 挿入した後は返却する配列の要素番号が一つずつずれて引数の配列の要素の値を入れる
				arrayIncrease[i + 1] = a[i];
			}
		}
		// 配列arrayIncreaseを返却する
		return arrayIncrease;
	}
}
