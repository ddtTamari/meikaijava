/*
  演習4-7		読み込んだ値の個数だけ記号文字を表示するプログラムを作成(表示は*+を交互に)
  演習日		6月6日
  製作者		玉利仁美
 */
package e_04_07;

import java.util.Scanner;

public interface e_04_07 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		System.out.print("何個*を表示しますか：");
		int n = stdIn.nextInt();

		int i = 0;
		//入力されたnよりiが小さいとき繰り返す
		while(i < n){
			//iが偶数の時*を表示
			if(i%2 == 0)
			System.out.print('*');
			//それ以外の時+を表示
			else
			System.out.print('+');
			//iを一つずつ増加
			i++;
		}
		//System.out.println();
	}
}
