/*
  演習15-2		文字列を読み込みその全文字の文字コードを表示するプログラム
  演習日		6月28日
  製作者		玉利仁美
 */
package e_15_02;

//キーボード入力をするためスキャナークラスをインポート
import java.util.Scanner;

//メインクラス
public class e_15_02 {
	//メインメソッド
	public static void main(String[] args) {
		// キーボードから値を入力できるよう宣言
		Scanner scan = new Scanner(System.in);
		// 反転する文字列の表示を促す
		System.out.print("文字列を入力してください：");
		// 文字列をキーボードから取得する
		String imputString = scan.nextLine();
		// すべての文字コードを表示するため文字数分だけ繰り返す
		for (int i = 0; i < imputString.length(); i++) {
			//各文字の文字コードを表示する
			System.out.println(imputString.codePointAt(i));
		}
		//ストリームを解放する
		scan.close();
	}
}
