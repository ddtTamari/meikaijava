/*
  演習16-1		List16-4(P.518)のtry文では、Exception例外とRuntimeException例外を、単一の例外ハンドラで補足している。
 				二つの例外を別々に補足するように変更したプログラムを作成せよ。
  演習日		7月9日
  製作者		玉利仁美
 */

//パッケージをe_16_1に指定する
package e_16_1;

//キーボード入力を行うためにスキャナークラスをインポートしておく
import java.util.Scanner;

//問題を解くためのクラスを宣言
public class e_16_1 {
	//どちらの例外処理に投げるか判定するための数字
	private final static int CASE_ONE_GOTO_EXCEPTION = 1;
	//どちらの例外処理に投げるか判定するための数字
	private final static int CASE_TWO_GOTO_RUNTIME_EXCEPTION = 2;

	// 検査例外発生を表示させるException例外ハンドラを作成する
	static void throwsException(int caseNumber) throws Exception {
		// Exception例外が投げられた時にコーションを表示させる
		throw new Exception("検査例外発生！！");
	}

	// 非検査例外発生を表示させるRuntimeException例外ハンドラを作成する
	static void throwsRuntimeException(int caseNumber) throws RuntimeException {
		// RuntimeException例外が投げられた時にコーションを表示させる
		throw new RuntimeException("非検査例外発生！！");
	}

	// どの例外ハンドラを呼び出すかを決める例外ハンドラ
	static void test(int branch) throws Exception {
		// 引数に与えられた数字によって呼び出す例外ハンドラを決める
		switch (branch) {
		// 引数が1だった場合問題に従ってException例外処理を呼び出す
		case CASE_ONE_GOTO_EXCEPTION:
			//例外の処理を呼び出す
			throwsException(branch);
			// 引数が2だった場合問題に従ってRuntimeException例外処理を呼び出す
		case CASE_TWO_GOTO_RUNTIME_EXCEPTION:
			//例外の処理を呼び出す
			throwsRuntimeException(branch);
		}
	}

	// 例外処理が行われるかもしれないメインメソッド
	public static void main(String[] args) {
		// ユーザーが入力できるようスキャナークラスを宣言しておく
		Scanner stdIn = new Scanner(System.in);

		// ユーザーにスイッチするための数字の入力を促す
		System.out.print("sw : ");
		// 例外処理用の引数の数字をキーボードから取得する
		int branch = stdIn.nextInt();

		// 例外処理が行われるかもしれないプログラムをtryで囲む
		try {
			// テストメソッドを呼び出し例外処理をさせる
			test(branch);
			// スーパークラスから呼び出すとコンパイルエラーになるのでさきにRuntimeExceptionを呼び出す
		} catch (RuntimeException exceptionHandle) {
			// 例外処理によって出された文字列を表示させる
			System.out.println(exceptionHandle.getMessage());
			// スーパークラスの例外ハンドラを呼び出す
		} catch (Exception exceptionHandle) {
			// 例外処理によって出された文字列を表示させる
			System.out.println(exceptionHandle.getMessage());
		}
		// ストリームを解放する
		stdIn.close();
		// メソッドを閉じる
	}
	// クラスを閉じる
}
