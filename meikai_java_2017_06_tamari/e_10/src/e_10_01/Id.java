/*
  演習10-1		連番クラスIDに最後に与えた識別番号を返すクラスメソッドgitMaxIdを追加。
  演習日		6月23日
  製作者		玉利仁美
 */
package e_10_01;

public class Id {
	static int counter = 0;

	private int id;

	public Id() {
		id = ++counter;
	}

	public int getId() {
		return id;
	}

	static int getMaxId() {
		return counter;
	}

}
