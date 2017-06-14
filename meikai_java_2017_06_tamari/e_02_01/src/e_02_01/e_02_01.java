/*
 	演習2-1	int型に小数部を持つ実数値を代入し考察する
	制作日時	6月5日
	制作者	玉利仁美

*/
package e_02_01;

public class e_02_01 {
	public static void main(String[] args) {

		double decimalA; // decimalAはdouble型の2値のうちの一つ目
		double decimalB; // decimalBはdouble型の2値のうちの二つ目

		decimalA = 63.1; // ｘに小数部を持つ実数値を代入
		decimalB = 18.2; // decimalに少数部を持つ実数値を代入

		// decimalAの値を表示
		System.out.println("decimalAの値は" + decimalA + "です。");
		// decimalBの値を表示
		System.out.println("decimalBの値は" + decimalB + "です。");
		// decimalAとdecimalBの合計の値を表示
		System.out.println("合計は" + (decimalA + decimalB) + "です。");
		// decimalAとdecimalBの平均の値を表示
		System.out.println("平均は" + (decimalA + decimalB) / 2 + "です。");

	}
}

/*
 * int型は整数しか扱えないため小数部をもつ数字を入れたら正しく実行されない。
 */
