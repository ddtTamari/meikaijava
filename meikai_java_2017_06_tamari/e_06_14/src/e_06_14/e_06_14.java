/*
  演習6-14		月を1～12の数値として表示、その英語表現を入力させる英単語学習プログラムの作成
  				・出題する月はランダムに・学習社が望む限り何度でも繰り返す・同一月を連続して出さない
  演習日		6月9日
  製作者		玉利仁美
 */
package e_06_14;
import java.util.Random;
import java.util.Scanner;
public interface e_06_14 {
	public static void main(String[] args){
		Random rand =new Random();
		Scanner stdIn = new Scanner(System.in);

		String[] monthAnser ={
				"January" , "February" , "March" , "April" , "May" , "Jun" ,
				"July","August" , "Septenmber" , "Octorber" , "November" , "December"
		};
		int monthQue ;
		System.out.print("英語の月名を入力してください。\nなお、先頭は大文字で、2文字目以降は小文字とします。\n");


		while(true){
			monthQue = rand.nextInt(12);
			System.out.print(monthQue + "月：");
			String Answer = stdIn.nextLine();

			if(Answer.equals(monthAnser[monthQue])) break;
				System.out.println("違います。");
		}
		System.out.println("正解です。");


		}


	}
}
