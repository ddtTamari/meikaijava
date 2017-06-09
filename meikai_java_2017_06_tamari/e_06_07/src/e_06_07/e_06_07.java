/*
  演習6-7		もっとも末尾側に位置する要素を見つけるプログラムを作成せよ
  演習日		6月9日
  製作者		玉利仁美
 */package e_06_07;

import java.util.Random;
import java.util.Scanner;

public class e_06_07 {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);

		// 要素数を12に設定
		final int n = 12;
		// 要素を12個持った配列aを作成
		int[] a = new int[n];

		// n回繰り返す
		for (int j = 0; j < n; j++)
			// 各配列に0～9までのランダムな数字を代入
			a[j] = rand.nextInt(10);

		// 配列aの要素の値と表示
		System.out.print("配列aの全要素の値\n｛");
		// n回繰り返す
		for (int j = 0; j < n; j++)
			// 各要素に入っている値を表示
			System.out.print(a[j] + " ");

		// ｝を表示
		System.out.println("}");

		// 探す数値の入力を促す
		System.out.print("探す数値：");
		// キーの値をキーボードから取得
		int key = stdIn.nextInt();

		// 何個目の要素
		int i;
		// 配列を後ろから確認していく
		for (i = 11; i > 0; i--) {
			// i個めの値がkeyと一致している場合
			if (a[i] == key)
				// for文を終了させる
				break;
		}

		// 走査し終わる前ならば、探索成功
		if (i > 0)
			// i個めにkeyの値があると表示
			System.out.println("それはa[" + i + "]にあります。");
		// 失敗なら
		else
			// keyの値は配列にないと表示
			System.out.println("それはありません。");

	}

}
