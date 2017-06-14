/*
 	演習2-7	一桁の整数、一桁の負の整数、2桁の正の整数値をランダムに生成
	制作日時	6月5日
	制作者	玉利仁美

*/
package e_02_07;

import java.util.Random;

public class e_02_07 {
	public static void main(String[] args) {
		Random rand = new Random();

		// 整数値に0～8の値を代入
		int integer = rand.nextInt(9);
		// 0～8のランダムな値に１を足すことで、1～9の正の整数値をランダムに表示
		System.out.println(integer + 1);
		// 0～8のランダムな値に９引くことで、-9～-1の負の整数値をランダムに表示
		System.out.println(integer - 9);

		// 2桁の正の整数値をランダムに生成するため0～89の値を代入
		int twoDigitsInteger = rand.nextInt(90);
		// 0～89の数字に10を足すことで、2桁の正の整数値をランダムに生成、表示
		System.out.println(twoDigitsInteger + 10);

	}
}
