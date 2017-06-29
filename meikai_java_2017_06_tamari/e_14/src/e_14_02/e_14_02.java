/*
  演習14-2		ロボット型ペットクラスRobotPetを拡張した着せ替え可能なロボット型ペットクラスを作成せよ
  演習日		6月29日
  製作者		玉利仁美
 */
package e_14_02;

//キーボードから入力をするためスキャナークラスをインポート
import java.util.Scanner;

//メインクラス
public class e_14_02 {
	// メインメソッド
	public static void main(String[] args) {
		// キーボード入力を可能にさせるため宣言
		Scanner scan = new Scanner(System.in);
		// スキンを引き続き変更するか否かを判定する変数
		int continueSkinChange = 1;
		// 一回目のスキン変更だったのかどうかの判定
		int countFirstOrOther = 0;

		// 名前の入力を促す
		System.out.print("ロボットの私の名前：");
		// 名前をキーボードから入力
		String roboName = scan.nextLine();
		// ご主人様の名前の入力を促す
		System.out.print("ご主人様の名前：");
		// ご主人様の名前をキーボードから取得
		String masterName = scan.nextLine();
		// ロボットペットのスキンの変更ができるロボットペットスキンクラスを、引数を入力された値で代入
		RobotPetSkin rob = new RobotPetSkin(roboName, masterName);
		rob.introduce();

		// 最初は一回必ずスキン変更を通る
		while (continueSkinChange == 1) {
			// 初回か否かを判定、初期値は0なので一回目は通らない
			if (countFirstOrOther != 0) {
				// スキンの変更を続けるかどうか聞く
				System.out.println("スキンの変更をつづけますか？はい...１/いいえ...０");
				// 続けるかどうか1か0でキーボード入力を促す
				continueSkinChange = scan.nextInt();
				// 入力された値が1か0意外だったときもう一度入力を促す
				while (continueSkinChange != 1 && continueSkinChange != 0) {
					// スキンの変更を続けるかどうか聞く
					System.out.println("スキンの変更をつづけますか？はい...１/いいえ...０");
					// 続けるかどうか1か0でキーボード入力を促す
					continueSkinChange = scan.nextInt();
				}
			}
			// 何色に変更するか質問する
			System.out.println("0...漆黒/1...深紅/2...柳葉/3...露草/4...豹柄");
			// スキン変更何番の番号の色にするか入力を促す
			System.out.print("スキン変更：");
			// 番号をキーボードから入力
			int roboSkin = scan.nextInt();

			// スキンを変えるメソッドを呼び出す
			rob.changeSkin(roboSkin);

			// 一回目が終わったのでカウントを1にする
			countFirstOrOther = 1;
		}
		// ストリームを解放する
		scan.close();
	}

}
