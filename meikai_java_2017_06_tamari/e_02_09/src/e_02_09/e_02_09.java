/*
 	演習2-9	0.0以上1.0未満の実数値、0.0以上10.0未満の実数値、-1.0以上1.0未満の実数値をランダムに生成
	制作日時	6月5日
	制作者	玉利仁美

*/
package e_02_09;

import java.util.Random;

public class e_02_09 {
	public static void main(String[] args) {
		Random rand = new Random();

		// nextDouble()を使うことで0.0以上1.0未満の数値をランダムで代入
		double decimal = rand.nextDouble();
		// 0.0以上10.0未満の実数値を出すために0～9までの数字をランダムで代入
		int integerA = rand.nextInt(10);
		// －1.0以上1.0未満の実数値を出すために0,1の数字をランダムで代入
		int integerB = rand.nextInt(2);

		// 0.0以上1.0未満の実数値ランダムで表示
		System.out.println(decimal);
		// 0～9までの値に0.0以上1.0未満の値を足すことで、0.0以上10.0未満のランダムな数値を生成、表示
		System.out.println(integerA + decimal);
		// 0.0以上1.0未満の値に0～1の整数値を引くことで、-1.0以上1.0未満のランダムな数値を生成、表示
		System.out.println(decimal - integerB);
	}
}
