/*
  演習15-5 		3人でじゃんけんするプログラムを作成
  演習日		7月13日
  製作者		玉利仁美
 */
package e_15_05;

//キーボード入力をするためスキャナークラスをインポート
import java.util.Scanner;

//プレイヤーが出す手をキーボードから取得するメソッド
public class HumanPlayer extends AllPlayer {
	// 出す手をキーボードから取得
	private int handShape;
	// グーかどうかを判定する数字
	private static final int HAND_SHAPE_IS_GU = 1;
	// チョキかどうかを判定する数字
	private static final int HAND_SHAPE_IS_CYOKI = 2;
	// パーかどうかを判定する数字
	private static final int HAND_SHAPE_IS_PA = 3;

	// オーバーライドされているか確認
	@Override
	// プレイヤーが出す手を決めるメソッド
	public int getHandShape() {
		// キーボードから取得できるよう宣言
		Scanner scan = new Scanner(System.in);

		// グーチョキパー以外の値が入力されたら入力を求め続ける
		do {
			// グーなのかチョキなのかパーなのか入力を求める
			System.out.println("あなたの出す手は(グー…1/チョキ…2/パー…3)");
			// 手の形の値をキーボードから取得
			handShape = scan.nextInt();
		} while (handShape != 1 && handShape != 2 && handShape != 3);
		// 手の形の値を返却する
		return handShape;
	}

	// オーバーライドされているか確認
	@Override
	// 入力した数字によってどの手を出したかを表示するメソッド
	public void displayHandShape() {
		// もし1を入力したらグーを出したことになる
		if (this.handShape == HAND_SHAPE_IS_GU) {
			// グーを出したと表示
			System.out.println("あなたの出した手はグーです。");
			// もし2を入力したらチョキを出したことになる
		} else if (this.handShape == HAND_SHAPE_IS_CYOKI) {
			// チョキを出したと表示
			System.out.println("あなたの出した手はチョキです。");
			// もし3を入力したらパーを出したことになる
		} else if (this.handShape == HAND_SHAPE_IS_PA) {
			// パーを出したと表示
			System.out.println("あなたの出した手はパーです。");
		}
	}

}
