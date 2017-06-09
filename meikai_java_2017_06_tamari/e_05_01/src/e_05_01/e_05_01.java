/*
  演習5-1		10進整数を読み込みその値の8進数と16進数で表示するプログラム
  演習日		6月8日
  製作者		玉利仁美
 */
package e_05_01;
import java.util.Scanner;
public interface e_05_01 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		//整数の入力を促す
		System.out.print("整数：");
		//整数をキーボードから取得
		int x = stdIn.nextInt();

		//10進数のxを8進数にして表示
		System.out.printf("8進数では%o\n" , x);
		//10進数のxを16進数にして表示
		System.out.printf("16進数では%x\n" , x );

	}
}
