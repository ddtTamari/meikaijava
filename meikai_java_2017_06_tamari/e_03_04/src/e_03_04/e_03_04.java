/*
 	演習3-4	二つの変数a,bを読み込んでその大小関係を、
	aのほうが大きい・bのほうが大きい・同じ値です、のいずれかで表示するプログラム
	制作日時	6月5日
	制作者	玉利仁美
*/
package e_03_04;

import java.util.Scanner;

public class e_03_04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 大きさを比べる2値のうちの一つ目の入力を促す
		System.out.print("変数a：");
		// 一つ目の値をキーボードから取得する
		int integerA = scan.nextInt();
		// 大きさを比べる2値のうちの二つ目の入力を促す
		System.out.print("変数b：");
		// 二つ目の値をキーボードから取得する
		int integerB = scan.nextInt();

		// 一つ目の値が二つ目の値より大きい値の時、一つ目の値のほうが大きいと表示する
		if (integerA > integerB){
			//一つ目の値のほうが大きいので、一つ目の値のほうが大きいと表示
			System.out.println("aのほうが大きいです。");
		// 一つ目の値が二つ目の値より小さい値の時、二つ目の値のほうが大きいと表示する
		}else if (integerA < integerB){
			//二つ目の値のほうが大きいため、二つ目の値のほうが大きいと表示
			System.out.println("bのほうが大きいです。");
		// 一つ目の値と二つ目の値に差がないとき、同じ値であると表示する
		}else{
			//2値は同じ値なので、2値は同じ値であると表示
			System.out.println("aとbは同じ値です。");
		}
		//ストリームの解放
		scan.close();
	}

}
