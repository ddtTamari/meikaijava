/*
  演習8-1		名前・身長・体重などをメンバとして持つ《人間クラス》を作成せよ(フィールドやメソッドなどは自分で自由に設計すること)
  演習日		6月21日
  製作者		玉利仁美
 */
package e_08_01;

//どこからでもアクセスできるよう定数を入れるクラス
public class Constant_Class {
	// 名前を表示する際に他クラスから呼び出して使う
	public static final String Human_Name = new String("名前：");
	// 年齢を表示する際に他クラスから呼び出して使う
	public static final String Age = new String("年齢：");
	// 性別を表示する際に他クラスから呼び出して入れる
	public static final String Gender = new String("性別：");
	// 国籍を表示する際に他クラスから呼び出して使う
	public static final String Nationality = new String("国籍：");
	// ボディマス指数を表示する際に他クラスから呼び出してに使う
	public static final String BMI_Index = new String("ボディマス指数：");

}
