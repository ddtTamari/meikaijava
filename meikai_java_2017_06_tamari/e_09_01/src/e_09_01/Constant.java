/*
  演習9-1		演習8－1で生成した人間クラスの配列を生成するプログラムを作成せよ。
  				生成時に要素を初期化するもの生成後の要素に値を代入するものなど複数のパターンを作ること
  演習日		6月22日
  製作者		玉利仁美
 */
package e_09_01;

//定数を格納しておくためのクラス
public class Constant {
	// 何人分のデータを入力するのか質問する際に他クラスから呼び出し使う
	public static final String How_Many_People = new String("何人のデータを入力しますか：");
	// サンプルデータを表示する際サンプルデータであることを明示するための
	public static final String Sample_Date = new String("サンプルデータ：");
	// 何人目のデータを入力しているかを表示する際他クラスから呼び出して使う
	public static final String What_Number = new String("人目：");
	// 名前を表示する際に他クラスから呼び出して使う
	public static final String Human_Name = new String("名前：");
	// 年齢を表示する際に他クラスから呼び出して使う
	public static final String askAge = new String("年齢：");
	// 性別を表示する際に他クラスから呼び出して入れる
	public static final String askGender = new String("性別：");
	// 国籍を表示する際に他クラスから呼び出して使う
	public static final String Nationality = new String("国籍：");
	// 性別を表示する際に他クラスから呼び出して入れる
	public static final String Height = new String("身長：");
	// 性別を表示する際に他クラスから呼び出して入れる
	public static final String Weight = new String("体重：");
	// ボディマス指数を表示する際に他クラスから呼び出してに使う
	public static final String BMI_Index = new String("ボディマス指数：");

}
