/*
 	演習3-10	2つの整数値を読み込みそれらの差を表示する
	制作日時	6月6日
	制作者	玉利仁美

*/
package e_03_10;
import java.util.Scanner;
public interface e_03_10 {

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
		//2つの整数値の差を表示する
		System.out.println(x);

	}

}
