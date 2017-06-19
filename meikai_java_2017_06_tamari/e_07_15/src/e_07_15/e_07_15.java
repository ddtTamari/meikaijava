/*
  演習7-13		整数を左右にシフトした値が、2のべき乗での乗算や除算と等しくなることを確認するプログラムの作成
  演習日		6月17日
  製作者		玉利仁美
 */
package e_07_15;

import java.util.Scanner;

public class e_07_15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		//いくつの要素がある配列なのか要素数の入力を促す
		System.out.print("いくつの要素がある配列を作りますか：");
		//要素の数をキーボードから入力
		int elements = scan.nextInt();
		//すべての要素の値を足す配列を要素数elementsで生成
		int[] arrayA = new int[elements];

		//入力された要素の数だけ繰り返し表示し入力を求める
		for (int i = 0; i < elements; i++) {
			//何個目かの要素にいれる値の入力を促す
			System.out.print(i + "個目の要素の値は：");
			//配列i個目の要素にキーボードから値を入力
			arrayA[i] = scan.nextInt();
		}

		//合計を求めるメソッドを呼び出し、その値を表示する
		System.out.println("配列の合計は：" + sumOf(arrayA));
		//ストリームを解放する
		scan.close();
	}

	//引数の配列の要素の値の合計を求めるメソッド
	static int sumOf(int[] a) {
		//合計に初期値０を代入
		int sum = 0;
		//配列の長さだけ繰り返し行う
		for (int i = 0; i < a.length; i++) {
			//i個目の配列の値を足していく
			sum += a[i];
		}
		//合計を返却する
		return sum;
	}

}
