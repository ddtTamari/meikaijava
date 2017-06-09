/*
  演習5-2		float型とdouble型の変数に値を読み込んで表示するプログラム
  演習日		6月8日
  製作者		玉利仁美
 */
package e_05_02;

import java.util.Scanner;

public class e_05_02 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		// 変数xはfloat型で表される、変数yはdouble型で表示される
		System.out.println("変数xはfloat型で、変数yはdouble型です。");
		// 変数xの入力を促す
		System.out.print("x：");
		// 変数xの値をキーボードから取得
		float x = stdIn.nextFloat();
		// 変数yの入力を促す
		System.out.print("y：");
		// 変数yの値をキーボードから取得
		double y = stdIn.nextDouble();

		// float型の変数xを表示
		System.out.println("x = " + x);
		// double型の変数ｙを表示
		System.out.println("y = " + y);

	}

}
