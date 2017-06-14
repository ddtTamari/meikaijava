/*
 	演習3-13	3つの整数値の中央値を求めて表示
	制作日時	6月6日
	制作者	玉利仁美

*/
package e_03_13;

import java.util.Scanner;

public class e_03_13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 3値の中央値を求めるプログラムの一つ目の変数値の入力を促す
		System.out.print("整数値a:");
		// 3値の一つ目の変数の値をキーボードから取得
		int integerA = scan.nextInt();
		// 3値の中央値を求めるプログラムの二つ目の変数値の入力を促す
		System.out.print("整数値b：");
		// 3値の二つ目の変数の値をキーボードから取得
		int integerB = scan.nextInt();
		// 3値の中央値を求めるプログラムの三つ目の変数値の入力を促す
		System.out.print("整数値c：");
		// 3値の三つ目の変数の値をキーボードから取得
		int integerC = scan.nextInt();

		int min = integerA; // 最小値の初期値を整数Aに設定
		// 最小値が整数Bより大きかった場合、最小値に整数Bを代入
		if (integerB < min) {
			// 整数Bのほうが最小値より小さいので、最小値に整数Bを代入
			min = integerB;
		}
		// 最小値が整数Cより大きかった場合、最小値に整数Cを代入
		if (integerC < min) {
			// 整数Cのほうが最小値より小さいので、最小値に整数Cを代入
			min = integerC;
		}

		int max = integerA; // 最大値の初期値を整数Aに設定
		// 最大値が整数Bより小さければ、最大値に整数Bを代入
		if (integerB > max) {
			// 整数Bが最大値より大きいので、最大値に整数Bを代入
			max = integerB;
		}
		// 最大値が整数Cより小さければ、最大値に整数Cを代入
		if (integerC > max) {
			// 整数Cが最大値より大きいので、最大値に整数Cを代入
			max = integerC;
		}

		int midian = integerA; // 中央値の初期値を整数Aに設定
		// 最大値と最小値ではない値が中央値なので、
		// 整数Bが最大でも最小でもないとき中央値は整数Bになる
		if (max != integerB && min != integerB) {
			// 整数Bが最大でも最小でもなかったので、中央値に整数Bを代入
			midian = integerB;
		}
		// 整数Cが最大でも最小でもないとき中央値は整数Cになる
		if (max != integerC && min != integerC) {
			// 整数Cが最大でも最小でもなかったので、中央値に整数Cを代入
			midian = integerC;
		}

		//最終的にでた中央値の値を表示する
		System.out.println("mid = " + midian);
		// ストリームの解放
		scan.close();
	}
}
