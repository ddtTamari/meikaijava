/*
  演習4-15		身長と標準体重の対応表を表示するプログラムを生成、入力する値は整数値として読み込むこと
  演習日		6月7日
  製作者		玉利仁美
 */
package e_04_15;

import java.util.Scanner;

public class e_04_15 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		// 何㎝からか入力を促す
		System.out.print("何㎝から：");
		// キーボードから入力
		int x = stdIn.nextInt();
		// 何㎝までか入力を促す
		System.out.print("何㎝まで：");
		// キーボードから入力
		int y = stdIn.nextInt();
		// 何㎝ごとか入力を促す
		System.out.print("何㎝ごと：");
		// キーボードから入力
		int z = stdIn.nextInt();

		// 身長と標準体重を表示
		System.out.println("身長　　　標準体重");
		// 身長が最大身長になるまで繰り返す
		for (int hig = x; hig <= y; hig += z) {
			// 平均体重を求める
			double ave = (hig - 100) * 0.9;
			// 身長と標準体重の値を表示する
			System.out.println(hig + "　　　 " + ave);

		}
	}

}
