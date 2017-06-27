/*
  演習12-1		総走行距離を表すフィールドとその値を調べるメソッドを追加した自動車クラスを作成
  演習日		6月27日
  製作者		玉利仁美
 */
package e_12_01;

//Carクラスのサブクラス
public class CarTotalTravelDistance extends Car {
	// 総走行距離を格納するフィールド
	private double totalDistance = 0.0f;
	// 今までどれくらい走ったかを格納するフィールド
	private static double countDistance;

	// Carクラスと同じコンストラクタでインスタンスを生成する
	public CarTotalTravelDistance(String carName, int carWidth, int carHeight, int carLength, double remainingFuel) {
		// Carクラスと同じ値を入力する
		super(carName, carWidth, carHeight, carLength, remainingFuel);
	}

	// 総走行距離を取得する
	public double getTotalDistance() {
		// 総走行距離を返す
		return totalDistance;
	}

	// 総走行距離を求めるメソッド
	public void setTotalDistatnce(double dx, double dy) {
		// 総走行距離に今まで走った値と今走った距離を足したものを代入
		totalDistance = countDistance + super.getMoveDistance(dx, dy);
		// 今まで走った値を求める
		countDistance = countDistance + super.getMoveDistance(dx, dy);
	}

}
