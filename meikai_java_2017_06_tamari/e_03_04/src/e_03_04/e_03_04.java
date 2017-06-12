/*
 	演習3-4	二つの変数a,bを読み込んでその大小関係を、
	aのほうが大きい・bのほうが大きい・同じ値です、のいずれかで表示するプログラム
	制作日時	6月5日
	制作者	玉利仁美
*/
package e_03_04;

import java.util.Scanner;

public class e_03_04 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		// 変数aの入力を促す
		System.out.print("変数a：");
		// キーボードから変数aに代入
		int a = stdIn.nextInt();
		// 変数bの入力を促す
		System.out.print("変数b：");
		// キーボードから変数bに代入
		int b = stdIn.nextInt();

		// aがbより大きいとき、aのほうが大きいと表示
		if (a > b)
			System.out.println("aのほうが大きいです。");
		// aがbより小さいとき、bのほうが大きいと表示
		else if (a < b)
			System.out.println("bのほうが大きいです。");
		// aとbが同じ値の時、aとｂは同じ値と表示
		else
			System.out.println("aとbは同じ値です。");
	}

}
