/*
s 	演習3-14	小さいほうの値大きいほうの値の両方を表示、同じ場合は同じと表示
	制作日時	6月6日
	制作者	玉利仁美

*/
package e_03_14;

import java.util.Scanner;

public class e_03_14 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		// 整数aをキーボードから入力
		System.out.print("整数a：");
		int a = stdIn.nextInt();
		// 整数bをキーボードから入力
		System.out.print("整数ｂ：");
		int b = stdIn.nextInt();

		int min, max; // 最小値、最大値

		// もしaがbより小さければ最小値はa、最大値がbになる。そうでなければ、最大値がa、最小値がｂになる。
		if (a < b) {
			min = a;
			max = b;
		} else {
			max = a;
			min = b;
		}
		// 最小値最大値を表示
		System.out.println("min：" + min);
		System.out.println("max:" + max);

		// もし、最大値・最小値が同じ値ならば、同じ値と表示
		if (min == max)
			System.out.println("二つの値は同じです。");
	}

}
