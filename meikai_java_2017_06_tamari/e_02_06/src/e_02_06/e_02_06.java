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

		// 三角形の底辺の値の入力を促す
		System.out.print("底辺：");
		// 底辺の値をキーボードから取得
		double triangleBase = stdIn.nextDouble();
		// 三角形の高さの値の入力を促す
		System.out.print("高さ：");
		// 高さの値をキーボードから取得
		double triangleHeight = stdIn.nextDouble();

		// 底辺×高さ÷2の公式により三角形の面積を求め、表示する
		System.out.println("面積は" + (triangleBase * triangleHeight) / 2 + "です。");

		//ストリームを解放する
		stdIn.close();
	}
}
