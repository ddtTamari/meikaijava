/*
  演習7-17		探索するキーと同じ値の要素が複数個存在する場合もっとも末尾側に位置する要素を見るけるメソッドの制作
  演習日		6月17日
  製作者		玉利仁美
 */
package e_07_17;

import java.util.Scanner;

public class e_07_17 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// いくつの要素数の配列を作るか要素の数の入力を求める
		System.out.print("要素数：");
		// 要素の数をキーボードから取得する
		int elements = scan.nextInt();
		// 要素数をキーボードから取得した値とした配列を生成
		int[] arrayA = new int[elements];

		// 要素の数だけ要素の値を入力したいので要素数の数だけ繰り返し行う
		for (int i = 0; i < elements; i++) {
			// 何個目の要素の値を入れるのかを表示
			System.out.print("x[" + i + "] :");
			// i個目の要素の値をキーボードから取得
			arrayA[i] = scan.nextInt();
		}
		// 探す値がいくつなのか入力を求める
		System.out.print("探す値は：");
		// 探す値をキーボードから取得
		int key = scan.nextInt();

		// 探索するキーと同じ値の要素を末尾から探すメソッドを呼び出し、その値をindexに代入
		int index = linearSearchR(arrayA, key);
		// もし探索が成功しなければ-１が入るので、indexがー1の場合は要素は存在しないと表示する
		if (index == -1) {
			// indexがー1なのでその要素は存在しないと表示
			System.out.println("その値の要素は存在しません");
			// －1以外の場合同じ値の要素があるので何番目にその要素があるのか表示する
		} else {
			// －1以外の数字だったので、その要素が何番目の要素なのか表示
			System.out.println("その値はx[" + index + "]にあります");
		}
		// ストリームを解放する
		scan.close();
	}

	// 引数の配列の中にkeyと同じ値の要素があるかどうか末尾の要素から調べるメソッド
	static int linearSearchR(int[] a, int key) {

		// 要素の番号は要素数ー1なので末尾から調べるためには要素数ー1した値から0まで調べていく
		for (int i = a.length - 1; i >= 0; i--) {
			//keyと同じ要素の値があったらそのiの数を返却する
			if (a[i] == key) {
				//i番目の要素とkeyが一緒だったのでiの値を返す
				return i;
			}
		}
		// 要素の探索が失敗したら-1を返す
		return -1;
	}

}
