/*
  演習4-4　		カウントダウンの最後に変数xの値が-1になることを確認
  演習日		6月6日
  製作者		玉利仁美
 */
package e_04_04;
import java.util.Scanner;

public interface e_04_04 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);


		System.out.println("カウントダウンします。");
		int x;
		//マイナス値が与えられている間、値の再入力を求める
		do {
			System.out.print("正の整数値：");
			x = stdIn.nextInt();
		}while (x <= 0);
		//与えられた値が正または0の時、その数から1ずつ減らしていく
		while (x >= 0){
			System.out.println(x);
			x--;
		}
		//while分が終わるのは条件から外れるまでなので-1まで減っている
		System.out.println("今のⅹの値は" + x + "です。");

	}
}
