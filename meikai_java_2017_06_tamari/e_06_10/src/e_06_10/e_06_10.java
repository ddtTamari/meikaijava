/*
  演習6-10		連続する要素が同じ値を持つことのないように改良
  演習日		6月9日
  製作者		玉利仁美
 */
package e_06_10;

import java.util.Random;
import java.util.Scanner;

public interface e_06_10 {
	public static void main(String[] args){
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);

		//要素の数の入力を促す
		System.out.print("要素数：");
		//要素数をキーボードから取得
		int x = stdIn.nextInt();

		//x個の要素を持つ配列aを作成
		int[] a = new int[x];

		//ｘ回繰り返す
		for(int i =0 ; i < x; i++){
			//各要素に1～10のランダムな数字を代入する
			a[i] = rand.nextInt(10) + 1 ;
			//iが0ではないとき
			if(i !=0){
				//ひとつ前の要素と同じ値の時
				if(a[i] == a[i-1]){
					//再度各要素に1～10のランダムな数字を代入する
					a[i] = rand.nextInt(10) + 1 ;
				}
			}
			//各要素の値を表示
			System.out.println("a[" + i +"] =" + a[i]);
		}

	}
}
