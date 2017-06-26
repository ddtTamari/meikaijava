/*
  演習11-1		p.356ページのクラスDateIdをパッケージidに所属させるように書き換える。なお、クラスDateIdTesterは無名パッケージに所属させること。
  演習日		6月26日
  製作者		玉利仁美
 */

//DateIdと同一パッケージ内にDateIdTesterがないためインポートしないと単純名でDateIdを呼び出すことができない
import id.DateId;

//DateIdを試すためのクラス
public class DateIdTester {
	// メインメソッド
	public static void main(String[] args) {
		// DateId型変数aを生成引数に何も入力しない場合今日の日付が入る
		DateId a = new DateId();
		// DateId型変数bを生成引数に何も入力しない場合今日の日付が入る
		DateId b = new DateId();
		// DateId型変数cを生成引数に何も入力しない場合今日の日付が入る
		DateId c = new DateId();

		// 識別番号がちゃんとインスタンスが生成されたときに増えているのか確かめる
		System.out.println("aの識別番号：" + a.getId());
		// 識別番号がちゃんとインスタンスが生成されたときに増えているのか確かめる
		System.out.println("bの識別番号：" + b.getId());
		// 識別番号がちゃんとインスタンスが生成されたときに増えているのか確かめる
		System.out.println("cの識別番号：" + c.getId());
	}
}
