/*
  演習5-5		3つの整数値を読み込み、その合計と平均を表示するプログラムを作成(平均はキャスト演算子を使って求める)
  演習日		6月8日
  製作者		玉利仁美
 */
package e_05_05;

import java.util.Scanner;

public interface e_05_05 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		//整数値xの入力を促す
		System.out.print("整数値x：");
		//xの値をキーボードから取得
		int x = stdIn.nextInt();
		//整数値yの入力を促す
		System.out.print("整数値y：");
		//yの値をキーボードから取得
		int y = stdIn.nextInt();
		//整数値zの入力を促す
		System.out.print("整数値z：");
		//zの値をキーボードから取得
		int z = stdIn.nextInt();

		//合計を求める
		int sum = x + y + z;
		//合計値を表示
		System.out.println("xとyとzの合計は" + sum);
		//平均を求める、その際キャスト演算子をを利用
		double ave = (double)(x + y + z) / 3;
		//平均値を表示
		System.out.println("xとyとzの平均は" + ave);

	}
}
