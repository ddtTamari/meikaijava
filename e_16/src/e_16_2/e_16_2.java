/*
  演習16-2		List16-6(P.523)のtry文では、ParmeterRangeError例外とResultRangeError例外を別々の例外ハンドラで補足している。
                  単一の例外ハンドラで補足するように変更したプログラムを作成せよ。
  演習日		7月11日
  製作者		玉利仁美
 */
package e_16_2;

//ユーザが入力ができるようにScannerクラスを呼び出す
import java.util.Scanner;

//非検査例外のルールを決めるために抽象クラスを作成する
class RangeError extends RuntimeException {
	// コーションとエラーのある値を表示するためのコンストラクタを作成
	RangeError(int inputNum, String coation) {
		//注意文と範囲外の値を表示する処理をおこなう
		super(coation + "範囲外の値：" + inputNum);
	//コンストラクタを閉じる
	}
	//抽象クラスを閉じる
}

//入力された値が範囲外だった時の例外処理クラス
class ParameterRangeError extends RangeError {
	//入力された値を引数として例外処理を行う
	ParameterRangeError(int inputNum) {
		//コーション内容と例外の値を表示させる
		super(inputNum, "加える数が範囲外です。");
		//例外処理を閉じる
	}
	//入力された値が範囲外だった時の例外処理クラスを閉じる
}

//計算結果が範囲外だった時の例外処理クラス
class ResultRangeError extends RangeError {
	//計算結果が範囲外だっと時の計算結果を引数として例外処理を行う
	ResultRangeError(int resultNum) {
		//コーション内容と例外の値を表示させる
		super(resultNum, "計算結果が範囲外です。");
		//例外処理を閉じる
	}
	//計算結果が範囲外だった時の例外処理クラスを閉じる
}

//メインクラス
public class e_16_2 {

	//入力された値が範囲外かどうか判定するメソッド、エラー処理を行うため条件を指定する
	static boolean isValid(int inputNum) {
		//引数の値が0～9の間の場合判定はTRUEが返る
		return inputNum >= 0 && inputNum <= 9;
	//入力された値が判定外かどうか判定するメソッドを閉じる
	}

	//足し算の処理をおこなうメソッド、この問題では例外処理を発生させるためのメソッド
	static int add(int a, int b) throws ParameterRangeError, ResultRangeError {
		//入力された値でFalseが返ってきたら例外処理を行う
		if (!isValid(a)) {
			//入力された値が範囲外だった時の処理を行う
			throw new ParameterRangeError(a);
		}
		//入力された値でFalseが返ってきたら例外処理を行う
		if (!isValid(b)) {
			//入力された値が範囲外だった時の処理を行う
			throw new ParameterRangeError(b);
		}
		//変数を用意して足し算を行う
		int result = a + b;
		//計算結果が範囲外だった時のFalseが返ってきたら例外処理を行う
		if (!isValid(result)) {
			//計算結果が範囲外だった時の処理を行う
			throw new ResultRangeError(result);
		}
		//例外処理がなければ計算結果を返す
		return result;

	}

	//メインメソッド
	public static void main(String[] args) {

		//計算用の入力を行うためにスキャナを宣言
		Scanner stdIn = new Scanner(System.in);

		//整数の一つ目を促すための文字列を表示する
		System.out.print("整数a:");
		//入力された値を保持するための変数を宣言
		int inputIntegerA = stdIn.nextInt();
		//整数の二つ目を促すための文字列を表示する
		System.out.print("整数b:");
		//入力された値を保持するための変数を宣言
		int inputIntegerB = stdIn.nextInt();

		//例外があるかもしれないプログラムを実行するためにtry句を使う
		try {
			//例外がないときに表示する文言を定義する
			System.out.println("それらの和は" + add(inputIntegerA, inputIntegerB) + "です。");
			//どの例外がキャッチされるかわからないので呼び出されるかもしれない例外処理の上位クラスを呼び出す
		} catch (RangeError errorNum) {
			//例外処理された値を引数にメッセージを表示する
			System.out.println(errorNum.getMessage());
			//例外処理が起こるかもしれない範囲を閉じる
		}
		// ストリームを解放する
		stdIn.close();
		//メインメソッドを閉じる
	}
	//メインクラスを閉じる

}
