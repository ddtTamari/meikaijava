/*
  演習16-4 全問と同様に、List16-8(次ページ)のメソッドreverseに対して、仮引数aに受け取った参照が空参照であった場合に、
           何らかの対処を行うように変更したプログラムを作成せよ
  演習日7月25日
  製作者玉利仁美
 */
package e_16_4;

//ユーザが入力した値をとるためにスキャナークラスを呼び出す
import java.util.Scanner;

//メインクラス
public class e_16_4 {
    /**
     * 配列の前後する要素を入れ替えるためのメソッド
     * @author 柴田望洋
     * @param a 入れ替えるための引数
     * @param idx1 前後する要素数の小さいほうの要素番号
     * @param idx2 前後する要素数の大きいほうの要素番号
     */
    //配列の前後する要素を入れ替えるためのメソッド
    static void swap(int[] a, int idx1, int idx2) {
        //小さいほうの要素に入っている値を一時保持しておく
        int t = a[idx1];
        //小さいほうの要素の値を大きいほうの要素の値で更新する
        a[idx1] = a[idx2];
        //大きいほうの要素の値を一時保持していた小さいほうの要素の値で更新する
        a[idx2] = t;
    }

    /**
     *配列を入れ替えるための処理を行うメソッド
     * @author 玉利仁美
     * @param argsArray 入れ替える配列
     * @throws Exception 例外処理が発生する可能性があることを示す
     */
    //配列を入れ替えるための処理を行うメソッド
    static void reverse(int[] argsArray) throws Exception {
        //この後の処理に例外が発生した際に例外処理を行うよう指定する
        try {
            //配列の半分の長さまで繰り返せばすべての要素を入れ替えられるのでそれまで繰り返す
            for (int i = 0; i < argsArray.length / 2; i++) {
                //Nullの例外処理を発生させるため引数を空参照にする
                swap(argsArray, i, argsArray.length - i);
            }
            //要素数より多い数が入ったら発生させる例外処理
        } catch (ArrayIndexOutOfBoundsException autOfBoundsError) {
            //例外処理に入ったら何が原因で起きた不具合なのかを表示させる
            throw new RuntimeException("reverseのバグ？", autOfBoundsError);
            //空参照した際に発生させる例外処理
        } catch (NullPointerException nullPointError) {
            //例外処理に入ったら何が原因で起きた不具合なのかを表示させる
            throw new RuntimeException("reverseのバグ？", nullPointError);
        }
    }

    /**
     * メインメソッド
     * @author 玉利仁美
     * @param args コマンドライン引数
     * @throws Exception 例外が発生する可能性があることを示す
     */
    //メインメソッド
    public static void main(String[] args) throws Exception {
        //ユーザ入力ができるようにスキャナを宣言する
        Scanner stdIn = new Scanner(System.in);

        //配列の要素数の入力を促す
        System.out.print("要素数；");
        //ユーザが入力した値を保持する
        int userDecidedElement = stdIn.nextInt();

        //Nullによる例外処理が行われない配列を用意する
        int[] arrayOutOfBounds = new int[userDecidedElement];
        //Nullによる例外処理を行うための配列を用意する
        int[] arrayNull;

        //配列の長さまで要素の中に値を入れたいのでその数まで繰り返す
        for (int i = 0; i < userDecidedElement; i++) {
            //要素の値の入力を促す
            System.out.print("x[" + i + "] : ");
            //キーボードから値を取得する
            arrayOutOfBounds[i] = stdIn.nextInt();
        }

        //この後の処理に例外が発生した際に例外処理を行うよう指定する
        try {
            //要素を反転させる処理Nullの例外処理を行うように呼び出す
            reverse(null);

            //要素の並びを反転したことを表示する
            System.out.println("要素の並びを反転しました。");
            //反転した要素をすべて表示させるために
            for (int i = 0; i < userDecidedElement; i++) {
                //各要素の番号と値を表示する
                System.out.println("x[" + i + "]=" + arrayOutOfBounds[i]);
            }
            //例外が発生した際に行う処理
        } catch (RuntimeException error) {
            //例外の種類を表示させる
            System.out.println("例外      : " + error);
            //例外の原因を表示させる
            System.out.println("例外の原因:" + error.getCause());
            //例外処理が起きても起きなくてもストリームを開放する
        } finally {
            // ストリームを解放する
            stdIn.close();
        }

    }

}
