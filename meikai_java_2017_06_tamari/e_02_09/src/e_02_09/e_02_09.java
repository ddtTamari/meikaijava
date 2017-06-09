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

		// double型の変数ｘにランダムで代入
		double x = rand.nextDouble();
		// int型の変数ｙに0～9までの数字をランダムで代入
		int y = rand.nextInt(10);
		// int型の変数zに0,1の数字を代入
		int z = rand.nextInt(2);

		// 0.0以上1.0未満の実数値を表示
		System.out.println(x);
		// 0.0以上10.0未満の数字を表示
		System.out.println(x + y);
		// -1.0以上1.0未満の数字を表示
		System.out.println(x - z);
	}
}
