/*
  演習15-1		文字列を読み込んで、その文字列を逆順に表示するプログラムを作成
  演習日		6月27日
  製作者		玉利仁美
 */

//パッケージは15_1
package e_15_01;

//キーボードから入力できるようスキャナークラスをインポートする
import java.util.Scanner;

//メインクラス
public class e_15_01 {
	// メインメソッド
	public static void main(String[] args) {
		// キーボードから値を入力できるよう宣言
		Scanner scan = new Scanner(System.in);

		// 反転する文字列の表示を促す
		System.out.print("文字列を入力してください：");
		// 文字列をキーボードから取得する
		String imputString = scan.nextLine();
		// 反転させる文字列の反転させた各文字を入れるため文字列の長さ分だけの要素の文字配列を生成
		char[] inverseImputChar = new char[imputString.length()];
		// 文字列の任意の文字を取得するためのインデックスにしたいので配列の長さから1引いた数を生成しておく
		int count = imputString.length() - 1;

		// 各文字を入れていくので文字列の長さ分だけ繰り返す
		for (int i = 0; i < imputString.length(); i++) {
			// 文字配列の要素に文字列の文字を後ろから代入していく
			inverseImputChar[i] = imputString.charAt(count);
			// i番目の文字配列を表示する
			System.out.print(inverseImputChar[i]);
			// 文字列の代入したい位置を一つ前に移す
			count--;
		}
		// ストリームを解放する
		scan.close();
	}
}
