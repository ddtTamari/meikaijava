/*
 	演習3-13	3つの整数値の中央値を求めて表示
	制作日時	6月6日
	制作者	玉利仁美

*/
package e_03_13;

import java.util.Scanner;

public interface e_03_13 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		//整数値aをキーボードから入力
		System.out.print("整数値a:"); int a = stdIn.nextInt();
		//整数値bをキーボードから入力
		System.out.print("整数値b："); int b = stdIn.nextInt();
		//整数値cをキーボードから入力
		System.out.print("整数値c："); int c = stdIn.nextInt();


		int min = a;	//最初にminにaを代入
		//もしbがminより小さければminの値にbを代入
		if(b < min)		min = b;
		//もしcがminより小さければminの値にcを代入
		if(c < min)		min = c;

		int max = a;	//最初にmaxにaを代入
		//もしbがmaxより小さければmaxの値にbを代入
		if(b > max)		max = b;
		//もしcがmaxより小さければmaxの値にcを代入
		if(c > max)		max = c;

		int mid = a;	//最初にmidにaを代入
		//もしminがmidより大きければmidにminを代入
		if(min > mid)	mid = min;
		//もしmaxがmidより小さければmidにmaxを代入
		if(max < mid)	mid = max;

		//midを表示
		System.out.println("mid = " + mid);
}
}
