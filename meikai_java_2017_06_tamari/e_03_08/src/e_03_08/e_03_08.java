/*
 	演習3-8	点数に応じた評価を判定するプログラム
	制作日時	6月5日
	制作者	玉利仁美

*/
package e_03_08;

import java.util.Scanner;

public class e_03_08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		//評価を行う点数について入力を促す
		System.out.print("点数：");
		//点数はキーボードから取得する
		int score = scan.nextInt();

		// 点数が0～59点の場合、不可と表示
		if (score >= 0 && score < 60) {
			//0～59点のいずれかだったので不可と表示
			System.out.println("不可");
		// 点数が60~69点の場合、可と表示
		} else if (score >= 60 && score < 70) {
			//60～69点のいずれかだったので可と表示
			System.out.println("可");
		// 点数が70~79点の場合、良と表示
		} else if (score >= 70 && score < 80) {
			//70～79点のいずれかだったので良と表示
			System.out.println("良");
		// 点数が80~100点の場合、優と表示
		} else if (score >= 80 && score <= 100) {
			//80～100点の場合、優と表示
			System.out.println("優");
		//0～100ではない値が入力されたら判定ができないので判定外と表示
		} else {
			//0～100ではない数字が入力されたので、判定外と表示
			System.out.println("判定外");
		}
		//ストリームを解放
		scan.close();

	}
}
