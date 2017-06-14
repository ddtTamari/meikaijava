/*
 	演習2-10	名前の姓と名を個別にキーボードから読み込み挨拶を行うプログラム
	制作日時	6月5日
	制作者	玉利仁美

*/
package e_02_10;

import java.util.Scanner;

public class e_02_10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 姓の入力を促す
		System.out.println("姓：");
		// 姓の文字列をキーボードから取得する
		String familyName = scan.next();
		// 名の入力を促す
		System.out.println("名：");
		// 名の文字列をキーボードから取得する
		String lastName = scan.next();
		//ストリームの解放
		scan.close();
		// 取得した姓と名を表示する
		System.out.println("こんにちは" + familyName + lastName + "さん。");


	}

}
