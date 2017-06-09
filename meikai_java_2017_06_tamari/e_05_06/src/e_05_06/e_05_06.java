/*
  演習5-6		float型の変数を0.0から1.0まで0.001ずつ増やす様子と
  				int型の変数を0から1000までインクリメントした値を
  				1000で割った値を求める様子を横に並べて表示するプログラム
  演習日		6月8日
  製作者		玉利仁美
 */
package e_05_06;

import java.util.Scanner;

public interface e_05_06 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		// floatとintの表示
		System.out.println("  float       int");
		// 実数部分と文字の部分を分ける
		System.out.println("--------------------");

		// xの値が1.0fを超えるまで0.001を足していく
		for (float x = 0.0f, y = 0.0f; x <= 1.0f; x += 0.001f, y++) {
			// iを0,001単位で増やしていく
			float i = y / 1000;
			// xとiの誤差を表示する
			System.out.printf("%1.7f  %1.7f\n", x, i);

		}

	}

}
