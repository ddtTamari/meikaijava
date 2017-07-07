/*
  演習12-2		定期預金付き銀行口座クラス型変数a,bの普通預金と定期預金残高の合計額を比較した結果を返却するメソッド
  				static int compBalance(Account a,Account b)を作成。合計額がaのほうが多ければ１・等しければ０・bのほうが多ければ‐1を返却すること。
  				定期預金を持たないAccount型のインスタンスであれば、普通預金の金額を比較の対象にすること
  演習日		7月7日
  製作者		玉利仁美
 */
package e_12_02;

//メインクラス
public class e_12_02 {
	//メインメソッド
	public static void main(String[] args) {
		//合計額を比べるためのアカウント型の足立インスタンスの生成
		Account adachi = new Account("足立幸一","123456",1000);
		//合計額を比べるための預金残高を持ったタイムアカウント型の仲田インスタンスの生成
		TimeAccount nakata = new TimeAccount("仲田真二","654321",699,500);

		//足立の口座情報を表示
		System.out.println(adachi.getName()+","+adachi.getNumber()+","+adachi.getBalance());
		//仲田の口座情報を表示
		System.out.println(nakata.getName()+","+nakata.getNumber()+","+nakata.getBalance()+","+nakata.getTimeBalance());

		//口座内の合計金額を比べるメソッドを呼び出し値を表示
		System.out.println(TimeAccount.compBalance(adachi, nakata));

	}


}
