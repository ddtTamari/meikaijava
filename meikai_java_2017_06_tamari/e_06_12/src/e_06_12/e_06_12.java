/*
  演習6-12		配列の要素の並びをシャッフルする(ランダムな順となるように)
  演習日		6月9日
  製作者		玉利仁美
 */
package e_06_12;

import java.util.Random;
import java.util.Scanner;

public class e_06_12 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);

		// 5つの要素を持った配列を作るための値を生成
		final int n = 5;
		// 配列aを作成
		int[] a = new int[n];
		// aの配列の要素に入れる値をランダムで出すための変数
		int random = 0;
		// 要素の並びをランダムで出すための変数
		int random2 = 0;
		// 要素数の分だけ繰り返し行う
		for (int i = 0; i < n; i++) {
			// ランダムの変数の中に、1から10までのランダムな値を代入
			random = rand.nextInt(10) + 1;
			// 配列の要素にランダムな値を代入
			a[i] = random;
		}

		//aの配列の要素の番号の配列
		int[] copy = new int[n];
		//0～4までの数字を入れたいので、5回繰り返す
		for (int i = 0; i < n; i++) {
			//繰り返し行う
			Outer: while (true) {
				//aの配列の要素の番号をランダムで決める
				random2 = rand.nextInt(n);
				//ほかの要素の番号とかぶっていないか確認
				for (int j = 0; j < i; j++) {
					//もしかぶっていたら
					if (copy[j] == random2) {
					//もう一度ランダム2の値を求めなおす
						continue Outer;
					}
				}
				//aの配列の要素の数字を、copyの配列の要素の値として保存
				copy[i] = random2;
				//while文を終了させる
				break;
			}
			//aの配列のインデックスを、copyの配列で表示させる
			System.out.println("a[" + copy[i] + "] = " + a[copy[i]]);

		}

	}
}
