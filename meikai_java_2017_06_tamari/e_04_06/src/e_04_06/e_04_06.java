/*
  演習4-6		一未満の時改行文字を出力しないように書き換えたプログラムの作成
  演習日		6月6日
  製作者		玉利仁美
 */
package e_04_06;
import java.util.Scanner;
public interface e_04_06 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		//*を何個表示するか促す
		System.out.print("何個*を表示しますか：");
		//nにキーボードから入力
		int n = stdIn.nextInt();

		int i = 0;//
		//iが入力されたnより小さい間繰り返す
		while(i < n){
			//＊を表示
			System.out.print('*');
			//iを１ずつ足す
			i++;
		}
		/*
		 while(i <=n){
		 System.out.print('*');
		 i++;
		 }
		 */
		//入力されたｎが1未満の時
		if(n <1){
		//改行文字を出力する
		System.out.println();
		}
	}

}
