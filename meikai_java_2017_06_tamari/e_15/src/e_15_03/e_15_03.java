/*
  演習15-3		文字探索のプログラムを書き換えて一致する部分が上下でそろうように表示するプログラム
  演習日		6月29日
  製作者		玉利仁美
 */
package e_15_03;

//キーボード入力を可能にするためにスキャナークラスをインポート
import java.util.Scanner;

//メインクラス
public class e_15_03 {
	// メインメソッド
	public static void main(String[] args) {
		// キーボードから入力をするため宣言
		Scanner scan = new Scanner(System.in);

		// 文字列s1の入力を促す
		System.out.println("文字列s1：");
		// 文字列を入力してもらう
		String stringOne = scan.next();
		// 文字列s2の入力を促す
		System.out.println("文字列s2：");
		// 文字列を入力してもらう
		String stringTwo = scan.next();
		// 一致した位置を取得する配列
		int index[] = new int[stringTwo.length()];
		// 文字列1と文字列2の一致した文字を入れておく配列
		char[] setStringMached = new char[stringOne.length()];

		// 入力された文字列１を表示する
		System.out.println("文字列s1：" + stringOne);

		// すべての要素に空白を入れるため配列の長さ分だけ繰り返す
		for (int i = 0; i < stringOne.length(); i++) {
			// 一つ一つの要素に空白を代入
			setStringMached[i] = ' ';
		}

		// 一致した文字の配列の番号を格納するため文字列2の長さ分繰り返す
		for (int j = 0; j < stringTwo.length(); j++) {
			// 文字列1と一致した文字があればその番号をなければ‐1が入る
			index[j] = stringOne.indexOf(stringTwo.charAt(j));
		}

		// 文字列2を表示する準備
		System.out.print("文字列s2：");

		// インデックスの長さ分だけ繰り返し行う
		for (int j = 0; j < index.length; j++) {
			// 一致した文字を入れた配列は文字列1と同じ長さなのでその長さ分繰り返す
			for (int i = 0; i < stringOne.length(); i++) {
				// 一致した位置を入れる配列とiの値が同じの時、一致した位置に文字列2の文字を入れる
				if (i == index[j]) {
					// 一致した位置の要素に、文字列2の一致した文字を入れる
					setStringMached[i] = stringTwo.charAt(j);
				}
			}
		}
		// 一致した文字を一致した位置に入れる配列を表示するため要素数分繰り返す
		for (int i = 0; i < stringOne.length(); i++) {
			// 配列の要素を一つずつ表示
			System.out.print(setStringMached[i]);
		}
		// ストリームを解放する
		scan.close();
	}
}
