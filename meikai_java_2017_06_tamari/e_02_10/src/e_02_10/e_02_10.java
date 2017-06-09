/*
 	演習2-10	キーボードから読み込んだ数値に10を足したのと減じた数字を出力する
	制作日時	6月5日
	制作者	玉利仁美

*/
package e_02_10;

import java.util.Scanner;

public class e_02_10 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		// 姓の入力を促す
		System.out.print("姓：");
		// string型の変数にキーボードから入力された文字列を代入
		String s = stdIn.next();
		// 名の入力を促す
		System.out.print("名：");
		// string型の変数にキーボードから入力された文字列を代入
		String n = stdIn.next();

		// 代入されたs,nを表示する
		System.out.println("こんにちは" + s + n + "さん。");

	}

}
