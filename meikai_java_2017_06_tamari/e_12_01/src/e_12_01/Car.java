/*
  演習12-1		総走行距離を表すフィールドとその値を調べるメソッドを追加した自動車クラスを作成
  演習日		6月27日
  製作者		玉利仁美
 */
package e_12_01;

//車のデータなどを入れておくクラス
public class Car {
	// 車の名前を格納するフィールド
	private String carName;
	// 車の横幅を格納するフィールド
	private int carWidth;
	// 車の高さを格納するフィールド
	private int carHeight;
	// 車の長さを格納するフィールド
	private int carLength;
	// 車のXのpositionを格納するフィールド
	private double carXPosition;
	// 車のYのpositionを格納するフィールド
	private double carYPosition;
	// 車の残り燃料を格納するフィールド
	private double remainingFuel;

	// 車のデータのコンストラクタ、最低限、名前・横幅・高さ・長さ・残り燃料をインスタンス生成時に引数として渡さなければならない
	public Car(String carName, int carWidth, int carHeight, int carLength, double remainingFuel) {
		// 車の名前を引数から受け取ったものにする
		this.carName = carName;
		// 車の車幅を引数から受け取ったものにする
		this.carWidth = carWidth;
		// 車の高さを引数から受け取ったものにする
		this.carHeight = carHeight;
		// 車の長さを引数から受け取ったものにする
		this.carLength = carLength;
		// 車の残り燃料を引数から受け取ったものにする
		this.remainingFuel = remainingFuel;
		// 今の位置情報を0で初期化する
		carXPosition = carYPosition = 0.0;
	}

	// 車のXの位置を取得するメソッド
	public double getCarXPosition() {
		// 車のX軸の位置を返す
		return carXPosition;
	}

	// 車のY軸の位置を取得するメソッド
	public double getCarYPosition() {
		// 車のY軸の位置を返す
		return carYPosition;
	}

	// 車の残り燃料を取得するメソッド
	public double getRemainingFuel() {
		// 車の残り燃料を返す
		return remainingFuel;
	}

	// 車のスペックを一度に全部表示するメソッド
	public void putSpec() {
		// 車の名前を表示
		System.out.println(carName);
		// 車の横幅を表示
		System.out.println(carWidth);
		// 車の高さを表示
		System.out.println(carHeight);
		// 車の長さを表示
		System.out.println(carLength);
	}

	// 車の移動した距離を取得するメソッド
	public double getMoveDistance(double moveCarXPosition, double moveCarYPosition) {
		// 車の走行距離を返す
		return Math.sqrt(moveCarXPosition * moveCarXPosition + moveCarYPosition * moveCarYPosition);
	}

	// 車の移動距離を求めその位置に移動させたりするメソッド
	public boolean moveCar(double moveCarXPosition, double moveCarYPosition) {
		// 車の走行距離をgetMoveDistanceから持ってくる
		double distance = getMoveDistance(moveCarXPosition, moveCarYPosition);

		// もし距離が残り燃料を上回った場合移動できないのでfalseを返す
		if (distance > remainingFuel) {
			// falseを返す
			return false;
			// 燃料のほうが距離より大きければ
		} else {
			// 燃料から距離分引く
			remainingFuel -= distance;
			// x軸のポジションを移動させる
			carXPosition += moveCarXPosition;
			// y軸のpositionを移動させる
			carYPosition += moveCarYPosition;
			// trueを返す
			return true;
		}
	}
}
