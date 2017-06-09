/*
 	演習3-3	elseをelse ifの形に変更したらどうなるか
	制作日時	6月5日
	制作者	玉利仁美
*/
package e_03_03;

import java.util.Scanner;

public class e_03_03 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		// 整数値の入力を促す
		System.out.print("整数値：");
		// キーボードから変数ｎを入力
		int n = stdIn.nextInt();

		// ｎが正の数字の時、その値は正であると表示
		if (n > 0)
			System.out.println("その値は正です。");
		// ｎが負の数字の時、その値は負であると表示
		else if (n < 0)
			System.out.println("その値は負です。");
		// ｎが0の時、その値は0であると表示
		else if (n == 0)
			System.out.println("その値は0です。");
	}
}

/*
 * テキストではelseを利用し正の数と負の数以外という指定の仕方だった。 それ以外の数字は0しかないので今回の様に0のみの指定でも同じ結果になった。
 */
