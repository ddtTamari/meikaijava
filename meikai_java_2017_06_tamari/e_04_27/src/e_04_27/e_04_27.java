/*
  演習4-27		数あてゲームに入力できる回数を設け、正解できなかった場合は正解を表示ゲームを終了
  演習日		6月7日
  製作者		玉利仁美
 */
package e_04_27;

import java.util.Random;
import java.util.Scanner;

public interface e_04_27 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();

		//10~99の数字をランダムに設定
		int no = rand.nextInt(90) + 10;
		System.out.println("数当てゲーム開始！！");
		System.out.println("10～99の数を当ててください。");
		System.out.println("制限回数は5回です。");

		int x ;
		int y = 5;

		Outer:
		//y回繰り返す
		for(int i = 1; i <= y ;i++){
			//答えの入力を促す
			System.out.println("いくつかな？");
			//xの値をキーボードから入力
			x= stdIn.nextInt();

			//y回目の時
			if(i == y){
				//ゲームオーバーと表示
				System.out.println("ゲームオーバーです。");
				//正解を表示
				System.out.println("正解は" + no + "でした。");
				//Outerのfor文を終了
				break Outer;
			}

			//もし入力した数字が答えより小さかったら、小さい数字ですと表示
			if(x > no) System.out.println("もっと小さな数字です。");
			//もし入力した数字が答えより大きかったら、大きい数字ですと表示
			else if(x < no) System.out.println("もっと大きな数字です。");
			//入力した数字が答えと同じになるまで繰り返す

			//答えと回答があっていた場合
			if(x == no){
				//答えと数字が一緒の場合、正解ですと表示
				System.out.println("正解です。");
				//for文を終了
				break Outer;
			}

		}



	}

}
