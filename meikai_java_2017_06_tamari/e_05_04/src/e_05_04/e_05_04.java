/*
  演習5-4		3つの整数値を読み込み、その合計と平均を表示するプログラムを作成(平均は実数として表示)
  演習日		6月8日
  製作者		玉利仁美
 */
package e_05_04;

import java.util.Scanner;

public class e_05_04 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		// 合計と平均を出すための3値のうちの一つ目
		System.out.print("整数値x：");
		// xの値をキーボードから取得
		int x = stdIn.nextInt();
		// 合計と平均を出すための3値のうちの二つ目
		System.out.print("整数値y：");
		// yの値をキーボードから取得
		int y = stdIn.nextInt();
		// 合計と平均を出すための3値のうちの三つ目
		System.out.print("整数値z：");
		// zの値をキーボードから取得
		int z = stdIn.nextInt();

		// 合計を求める
		int sum = x + y + z;
		// 合計値を表示
		System.out.println("xとyとzの合計は" + sum);
		// 平均を求める
		double ave = (x + y + z) / 3.0;
		// 平均値を表示
		System.out.println("xとyとzの平均は" + ave);
		stdIn.close();

	}
}
