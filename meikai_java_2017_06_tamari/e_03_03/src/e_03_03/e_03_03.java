/*
 	演習3-3	elseをelse ifの形に変更したらどうなるか
	制作日時	6月5日
	制作者	玉利仁美
*/
package e_03_03;

import java.util.Scanner;

public class e_03_03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 符号を判定する整数値の入力を促す
		System.out.print("整数値：");
		// 符号を判定する整数値をキーボードから取得する
		int integer = scan.nextInt();

		// 入力された整数値が、0より大きいならば符号は正となる
		if (integer > 0) {
			//0より大きいので、正の値であると表示
			System.out.println("その値は正です。");
		// 入力っされた整数値が、0より小さいならば符号は負となる
		} else if (integer < 0) {
			//0より小さいので、負の値であると表示
			System.out.println("その値は負です。");
			// 入力された値が、0ならば符号は0になる
		} else if (integer == 0) {
			//値が0なので、0であると表示
			System.out.println("その値は0です。");
		}
		//ストリームの解放
		scan.close();
	}
}

/*
 * テキストではelseを利用し正の数と負の数以外という指定の仕方だった。 それ以外の数字は0しかないので今回の様に0のみの指定でも同じ結果になった。
 */
