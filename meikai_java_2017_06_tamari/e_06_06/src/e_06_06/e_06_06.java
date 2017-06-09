/*
  演習6-6		点数の合計点・最高点・最低点を表示するプログラムを作成、人数・点数はキーボードから読み取る
  演習日		6月9日
  製作者		玉利仁美
 */
package e_06_06;

import java.util.Scanner;

public class e_06_06 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		// 人数の入力を促す
		System.out.print("人数は：");
		//
		int num = stdIn.nextInt();
		int[] score = new int[num];

		for (int i = 0; i < num; i++) {
			System.out.print((i + 1) + "番目の点数：");
			score[i] = stdIn.nextInt();
		}

		int sum = 0;
		for (int i = 0; i < num; i++)
			sum += score[i];

		int ave = sum / num;
		int max = score[0];
		int min = score[0];

		for (int i = 0; i < num; i++) {
			if (score[i] > max) {
				max = score[i];
			}
			if (score[i] < min) {
				min = score[i];
			}
		}
		System.out.println("合計点は" + sum + "点です。");
		System.out.println("平均点は" + ave + "点です。");
		System.out.println("最高点は" + max + "点です。");
		System.out.println("最低点は" + min + "点です。");

	}
}
