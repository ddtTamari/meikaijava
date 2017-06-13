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
		//テストの点数を入力する人数をキーボードから取得
		int number = stdIn.nextInt();
		//点数を入れるための配列を作成
		int[] score = new int[number];

		//人数の分だけ繰り返し行う
		for (int i = 0; i < number; i++) {
			//1番目の点数の人から点数の入力を促す
			System.out.print((i + 1) + "番目の点数：");
			//点数を入力
			score[i] = stdIn.nextInt();
		}
		int sum = 0;	//合計点
		//人数の分だけ繰り返し行う
		for (int i = 0; i < number; i++){
			//合計は、それぞれの要素に入れた点数を足していったもの
			sum += score[i];
		}

		int ave = sum / number;	//平均。合計を人数で割ったもの
		int max = score[0];		//最高得点にとりあえず一つ目の要素を代入
		int min = score[0];		//最低得点にとりあえず一つ目の要素を代入

		//人数の分だけ繰り返し行う
		for (int i = 0; i < number; i++) {
			//各要素の値が、最高得点より高い場合その値を代入
			if (score[i] > max) {
				//最高得点はi番目の要素の値
				max = score[i];
			}
			//各要素の値が、最少得点より低い場合はその値を代入
			if (score[i] < min) {
				//最低得点はi番目の要素の値
				min = score[i];
			}
		}
		//合計得点を表示
		System.out.println("合計点は" + sum + "点です。");
		//平均得点を表示
		System.out.println("平均点は" + ave + "点です。");
		//最高得点を表示
		System.out.println("最高点は" + max + "点です。");
		//最低得点を表示
		System.out.println("最低点は" + min + "点です。");
		//ストリームを閉じる
		stdIn.close();
	}
}
