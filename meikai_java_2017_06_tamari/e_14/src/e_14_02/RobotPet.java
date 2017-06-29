/*
  演習14-2		ロボット型ペットクラスRobotPetを拡張した着せ替え可能なロボット型ペットクラスを作成せよ
  演習日		6月29日
  製作者		玉利仁美
 */
package e_14_02;

//ペットクラスから派生したサブクラス
public class RobotPet extends Pet {
	// コンストラクタを追加するフィールドがないのでスーパークラスと同じで設定
	public RobotPet(String name, String masterName) {
		// スーパークラスと同じフィールドを使用する
		super(name, masterName);
	}

	// 自己紹介をするメソッド
	public void introduce() {
		// 自分の名前を紹介する
		System.out.println("◇私はロボット。名前は" + getName() + "。");
		// ご主人様の仲間を紹介する
		System.out.println("◇ご主人様は" + getMasterName() + "。");
	}

	// 行動する仕事を表示するメソッド
	public void work(int sw) {
		// 引数として与えられた値によって表示される内容が変わる
		switch (sw) {
		// 0が与えられたら
		case 0:
			// 掃除を行うと表示
			System.out.println("掃除します。");
			// switch文から抜け出す
			break;
		// 1が与えられたら
		case 1:
			// 洗濯をすると表示
			System.out.println("洗濯します。");
			// switch文から抜け出す
			break;
		// 2が与えられたら
		case 2:
			// 炊事をすると表示
			System.out.println("炊事します");
			// switch文から抜け出す
			break;
		}
	}
}
