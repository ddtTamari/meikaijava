/*
 	演習2-2	三つのint型の変数を使って合計と平均を求める
	制作日時	6月5日
	制作者	玉利仁美
*/
package e_02_02;

public interface e_02_02 {
	public static void main(String[] args){

		int x;		//xはint型の変数
		int y;		//ｙはint型の変数
		int z;		//ｚはint型の変数

		x = 63;
		y = 18;
		z = 35; //x,y,zにそれぞれ63、18、35を代入

		//　x,y,zの合計を求める
		System.out.println("合計は" + (x + y + z));

		//　x,y,zの平均を求める
		System.out.println("平均は" + (x+y+z)/2);
	}

}
