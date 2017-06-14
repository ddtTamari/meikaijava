/*
 	演習2-1	int型に小数部を持つ実数値を代入し考察する
	制作日時	6月5日
	制作者	玉利仁美

*/
package e_02_01;

public class e_02_01 {
	public static void main(String[] args) {

		double decimalA; // decimalAはint型の変数
		double decimalB; // decimalBはint型の変数

		decimalA = 63.1; // ｘに小数部を持つ実数値を代入
		decimalB = 18.2; // decimalに少数部を持つ実数値を代入

		// decimalの値を表示
		System.out.println("decimalAの値は" + decimalA + "です。");
		// ｙの値を表示
		System.out.println("decimalBの値は" + decimalB + "です。");
		// ｘ+ｙの結果を表示
		System.out.println("合計は" + (decimalA + decimalB) + "です。");
		// ｘとｙの平均を表示
		System.out.println("平均は" + (decimalA + decimalB) / 2 + "です。");

	}
}

/*
 * int型は整数しか扱えないため小数部をもつ数字を入れたら正しく実行されない。
 */
