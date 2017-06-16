/*
  演習7-6		引数ｍで指定された月の季節を表示するメソッドprintSeasonを表示。
  				3,4,5であれば春、6,7,8であれば夏、9,10,11であれば秋、12,1,2であれば冬を表示し、それ以外の値は何も表示しない
  演習日		6月16日
  製作者		玉利仁美
 */
package e_07_06;

import java.util.Scanner;

public class e_07_06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 指定された月を判定するので、判定する月の数字の入力を促す
		System.out.print("季節を判定する月：");
		// 指定する月をキーボードから取得
		int m = scan.nextInt();
		// キーボードから取得した数値を引数として、printSeasonメソッドを呼び出す
		printSeason(m);
		//ストリームを解放
		scan.close();
	}

	// 仮引数としてmを受け取り、実引数で初期化された仮引数ｍの値により春か夏か秋か冬か何も表示しないのかを判定する
	static void printSeason(int m) {
		// 仮引数mの値によって変化する
		switch (m) {
		// 3の値が入力されたらcase5のbreakまで進み、case5内の春と表示する文を実行する
		case 3:
		// 4の値が入力されたらcase5のbreakまで進み、case5内の春と表示する文を実行する
		case 4:
		// 5の値が入力されたら、春と表示しbreakでswitch文から抜け出す
		case 5:
			// 3,4,5のいずれかの値が入れば春と表示
			System.out.println("春");
			//switch文から抜け出す
			break;
		// 6の値が入力されたらcase8のbreakまで進み、case8内の夏と表示する文を実行しswitch文から抜け出す
		case 6:
		// 7の値が入力されたらcase8のbreakまで進み、case8内の夏と表示する文を実行しswitch文から抜け出す
		case 7:
		// 8の値が入力されたら、夏と表示しbreakでswitch文から抜け出す
		case 8:
			// 6,7,8のいずれかの値が入れば夏と表示
			System.out.println("夏");
			//switch文から抜け出す
			break;
		// 9の値が入力されたらcase11のbreakまで進み、case11内の秋と表示する文を実行しswitch文から抜け出す
		case 9:
		// 10の値が入力されたらcase11のbreakまで進み、case11内の秋と表示する文を実行しswitch文から抜け出す
		case 10:
		// 11の値が入力されたら、秋と表示しbreakによってswitch文から抜け出す
		case 11:
			//9,10,11のいずれかの値が入れば秋と表示
			System.out.println("秋");
			//switch文から抜け出す
			break;
		// 12の値が入力されたらcase1のbreakまで進み、case1内の冬と表示する文を実行ししswitch文から抜け出す
		case 12:
		// 1の値が入力されたらcase1のbreakまで進み、case1内の冬と表示する文を実行ししswitch文から抜け出す
		case 1:
		// 2の値が入力されたら、冬と表示しbreakによってswitch文から抜け出す
		case 2:
			//1,2,12のいずれかの値が入れば冬と表示
			System.out.println("冬");
			//switch文から抜け出す
			break;
		// デフォルトとして1～12の値以外が入力されたら、switch文から抜け出す
		default:
			//何も表示せずにswitch文から抜け出す
			break;
		}
	}

}
