/*
  演習16-3		List 16-7のメソッドreverseは、仮引数aに受け取った参照が空参照でないことを前提としている。
  				受け取ったのが空参照であった場合に、何らかの対処を行うように変更したプログラムを作成せよ。
  				※Column 16-2(P.527)に示すNullPointerExceptionを補足して対処すること。
  演習日		7月23日
  製作者		玉利仁美
 */
package e_16_3;

//ユーザが入力した値をとるためにスキャナークラスを呼び出す
import java.util.Scanner;

//メインクラス
public class e_16_3 {
    /**
     * 配列の中に入っている要素を逆に並び替えるメソッド
     * @author 柴田望洋
     * @param array 入れ替えたい配列を示す引数
     * @param idx1 要素を入れ替えるための配列の内の一つ目
     * @param idx2 要素を入れ替えるための配列の内の二つ目
     */
    //配列の要素を入れ替えるメソッド
    static void swap(int[] array, int idx1, int idx2) {
        //一つ目の要素の値をとっておくための変数を用意する
        int keepNum = array[idx1];
        //一つ目の要素に二つ目の要素の値を代入して順番を変える
        array[idx1] = array[idx2];
        //二つ目の要素にはあらかじめとっておいた二つ目の要素の値を代入する
        array[idx2] = keepNum;
    }

    /**
     * 配列を入れ替えるための処理を行うメソッド
     * @author 柴田望洋
     * @param array 入れ替える配列を指定する
     */
    //配列を入れ替えるための処理を行うメソッド
    static void reverse(int[] array) {
        //この後の処理には例外が発生した際に例外処理を行うよう指定する
        try {
            //入れ替えるためには半分入れ替え処理を行えばいいので配列の長さの半分だけ繰り返す
            for (int i = 0; i < array.length / 2; i++) {
                //例外処理を起こすために要素数より多くなるようにして配列の並び替えメソッドを呼び出す
                swap(array, i, array.length - i);
            }
            //インデックスが要素数より多くなった時キャッチする例外ハンドラ
        } catch (ArrayIndexOutOfBoundsException error) {
            //要素数より多くなった時のエラー内容を表示する
            error.printStackTrace();
            //参照が空参照だった時キャッチする例外ハンドラ
        } catch (NullPointerException error) {
            //参照が空参照だったことを表示する
            error.printStackTrace();
        }
    }

    /**
     * @author 柴田望洋
     * @param args コマンドライン引数
     */
    //メインメソッド
    public static void main(String[] args) {
        //ユーザが入力できるようにする
        Scanner stdIn = new Scanner(System.in);

        //ユーザに要素数の入力を促す
        System.out.print("要素数：");
        //ユーザが入力した値を保持する
        int num = stdIn.nextInt();

        //ユーザが入力した数の要素数を持つ配列を準備する
        int[] arrayOutOf = new int[num];
        //空参照を起こすための配列を準備する
        int[] arrayNull;

        //空参照のエラーを出すためにNullを代入する
        arrayNull = null;

        //ユーザが入力した数だけ配列に値を入力するために要素数分繰り返す
        for (int i = 0; i < num; i++) {
            //ユーザに配列の各要素の値の入力を促す
            System.out.print("x[" + i + "] : ");
            //各配列にキーボードから値を取得する
            arrayOutOf[i] = stdIn.nextInt();
        }

        //反転する処理を行うメソッドを呼び出す。この呼び出しでは要素数以上の数字を配列に入れ例外処理を起こす
        reverse(arrayOutOf);
        //反転する処理を行うメソッドを呼び出す。この呼び出しではNullを引数として渡すことでNULL用の例外処理を起こす
        reverse(arrayNull);

        //要素の反転ができたことを明示する
        System.out.println("要素の並びを反転しました。");
        //各要素の値を表示したいので要素数分繰り返す
        for (int i = 0; i < num; i++) {
            //各要素を反転した結果を表示する
            System.out.println("x[" + i + "] = " + arrayOutOf[i]);
        }
        // ストリームを解放する
        stdIn.close();
    }
}
