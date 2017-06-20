/*
  演習7-30		2つのint型整数の最小値、3つのint型整数の最小値、
  				配列aの要素の最小値を求める多重定義されたメソッド群を作成
  演習日		6月20日
  製作者		玉利仁美
 */
package e_07_30;

import java.util.Scanner;

public class e_07_30 {
	public static void main(String[] args) {
		// 比較する整数や、配列の行数などをキーボードから取得するために宣言
		Scanner scan = new Scanner(System.in);

		// 比較する整数のうち一つ目の値の入力を促す
		System.out.print("整数aの値：");
		// 一つ目の整数の値をキーボードから取得
		int integer1 = scan.nextInt();
		// 比較する整数のうちの二つ目の値の入力を促す
		System.out.print("整数bの値：");
		// 二つ目の整数の値をキーボードから取得
		int integer2 = scan.nextInt();
		// 比較する整数のうちの三つ目の値の入力を促す
		System.out.print("整数cの値：");
		// 三つ目の整数の値をキーボードから取得
		int integer3 = scan.nextInt();

		// 配列内の要素を比較するための配列の要素の数の入力を促す
		System.out.print("配列aの要素数：");
		// 配列の要素数をキーボードから取得
		int arrayLineNum = scan.nextInt();
		// 入力された要素数を持った配列を生成
		int[] array = new int[arrayLineNum];

		// 要素の値を入力するので要素の数だけ繰り返しを行う
		for (int i = 0; i < arrayLineNum; i++) {
			// 何番目の要素なのか表示し、値の入力を促す
			System.out.print("a[" + i + "]:");
			// i番目の要素の値をキーボードから取得
			array[i] = scan.nextInt();
		}

		// 二つの引数を渡し、最小値を求めるメソッドを呼び出す
		System.out.println("a,bの最小値は" + min(integer1, integer2) + "です。");
		// 三つの引数を渡し、最小値を求めるメソッドを呼び出す
		System.out.println("a,b,cの最小値は" + min(integer1, integer2, integer3) + "です。");
		// 配列aを引数として渡し、配列の要素の値の最小値を求めるメソッドを呼び出す
		System.out.println("配列aの最小値は" + min(array) + "です。");

		// ストリームを解放
		scan.close();
	}

	//2つの値の小さいほうを返すメソッド
	static int min(int a, int b) {
		//2値のうち小さいほうを返す
		return a < b ? a : b;
	}

	//3つの値の最小値を返却するメソッド
	static int min(int a, int b, int c) {
		//先頭から確認するため、最小値の初期値にaを代入
		int min = a;
		//最小値よりbのほうが小さければbが最小値
		if (min > b) {
			//最小値にbを代入
			min = b;
		}
		//最小値よりcのほうが小さければcが最小値
		if (min > c) {
			//最小値にcを代入
			min = c;
		}
		//最小値を返却
		return min;
	}

	//引数に渡された配列の各要素を比較し最も小さい値を返すメソッド
	static int min(int[] a) {
		//先頭から順に確認するため、最小値の初期値をa[0]に設定
		int min = a[0];
		//配列の長さを変数に取っておく
		int aLong = a.length;

		//配列の要素すべてを確認するので、配列の長さ分繰り返す
		for (int i = 0; i < aLong; i++) {
			//最小値より小さい要素があれば最小値をその値に変更
			if (min > a[i]) {
				//最小値にa[i]を代入する
				min = a[i];
			}
		}
		//最小値を返却
		return min;
	}

}
