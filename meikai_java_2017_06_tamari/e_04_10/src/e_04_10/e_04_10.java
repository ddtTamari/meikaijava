/*
  演習4-10		読み込んだ値が１未満なら改行文字を出力しないよう書き換える
  演習日		6月6日
  製作者		玉利仁美
 */
package e_04_10;
import java.util.Scanner;

public interface e_04_10 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		//何個表示するのか促す
		System.out.print("何個*を表示しますか：");
		//キーボードから入力
		int n = stdIn.nextInt();

		//iは0、入力されたｎより小さい間繰り返し、iは一つずつ増える
		for(int i = 0; i < n ; i++ )
			//*を表示
			System.out.print('*');

		//nが１未満の時
		if(n <1){
		//改行文字を表示
		System.out.println();
		}
	}
}