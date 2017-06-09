/*
  演習6-8		double型の配列の全要素の合計値・平均値を求めるプログラム、要素数・全要素はキーボードから読み込み
  演習日		6月9日
  製作者		玉利仁美
 */
package e_06_08;
import java.util.Scanner;
public interface e_06_08 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		//要素数の入力を促す
		System.out.print("要素数：");
		//要素数をキーボードから取得
		int x = stdIn.nextInt();
		//要素数がxの配列aを作成する
		double[] a = new double[x];

		//要素数分だけ繰り返す
		for(int j = 0 ; j < x ;j++){
			//要素の値の入力を促す
			System.out.print("a[" + j +"] = ");
			//a[j]の値をキーボードから取得
			a[j]=stdIn.nextDouble();
		}

		double sum = 0; //要素の値の合計

		//aの配列を走査
		for(double i : a)
			//要素の値の合計を求める
			sum += i;
		double ave = sum / x; //要素の値の平均

		//合計を表示
		System.out.println("要素の値の合計は" + sum);
		//平均を表示
		System.out.println("要素の値の平均は" + ave);
	}

}
