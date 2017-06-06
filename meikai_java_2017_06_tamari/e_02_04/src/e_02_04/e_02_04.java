/*
 	演習2-4	キーボードから読み込んだ数値に10を足したのと減じた数字を出力する
	制作日時	6月5日
	制作者	玉利仁美

*/
package e_02_04;

import java.util.Scanner;

public interface e_02_04 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		//整数値の入力を促す
		System.out.print("整数値：");
		//変数ｘにキーボードから読み込んだ数字を入れる
		int x = stdIn.nextInt();

		//入力した数字に10を足す
		System.out.println("10を加えた値は" + (x + 10) + "です。");
		//入力した数字から10を引く
		System.out.println("10を減じた値は" + (x - 10) + "です。");


	}
}
