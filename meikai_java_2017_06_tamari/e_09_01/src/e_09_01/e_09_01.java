/*
  演習9-1		演習8－1で生成した人間クラスの配列を生成するプログラムを作成せよ。
  				生成時に要素を初期化するもの生成後の要素に値を代入するものなど複数のパターンを作ること
  演習日		6月22日
  製作者		玉利仁美
 */package e_09_01;

import java.util.Scanner;

//人のデータを入力したるするためのメインクラス
public class e_09_01 {
	// 人のデータを入力したるするためのメインメソッド
	public static void main(String[] args) {
		// 入力するデータをキーボードから取得するために宣言
		Scanner scan = new Scanner(System.in);

		// 何人分のデータを入力するのか値の入力を促す
		System.out.print(Constant.How_Many_People);
		// 何人分のデータを入力するのかキーボードから取得
		int howManyPeopleInput = scan.nextInt();

		// 人間クラスの配列を、何人分入力するのかに加えサンプルデータ3つ分の要素を用意
		Human_Class[] humanSpec = new Human_Class[howManyPeopleInput + 3];
		// 人間クラスの配列の要素の数を取っておく
		int humanSpecLength = humanSpec.length;

		// 要素番号0の時、プログラムからきまった値を代入
		humanSpec[0] = new Human_Class("畠山和洋", 34, "男", "日本", 180.0f, 96.0f);
		// 要素番号1の時、プログラムからきまった値を代入
		humanSpec[1] = new Human_Class("ウラディミール・バレンティン", 32, "男", "オランダ", 185.0f, 100.0f);
		// 要素番号2の時、プログラムからきまった値を代入
		humanSpec[2] = new Human_Class("吉田沙保里", 34, "女", "日本", 156.0f, 55.0f);

		// サンプルデータであることを明示
		System.out.println(Constant.Sample_Date);
		// 3つのサンプルデータを表示するので3回分繰り返す
		for (int i = 0; i < 3; i++) {
			// インスタンスに入力された値とBMIを表示するメソッドを呼び出す
			humanSpec[i].putHumanSpec();
		}

		// 生成された人間クラスの配列の長さ分質問をしたいので繰り返す
		for (int i = 0; i < humanSpecLength; i++) {
			// 0～3についてはすでにサンプルデータが入っているので3以上の時になったら入力を促す
			if (i > 2) {
				// サンプルデータをのぞいた数人目データであると表示する
				System.out.println(i - 2 + Constant.What_Number);
				// i－2人目の人の名前の入力を促す
				System.out.print(Constant.Human_Name);
				// 名前をキーボードから取得する
				String imputName = scan.next();
				// i－2人目の人の年齢の入力を促す
				System.out.print(Constant.askAge);
				// 年齢をキーボードから取得する
				int imputAge = scan.nextInt();
				// i－2人目の人の性別の入力を促す
				System.out.print(Constant.askGender);
				// 性別をキーボードから取得する
				String imputGender = scan.next();
				// i－2人目の人の国籍の入力を促す
				System.out.print(Constant.Nationality);
				// 国籍をキーボードから取得する
				String imputNationality = scan.next();
				// i－2人目の人の身長の入力を促す
				System.out.print(Constant.Height);
				// 身長をキーボードから取得する
				float imputHeight = scan.nextFloat();
				// i－2人目の人の体重の入力を促す
				System.out.print(Constant.Weight);
				// 体重をキーボードから取得する
				float imputWeight = scan.nextFloat();
				// 人間クラスの配列のi番目にそれぞれキーボードから入力した値を入れる
				humanSpec[i] = new Human_Class(imputName, imputAge, imputGender, imputNationality, imputHeight,
						imputWeight);
			}
		}

		// 入力結果はまとめて表示したいのでひとつ前のfor文と分ける
		for (int i = 0; i < humanSpecLength; i++) {
			// サンプルデータを除いた3番目の要素から表示する
			if (i > 2) {
				// 入力されたデータを表示するメソッド呼び出す
				humanSpec[i].putHumanSpec();
			}
		}
		// ストリームを解放する
		scan.close();
	}
}
