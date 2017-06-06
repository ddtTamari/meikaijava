/*
 	演習3-7	3で割った際余りがいくつか、割り切れるのかを判定
	制作日時	6月5日
	制作者	玉利仁美

*/
package e_03_07;
import java.util.Scanner;
public interface e_03_07 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		//整数値の入力を促す
		System.out.print("整数値：");
		//変数nにキーボードから入力
		int n = stdIn.nextInt();

		//nが正の数字の時
		if(n > 0)
			//ｎが3で割り切れるとき、3で割り切れると表示
			if(n % 3 == 0)
				System.out.println("その値は3で割り切れます。");
			//ｎが3で割り切れず1余るとき、余りは1と表示
			else if(n % 3 == 1)
				System.out.println("その値を3で割った余りは1です。");
			//ｎが3で割り切れず2余るとき、余りは2と表示
			else if(n % 3 == 2)
				System.out.println("その値を3で割った余りは2です。");
		//ｎが正の数字ではない時、正ではない値が入力されたと表示
		else
			System.out.println("正ではない値が入力されました。");
	}

}
