/*
  演習13-4		演習9－4で作成した人間クラスにjavadocコメントを与えるとともに、javadocツールによってドキュメントを作成せよ
  演習日		7月10日
  製作者		玉利仁美
 */
package e_13_04;

/**
 * どこからでもアクセスできるよう定数を入れるクラス
 * @author 玉利仁美
 *
 */
public class Constant_Class {
	/**
	 *  名前を表示する際に他クラスから呼び出して使う
	 */
	public static final String Human_Name = new String("名前：");
	/**
	 *  誕生日を表示する際に他クラスから呼び出して使う
	 */
	public static final String Birth_Day = new String("誕生日：");
	/**
	 *  年齢を表示する際に他クラスから呼び出して使う
	 */
	public static final String Age = new String("年齢：");
	/**
	 *  性別を表示する際に他クラスから呼び出して入れる
	 */
	public static final String Gender = new String("性別：");
	/**
	 *  国籍を表示する際に他クラスから呼び出して使う
	 */
	public static final String Nationality = new String("国籍：");
	/**
	 *  ボディマス指数を表示する際に他クラスから呼び出してに使う
	 */
	public static final String BMI_Index = new String("ボディマス指数：");

}
