/*
  演習9-5		開始日と終了日とから構成される《期間》を表すクラスPeriodを作成せよ。
  演習日		6月23日
  製作者		玉利仁美
 */
package e_09_05;

//期間を表すクラス
public class Period {
	// 期間の開始日
	private DaySetting from;
	// 期間の終了日
	private DaySetting to;

	// コンストラクタに開始日と終了日でインスタンスを初期化
	Period(DaySetting from, DaySetting to) {
		// 開始日フィールドに引数のdaysetting型のインスタンスを代入
		this.from = new DaySetting(from);
		// 終了日フィールドに引数のdaysetting型のインスタンスを代入
		this.to = new DaySetting(to);
	}

	// 開始日を取得するメソッド
	public DaySetting getFrom() {
		// 開始日を返す
		return new DaySetting(from);
	}

	// 終了日を取得するメソッド
	public DaySetting getTo() {
		// 終了日を返す
		return new DaySetting(to);
	}

	// 開始日を設定するメソッド
	void setFrom(DaySetting from) {
		// 開始日をあとから値を入れるとき引数を代入する
		this.from = from;
	}

	// 終了日を設定するメソッド
	void setTo(DaySetting to) {
		// 終了日を後から値を入れるとき引数を代入する
		this.to = to;
	}

	// 開始終了日を設定するメソッド
	void setFromTo(DaySetting from, DaySetting to) {
		// あとからまとめて変えたいときに引数を代入する
		this.from = from;
		// あとから開始日終了日を変えたいときに引数を代入する
		this.to = to;
	}

	// 開始日終了日を引数として受け取り、終了日のほうが開始日よりも早ければfalseの処理に移行させるメソッド
	public boolean overStart(DaySetting from, DaySetting to) {
		// 開始年より終了年のほうが小さければfalseを返す
		if (from.getYear() > to.getYear()) {
			// falseの処理にいく
			return false;
			// 開始年が終了年と同じでかつ、月が開始日より大きいときfalseを返す
		} else if ((from.getYear() == to.getYear()) && (from.getMonth() > to.getMonth())) {
			// falseの処理に行く
			return false;
			// 開始と終了の年と月が一緒で終了日の日にちが開始日より大きいときfalseを返す
		} else if ((from.getYear() == to.getYear()) && (from.getMonth() == to.getMonth())
				&& (from.getDate() > to.getDate())) {
			// falseの処理に行く
			return false;
		}
		// 開始日より終了日のほうが遅ければtrueを返す
		return true;

	}

}
