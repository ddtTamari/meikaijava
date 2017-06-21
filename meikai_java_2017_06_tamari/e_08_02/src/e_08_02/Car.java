/*
  演習8-2		carクラスに対して、フィールドやメソッドを自由に追加する
  演習日		6月21日
  製作者		玉利仁美
 */
package e_08_02;

import java.util.Random;

public class Car {
	Random rand = new Random();

	private String name;
	private int width;
	private int height;
	private int length;
	private int crash;
	private double xCoordinate;
	private double yCoordinate;
	private double fuel;
	private double tankCapacity;
	private double fuelConsumption;
	private double fuelRefill;
	private String plateNumber;

	Car(String name, int width, int height, int length, String plateNumber, double tankCapacity, double fuel,
			double fuelConsumption) {
		this.name = name;
		this.width = width;
		this.height = height;
		this.length = length;
		this.plateNumber = plateNumber;
		this.tankCapacity = tankCapacity;
		this.fuel = fuel;
		this.fuelConsumption = fuelConsumption;
		xCoordinate = yCoordinate = 0.0;
	}

	double getX() {
		return xCoordinate;
	}

	double getY() {
		return yCoordinate;
	}

	double getTankCapacity() {
		return tankCapacity;
	}

	double getFuel() {
		if (tankCapacity < fuel) {
			fuel = tankCapacity;
			System.out.println(Constant.Car_Over_Fuel);
			return fuel;
		}
		return fuel;
	}

	double addFuel(double add) {
		return fuel += add;
	}

	boolean crashProbability() {
		int crash = rand.nextInt(5);
		if (crash > 3) {
			return false;
		}
		return true;
	}

	boolean move(double dx, double dy) {
		double dist = Math.sqrt(dx * dx + dy * dy);

		if (dist > fuel) {
			return false;
		} else {
			fuel -= dist / fuelConsumption;
			xCoordinate += dx;
			yCoordinate += dy;
			return true;
		}
	}

}
