/*
  演習4-24		正の整数値を読み込みそれが素数であるかどうかを判定するプログラムを作成
  演習日		6月7日
  製作者		玉利仁美
 */
package e_04_24;
import java.util.Scanner;
public interface e_04_24 {

	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		//正の整数の入力を促す
		System.out.print("正の整数を素数かどうか判定します\n正の整数ｎ：");
		//nの値をキーボードの入力から取得
		int n = stdIn.nextInt();
		//素数であることを前提にtrueでフラグを立てる
		boolean flag = true;

		//ｎの値になるまで繰り返す
		for(int i = 2; i < n ; i++){

			//ｎをiで割った余りが0なら
			if(n % i ==0 ){
				//素数という前提がfalseになり素数ではないと判断
				flag = false;
				//繰り返しを終了させる
				break;
			}
		}
		//もしフラグがfalseならば
		if(flag == false){
			//それは素数ではないと表示
			System.out.println("それは素数ではありません。");
		//そうでなければ
		}else{
			//素数であると表示
			System.out.println("それは素数です。");
		}


	}
}
