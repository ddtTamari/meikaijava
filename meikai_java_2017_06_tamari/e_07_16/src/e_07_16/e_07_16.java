/*
  演習7-16		配列aの要素の最小値を求めるメソッド
  演習日		6月17日
  製作者		玉利仁美
 */
package e_07_16;

import java.util.Scanner;

public class e_07_16 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// いくつの要素がある配列なのか要素数の入力を促す
		System.out.print("いくつの要素がある配列を作りますか：");
		// 要素の数をキーボードから入力
		int elements = scan.nextInt();
		// すべての要素の値の最小値を求める配列を要素数elementsで生成
		int[] arrayA = new int[elements];

		// 入力された要素の数だけ繰り返し表示し入力を求める
		for (int i = 0; i < elements; i++) {
			// 何個目かの要素にいれる値の入力を促す
			System.out.print(i + "個目の要素の値は：");
			// 配列i個目の要素にキーボードから値を入力
			arrayA[i] = scan.nextInt();
		}

		// 最小値を求めるメソッドを呼び出し、その値を表示する
		System.out.println("要素の最小値：" + minOf(arrayA));
		// ストリームを解放する
		scan.close();
	}

	// 引数の配列の要素の値の最小値を求めるメソッド
	static int minOf(int[] a) {
		// 最小値に初期値としてa[0]を代入
		int min = a[0];
		// 配列の要素の数だけ繰り返す
		for (int i = 0; i < a.length; i++) {
			// a[i]個目の値がminより小さければその値を最小値とする
			if (min > a[i]) {
				// 最小値にa[i]を代入する
				min = a[i];
			}
		}
		// 最小値の値を返却する
		return min;
	}

}
