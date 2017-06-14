/*
 	演習3-2	変数bが変数aの約数であるかどうか確かめる
	制作日時	6月5日
	制作者	玉利仁美

*/
package e_03_02;

import java.util.Scanner;

public class e_03_02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 2値のうち一つ目の整数の入力を促す、二つ目の値が一つ目の値の約数であるか調べるための変数
		System.out.print("整数A:");
		// 二つ目の値が一つ目の値の約数であるか調べるための、一つ目の値をキーボードから入力する
		int integer = scan.nextInt();
		// 2値のうちの二つ目で、一つ目の値の約数であるか判断するための変数の入力を促す
		System.out.print("整数B：");
		// 二つ目の値の入力をキーボードから取得する
		int divisor = scan.nextInt();

		// 一つ目の値を二つ目の値で割り切れるならば、二つ目の値は一つ目の値の約数であるといえる
		if (integer % divisor == 0) {
			//一つ目の値を二つ目の値で割り切れたので、約数であると表示
			System.out.println("BはAの約数です。");
			// 一つ目の値を二つ目の値で割り切れないならば、変数ではない
		} else {
			//一つ目の値を二つ目の値で割り切れないので、変数ではないと表示
			System.out.println("BはAの約数ではありません");
		}
		//ストリームの解放
		scan.close();
	}
}
