/*
  演習4-20		n段の正方形を表示するプログラムを作成せよ
  演習日		6月7日
  製作者		玉利仁美
 */
package e_04_20;
import java.util.Scanner;
public interface e_04_20 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		//ｎの値を促す
		System.out.print("n段の正方形：");
		//ｎの値をキーボードから取得
		int n = stdIn.nextInt();

		//iがｎ以下の時繰り返し、1ずつ増やしていく
		for(int i =1 ; i <= n ; i++){
			//ｊはn以下の時に繰り返し、ｊの値を一つ増やす
			for(int j = 1; j <= n ;j ++){
				//*を表示する
				System.out.print('*');
			}
			//改行する
			System.out.println();
		}
	}
}
