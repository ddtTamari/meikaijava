/*
  演習4-5　		x--を--xと書き換えたらどのような結果になるか確認する。
  演習日		6月6日
  製作者		玉利仁美
 */
package e_04_05;
import java.util.Scanner;
public interface e_04_05 {
	public static void main (String[] args){
		Scanner stdIn = new Scanner(System.in);

		System.out.println("カウントダウンします。");
		int x;
		do{
			System.out.print("正の整数値：");
			x = stdIn.nextInt();
		}while (x <= 0);

		while (x >= 0)
			//System.out.println(x--);
			System.out.println(--x);

	}

}
//--xにすると減少後の数字が生成されるのでⅹが-1になっても先に-1の値が表示される。