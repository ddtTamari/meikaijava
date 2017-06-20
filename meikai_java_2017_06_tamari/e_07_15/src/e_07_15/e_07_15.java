/*
  演習7-15		配列aの要素の合計を求めるメソッドを作成
  演習日		6月17日
  製作者		玉利仁美
 */
package e_07_15;

import java.util.Scanner;

public class e_07_15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// いくつの要素がある配列なのか要素数の入力を促す
		System.out.print("いくつの要素がある配列を作りますか：");
		// 要素の数をキーボードから入力
		int elementsNumber = scan.nextInt();
		// すべての要素の値を足す配列を要素数elementsNumberで生成
		int[] arraySum = new int[elementsNumber];

		// 入力された要素の数だけ繰り返し表示し入力を求める
		for (int i = 0; i < elementsNumber; i++) {
			// 何個目かの要素にいれる値の入力を促す
			System.out.print(i + "個目の要素の値は：");
			// 配列i個目の要素にキーボードから値を入力
			arraySum[i] = scan.nextInt();
		}

		// 合計を求めるメソッドを呼び出し、その値を表示する
		System.out.println("要素の最小値：" + sumOf(arraySum));
		// ストリームを解放する
		scan.close();
	}

	// 引数の配列の要素の値の合計を求めるメソッド
	static int sumOf(int[] a) {
		// 最小値に初期値としてa[0]を代入
		int sum = 0;
		// 配列の要素の数だけ繰り返す
		for (int i = 0; i < a.length; i++) {
			// a[i]個目の値がminよりちいさいｂ
			sum += a[i];
		}
		return sum;
	}

}
