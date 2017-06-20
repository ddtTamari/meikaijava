/*
  演習7-31		int,long,float,doubleの絶対値を求める多重定義されたメソッド群の作成
  演習日		6月20日
  製作者		玉利仁美
 */
package e_07_31;

import java.util.Scanner;

public class e_07_31 {
	public static void main(String[] args) {
		// 絶対値を求める整数や実数の値をキーボードから取得するため宣言
		Scanner scan = new Scanner(System.in);

		// 絶対値を求めるint型の整数の入力を促す
		System.out.print("int型の整数：");
		// int型の整数の値をキーボードから取得
		int intInteger = scan.nextInt();
		// 絶対値を求めるlong型の整数の入力を促す
		System.out.print("long型の整数：");
		// long型の整数の値をキーボードから取得
		long longInteger = scan.nextLong();
		// 絶対値を求めるfloat型の実数の入力を促す
		System.out.print("float型の実数：");
		// float型の実数の値をキーボードから取得
		float floatDecimal = scan.nextFloat();
		// 絶対値を求めるdouble型の実数の入力を促す
		System.out.print("double型の実数：");
		// double型の実数の値をキーボードから取得
		double doubleDecimal = scan.nextDouble();

		// 入力されたint型の整数の絶対値を求めるメソッドを呼び出し返却値を表示
		System.out.println("int型整数の絶対値は" + absolute(intInteger) + "です。");
		// 入力されたlong型の整数の絶対値を求めるメソッドを呼び出し返却値を表示
		System.out.println("long型整数の絶対値は" + absolute(longInteger) + "です。");
		// 入力されたfloat型の実数の絶対値を求めるメソッドを呼び出し返却値を表示
		System.out.println("float型実数の絶対値は" + absolute(floatDecimal) + "です。");
		// 入力されたdouble型の実数の絶対値を求めるメソッドを呼び出し返却値を表示
		System.out.println("double型実数の絶対値は" + absolute(doubleDecimal) + "です。");

		// ストリームを解放
		scan.close();
	}

	// 入力されたint型の整数の絶対値を求めるメソッド
	static int absolute(int x) {
		// xが負の値の時は-1をかけて自然数に直す
		if (x < 0) {
			//引数に-1をかけたものを返却する
			return x * (-1);
		}
		//0または正の値の場合そのまま返却する
		return x;
	}

	// 入力されたlong型の整数の絶対値を求めるメソッド
	static long absolute(long x) {
		// xが負の値の時は-1をかけて自然数に直す
		if (x < 0) {
			//引数に-1をかけたものを返却する
			return x * (-1);
		}
		//0または正の値の場合そのまま返却する
		return x;
	}

	// 入力されたfloat型の実数の絶対値を求めるメソッド
	static float absolute(float x) {
		// xが負の値の時は-1をかけて自然数に直す
		if (x < 0) {
			//引数に-1をかけたものを返却する
			return x * (-1);
		}
		//0または正の値の場合そのまま返却する
		return x;
	}

	// 入力されたdouble型の実数の絶対値を求めるメソッド
	static double absolute(double x) {
		// xが負の値の時は-1をかけて自然数に直す
		if (x < 0) {
			//引数に-1をかけたものを返却する
			return x * (-1);
		}
		//0または正の値の場合そのまま返却する
		return x;
	}

}
