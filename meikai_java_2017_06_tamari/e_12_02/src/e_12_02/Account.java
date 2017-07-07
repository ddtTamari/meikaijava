/*
  演習12-2		定期預金付き銀行口座クラス型変数a,bの普通預金と定期預金残高の合計額を比較した結果を返却するメソッド
  				static int compBalance(Account a,Account b)を作成。合計額がaのほうが多ければ１・等しければ０・bのほうが多ければ‐1を返却すること。
  				定期預金を持たないAccount型のインスタンスであれば、普通預金の金額を比較の対象にすること
  演習日		7月7日
  製作者		玉利仁美
 */
package e_12_02;

//口座情報を入れるクラス
public class Account {
	//名前を入れるためのフィールド
	private String name;
	//口座番号を入れるためのフィールド
	private String number;
	//普通預金を入れるためのフィールド
	private long balance;

	//口座の情報は、名前・口座番号・普通預金をいれなければならない
	Account(String name, String number, long balance) {
		//名前を引数から受け取る
		this.name = name;
		//口座番号を引数から受け取る
		this.number = number;
		//普通預金を引数から受け取る
		this.balance = balance;
	}

	//名前を取得するメソッド
	public String getName() {
		//名前を返す
		return name;
	}

	//口座番号を取得するメソッド
	public String getNumber() {
		//口座番号を返す
		return number;
	}

	//普通預金残高を返すメソッド
	public long getBalance() {
		//残高の値を返す
		return balance;
	}


}
