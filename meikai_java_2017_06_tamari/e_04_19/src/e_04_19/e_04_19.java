/*
  演習4-18		1~12の値以外が入力されたら再入力を求めるプログラム
  演習日		6月7日
  製作者		玉利仁美
 */
package e_04_19;
import java.util.Scanner;
public interface e_04_19 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);


		int retry; //リトライの判定用
		int month; //月

		//リトライの値が1の限り繰り返す
		do {
			//monthに入る値が1～12以外の場合繰り返す
			do{
				//何月かの入力を求める
				System.out.print("季節を求めます。\n何月ですか：");
				//月をキーボードで入力
				month = stdIn.nextInt();
			}while(month <1 || month >12);

			//3から5までの間なら
			if(month >= 3&& month <= 5){
				//春であると表示
				System.out.println("それは春です。");
			//6から8までの間なら
			}else if( month >= 6 && month <= 8){
				//夏であると表示
				System.out.println("其れは夏です。");
			//9から11までの間なら
			}else if( month >= 9 && month <= 11){
				//秋であると表示
				System.out.println("それは秋です。");
			//1，2，12なら
			}else if( month ==12 || month == 1 || month == 2){
				//冬であると表示
				System.out.println("それは冬です。");
			}
			//もう一度やるかどうか確認する
			System.out.print("もう一度？　1…yes /　2…no");
			//retryの値をキーボードで入力
			retry = stdIn.nextInt();
		//retryの値が1の場合繰り返す
		}while (retry == 1);

	}
}
