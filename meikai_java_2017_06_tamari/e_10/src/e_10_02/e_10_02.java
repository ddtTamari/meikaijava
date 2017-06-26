/*
  演習10-2		連番クラスIDに最後に与えた識別番号を返すクラスメソッドgitMaxExIdを追加。
  演習日		6月23日
  製作者		玉利仁美
 */
package e_10_02;

public class e_10_02 {
	public static void main(String[] args) {
		// クラス型変数を作りインスタンス化を行う
		ExId a = new ExId();
		// 2つ目のクラス型変数を作りインスタンス化を行う
		ExId b = new ExId();
		// 3つ目のクラス型変数を作りインスタンス化を行う
		ExId c = new ExId();
		// 識別番号を4個ずつ増やすように設定する
		c.setAddIdNumber(4);
		// 4つ目のクラス型変数を作りインスタンス化を行う
		ExId d = new ExId();
		// 5つ目のクラス型変数を作りインスタンス化を行う
		ExId e = new ExId();

		// クラス型変数aの識別番号がいくつなのか確認する
		System.out.println(Constant.A_IDENTIFICATION_NUMBER + a.getId());
		// クラス型変数bの識別番号がいくつなのか確認する
		System.out.println(Constant.B_IDENTIFICATION_NUMBER + b.getId());
		// クラス型変数cの識別番号がいくつなのか確認する
		System.out.println(Constant.C_IDENTIFICATION_NUMBER + c.getId());
		// クラス型変数dの識別番号がいくつなのか確認する
		System.out.println(Constant.D_IDENTIFICATION_NUMBER + d.getId());
		// クラス型変数eの識別番号がいくつなのか確認する
		System.out.println(Constant.E_IDENTIFICATION_NUMBER + e.getId());
		// 個々の識別番号がちゃんと表示されているのかもう一度dの識別番号を表示する
		System.out.println(Constant.D_IDENTIFICATION_NUMBER + d.getId());

	}
}
