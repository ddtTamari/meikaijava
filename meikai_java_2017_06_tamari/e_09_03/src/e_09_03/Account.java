/*
  演習9-3		第8章で作成した銀行口座クラスに口座開設日のフィールドとtoStringメソッドを追加
  演習日		6月22日
  製作者		玉利仁美
 */
package e_09_03;

//口座のデータがあるクラス
public class Account {
	//口座名義を入れるフィールド
	private String name;
	//口座番号を入れるフィールド
	private String no;
	//預金残高を入れるフィールド
	private long balance;
	//口座開設日を入れるクラス型のフィールド
	private Day accountOpeningDate;

	//口座のコンストラクタとして、名前・口座番号・預金残高・開設日を入れる
	Account(String n, String num, long z, Day accountOpeningDate) {
		//名前フィールドには引数に受け取った名前を代入する
		name = n;
		//口座番号フィールドには引数に受け取った番号を代入する
		no = num;
		//預金残高フィールドには引数に受け取った残高を代入する
		balance = z;
		//口座開設日には引数に受け取った開設日と曜日が入る
		this.accountOpeningDate = new Day(accountOpeningDate);
	}

	//名前を取得するメソッド
	String getName() {
		//名前のを返す
		return name;
	}

	String getNo() {
		return no;
	}

	long getBalance() {
		return balance;
	}

	void deposit(long k) {
		balance += k;
	}

	void withdraw(long k) {
		balance -= k;
	}

	public Day getAccountOpeningDate() {
		return new Day(accountOpeningDate);
	}

}
