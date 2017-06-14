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

		// プラスマイナス5の範囲の基準となる整数値の入力を促す
		System.out.print("整数値：");
		// プラスマイナス5の範囲の基準となる整数値をキーボードから取得
		int integer = stdIn.nextInt();
		//  あらかじめ基準の値から5を引いた数に0～10を足すことで、基準値からプラスマイナス5の値をランダムで生成する
		int  randomNumber = rand.nextInt(11) + (integer - 5);
		// 生成されたプラスマイナス5の範囲の値を表示
		System.out.println(randomNumber);

		//ストリームを解放する
		stdIn.close();
	}

}
