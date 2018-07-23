/*
  演習16-3		List 16-7のメソッドreverseは、仮引数aに受け取った参照が空参照でないことを前提としている。
  				受け取ったのが空参照であった場合に、何らかの対処を行うように変更したプログラムを作成せよ。
  				※Column 16-2(P.527)に示すNullPointerExceptionを補足して対処すること。
  演習日		7月23日
  製作者		玉利仁美
 */
package e_16_3;

import java.util.Scanner;

public class e_16_3 {
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

	static void reverse(int[] a) {
		try {
			for (int i = 0; i < a.length / 2; i++) {
				swap(a, i, a.length - i);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.exit(1);
		} catch (NullPointerException e) {
			e.printStackTrace();
			System.exit(1);
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("要素数：");
		int num = stdIn.nextInt();

		int[] x = new int[num];

		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = stdIn.nextInt();
		}

		reverse(x);

		System.out.println("要素の並びを反転しました。");
		for (int i = 0; i < num; i++) {
			System.out.println("x[" + i + "] = " + x[i]);
		}
	}
}
