/*
  演習15-5 		3人でじゃんけんするプログラムを作成
  演習日		7月13日
  製作者		玉利仁美
 */
package e_15_05;

public class e_15_05 {

	public static void main(String[] args) {
		// Allplayer型の変数humanで生成し、humanのメソッドを呼び出せるようにする
		AllPlayer human = new HumanPlayer();
		// Allplayer型の変数computerを生成し、computerのメソッドを呼び出せるようにする
		AllPlayer computer1 = new ComputerPlayer();
		// コンピュータ２を生成
		AllPlayer computer2 = new ComputerPlayer();

		// プレイヤーとコンピューター1の勝負の結果を入れるための変数(以下、一回目の勝負)
		int judgeGameOne;
		// プレイヤーとコンピューター2の勝負の結果を入れるための変数(以下、二回目の勝負)
		int judgeGameTwo;
		// プレイヤーが勝った時のフラグ
		int playerWin = 0x01;
		// コンピューター1が勝った時のフラグ
		int computer1Win = 0x02;
		// コンピューター2が勝った時のフラグ
		int computer2Win = 0x04;
		// 勝った人が誰なのか入れる変数
		int winner = 0;
		// プレイヤーの出す手を入れとく変数
		int playerHands;

		// 一回通った後あいこだった場合繰り返す
		do {
			// プレイヤーの出した手を格納する
			playerHands = human.getHandShape();
			// プレイヤーとコンピューター1の結果を求める
			judgeGameOne = playerHands - computer1.getHandShape();
			// プレイヤーとコンピューター2の結果を求める
			judgeGameTwo = playerHands - computer2.getHandShape();

			// プレイヤーがコンピュータ1に勝った時の処理
			if (judgeGameOne == -1 || judgeGameOne == 2) {
				// プレイヤーが勝ったので勝ったフラグを立てる
				winner = winner | playerWin;
				// プレイヤーとコンピューター2の勝負でplayerが負けた時の処理
				if (judgeGameTwo == 1 || judgeGameTwo == -2) {
					// プレイヤーが一回勝って一回負けるときはあいこになるのでプレイヤー勝ちフラグを下げる
					winner = winner & 0;
					// プレイヤーとコンピューター2の勝負があいこだった時の処理
				} else if (judgeGameTwo == 0) {
					// コンピューター2はコンピューター1に勝っていることになるので勝者にコンピュータ2の勝ちフラグを立てる
					winner = winner | computer2Win;
				}
				// 一回目の勝負で引き分けだった時
			} else if (judgeGameOne == 0) {
				// 二回目の勝負でplayerが勝った時
				if (judgeGameTwo == -1 || judgeGameTwo == 2) {
					// プレイヤーとコンピュータ1は引き分けなので、その二人の勝ちフラグを立てる
					winner = winner | playerWin | computer1Win;
					// 二回目の勝負に負けた時
				} else if (judgeGameTwo == 1 || judgeGameTwo == -2) {
					// 勝者はコンピュータ2になる
					winner = winner | computer2Win;
				}
				// 一回目の勝負で負けた時の処理
			} else if (judgeGameOne == 1 || judgeGameOne == -2) {
				// コンピュータ1が勝ったのでコンピュータ１の勝ちフラグを立てる
				winner = winner | computer1Win;
				// 二回目の勝負で負けた時の処理
				if (judgeGameTwo == 1 || judgeGameTwo == -2) {
					// 勝者にコンピュータ2も加える
					winner = winner | computer2Win;
					// 二回目の勝負で勝った時の処理
				} else if (judgeGameTwo == -1 || judgeGameTwo == 2) {
					// 一回負けて一回勝った時はあいこになるので今まで勝ってた人のフラグを下げる
					winner = winner & 0;
				}
			}

			// playerが出した手を表示
			human.displayHandShape();
			// コンピューターが出した手を表示
			computer1.displayHandShape();
			// コンピューターが出した手を表示
			computer2.displayHandShape();

			// あいこでないとき勝者を表示したいのでそのためのif文
			if (winner != 0) {
				// プレイヤー勝ちフラグが立っているときの処理
				if ((winner & playerWin) != 0) {
					// あなたと表示
					System.out.println("あなた　");
				}
				// コンピューター1の勝ちフラグが立っているときの処理
				if ((winner & computer1Win) != 0) {
					// コンピューター1と表示
					System.out.println("computer1　");
				}
				// コンピュータ2の勝ちフラグが立っているときの処理
				if ((winner & computer2Win) != 0) {
					// コンピュータ2と表示
					System.out.println("computer2　");
				}
				// 表示した勝者の勝ちであると表示する
				System.out.println("の勝ちです！");
				// あいこの時
			} else {
				// あいこであると表示
				System.out.println("あいこです");
			}
			// あいこの間繰り返す
		} while (winner == 0);
	}

}
