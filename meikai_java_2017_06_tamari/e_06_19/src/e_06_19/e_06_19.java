/*
  演習6-19		クラス数・各クラスの人数・全員の点数を読み込み合計点と平均点を求めるプログラム
  				合計平均は、クラスごとのものと全体のものとを表示
  演習日		6月14日
  製作者		玉利仁美
 */
package e_06_19;

import java.util.Scanner;

public class e_06_19 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[][] score;
		System.out.print("クラス数：");
		int classCount = scan.nextInt();
		score = new int[classCount][];

		System.out.println();
		int classMember = 0;

		for (int i = 0; i < score.length; i++) {
			System.out.print((i + 1) + "組の人数：");
			classMember = scan.nextInt();
			score[i] = new int[classMember];
			for (int j = 0; j < score[i].length; j++) {
				System.out.print((i + 1) + "組" + (j + 1) + "番の点数：");
				score[i][j] = scan.nextInt();
			}
			System.out.println();
		}

		int sum[] = new int[classCount];
		float average[] = new float[classCount];
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				sum[i] += score[i][j];
			}
			average[i] = sum[i] / (score[i].length * 1.0f);
			System.out.println(average[i]);
		}

		int total = 0;
		float totalAverage = 0;
		System.out.print("　組　|　　合計　　平均\n");
		System.out.print("------+-----------------\n");
		for (int i = 0; i < score.length; i++) {
			System.out.printf(" " + (i + 1) + "組　|%7d%9.1f", sum[i], average[i]);
			System.out.println();
			total += sum[i];
			totalAverage += average[i];

		}
		System.out.print("------+-----------------\n");

		System.out.printf("　計　|%7d%9.1f",total,(totalAverage/score.length));

		scan.close();
	}
}
