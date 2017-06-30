/*
  演習13-3 		じゃんけんのプレーヤを表す抽象クラスを定義せよ。そのクラスから以下のクラスを派生すること。
  演習日		6月30日
  製作者		玉利仁美
 */
package e_13_03;

//キーボード入力をするためスキャナークラスをインポート
import java.util.Scanner;

//プレイヤーが出す手をキーボードから取得するメソッド
public class HumanPlayer extends AllPlayer {
	// 出す手をキーボードから取得
	private int handShape;

	// プレイヤーが出す手を決めるメソッド
	public int getHandShape() {
		// キーボードから取得できるよう宣言
		Scanner scan = new Scanner(System.in);
		// グーなのかチョキなのかパーなのか入力を求める
		System.out.println("あなたの出す手は(グー…1/チョキ…2/パー…3)");
		// 手の形の値をキーボードから取得
		handShape = scan.nextInt();

		// グーチョキパー以外の値が入力されたら入力を求め続ける
		while (handShape != 1 && handShape != 2 && handShape != 3) {
			// グーなのかチョキなのかパーなのか入力を求める
			System.out.println("あなたの出す手は(グー…1/チョキ…2/パー…3)");
			// 手の形の値をキーボードから取得
			handShape = scan.nextInt();
		}
		// 手の形の値を返却する
		return handShape;
	}

	// オーバーライドされているか確認
	@Override
	// 入力した数字によってどの手を出したかを表示するメソッド
	public void displayHandShape() {
		// もし1を入力したらグーを出したことになる
		if (this.handShape == 1) {
			// グーを出したと表示
			System.out.println("あなたの出した手はグーです。");
			// もし2を入力したらチョキを出したことになる
		} else if (this.handShape == 2) {
			// チョキを出したと表示
			System.out.println("あなたの出した手はチョキです。");
			// もし3を入力したらパーを出したことになる
		} else if (this.handShape == 3) {
			// パーを出したと表示
			System.out.println("あなたの出した手はパーです。");
		}
	}

}
