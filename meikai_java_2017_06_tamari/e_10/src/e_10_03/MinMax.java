/*
  演習10-3		二値／三値／配列の最小値を求めるメソッドや災害地を求めるメソッドを集めたユーティリティクラスMinMaxを作成
  演習日		6月26日
  製作者		玉利仁美
 */
package e_10_03;

//渡された引数の最大値最小値を求めるクラス
public final class MinMax {
	// 引数に二つの整数が与えられたとき最小値を返すメソッド
	public static int Min(int integerA, int integerB) {
		// 2値のうち小さいほうの値を返却する
		return (integerA < integerB) ? integerA : integerB;
	}

	// 引数に三つの整数が与えられたとき最小値を返すメソッド
	public static int Min(int integerA, int integerB, int integerC) {
		// 3値を比べたいので最小値の初期値を一つ目の整数にする
		int min = integerA;
		// 最小値よりも整数2のほうが小さいなら最小値の値を変える
		if (integerB < min) {
			// 最小値に整数2を代入する
			min = integerB;
		}
		// 最小値よりも整数3のほうが小さいなら最小値の値を変える
		if (integerC < min) {
			// 最小値に整数3を代入
			min = integerC;
		}
		// 最小値の値を返却する
		return min;
	}

	// 渡された引数の配列の要素の最小値を求めるメソッド
	public static int Min(int[] arrayA) {
		// すべての要素を比べたいので、最小値を最初の要素の値で初期化する
		int min = arrayA[0];
		// 配列の長さを変数に取っておく
		int arrayALength = arrayA.length;
		// すべての要素を比べたいので配列の長さだけ繰り返し比べる
		for (int i = 0; i < arrayALength; i++) {
			// もし配列i番目が最小値より小さい値だった時は最小値を入れ替える
			if (arrayA[i] < min) {
				// 最小値にi番目の配列を代入する
				min = arrayA[i];
			}
		}
		// 最小値を返却する
		return min;
	}

	// 引数に二つの整数が与えられたとき最大値を返すメソッド
	public static int Max(int integerA, int integerB) {
		//// 2値のうち大きいの値を返却する
		return (integerA > integerB) ? integerA : integerB;
	}

	// 引数に三つの整数が与えられたとき最大値を返すメソッド
	public static int Max(int integerA, int integerB, int integerC) {
		// 3値を比べたいので最大値の初期値を一つ目の整数にする
		int max = integerA;
		// 最大値よりも整数2のほうが小さいなら最小値の値を変える
		if (integerB > max) {
			// 最大値に整数2を代入する
			max = integerB;
		}
		// 最大値よりも整数3のほうが大きいなら最大値の値を変える
		if (integerC > max) {
			// 最大値に整数3を代入
			max = integerC;
		}
		// 最大値の値を返却する
		return max;
	}

	// 渡された引数の配列の要素の最大値を求めるメソッド
	public static int Max(int[] arrayA) {
		// すべての要素を比べたいので、最大値を最初の要素の値で初期化する
		int max = arrayA[0];
		// 配列の長さを変数に取っておくｓ
		int arrayALength = arrayA.length;
		// すべての要素を比べたいので配列の長さだけ繰り返し比べる
		for (int i = 0; i < arrayALength; i++) {
			// もし配列i番目が最大値より小さい値だった時は最大値を入れ替える
			if (arrayA[i] > max) {
				// 最大値にi番目の配列を代入する
				max = arrayA[i];
			}
		}
		// 最大値を返却する
		return max;
	}

}
