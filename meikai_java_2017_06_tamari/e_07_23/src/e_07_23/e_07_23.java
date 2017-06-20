/*
  演習7-23		配列aの要素の中で値がxである全要素のインデックスを先頭から順に格納した配列を返却するメソッド
  演習日		6月17日
  製作者		玉利仁美
 */
package e_07_23;

import java.util.Scanner;

public class e_07_23 {
	public static void main(String[] args) {
		// キーボードから値を取得するために宣言
		Scanner scan = new Scanner(System.in);

		// クローンを作るもととなる配列aの要素の数の入力を求める
		System.out.print("要素数：");
		// 要素数をキーボードから取得
		int elements = scan.nextInt();
		// 入力された要素数を持った配列aを生成
		int[] array = new int[elements];

		// すべての要素を表示するため要素数回分繰り返し行う
		for (int i = 0; i < elements; i++) {
			// i個目の要素の値の入力を促す
			System.out.print("a[" + i + "]:");
			// 要素の値をキーボードから取得する
			array[i] = scan.nextInt();
		}
		// 配列の中を探す値の入力を促す
		System.out.print("探す値：");
		// 探す値をキーボードから取得する
		int key = scan.nextInt();

		// すべての要素を表示するために要素数分繰り返し行う
		for (int i = 0; i < arraySrchIdx(array, key).length; i++) {
			// 配列aの要素と探す値が一致したときの配列aの要素番号を格納する配列を作るメソッドを呼び出し、その値を表示する
			System.out.println("key[" + i + "]:" + arraySrchIdx(array, key)[i]);

		}
		// ストリームを解放する
		scan.close();
	}

	// 探す値と配列の要素の値が一緒の時、その要素の番号を格納する配列を生成するメソッド
	static int[] arraySrchIdx(int[] a, int x) {
		// keyと要素の値が一緒の時の要素の番号を入れる配列の要素数を準備
		int elementsKey = 0;
		// 配列aの長さを記憶しておく
		int aLong = a.length;

		// 配列aの中に何個、探す値があるのか調べたいので要素数分繰り返す
		for (int i = 0; i < aLong; i++) {
			// i個目の要素と探す値が一緒の時、それを格納する要素数を一つ増やす
			if (a[i] == x) {
				// 配列aの要素とkeyが一緒の時、それを格納する要素数を一つ増やす
				elementsKey++;
			}
		}
		// 配列keyの要素番号を取っておく変数
		int elements = 0;
		// 要素数がelementsKey(a[i]とkeyが同じになった回数)の配列keyを生成
		int[] arrayKey = new int[elementsKey];

		// 配列aの長さ繰り返す
		for (int i = 0; i < aLong; i++) {
			// 探している値と配列aのi個目の要素の値が一緒だった場合
			if (a[i] == x) {
				// 配列keyにその番号を代入する
				arrayKey[elements] = i;
				// 配列keyの要素番号を次の値にする
				elements++;
			}
		}

		// 配列keyを返却する
		return arrayKey;
	}
}
