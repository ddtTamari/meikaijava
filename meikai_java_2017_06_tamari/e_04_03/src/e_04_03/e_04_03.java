/*
  演習4-3　		2つの整数値の間の数を小さいほうから順に表示するプログラムを作る
  演習日		6月6日
  製作者		玉利仁美
 */
package e_04_03;
import java.util.Scanner;
public interface e_04_03 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数A:"); int a = stdIn.nextInt();
		System.out.print("整数B:"); int b = stdIn.nextInt();

		//aとbのどちらが大きいかを確かめる
		int min, max;
		if (a > b){
			max = a;
			min = b;
		}else{
			min =a;
			max =b;
		}
		//最大値の値になるまで最小値に1ずつ足していく
		do{
			System.out.println(min);
			min ++;
		}while(min != (max + 1) );

	}
}
