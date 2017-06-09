/*
  演習6-13		配列aの全要素を配列bに対して逆順にコピーするプログラムを作成(二つの配列の要素数は同一であると仮定)
  演習日		6月9日
  製作者		玉利仁美
 */
package e_06_13;
import java.util.Scanner;
public interface e_06_13 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		//要素数の入力を促す
		System.out.print("要素数：");
		int n = stdIn.nextInt();  //要素数
		//要素数nの配列a生成
		int[] a = new int[n];
		//要素数nの配列b生成
		int[] b = new int[n];

		//n回繰り返す
		for(int i =0;i < n ; i++){
			//要素の値の入力を促す
			System.out.print("a[" + i + "] = ");
			//配列aの値をキーボードから取得
			a[i] = stdIn.nextInt();
		}
		//n回繰り返す
		for(int i = 1;i <= n ;i ++){
			//逆順に入るようインデックスを大きい数字から減らしていく
			b[n-i] = a[i-1];

		}

		//逆順にしたことを表示
		System.out.println("逆順コピーしました。");
		//n回繰り返す
		for(int i = 0;i < n ;i ++)
		//配列bを表示
		System.out.println("b["+i +"] = " + b[i]);
	}

}
