/*
  演習13-3 		じゃんけんのプレーヤを表す抽象クラスを定義せよ。そのクラスから以下のクラスを派生すること。
  演習日		6月30日
  製作者		玉利仁美
 */
package e_13_03;

//メインクラス
public class e_13_03 {
	// メインメソッド
	public static void main(String[] args) {
		// Allplayer型の変数humanで生成し、humanのメソッドを呼び出せるようにする
		AllPlayer human = new HumanPlayer();
		// Allplayer型の変数computerを生成し、computerのメソッドを呼び出せるようにする
		AllPlayer computer = new ComputerPlayer();
		int judgeWinOrLose;

		//引き分けの限り続ける
		do {
			// プレイヤーとコンピューターの出した手の値を引き算した値を勝ち負けの判定に使う
			judgeWinOrLose = human.getHandShape() - computer.getHandShape();
			// playerが勝つには手の値を引き算した値がー1か2しかないのでその時は勝ったことを表示
			if (judgeWinOrLose == -1 || judgeWinOrLose == 2) {
				// playerが出した手を表示
				human.displayHandShape();
				// コンピューターが出した手を表示
				computer.displayHandShape();
				// 勝ったことを表示する
				System.out.println("☆彡あなたの勝ちです！☆彡");
				// playerが負けるには手の値を引いた値がー2か1しかないのでその時は負けたことを表示
			} else if (judgeWinOrLose == -2 || judgeWinOrLose == 1) {
				// playerが出した手を表示
				human.displayHandShape();
				// コンピューターが出した手を表示
				computer.displayHandShape();
				// 負けたことを表示する
				System.out.println("あなたの負けです…");
				// そうでないときつまり0の時は引き分けになる
			} else {
				// playerが出した手を表示
				human.displayHandShape();
				// コンピューターが出した手を表示
				computer.displayHandShape();
				// 引き分けであると表示
				System.out.println("引き分けです：");
			}
			//引き分けの限り続ける
		} while (judgeWinOrLose == 0);

	}

}
