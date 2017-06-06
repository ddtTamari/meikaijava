/*
 	演習3-12	3つの整数値の最小値を求めて表示する
	制作日時	6月6日
	制作者	玉利仁美

*/
package e_03_12;
import java.util.Scanner;
public interface e_03_12 {

	public static void main(String[] args){

		Scanner stdIn = new Scanner(System.in);

		//整数値aをキーボードから入力
		System.out.print("整数値a:"); int a = stdIn.nextInt();
		//整数値bをキーボードから入力
		System.out.print("整数値b："); int b = stdIn.nextInt();
		//整数値cをキーボードから入力
		System.out.print("整数値c："); int c = stdIn.nextInt();


		int min = a;	//最初にminにaを代入
		//もしbがminより小さければminの値にbを代入
		if(b < min)		min = b;
		//もしcがminより小さければminの値にcを代入
		if(c < min)		min = c;

		//minの値を表示
		System.out.println("min=" + min);
	}



}
