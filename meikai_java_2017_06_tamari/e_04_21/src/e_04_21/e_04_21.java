/*
  演習4-21		直角が左上、右下、右上の直角三角形を表示するプログラムを作成
  演習日		6月7日
  製作者		玉利仁美
 */
package e_04_21;
import java.util.Scanner;
public interface e_04_21 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		//段数の入力を促す
		System.out.print("段数は：");
		//段数をキーボードから取得
		int n = stdIn.nextInt();


		////////////////////////////////////////////

		{//直角が左上の三角
			//iがｎ以下の時繰り返す、そのたびiは1増える
			for(int i = 1; i <= n ; i++){
				//jがiより大きい時繰り返す、そのたびjは1減る
				for(int j = n; j >=i ; j--){
					System.out.print('*');
				}
				//改行する
				System.out.println();
			}
		}


		////////////////////////////////////////////


		{//直角が右下の三角
			//iがｎ以下の時繰り返し、一つずつ増やす
			for(int i = 1; i <= n ; i++){
				//空白をｎ－1個生成する
				for(int j = 1 ; j <= n - i; j++){
					//空白を生成
					System.out.print(" ");
				}
				//*をj個生成する
				for(int j = 1; j <= i ; j ++){
					//*を生成
					System.out.print('*');
				}
				//改行する
				System.out.println();
			}
		}

		////////////////////////////////////////////

		System.out.println();

		{//直角が右上の三角
			//n回繰り返す
			for(int i = 1; i <= n ; i++){
				//jがiより少ないとき空白を生成
				for(int j = 1; j < i ; j ++){
					//空白を生成する
					System.out.print(' ');
				}
				//*をjがｎより小さい間生成する
				for(int j = i ; j <= n ; j++){
					//*を生成する
					System.out.print("*");
				}
				//改行する
				System.out.println();
			}
		}
		/////////////////////////////////////////////


	}

}
