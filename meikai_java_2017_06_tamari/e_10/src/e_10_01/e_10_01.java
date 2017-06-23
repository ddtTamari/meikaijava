/*
  演習10-1		連番クラスIDに最後に与えた識別番号を返すクラスメソッドgitMaxIdを追加。
  演習日		6月23日
  製作者		玉利仁美
 */
package e_10_01;

public class e_10_01 {
	// メインメソッド
	public static void main(String[] args) {
		// クラス型変数を作りインスタンス化を行う
		Id a = new Id();
		// 2つ目のクラス型変数を作りインスタンス化を行う
		Id b = new Id();

		// クラス型変数aの識別番号がいくつなのか確認する
		System.out.println(Constant.A_IDENTIFICATION_NUMBER + a.getId());
		// クラス型変数bの識別番号がいくつなのか確認する
		System.out.println(Constant.B_IDENTIFICATION_NUMBER + b.getId());

		// Idクラスのカウンターの値をそのまま表示
		System.out.println(Constant.ID_COUNTER + Id.counter);
		// クラス型変数aのインスタンスからカウンターを呼び出す
		System.out.println(Constant.A_COUNTER + a.counter);
		// クラス型変数bのインスタンスからカウンターを呼び出す
		System.out.println(Constant.B_COUNTER + b.counter);

		// いくつのインスタンスが生成されたか識別番号の数を呼び出す
		System.out.println(b.getMaxId());
	}

}
