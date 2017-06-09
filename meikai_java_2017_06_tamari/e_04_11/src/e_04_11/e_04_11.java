/*
  演習4-11		正の整数値を0までカウントダウンするプログラムをfor分を使って作成
  演習日		6月6日
  製作者		玉利仁美
 */
package e_04_11;
import java.util.Scanner;
public interface e_04_11 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);


		int x;//任意の正の整数
		//正の値しか入力できないようにする
		do{
			System.out.print("正の整数値：");	 x= stdIn.nextInt();
		}while(x <= 0);
		//iにxを代入、iが0以上のとき繰り返す、iは1ずつ減らしていく
		for(int i = x; i >= 0 ; i--){
			//iを表示
			System.out.println(i);

		}
	}

}
