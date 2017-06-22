/*
  演習9-1		演習8－1で生成した人間クラスの配列を生成するプログラムを作成せよ。
  				生成時に要素を初期化するもの生成後の要素に値を代入するものなど複数のパターンを作ること
  演習日		6月22日
  製作者		玉利仁美
 */package e_09_01;

//人のデータを格納しておくためのクラス
public class Human_Class {
	// 名前を表すフィールド
	private String name;
	// 年を表すフィールド
	private int age;
	// 性別を表すフィールド
	private String gender;
	// 国籍を表すフィールド
	private String nationality;
	// 身長を表すフィールド
	private float height;
	// 体重を表すフィールド
	private float weight;

	// 名前、年、性別、国籍、身長、体重この6つの値でクラスのインスタンスを初期化させる、
	Human_Class(String name, int age, String gender, String nationality, float height, float weight) {
		// 名前を入れるフィールドに入れる値を引数から受け取る
		this.name = name;
		// 年を入れるフィールドに入れる値を引数から受け取る
		this.age = age;
		// 性別を入れるフィールドに入れる値を引数から受け取る
		this.gender = gender;
		// 国籍に入れるフィールドに入れる値を引数から受け取る
		this.nationality = nationality;
		// 身長に入れるフィールドに入れる値を引数から受け取る
		this.height = height;
		// 体重に入れるフィールドに入れる値を引数から受け取る
		this.weight = weight;
	}

	// BMIを求めるメソッド
	float getBMI() {
		// BMIは体重割る身長を100で割った値の2乗で求められる
		float BMIIndex = weight / (height / 100) / (height / 100);
		// 評価されたBMIを返す
		return BMIIndex;
	}

	// インスタンス変数の値を表示する
	void putHumanSpec() {
		// 身長は最低でも4桁小数点第1位まで表す
		String Height = String.format("身長：%4.1fcm", height);
		// 体重は最低でも4桁小数点第1位まで表す
		String Weight = String.format("体重：%4.1fcm", weight);

		// 人物の名前を表示するようオブジェクトにメッセージを送る
		System.out.println(Constant.Human_Name + name);
		// 年齢を表示するよう、定数クラスのオブジェクトにメッセージを送る
		System.out.println(Constant.askAge + age);
		// 性別を表示するよう、定数クラスのオブジェクトにメッセージを送る
		System.out.println(Constant.askGender + gender);
		// 国籍を表示するよう、定数クラスのオブジェクトにメッセージを送る
		System.out.println(Constant.Nationality + nationality);
		// 身長の値を表示する
		System.out.println(Height);
		// 体重の値を表示する
		System.out.println(Weight);
		// BMIの値を表示する
		System.out.println(Constant.BMI_Index + getBMI());
		// 次の表示に備えて改行しておく
		System.out.println();
	}

}
