/*
 	演習2-1	int型に小数部を持つ実数値を代入し考察する
	制作日時	6月5日
	制作者	玉利仁美

*/
package e_02_01;

public class e_02_01 {
	public static void main(String[] args) {

		int x; // xはint型の変数
		int y; // yはint型の変数

		x = 63.1; // ｘに小数部を持つ実数値を代入
		y = 18.2; // yに少数部を持つ実数値を代入

		// xの値を表示
		System.out.println("xの値は" + x + "です。");
		// ｙの値を表示
		System.out.println("yの値は" + y + "です。");
		// ｘ+ｙの結果を表示
		System.out.println("合計は" + (x + y) + "です。");
		// ｘとｙの平均を表示
		System.out.println("平均は" + (x + y) / 2 + "です。");

	}
}

/*
 * int型は整数しか扱えないため小数部をもつ数字を入れたら正しく実行されない。
 */
