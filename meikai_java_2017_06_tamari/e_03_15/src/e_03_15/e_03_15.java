/*
 	演習3-15	2つの整数値を読み込んで降順
	制作日時	6月6日
	制作者	玉利仁美

*/
package e_03_15;

import java.util.Scanner;

public class e_03_15 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		// 整数aとbにキーボードから入力
		System.out.print("整数a:");
		int a = stdIn.nextInt();
		System.out.print("整数ｂ：");
		int b = stdIn.nextInt();

		// ｔにaを代入
		int t = a;
		// aがbより小さい場合aとbを入れ替える
		if (a < b) {
			a = b;
			b = t;
		}

		// 降順に並び替えたaとbを表示する
		System.out.println("降順になるように並びかえました。");
		System.out.println("整数aは" + a + "になりました。");
		System.out.println("整数bは" + b + "になりました。");

	}
}
