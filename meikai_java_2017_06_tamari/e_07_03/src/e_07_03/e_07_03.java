/*
  演習7-3		三つのint型引数a,b,cの中央値を求めるメソッドmedを作成せよ
  演習日		6月15日
  製作者		玉利仁美
 */
package e_07_03;

import java.util.Scanner;

public class e_07_03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 中央値を求める3値のうちの一つ目の引数の入力を促す
		System.out.print("引数a：");
		// 一つ目の引数の値をキーボードから取得
		int argmentA = scan.nextInt();
		// 中央値を求める3値のうちの二つ目の引数の入力を促す
		System.out.print("引数b：");
		// 二つ目の引数の値をキーボードから取得
		int argmentB = scan.nextInt();
		// 中央値を求める3値のうちの三つ目の引数の入力を促す
		System.out.print("引数c：");
		// 三つ目の引数の値をキーボードから取得
		int argmentC = scan.nextInt();

		// 中央値を求めるminメソッドを呼び出し、返却地を表示
		System.out.println("中央値は：" + med(argmentA, argmentB, argmentC));
		// ストリームを解放
		scan.close();
	}

	// 仮引数a,b,cの中の中央値を求めるメソッド
	static int med(int a, int b, int c) {
		// 最大値の初期値をaに設定
		int max = a;
		// 最大値がbより小さければ最大値はbとなる
		if (max > b) {
			// 最大値がbより大きかったので、最大値にbを代入
			max = b;
		}
		// 最大値がcより小さければ最大値はcとなる
		if (max > c) {
			// 最大値がcより大きかったので、最大値にcを代入
			max = c;
		}

		// 最小値の初期値をaに設定
		int min = a;
		// 最小値がbより小さければ最小値はbとなる
		if (min > b) {
			// 最小値がbより大きかったので、最小値にbを代入
			min = b;
		}
		// 最小値がcより小さければ最小値はcとなる
		if (min > c) {
			// 最小値がcより大きかったので、最小値にcを代入
			min = c;
		}

		// 中央値の初期値をaに設定
		int med = a;
		//bが最大値でも最小値でもないとき、bは中央値になる
		if (b != max && b != min) {
			//bが最大値でも最小値でもないので、中央値にbを代入
			med = b;
		}
		//cが最大値でも最小値でもないとき、cは中央値になる
		if (c != max && c != min) {
			// cが最大値でも最小値でもないので、中央値にcを代入
			med = c;
		}
		//中央値medを返却値として返却
		return med;

	}
}
