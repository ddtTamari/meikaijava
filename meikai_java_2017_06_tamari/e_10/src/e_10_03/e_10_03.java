/*
  演習10-3		二値／三値／配列の最小値を求めるメソッドや災害地を求めるメソッドを集めたユーティリティクラスMinMaxを作成
  演習日		6月26日
  製作者		玉利仁美
 */
package e_10_03;

import java.util.Scanner;

public class e_10_03 {
	// メインメソッド
	public static void main(String[] args) {
		// 比べる値をキーボードから取得するため宣言
		Scanner scan = new Scanner(System.in);

		// 比べる値のうち一つ目の整数の値の入力を求める
		System.out.print(Constant.INTEGER_ONE);
		// 一つ目の整数の値をキーボードから取得
		int integerA = scan.nextInt();
		// 比べる値のうち二つ目の整数の値の入力を求める
		System.out.print(Constant.INTEGER_TWO);
		// 二つ目の整数の値をキーボードから取得
		int integerB = scan.nextInt();

		// MinMaxクラスの二値の最小値を求めるメソッドを呼び出し結果を表示
		System.out.println(Constant.TWO_NUMBER_MIN_DISPLAY + MinMax.Min(integerA, integerB));
		// MinMaxクラスの二値の最大値を求めるメソッドを呼び出し結果を表示
		System.out.println(Constant.TWO_NUMBER_MAX_DISPLAY + MinMax.Max(integerA, integerB));

		// 比べる値のうち三つ目の整数の値の入力を求める
		System.out.print(Constant.INTEGER_THREE);
		// 三つ目の整数の値をキーボードから取得
		int integerC = scan.nextInt();
		// MinMaxクラスの三値の最小値を求めるメソッドを呼び出し結果を表示
		System.out.println(Constant.THREE_NUMBER_MIN_DISPLAY + MinMax.Min(integerA, integerB, integerC));
		// MinMaxクラスの三値の最大値を求めるメソッドを呼び出し結果を表示
		System.out.println(Constant.THREE_NUMBER_MAX_DISPLAY + MinMax.Max(integerA, integerB, integerC));

		// 配列の要路の数の入力を求める
		System.out.print(Constant.ARRAY_ELEMENTS_NUMBER);
		// 配列の要素の数をキーボードから取得
		int elementsNumber = scan.nextInt();
		// 要素数がキーボードから取得した値の配列を生成
		int[] arrayA = new int[elementsNumber];

		// 配列の要素すべてに値を入れたいので要素の数だけ繰り返す
		for (int i = 0; i < elementsNumber; i++) {
			// i番目の要素の値を促す
			final String arrayImput = String.format("a[%d]=", i);
			// i番目の要素の値を促す
			System.out.print(arrayImput);
			// i番目の要素の値をキーボードから取得
			arrayA[i] = scan.nextInt();
		}
		// 配列の要素の最小値を求めるメソッドをクラスMinMaxから呼び出し表示
		System.out.println(Constant.ARRAY_NUMBER_MIN_DISPLAY + MinMax.Min(arrayA));
		// 配列の要素の最大値を求めるメソッドをクラスMinMaxから呼び出し表示
		System.out.println(Constant.ARRAY_NUMBER_MAX_DISPLAY + MinMax.Max(arrayA));

		scan.close();
	}
}
