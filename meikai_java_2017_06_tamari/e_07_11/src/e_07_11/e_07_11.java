/*
  演習7-11		整数を左右にシフトした値が、2のべき乗での乗算や除算と等しくなることを確認するプログラムの作成
  演習日		6月16日
  製作者		玉利仁美
 */
package e_07_11;

import java.util.Scanner;

public class e_07_11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 左右にシフトさせる整数xの値の入力を促す
		System.out.print("整数x:");
		// 整数xの値をキーボードから取得する
		int integerX = scan.nextInt();
		// 左右にいくつシフトさせるのか値の入力を促す
		System.out.print("いくつシフトさせるか：");
		// いくつシフトさせるのか値をキーボードから取得する
		int shift = scan.nextInt();

		// 右にシフトした値が、2のべき乗での除算と同じ値になるか確かめるために、整数xを2のshift乗した値で割った値を求める
		int division = integerX / power(shift);
		// 左にシフトした値が、2のべき乗での乗算と同じ値になるか確かめるために、整数xを2のshift乗した値にかけた値を求める
		int multiPlication = integerX * power(shift);

		// 整数xを2のshift乗した値で割った値を、32ビットで表した値を表示する
		System.out.print("整数xを2のn乗で割った数のビットは：");
		// 整数を32ビットで表すようにするprintbitsメソッドを呼び出し、整数xを2のshift乗した値で割った値を、32ビットで表示
		printbits(integerX / power(shift));
		// 整数xを2のshift乗した値で割った値を表示する
		System.out.println("整数xを2のn乗で割った数は：" + division);

		// 整数xを2のshift乗した値にかけた値を、32ビットで表した値を表示する
		System.out.print("整数xを2のn乗をかけた数のビットは：");
		// 整数を32ビットで表すようにするprintbitsメソッドを呼び出し、整数xを2のshift乗した値にかけた値を、32ビットで表示
		printbits(integerX * power(shift));
		// 整数xを2のshift乗した値にかけた値を表示する
		System.out.println("整数xを2のn乗をかけた数は：" + multiPlication);

		// シフトした値と見分けやすくするため改行
		System.out.println();

		// 変数xをshift分、右にシフトさせた値を表示するメソッドを呼び出す
		rightShift(integerX, shift);
		// 変数xをshift分、左にシフトさせた値を表示するメソッドを呼び出す
		leftShift(integerX, shift);
		// ストリームを解放する
		scan.close();

	}

	// 2のshift乗を計算するメソッド
	static int power(int shift) {
		// 2のshift乗を入れておく変数を用意
		int power = 1;
		// shift回分繰り返し2をかけ続ける
		for (int i = 0; i < shift; i++) {
			// 2をi回分かける
			power *= 2;
		}
		// 返却値として２のshift乗を返す
		return power;

	}

	// 与えられた整数を32ビットで表示するメソッド
	static void printbits(int x) {
		// 32ビットで表示するので32回繰り返す
		for (int i = 31; i >= 0; i--) {
			// 第iビットの値が1か0かを求め、1ならば1を表示0ならば0を表示する
			System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
		}
		// 32ビット表示し終えたので改行する
		System.out.println();
	}

	// 整数xをn回右にシフトさせた値を求めるメソッド
	static void rightShift(int x, int n) {
		// 何の数字を何回右にシフトしたのか表示する
		System.out.print(x + "を右に" + n + "回シフトした数のビットは：");
		// 32ビットでxをn回右にシフトした値を表示する
		printbits(x >> n);
		// 何の数字を何回右にシフトしたのか整数で表示する
		System.out.print(x + "を右に" + n + "回シフトした数は：" + (x >> n));
		// 右にシフトした値を表示し終えたので改行する
		System.out.println();
	}

	// 整数xをn回左にシフトさせた値を求めるメソッド
	static void leftShift(int x, int n) {
		// 何の数字を何回左にシフトしたのか表示する
		System.out.print(x + "を左に" + n + "回シフトした数のビットは：");
		// 32ビットでxをn回左にシフトした値を表示する
		printbits(x << n);
		// 何の数字を何回左にシフトしたのか整数で表示する
		System.out.print(x + "を左に" + n + "回シフトした数は：" + (x << n));

	}

}
