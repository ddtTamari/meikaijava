/*
 	演習3-11	二つの整数値を読み込んでそれらの値の差が10以下かどうか判定
	制作日時	6月6日
	制作者	玉利仁美

*/package e_03_11;

import java.util.Scanner;

public interface e_03_11 {
	public static void main(String[] args){

		Scanner stdIn = new Scanner(System.in);

		//実数aの入力を促す
		System.out.print("実数a:");
		//aをキーボードから入力
		int a = stdIn.nextInt();
		//実数bの入力を促す
		System.out.print("実数b：");
		//bをキーボードから入力
		int b = stdIn.nextInt();

		//2つの整数値の差を求める
		int x = a - b;

		//差が10以下の時、それらの差が10以下と表示
		if(x <= 10 )
			System.out.println("それらの差は10以下です。");
		//それ以外の時、それらの差は11以上と表示
		else
			System.out.println("それらの差は11以上です。");
	}
}
