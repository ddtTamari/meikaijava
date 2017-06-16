/*
  演習7-11		x+y+z , x+y-z , x-y+z , x-y-zの四つの問題をランダムに出題するプログラムを作成せよ
  演習日		6月16日
  製作者		玉利仁美
 */
package e_07_11;

import java.util.Scanner;

public class e_07_11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("整数x:");
		int integerX = scan.nextInt();
		System.out.print("いくつシフトさせるか：");
		int shift = scan.nextInt();
		int division = integerX / (2 ^ shift);
		int multiPlication = integerX * (2 ^ shift);
		printbits(integerX);
		rightShift(integerX, shift, division);
		leftShift(integerX, shift, multiPlication);

	}

	static void printbits(int x) {
		for (int i = 31; i >= 0; i--) {
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');

		}
		System.out.println();
	}

	static void rightShift(int x, int n, int y) {
		System.out.print("xを" + n + "2のn乗で割った数：" + y );
		System.out.println();
		System.out.print("xを" + n + "個右にシフトした数：" + (x >> 1));
		System.out.println();
		if ((x >> n) == y) {
			System.out.println("xをn右にシフトしたとき、xを2のn乗で割った値と同じになりました。");
			System.out.print("xを" + n + "個右にシフトした数：" + (x >> 1));
			System.out.println();
			System.out.print("xを" + n + "2のn乗で割った数：" + x / (2 ^ n));
		} else {
			System.out.println("false");
		}
	}

	static void leftShift(int x, int n, int y) {
		if ((x << n) == y) {
			System.out.println("xをn左にシフトしたとき、xを2のn乗とかけた値と同じになりました。");
			System.out.print("xを" + n + "個右にシフトした数：" + y);
			System.out.println();
			System.out.print("xを" + n + "2のn乗でかけた数：" + y);
		} else {
			System.out.println("false");
		}
	}

}
