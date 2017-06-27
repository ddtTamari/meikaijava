/*
  演習12-1		総走行距離を表すフィールドとその値を調べるメソッドを追加した自動車クラスを作成
  演習日		6月27日
  製作者		玉利仁美
 */
package e_12_01;

//キーボードから値を習得するためスキャナークラスをインポート
import java.util.Scanner;

//車のデータなどを入力するクラス
public class e_12_01 {
	// メインメソッド
	public static void main(String[] args) {
		// キーボード入力をするため宣言
		Scanner scan = new Scanner(System.in);

		// 車のデータの入力を促す
		System.out.println(Constant.INPUT_CAR_DATE);
		// 車の名前の入力を促す
		System.out.print(Constant.CAR_NAME);
		// 車の名前をキーボードから取得する
		String name = scan.next();
		// 車の横幅の入力を促す
		System.out.print(Constant.CAR_WEIGHT);
		// 車の横幅の値をキーボードから取得する
		int width = scan.nextInt();
		// 車の高さの入力を促す
		System.out.print(Constant.CAR_HEIGHT);
		// 車の高さの値をキーボードから取得する
		int height = scan.nextInt();
		// 車の長さの入力を促す
		System.out.print(Constant.CAR_LENGTH);
		// 車の長さの値をキーボードから取得する
		int length = scan.nextInt();
		// 車の残り燃料の入力を促す
		System.out.print(Constant.CAR_FUEL);
		// 車の残り燃料の値をキーボードから取得する
		double fuel = scan.nextDouble();

		// car型変数にそれぞれキーボードから取得した値を引数として渡しインスタンスを生成
		Car myCar = new Car(name, width, height, length, fuel);
		// carTotalTraveldistance型変数を用意しメソッドを呼び出せるようにする
		CarTotalTravelDistance myCar2 = new CarTotalTravelDistance(name, width, height, length, fuel);
		// breakするまで繰り返す
		while (true) {
			// 現在地と残り燃料の値を表示する
			System.out.println("現在地(" + myCar.getCarXPosition() + "," + myCar.getCarYPosition() + ")・残り燃料："
					+ myCar.getRemainingFuel());
			// 総走行距離数を表示する
			System.out.println(Constant.CAR_TOTAL_DISTANCE + myCar2.getTotalDistance());
			// 移動をするか否かを問う
			System.out.print(Constant.ASK_CONTINUE_MOVE);
			// 入力した値が0ならばbreakしてwhile文から抜け出す
			if (scan.nextInt() == 0) {
				// while文から抜け出す
				break;
			}
			// いくつx軸方面に動くか入力を促す
			System.out.print(Constant.HOW_MANY_MOVE_X);
			// x軸方面に動かす値をキーボードから取得する
			double dx = scan.nextDouble();
			// いくつy軸方面に動くか入力を促す
			System.out.print(Constant.HOW_MANY_MOVE_Y);
			// y軸方面に動かす値をキーボードから取得する
			double dy = scan.nextDouble();
			// 総走行距離の値を返すメソッドを呼び出す
			myCar2.setTotalDistatnce(dx, dy);

			// 移動距離が残り燃料より大きい場合移動できないことを表示する
			if (!myCar.moveCar(dx, dy)) {
				// 燃料が足りないことを表示
				System.out.println(Constant.NO_MORE_FUEL);
			}
		}
		// ストリームを解放する
		scan.close();
	}
}
