/*
  演習8-2		carクラスに対して、フィールドやメソッドを自由に追加する
  演習日		6月21日
  製作者		玉利仁美
 */
package e_08_02;

import java.util.Scanner;

public class e_08_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println(Constant.Car_Date_Prompt);
		System.out.print(Constant.Car_Name);
		String name = scan.next();
		System.out.print(Constant.Car_Width);
		int width = scan.nextInt();
		System.out.print(Constant.Car_Height);
		int height = scan.nextInt();
		System.out.print(Constant.Car_Length);
		int length = scan.nextInt();
		System.out.print(Constant.Car_Plate_Number);
		String plateNumber = scan.next();
		System.out.print(Constant.Car_Fuel_Tank_Capacity);
		double tankCapacity = scan.nextDouble();
		System.out.print(Constant.Car_Fuel_Remaining_Quantity);
		double fuel = scan.nextDouble();
		System.out.print(Constant.Car_Fuel_Consumption);
		double fuelConsumption = scan.nextDouble();

		Car myCar = new Car(name, width, height, length, plateNumber, tankCapacity, fuel, fuelConsumption);

		while (true) {
			String Now_Position_And_Remaining_Fuel = String.format("現在地(%2.1f,%2.1f)・残り燃料：%3.1f", myCar.getX(),
					myCar.getY(), myCar.getFuel());
			System.out.println(Now_Position_And_Remaining_Fuel);
			System.out.println(Constant.Car_Move_Continue);
			if (scan.nextInt() == 0) {
				break;
			}
			System.out.print(Constant.Car_X_Move_Distance);
			double dx = scan.nextDouble();
			System.out.print(Constant.Car_Y_Move_Distance);
			double dy = scan.nextDouble();

			if (!myCar.move(dx, dy)) {
				System.out.println(Constant.Car_Nomore_Fuel);
			}
		}

	}

}
