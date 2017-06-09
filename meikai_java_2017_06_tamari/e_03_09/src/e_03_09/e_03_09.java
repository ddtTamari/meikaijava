/*
 	演習3-9	2つの実数値の大きいほうの値を評価するプログラム
	制作日時	6月5日
	制作者	玉利仁美

*/
package e_03_09;

import java.util.Scanner;

public class e_03_09 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		// 整数aの入力を促す
		System.out.print("実数a:");
		// 整数aをキーボードから入力
		double a = stdIn.nextDouble();
		// 整数aの入力を促す
		System.out.print("実数b:");
		// 整数aをキーボードから入力
		double b = stdIn.nextDouble();

		// 整数aと整数bを比べてaが大きいならaをbが大きいならｂがmaxとして表示する
		double max = a > b ? a : b;
		System.out.println(max);
	}

}
