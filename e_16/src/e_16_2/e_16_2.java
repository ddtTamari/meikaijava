/*
  演習16-2		List16-6(P.523)のtry文では、ParmeterRangeError例外とResultRangeError例外を別々の例外ハンドラで補足している。
                  単一の例外ハンドラで補足するように変更したプログラムを作成せよ。
  演習日		7月11日
  製作者		玉利仁美
 */
package e_16_2;

//ユーザが入力ができるようにScannerクラスを呼び出す
import java.util.Scanner;

//非検査例外のルールを決めるために親クラスを作成する
class RangeError extends RuntimeException {

    /**
    	 * 例外処理を行う際のルールを決めるコンストラクタ
    	 * @author 玉利仁美
    	 * @param inputNum ユーザが入力した値
    	 * @param caution 例外が起きた際に表示される文言
    	 */
    // コーションとエラーのある値を表示するためのコンストラクタを作成
    RangeError(int inputNum, String caution) {
        //注意文と範囲外の値を表示する処理をおこなう
        super(caution + "範囲外の値：" + inputNum);
        //コンストラクタを閉じる
    }
    //抽象クラスを閉じる
}

//入力された値が範囲外だった時の例外処理クラス
class ParameterRangeError extends RangeError {
    /**
    	 * 入力された値が例外だった時の処理を行うメソッド
    	 * @author 玉利仁美
    	 * @param inputNum ユーザが入力した値
    	 */
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
    /**
    	 * 計算結果が例外だった時の処理を行うメソッド
    	 * @author 玉利仁美
    	 * @param resultNum 計算結果
    	 */
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

    /**
    	 * 入力された値が範囲外かどうか判定するメソッド
    	 * @author 玉利仁美
    	 * @param inputNum ユーザが入力した値
    	 * @return inputNumが0~9までの間だったらTrue
    	 */
    //入力された値が範囲外かどうか判定するメソッド、エラー処理を行うため条件を指定する
    static boolean isValid(int inputNum) {
        //引数の値が0～9の間の場合判定はTRUEが返る
        return inputNum >= 0 && inputNum <= 9;
        //入力された値が判定外かどうか判定するメソッドを閉じる
    }

    /**
    	 * 足し算の処理をおこなうメソッド
    	 * @author 玉利仁美
    	 * @param inputIntegerA ユーザが入力した一つ目の値
    	 * @param inputIntegerB ユーザが入力した二つ目の値
    	 * @return result ユーザが入力した2つの値の合計値
    	 * @throws ParameterRangeError ユーザが入力した値が例外だった場合の処理
    	 * @throws ResultRangeError 二つの値の合計値が例外だった場合の処理
    	 */
    //足し算の処理をおこなうメソッド、この問題では例外処理を発生させるためのメソッド
    static int add(int inputIntegerA, int inputIntegerB) throws ParameterRangeError, ResultRangeError {
        //入力された値でFalseが返ってきたら例外処理を行う
        if (!isValid(inputIntegerA)) {
            //入力された値が範囲外だった時の処理を行う
            throw new ParameterRangeError(inputIntegerA);
        }
        //入力された値でFalseが返ってきたら例外処理を行う
        if (!isValid(inputIntegerB)) {
            //入力された値が範囲外だった時の処理を行う
            throw new ParameterRangeError(inputIntegerB);
        }
        //変数を用意して足し算を行う
        int result = inputIntegerA + inputIntegerB;
        //計算結果が範囲外だった時のFalseが返ってきたら例外処理を行う
        if (!isValid(result)) {
            //計算結果が範囲外だった時の処理を行う
            throw new ResultRangeError(result);
        }
        //例外処理がなければ計算結果を返す
        return result;

    }

    /**
    	 * ユーザーの入力した任意の値を足し算するメソッド
    	 * @author 玉利仁美
    	 * @param args コマンドライン引数
    	 */
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
            //どの例外がキャッチされるかわからないので呼び出されるかもしれない例外処理の上位クラスをキャッチ
        } catch (RangeError errorNum) {
            //例外処理された値を引数にメッセージを表示する
            System.out.println(errorNum.getMessage());
            //例外処理が起きても起きなくてもストリームを開放する
        }finally {
            // ストリームを解放する
            stdIn.close();
        }
        //メインメソッドを閉じる
    }
    //メインクラスを閉じる
}
