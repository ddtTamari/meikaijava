/*
  演習4-2		10~99の数当てゲームを製作
  演習日		6月6日
  製作者		玉利仁美
 */
package e_04_02;
import java.util.Random;
import java.util.Scanner;
public interface e_04_02 {

	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();

		//10~99の数字をランダムに設定
		int no = rand.nextInt(90) + 10;
		System.out.println("数当てゲーム開始！！");
		System.out.println("10～99の数を当ててください。");

		int x ;
		do {
			System.out.println("いくつかな？");
			//xの値をキーボードから入力
			x= stdIn.nextInt();

			//もし入力した数字が答えより小さかったら、小さい数字ですと表示
			if(x > no) System.out.println("もっと小さな数字です。");
			//もし入力した数字が答えより大きかったら、大きい数字ですと表示
			else if(x < no) System.out.println("もっと大きな数字です。");
		}while (x != no); //入力した数字が答えと同じになるまで繰り返す
		//答えと数字が一緒の場合、正解ですと表示
		System.out.println("正解です。");
	}

}

