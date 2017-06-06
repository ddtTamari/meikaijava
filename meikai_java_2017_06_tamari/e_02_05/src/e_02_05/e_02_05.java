/*
 	演習2-5	二つの実数値をキーボードから読み込みその和と平均を求める
	制作日時	6月5日
	制作者	玉利仁美

*/
package e_02_05;

import java.util.Scanner;

public interface e_02_05 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		//ｘの値の入力を求める
		System.out.print("xの値：");
		//double型の変数ｘをキーボードから得られるようにする
		double x = stdIn.nextDouble();
		//ｙの値の入力を求める
		System.out.print("yの値：");
		//double型の変数ｙをキーボードから得られるようにする
		double y = stdIn.nextDouble();

		//キーボードから得た変数ｘとｙの値を足し算
		System.out.println("合計は" + (x + y) + "です。");
		//キーボードから得た変数ｘとｙの値の平均を求める
		System.out.println("平均は" + (x + y)/2 + "です。");
	}
}
