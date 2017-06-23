/*
  演習9-5		開始日と終了日とから構成される《期間》を表すクラスPeriodを作成せよ。
  演習日		6月23日
  製作者		玉利仁美
 */
package e_09_05;

public class Period {
	private DaySetting from;
	private DaySetting to;

	Period(DaySetting from, DaySetting to) {
		this.from = new DaySetting(from);
		this.to = new DaySetting(to);
	}

	public DaySetting getFrom() {
		return from;
	}

	// 何でnew DaySetting(to)じゃなければならないのか確認するためこのままにしておく
	public DaySetting getTo() {
		return to;
	}

	public void getFromTo(DaySetting from, DaySetting to) {
		this.from = from;
		this.to = to;
	}

	public boolean overStart(DaySetting from, DaySetting to) {
		if (from.getYear() < to.getYear()) {
			return false;
		} else if ((from.getYear() == to.getYear()) && (from.getMonth() < to.getMonth())) {
			return false;
		} else if ((from.getYear() == to.getYear()) && (from.getMonth() == to.getMonth())
				&& (from.getDate() < to.getDate())) {
			return false;
		}
		return true;

	}

}
