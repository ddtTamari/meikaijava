/*
  演習7-7		list7-7に示したnこの'＊'を連続表意jするメソッドputStarsを内部で
  				list7-8のメソッドputCarsを呼び出すことによって表示を行うように書き換えよ
  演習日		6月16日
  製作者		玉利仁美
 */
package e_07_07;

import java.util.Scanner;

public class e_07_07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 何を行うプログラムなのかを表示
		System.out.println("左下直角の三角形を表示します");
		// 何段の左下直角三角形を表示するのか入力を促す
		System.out.print("段数は：");
		// 段数の値をキーボードから取得
		int n = scan.nextInt();
		// n段分putCharを呼び出し改行するputStarsを呼び出す
		putStars(n);
		// ストリームを解放する
		scan.close();
	}
	//n段の三角形を作るためi+1回ずつ＊を表示する、実際に＊を表示しているのはputCharメソッド
	static void putStars(int n) {
		//一行に1からｎ個まで一つずつ増やして表示させたいので
		for (int i = 0; i < n; i++) {
			//i+1回＊を表示するputCharメソッドを呼び出す
			putChar('*', i + 1);
			//i+1回＊を表示したら次の段に移行するため改行
			System.out.println();

		}

	}

	//仮引数のn回分、仮引数cを表示するメソッド
	static void putChar(char c, int n) {
		//nが0より大きいときn回繰り返させるために1つずつ減らしていく
		while (n-- > 0) {
			//仮引数に代入された文字を表示
			System.out.print(c);
		}
	}

}
