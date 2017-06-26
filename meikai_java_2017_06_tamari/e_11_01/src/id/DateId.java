/*
  演習11-1		p.356ページのクラスDateIdをパッケージidに所属させるように書き換える。なお、クラスDateIdTesterは無名パッケージに所属させること。
  演習日		6月26日
  製作者		玉利仁美
 */
//パッケージid内のものなら単純名でアクセスできる
package id;

//Java内のutil、calendarパッケージ内にあるクラスをオンデマンド型インポートしている
import static java.util.Calendar.*;

//java.util内のグレゴリオcalendarクラスをインポート
import java.util.GregorianCalendar;

//日付と識別番号を付けるクラス
public class DateId {
	// いくつインスタンス化されたかを求めるためのクラス変数
	private static int counter;

	// 各インスタンスの識別番号を格納するフィールド
	private int id;

	// クラス初期化子なのでインスタンスを生成した際には中の処理ですべて初期化されている
	static {
		// グレゴリオカレンダークラス型変数を生成
		GregorianCalendar today = new GregorianCalendar();
		// グレゴリオカレンダークラス内のgetメソッドを呼び出す
		int y = today.get(YEAR);
		// グレゴリオカレンダークラス内のgetメソッドを呼び出す
		int m = today.get(MONTH);
		// グレゴリオカレンダークラス内のgetメソッドを呼び出す
		int d = today.get(DATE);

		// 今日の日付を表示
		System.out.printf("今日は%4d年%02d月%02d日です。\n", y, m, d);
		// 今日の日付足す2桁の10桁の数字をカウンターにとっておく
		counter = y * 1000000 + m * 10000 + d * 100;
	}

	// コンストラクタなのでインスタンスが生成されるたびcounterの値を一つずつ多くし識別番号を分ける
	public DateId() {
		// 識別番号を増やし何番目に生成されたインスタンスなのかわかるようにする
		id = ++counter;
	}

	// 識別番号を取得する
	public int getId() {
		// 識別番号を返す
		return id;
	}

}
