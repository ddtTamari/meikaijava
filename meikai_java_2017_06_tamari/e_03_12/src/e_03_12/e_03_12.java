/*
 	演習3-12	3つの整数値の最小値を求めて表示する
	制作日時	6月6日
	制作者	玉利仁美

*/
package e_03_12;

import java.util.Scanner;

public class e_03_12 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//最小値を比べる3値のうちの一つ目の入力を促す
		System.out.print("整数値a:");
		//最小値を比べる3値のうちの一つ目の値をキーボードから取得
		int integerA = scan.nextInt();
		// 最小値を比べる3値のうちの二つ目の入力を促す
		System.out.print("整数値b：");
		//最小値を比べる3値のうちの二つ目の値をキーボードから取得
		int integerB = scan.nextInt();
		// 最小値を比べる3値のうちの三つ目の入力を促す
		System.out.print("整数値c：");
		//最小値を比べる3値のうちの三つ目の値をキーボードから取得
		int integerC = scan.nextInt();


		int min = integerA; // 最小値の初期値として一つ目の変数を代入
		// 最小値より二つ目の変数のほうが小さければ、最小値に二つ目の変数を代入
		if (integerB < min){
			//二つ目の変数のほうが小さいので、最小値を二つ目の変数に変更
			min = integerB;
		}
		// 現在の最小値より三つ目の変数のほうが小さければ、最小値に三つ目の変数を代入
		if (integerC < min){
			//三つ目の変数のほうが小さいので、最小値を三つ目の変数に変更
			min = integerC;
		}

		// 現在の最小値の値を表示する
		System.out.println("min=" + min);
		//ストリームを解放
		scan.close();

	}

}
