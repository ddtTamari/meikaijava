/*
  演習13-4		演習9－4で作成した人間クラスにjavadocコメントを与えるとともに、javadocツールによってドキュメントを作成せよ
  演習日		7月10日
  製作者		玉利仁美
 */
package e_13_04;

/**
 * 表示する人間のそれぞれのインスタンスの値を表示する
 * @author ddtji
 *
 */
public class HumanClass {
	/**
	 *  名前を表すフィールド
	 */
	private String name;
	/**
	 *  年を表すフィールド
	 */
	private int age;
	/**
	 *  性別を表すフィールド
	 */
	private String gender;
	/**
	 *  国籍を表すフィールド
	 */
	private String nationality;
	/**
	 *  身長を表すフィールド
	 */
	private float height;
	/**
	 *  体重を表すフィールド
	 */
	private float weight;
	/**
	 *  日にちを読み込むクラスのDay型のフィールド
	 */
	private Day birthDay;

	/**
	 *  名前、年、性別、国籍、身長、体重この6つの値でクラスのインスタンスを初期化させる、
	 * @param name
	 * @param age
	 * @param gender
	 * @param nationality
	 * @param height
	 * @param weight
	 * @param birthDay
	 */
	HumanClass(String name, int age, String gender, String nationality, float height, float weight, Day birthDay) {
		/**
		 *  名前を入れるフィールドに入れる値を引数から受け取る
		 */
		this.name = name;
		/**
		 *  年を入れるフィールドに入れる値を引数から受け取る
		 */
		this.age = age;
		/**
		 * 性別フィールドに入れる値を引数から受け取る
		 */
		this.gender = gender;
		/**
		 *  国籍フィールドに入れる値を引数から受け取る
		 */
		this.nationality = nationality;
		/**
		 *  身長フィールドに入れる値を引数から受け取る
		 */
		this.height = height;
		/**
		 *  体重フィールドに入れる値を引数から受け取る
		 */
		this.weight = weight;
		/**
		 *  誕生日フィールドに入れる値を引数から受け取る
		 */
		this.birthDay = new Day(birthDay);
	}

	/**
	 *  BMIを求めるメソッド
	 * @return BMIを返される
	 */
	public float getBMI() {
		/** BMIは体重割る身長を100で割った値の2乗で求められる
		 *
		 */
		float BMIIndex = weight / (height / 100) / (height / 100);
		/**
		 *  評価されたBMIを返す
		 */
		return BMIIndex;
	}

	public Day getBirthDay() {
		return new Day(birthDay);
	}

	/**
	 *  インスタンス変数の値を表示する
	 */
	public void putHumanSpec() {
		/**
		 *  身長は最低でも4桁小数点第1位まで表す
		 */
		String Height = String.format("身長：%4.1fcm", height);
		/**
		 *  体重は最低でも4桁小数点第1位まで表す
		 */
		String Weight = String.format("体重：%4.1fcm", weight);

		/**
		 *  人物の名前を表示するようオブジェクトにメッセージを送る
		 */
		System.out.println(Constant_Class.Human_Name + name);
		/**
		 *  生年月日を表示するようオブジェクトにメッセージを送る
		 */
		System.out.println(Constant_Class.Birth_Day + new Day(birthDay));
		/**
		 *  年齢を表示するよう、定数クラスのオブジェクトにメッセージを送る
		 */
		System.out.println(Constant_Class.Age + age);
		/**
		 *  性別を表示するよう、定数クラスのオブジェクトにメッセージを送る
		 */
		System.out.println(Constant_Class.Gender + gender);
		/**
		 *  国籍を表示するよう、定数クラスのオブジェクトにメッセージを送る
		 */
		System.out.println(Constant_Class.Nationality + nationality);
		/**
		 *  身長の値を表示する
		 */
		System.out.println(Height);
		/**
		 *  体重の値を表示する
		 */
		System.out.println(Weight);
		/**
		 *  BMIの値を表示する
		 */
		System.out.println(Constant_Class.BMI_Index + getBMI());
		/** 次の表示に備えて改行しておく
		 *
		 */
		System.out.println();
	}

}
