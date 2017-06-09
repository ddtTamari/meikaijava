/*
  演習5-5		double型で要素数が5の配列の要素に対し、1.1,2.2,3.3,4.4,5.5を代入、表示
  演習日		6月8日
  製作者		玉利仁美
 */
package e_06_03;

public class e_06_03 {

	public static void main(String[] args) {
		double[] a = new double[5];

		// 失敗作
		/*
		 * for(int i = 0; i < 5; i++){ a[i] =(i * 1.1) + 1.1;
		 * System.out.println("a[" + i + "] =" + a[i]); }
		 */

		// 5回繰り返す
		for (int i = 0; i < 5; i++) {
			// double型のため10進整数でピッタリ表現するこてはできないので
			// 何回目かをint型で作っておく
			int j = i + 1;
			// 回数×11で先に求める値の倍を出して置き、その後10で割り小数点以下を正しく表示する
			double t = (double) (j * 11) / 10;
			// 結果を表示
			System.out.println("a[" + i + "] =" + t);

		}
	}
}
