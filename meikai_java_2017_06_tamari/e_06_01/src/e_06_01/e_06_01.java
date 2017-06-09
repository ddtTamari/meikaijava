/*
  演習6-1		要素型がdouble型で要素数が5の配列を生成して、その全要素の値を表示するプログラム
  演習日		6月8日
  製作者		玉利仁美
 */
package e_06_01;

public interface e_06_01 {
	public static void main(String[] args){
		//5つの要素を持つ配列aを作成
		double[] a = new double[5];

		//a[0]の値を表示
		System.out.println(a[0]);
		//規定値により0.0を表示
		System.out.println(a[1]);
		//規定値により0.0を表示
		System.out.println(a[2]);
		//規定値により0.0を表示
		System.out.println(a[3]);
		//規定値により0.0を表示
		System.out.println(a[4]);

	}

}
