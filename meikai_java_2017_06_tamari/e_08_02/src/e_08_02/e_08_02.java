/*
  演習8-2		carクラスに対して、フィールドやメソッドを自由に追加する
  演習日		6月21日
  製作者		玉利仁美
 */
package e_08_02;

import java.util.Scanner;

public class e_08_02 {

	public static void main(String[] args) {
		// 車の各情報をキーボードから入力するためスキャナーを宣言
		Scanner scan = new Scanner(System.in);

		// 車のデータを入力してもらえるように表示
		System.out.println(Constant.Car_Date_Prompt);
		// 車の名前の入力を促す
		System.out.print(Constant.Car_Name);
		// 車の名前をキーボードから入力
		String name = scan.next();
		// 車の経過年数の入力を促す
		System.out.print(Constant.Car_Elapsed_Years);
		// 車の経過年数をキーボードから入力
		int elapsedYears = scan.nextInt();
		// 車の横幅の入力を促す
		System.out.print(Constant.Car_Width);
		// 車の横幅をキーボードから入力
		int width = scan.nextInt();
		// 車の高さの入力を促す
		System.out.print(Constant.Car_Height);
		// 車の高さをキーボードから入力
		int height = scan.nextInt();
		// 車の長さの入力を促す
		System.out.print(Constant.Car_Length);
		// 車の長さの入力をキーボードから入力
		int length = scan.nextInt();
		// 車のナンバープレートの入力を促す
		System.out.print(Constant.Car_Plate_Number);
		// 車のナンバープレートをキーボードから入力
		String plateNumber = scan.next();
		// 燃料タンクの容量の入力を促す
		System.out.print(Constant.Car_Fuel_Tank_Capacity);
		// 燃料タンクの容量をキーボードから入力
		double tankCapacity = scan.nextDouble();
		// 残っている燃料の入力を促す
		System.out.print(Constant.Car_Fuel_Remaining_Quantity);
		// 残っている燃料をキーボードから入力
		double fuel = scan.nextDouble();
		// 燃費の入力を促す
		System.out.print(Constant.Car_Fuel_Consumption);
		// 燃費をキーボードから入力
		double fuelConsumption = scan.nextDouble();

		// クラス変数を宣言
		Car myCar = new Car(name, elapsedYears, width, height, length, plateNumber, tankCapacity, fuel,
				fuelConsumption);
		// 現在地と残り燃料を表示する変数を生成
		String Now_Position_And_Remaining_Fuel = String.format("現在地(%2.1f,%2.1f)・残り燃料：%3.1f", myCar.getX(),
				myCar.getY(), myCar.getFuel());

		// 何かの条件によってbreakするまで繰り返す
		while (true) {
			// 現在地と残り燃料を表示
			System.out.println(Now_Position_And_Remaining_Fuel);
			// 移動するかどうかを質問する
			System.out.print(Constant.Car_Move_Continue);
			// 入力された値が0なら終了する
			if (scan.nextInt() == 0) {
				// while文から抜け出す
				break;
				// それ以外の値だったら
			} else if (scan.nextInt() == 1) {
				// x座標をどれくらい動かすか入力を促す
				System.out.print(Constant.Car_X_Move_Distance);
				// x座標を動かす値をキーボードから入力
				double dx = scan.nextDouble();
				// y座標をどれくらい動かすか入力を促す
				System.out.print(Constant.Car_Y_Move_Distance);
				// y座標をどれくらい動かすか入力を促す
				double dy = scan.nextDouble();
				// 事故が起きるか判断するメソッドがtrueならば事故が起きたことにし、while文がから抜け出す
				if (myCar.crashProbability(elapsedYears)) {
					// 事故が起きたことを表示
					System.out.println(Constant.Car_Crash);
					// while文から抜け出す
					break;
				}
				// 移動する量より燃料が足りないとき
				if (!myCar.move(dx, dy)) {
					// 燃料が足りないことを表示
					System.out.print(Constant.Car_Nomore_Fuel);
					// 燃料を追加するかどうか聞く
					System.out.print(Constant.Car_Fuel_Refill);
					// 追加を求めるのであれば
					if (scan.nextInt() == 1) {
						// どれぐらい追加するのか入力を促す
						System.out.print(Constant.Car_Howmany_Add);
						// どれぐらい追加するのかキーボードから取得
						double fuelRefill = scan.nextDouble();
						// 追加分の値を引数にして燃料に足す
						myCar.addFuel(fuelRefill);
					}
				}
				// 0か1以外の値が入力されたらもういちど聞き直す
			} else {
				// 現在地と残り燃料を表示
				System.out.println(Now_Position_And_Remaining_Fuel);
				// 移動するかどうかを質問する
				System.out.print(Constant.Car_Move_Continue);
			}
		}
		// ストリームを解放する
		scan.close();
	}

}
