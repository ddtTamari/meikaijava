/*
  演習7-4		1からnまでの全整数の和を求めて返却するメソッドを作成(int sumUp(int n))
  演習日		6月15日
  製作者		玉利仁美
 */
package e_07_04;

import java.util.Scanner;

public class e_07_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 1から任意の値までの全整数の和を求めるための、任意の値の入力を促す
		System.out.print("整数：");
		// 任意の値をキーボードから取得
		int integer = scan.nextInt();

		// 1からintegerまでの全整数の和を求めるメソッドを呼び出し、全整数の和を返却値として受け取り表示
		System.out.println("1から" + integer + "までの全整数の和は" + sumUp(integer) + "です。");
		// ストリームを解放
		scan.close();
	}

	// 1から仮引数nまでの全整数の和の値を求めるメソッド
	static int sumUp(int n) {
		// 全整数の和を意味する変数sumの初期値を0と設定
		int sum = 0;
		// 仮引数のnの値までiを足していき、その間変数sumにiを足し続けnまでの全整数の和を求める
		for (int i = 0; i <= n; i++) {
			// 全整数の和を求めるため、0からnまでiを一ずつ増やしながら足していく
			sum += i;
		}
		// 返却値として全整数の和としてsumの値を返却
		return sum;
	}

}
