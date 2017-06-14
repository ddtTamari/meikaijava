/*
 	演習2-2	三つのint型の変数を使って合計と平均を求める
	制作日時	6月5日
	制作者	玉利仁美
*/
package e_02_02;

public class e_02_02 {
	public static void main(String[] args) {

		int integerA; // integerAはint型の合計と平均を求める3値のうちの一つ目
		int integerB; // integerBはint型の合計と平均を求める3値のうちの二つ目
		int integerC; // integerCはint型の合計と平均を求める3値のうちの三つ目

		integerA = 63;	//integerAに63を代入
		integerB = 18;	//integerBに18を代入
		integerC = 35; 	//integerCに35を代入

		// integerA,integerB,integerCの合計を求め、その値を表示
		System.out.println("合計は" + (integerA + integerB + integerC));

		// integerA,integerB,integerCの平均を求め、その値を表示
		System.out.println("平均は" + (integerA + integerB + integerC) / 2);
	}

}
