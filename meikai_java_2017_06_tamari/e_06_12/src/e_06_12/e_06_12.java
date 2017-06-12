/*
  演習6-12		配列の要素の並びをシャッフルする(ランダムな順となるように)
  演習日		6月9日
  製作者		玉利仁美
 */
package e_06_12;

import java.util.Random;
import java.util.Scanner;

public class e_06_12 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);

		final int n = 5;
		int[] a = new int[n];
		int random = 0;
		for (int i = 0; i < n; i++) {
			random = rand.nextInt(10);
			a[i] = random;

		}

		for (int i = 0; i < n; i++) {
			i = rand.nextInt(n);

				Outer: while (true) {
					int random2 = rand.nextInt(n);
					for (int j = 0; j < i; j++) {
						if (i == random2) {
							continue Outer;
						}
					}
					System.out.println("a[" + i + "] = " + a[i]);
					break Outer;

			}
		}

	}
}
