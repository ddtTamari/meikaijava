/*
  演習7-2		三つのint型引数a,b,cの最小値を求めるメソッドminを作成せよ
  演習日		6月14日
  製作者		玉利仁美
 */
package e_07_02;

import java.util.Scanner;

public class e_07_02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		//最小値を求める3値のうちの一つ目の引数の入力を促す
		System.out.print("引数a：");
		//一つ目の引数の値をキーボードから取得
		int argmentA = scan.nextInt();
		//最小値を求める3値のうちの二つ目の引数の入力を促す
		System.out.print("引数b：");
		//二つ目の引数の値をキーボードから取得
		int argmentB = scan.nextInt();
		//最小値を求める3値のうちの三つ目の引数の入力を促す
		System.out.print("引数c：");
		//三つ目の引数の値をキーボードから取得
		int argmentC = scan.nextInt();

		//最小値を求めるminメソッドを呼び出し、返却値を表示
		System.out.println("最小値は：" + min(argmentA, argmentB, argmentC));
		//ストリームを解放
		scan.close();
	}

	//仮引数a,b,cの中の最小値を求めるメソッド
	static int min(int a, int b, int c) {
		//最小値の初期値をaに設定
		int min = a;
		//最小値がbより小さければ最小値はbとなる
		if (min > b) {
			//最小値がbより大きかったので、最小値にbを代入
			min = b;
		}
		//最小値がcより小さければ最小値はcとなる
		if (min > c) {
			//最小値がcより大きかったので、最小値にcを代入
			min = c;
		}
		//返却値としてminを返す
		return min;

	}

}
