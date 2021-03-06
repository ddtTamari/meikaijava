/*
  演習3－18		0，1，2のいずれかの値の乱数を生成、その値によってグーチョキパーいずれかを表示させる
  演習日		6月6日
  製作者		玉利仁美
 */
package e_03_18;

import java.util.Scanner;

public class e_03_18 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("月：");
		int month = stdIn.nextInt();

		switch (month) {
		case 1:
		case 2:
			System.out.println("冬");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("春");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("夏");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("秋");
			break;
		case 12:
			System.out.println("冬");
			break;
		default:
			System.out.println("1～12の間の数を入れてください。");
			break;
		}
	}
}
