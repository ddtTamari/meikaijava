/*
 	演習2-6	底辺と高さを読み込みその面積を表示する
	制作日時	6月5日
	制作者	玉利仁美

*/
package e_02_06;

import java.util.Scanner;

public class e_02_06 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		// 底辺の入力をもとめる
		System.out.print("底辺：");
		// double型の変数ｘをキーボードから得られるようにする
		double x = stdIn.nextDouble();
		// 高さの入力を求める
		System.out.print("高さ：");
		// double型の変数ｙをキーボードから得られるようにする
		double y = stdIn.nextDouble();

		// 底辺×高さ÷2で三角形の面積を求める
		System.out.println("面積は" + (x * y) / 2 + "です。");

	}
}
