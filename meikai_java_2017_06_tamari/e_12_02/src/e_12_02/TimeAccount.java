/*
  演習12-2		定期預金付き銀行口座クラス型変数a,bの普通預金と定期預金残高の合計額を比較した結果を返却するメソッド
  				static int compBalance(Account a,Account b)を作成。合計額がaのほうが多ければ１・等しければ０・bのほうが多ければ‐1を返却すること。
  				定期預金を持たないAccount型のインスタンスであれば、普通預金の金額を比較の対象にすること
  演習日		7月7日
  製作者		玉利仁美
 */
package e_12_02;

//口座を意味するAccountクラスの定期預金残高を追加した派生クラスタイムアカウント
public class TimeAccount extends Account {
	//定期預金残高を用意
	private long timeBalance = 0;

	//タイムアカウントでは、アカウントのフィールドに定期預金残高を追加したコンストラクタ
	TimeAccount(String name, String number, long balance, long timeBalance) {
		//アカウントの値を受け取る
		super(name, number, balance);
		//タイムアカウントで追加した定期預金残高を受け取る
		this.timeBalance = timeBalance;
	}

	//定期預金残高の値を取得するメソッド
	public long getTimeBalance() {
		//定期預金残高を返す
		return timeBalance;
	}

	//受け取ったアカウント型インスタンスの残高を比べて値を返すメソッド
	public static int compBalance(Account a, Account b) {
		//アカウントAの合計残高
		long totalTimeAccountA;
		//アカウントBの合計残高
		long totalTimeAccountB;

		//アカウントAがタイムアカウントの時、定期預金残高も計算しなければならないのでその処理のためのif文
		if (a instanceof TimeAccount) {
			//合計残高は普通預金と定期預金の合計額になる
			totalTimeAccountA = a.getBalance() + ((TimeAccount) a).getTimeBalance();
			//タイムアカウント型でなければ定期預金残高は考慮しなくていいのでその処理を行う
		} else {
			//合計残高は普通預金がそのまま入る
			totalTimeAccountA = a.getBalance();
		}
		//アカウントBがタイムアカウントの時、定期預金残高も計算しなければならないのでその処理のためのif文
		if (b instanceof TimeAccount) {
			//合計残高は普通預金と定期預金の合計額になる
			totalTimeAccountB = b.getBalance() + ((TimeAccount) b).getTimeBalance();
			//タイムアカウント型でなければ定期預金残高は考慮しなくていいのでその処理を行う
		} else {
			//合計残高は普通預金がそのまま入る
			totalTimeAccountB = b.getBalance();
		}

		//合計残高の比較を行い口座Aのほうが口座Bより小さければ
		if (totalTimeAccountA < totalTimeAccountB) {
			//－1を返す
			return -1;
			//口座Aのほうが口座Bより大きければ
		} else if (totalTimeAccountA > totalTimeAccountB) {
			//1を返す
			return 1;
		}
		//そうでなければ合計は同じなので0を返す
		return 0;
	}
}
