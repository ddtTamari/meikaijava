/*
  演習4-6　		一未満の時改行文字を出力しないように書き換えたプログラムの作成
  演習日		6月6日
  製作者		玉利仁美
 */
package e_04_06;
import java.util.Scanner;
public interface e_04_06 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		System.out.print("何個*を表示しますか：");
		int n = stdIn.nextInt();

		int i = 0;

			while(i < n && i > 0){
				System.out.print('*');
				i++ ;
			}

	}
}
