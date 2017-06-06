/*
 	演習3-16	3つの数字を昇順で並びかえ
	制作日時	6月6日
	制作者	玉利仁美

*/
package e_03_16;

import java.util.Scanner;

public interface e_03_16 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		//整数aとbとcにキーボードから入力
		System.out.print("整数a:");	int a = stdIn.nextInt();
		System.out.print("整数ｂ：");	int b = stdIn.nextInt();
		System.out.print("整数c：");	int c = stdIn.nextInt();

		//sにaを代入
		int s = a;
		//tにbを代入
		int t = b;

		//もしbよりaのほうが大きいならばaとbを入れ替える
		if(a > b){
			a = b;
			b = s;
		}
		//もしcよりbのほうが大きいならばbとcを入れ替える
		if(b > c){
			b = c;
			c = s;
		}
		//最後に入れ替えた後のbよりaが大きいならばaとbを入れかえる
		if(a > b){
			a = b;
			b = t;

		}



		//昇順に並び替えたaとbとcを表示する
		System.out.println("降順になるように並びかえました。");
		System.out.println("整数aは" + a +"になりました。");
		System.out.println("整数bは" + b +"になりました。");
		System.out.println("整数cは" + c +"になりました。");


	}

}