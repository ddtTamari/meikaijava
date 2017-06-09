/*
 	演習2-8	キーボードから読み込んだ整数値のプラスマイナス5の範囲の整数値をランダムに生成
	制作日時	6月5日
	制作者	玉利仁美

*/
package e_02_08;

import java.util.Random;
import java.util.Scanner;

public class e_02_08 {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);

		// 整数値の入力を促す
		System.out.print("整数値：");
		// 変数ｘをキーボードから入力
		int x = stdIn.nextInt();
		// 変数ｙは0～10までの数字から変数ｘから5を減らした数字、これによって変数ｘからプラスマイナス5の数字がでる
		int y = rand.nextInt(11) + (x - 5);
		// ｙを表示する
		System.out.println(y);

	}

}
