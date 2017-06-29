/*
  演習14-2		ロボット型ペットクラスRobotPetを拡張した着せ替え可能なロボット型ペットクラスを作成せよ
  演習日		6月29日
  製作者		玉利仁美
 */package e_14_02;

//ロボットペットのサブクラス、インターフェースを実装してる
public class RobotPetSkin extends RobotPet implements Skinnable {

	// コンストラクタを追加するフィールドがないのでスーパークラスと同じで設定
	public RobotPetSkin(String name, String masterName) {
		// スーパークラスと同じフィールドを使用する
		super(name, masterName);
	}

	// 引数に与えられた値によってスキンを変える
	public void changeSkin(int skin) {
		// スキンをと表示した後に変えた色を表示させる
		System.out.print("スキンを");
		// スキンの値によって色が変化
		switch (skin) {
		// インターフェースを実装しているのでBLACKの値は0で0が入力されたとき
		case BLACK:
			// 漆黒と表示
			System.out.print("漆黒");
			// switch文から抜け出す
			break;
		// インターフェースを実装しているのでREDの値は1で1が入力されたとき
		case RED:
			// 深紅と表示
			System.out.print("深紅");
			// switch文から抜け出す
			break;
		// インターフェースを実装しているのでGREENの値は2で2が入力されたとき
		case GREEN:
			// 柳葉と表示
			System.out.print("柳葉");
			// switch文から抜け出す
			break;
		// インターフェースを実装しているのでBLUEの値は3で3が入力されたとき
		case BLUE:
			// 露草と表示
			System.out.print("露草");
			// switch文から抜け出す
			break;
		// インターフェースを実装しているのでLEOPARDの値は4で4が入力されたとき
		case LEOPARD:
			// 豹柄と表示
			System.out.print("豹柄");
			// switch文から抜け出す
			break;
		// 0～4の値以外が与えられた時は、無地を表示
		default:
			// 無地と表示
			System.out.print("無地");
			// switch文から抜け出す
			break;
		}
		// switch文で表示した色に変更したと表示
		System.out.println("に変更しました。");
	}

}
