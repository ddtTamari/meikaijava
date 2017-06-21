/*
  演習8-2		carクラスに対して、フィールドやメソッドを自由に追加する
  演習日		6月21日
  製作者		玉利仁美
 */
package e_08_02;

import java.util.Random;

//車に関する情報が入ったクラス
public class Car {
	// ランダムな確率で事故が起きるためのランダムを宣言
	Random rand = new Random();

	// 車の名前を表す
	private String name;
	// 車のプレートナンバーを表す
	private String plateNumber;
	// 車の横幅を表す
	private int width;
	// 車の高さを表す
	private int height;
	// 車の長さを表す
	private int length;
	// 車が事故するかどうかを表す
	private int crash;
	// 車の経過年数を表す
	private int elapsedYears;
	// 車の現在位置のx座標を表す
	private double xCoordinate;
	// 車の現在位置のy座標を表す
	private double yCoordinate;
	// 車の燃料を表す
	private double fuel;
	// 車のタンク容量を表す
	private double tankCapacity;
	// 車の燃費を表す
	private double fuelConsumption;
	// 車の追加燃料を表す
	private double fuelRefill;

	// 車のインスタンスを初期化させるコンストラクタ
	Car(String name, int elapsedyears, int width, int height, int length, String plateNumber, double tankCapacity,
			double fuel, double fuelConsumption) {
		// 名前の変数の中に引数から受け取った名前の値を代入
		this.name = name;
		// 横幅の変数の中に引数から受け取った横幅の値を代入
		this.width = width;
		// 高さの変数の中に引数から受け取った高さの値を代入
		this.height = height;
		// 長さの変数の中に引数から受け取った長さの値を代入
		this.length = length;
		// プレートナンバーの変数の中に引数から受け取ったプレートナンバーの値を代入
		this.plateNumber = plateNumber;
		// タンク容量の変数の中に引数から受け取ったタンク容量の値を代入
		this.tankCapacity = tankCapacity;
		// 燃料の変数の中に引数から受け取った燃料を代入
		this.fuel = fuel;
		// 燃費の変数の中に引数から受け取った燃費を代入
		this.fuelConsumption = fuelConsumption;
		// 車の初期位置を0にする
		xCoordinate = yCoordinate = 0.0;
	}

	// 車のx座標を返すメソッド
	double getX() {
		// 車のx座標を呼び出し元に返す
		return xCoordinate;
	}

	// 車のy座標を返すメソッド
	double getY() {
		// 車のy座標を呼び出し元に返す
		return yCoordinate;
	}

	// タンクの容量を返すメソッド
	double getTankCapacity() {
		// タンクの容量を呼び出し元に返す
		return tankCapacity;
	}

	// 燃料の値を返すメソッド
	double getFuel() {
		// タンク容量より燃料が多い場合は燃料はタンク容量と同じになる
		if (tankCapacity < fuel) {
			// 燃料にタンク容量の値を代入
			fuel = tankCapacity;
			// タンクから燃料が漏れたことと、燃料はタンク容量と同じ値になったことを表示
			System.out.println(Constant.Car_Over_Fuel);
			// 燃料の値を返す
			return fuel;
		}
		// タンク容量より多くなければそのまま燃料の値を返す
		return fuel;
	}

	// 燃料を追加するメソッド
	double addFuel(double add) {
		// 残り燃料にaddの分追加した値を返す
		return fuel += add;
	}

	// 経過年数によって事故の確率が変わるメソッド
	boolean crashProbability(int years) {
		// 経過年数が50より多ければ経過年数を49に設定
		if (years > 49) {
			// 年数に49を代入
			years = 49;
		}
		// 確率は50から経過年数を引いたものにする
		int probability = 50 - years;
		// 事故はprobabilityの数までのランダムな値として出す
		int crash = rand.nextInt(probability);
		// 事故の値がランダムで出せる一番大きい数字ならば事故が起きる
		if (crash == probability - 1) {
			// 事故の処理に移るためfalseを呼び出し元に返す
			return false;
		}
		// ランダムの値が最大値でないときはそのまま続けて移動するかどうかの処理に移る
		return true;
	}

	// 車の移動距離や燃料などを求めるメソッド
	boolean move(double dx, double dy) {
		// 移動距離を求める
		double dist = Math.sqrt(dx * dx + dy * dy);

		// 移動距離を燃費で割ったものが燃料より大きいときその燃料では移動できないのでfalseを返す
		if (dist / fuelConsumption > fuel) {
			// 残り燃料で移動できないのでfalseを返す
			return false;
			// 燃料のほうが大きければ
		} else {
			// 燃料から移動距離を燃費で割ったものを引く
			fuel -= dist / fuelConsumption;
			// 車のx座標に移動した分を足す
			xCoordinate += dx;
			// 車のy座標に移動した分を足す
			yCoordinate += dy;
			// 移動した後の処理に移るためtrueを返す
			return true;
		}
	}

}
