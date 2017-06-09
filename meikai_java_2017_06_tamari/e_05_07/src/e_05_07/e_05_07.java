/*
  演習5-7		0.0から1.0まで0.001沖にその値とその値の2乗を表示するプログラム
  演習日		6月8日
  製作者		玉利仁美
 */
package e_05_07;

public class e_05_07 {
	public static void main(String[] args) {

		// どちらが値なのか2乗なのかを表示
		System.out.println("   値　　　 値の2乗");
		// 実数値と文字を区切る
		System.out.println("--------------------");

		// 1000回繰り返す
		for (int i = 0; i <= 1000; i++) {
			// 0,001になるようにiを1000で割る
			float x = (float) i / 1000;
			// 2乗を求める
			float y = x * x;
			// 最低でも小数点第7までxとyの値を表示
			System.out.printf("%1.7f  %1.7f\n", x, y);
		}
	}
}
