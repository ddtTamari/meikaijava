/*
  演習15-5 		3人でじゃんけんするプログラムを作成
  演習日		7月13日
  製作者		玉利仁美
 */
package e_15_05;

//ランダムで値を出すためにランダムクラスをインポート
import java.util.Random;

//コンピューターのだす手を決めるメソッド
public class ComputerPlayer extends AllPlayer {
	// 出す手を入れておく変数
	private int handShape;
	// グーかどうかを判定する数字
	private int handShapeIsGu = 1;
	// チョキかどうかを判定する数字
	private int handShapeIsChoki = 2;
	// パーかどうかを判定する数字
	private int handShapeIsPa = 3;

	// オーバーライドされているか確認
	@Override
	// コンピュータが出す手の形を決めるメソッド
	public int getHandShape() {
		// ランダムな値を入れるため宣言
		Random rand = new Random();
		// 1~3までの間で手の形にランダムな値を代入する
		handShape = rand.nextInt(3) + 1;
		// 手の形の値を返す
		return handShape;
	}

	// オーバーライドされているか確認
	@Override
	// 出した手の形を表示するメソッド
	public void displayHandShape() {
		// もし入力された値が1ならグー
		if (this.handShape == handShapeIsGu) {
			// グーを出したことを表示
			System.out.println("コンピューターの出した手はグーです。");
			// もし入力された値が2ならチョキ
		} else if (this.handShape == handShapeIsChoki) {
			// チョキを出されたことを表示
			System.out.println("コンピューターの出した手はチョキです。");
			// 3が入力されたならパー
		} else if (this.handShape == handShapeIsPa) {
			// パーが出されたことを表示
			System.out.println("コンピューターの出した手はパーです。");
		}
	}
}
