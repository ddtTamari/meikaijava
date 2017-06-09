/*
  演習4-14		式を表示するプログラム
  演習日		6月7日
  製作者		玉利仁美
 */package e_04_14;

import java.util.Scanner;

public interface e_04_14 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int n;	//任意の値

		//正の値が入力されるまで繰り返す
		do{
			System.out.print("nの値：");
			n= stdIn.nextInt();
		}while(n <= 0);

		int sum =0;	//合計
		//iがｎを超えるまでiを足していく
		for(int i = 0 ; i <= n ;i++ ){
			//合計にiを足していく
			sum += i;
			//iがnより小さく、iが0ではないとき
			if(i < n && i !=0){
				//i＋を表示
				System.out.print(i + "+");
			//iがnの時
			}else if(i == n){
				//iを表示
				System.out.print(i);

			}
		}
		//合計を表示する
		System.out.print("=" + sum);

	}
}
