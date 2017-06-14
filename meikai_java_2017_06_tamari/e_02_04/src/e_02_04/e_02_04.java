/*
 	演習2-4	キーボードから読み込んだ数値に10を足したのと減じた数字を出力する
	制作日時	6月5日
	制作者	玉利仁美

*/
package e_02_04;

import java.util.Scanner;

public class e_02_04 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		// 10を加えた値と減らした値のもととなる整数値の値の入力を促す
		System.out.print("整数値：");
		// これからプラスマイナス10する値をキーボードから取得
		int integer = stdIn.nextInt();

		// 入力された値に10を足し表示
		System.out.println("10を加えた値は" + (integer + 10) + "です。");
		// 入力した数字から10を引き表示
		System.out.println("10を減じた値は" + (integer - 10) + "です。");
		//ストリームを解放する
		stdIn.close();
	}
}
