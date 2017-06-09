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

		// 変数ｘにランダムで0～9の数字を代入
		int x = rand.nextInt(9);
		// 0~8の数字に足す１することで正の整数値をランダムに表示
		System.out.println(x + 1);
		// 0~8の数字に-9することで負の整数値をランダムに表示
		System.out.println(x - 9);

		// 変数yに0~89の数字を代入
		int y = rand.nextInt(90);
		// 0～89の数字に10を足し2桁の正の整数値をランダムに生成
		System.out.println(y + 10);

	}
}
