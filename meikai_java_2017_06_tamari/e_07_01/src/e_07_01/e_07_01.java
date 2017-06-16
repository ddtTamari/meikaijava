/*
  演習7-1		受っとったint型引数の値nが負であれば-1を返却、
  				0であれば0を返却、姓であれば1を返却するメソッドsignOfを作成
  演習日		6月15日
  製作者		玉利仁美
 */
package e_07_01;

import java.util.Scanner;

public class e_07_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//負の値か、正の値か、0かを判定するメソッドに渡す実引数の入力を促す
		System.out.print("実引数：");
		//実引数の値をキーボードから取得
		int argment = scan.nextInt();

		//メソッドを呼び出し、メソッドから返却された値を表示する
		System.out.println("返却値:" +signOf(argment));
		//ストリームを解放
		scan.close();
	}

	//仮引数に与えられた値が、負の値なら-1を、正の値なら1を、0なら0を返すメソッド
	static int signOf(int argment) {
		//実引数で初期化された仮引数が正の値ならば、仮引数に1を代入
		if (argment > 0) {
			//正の値だったので、仮引数に1を代入
			argment = 1;
		//実引数で初期化された値が0ならば、仮引数に0を代入
		} else if (argment == 0) {
			//値が0だったので、仮引数に0を代入
			argment = 0;
		//実引数で初期化された値が負の値ならば、仮引数にー1を代入
		} else {
			//負の値だったので、仮引数にー1を代入
			argment = -1;
		}

		//仮引数を返却値として返す
		return argment;
	}
}
