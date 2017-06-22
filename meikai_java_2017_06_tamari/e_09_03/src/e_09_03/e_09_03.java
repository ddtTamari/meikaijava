/*
  演習9-3		第8章で作成した銀行口座クラスに口座開設日のフィールドとtoStringメソッドを追加
  演習日		6月22日
  製作者		玉利仁美
 */
package e_09_03;

//メインクラス
public class e_09_03 {
	// メインメソッド
	public static void main(String[] args) {
		// 足立君の口座の情報を入れたインスタンスを生成
		Account adachi = new Account("足立幸一", "123456", 1000, new Day(2014, 12, 23));
		// 仲田君の口座の情報を入れたインスタンスを生成
		Account nakata = new Account("仲田信二", "654321", 200, new Day(2002, 3, 3));

		// 足立君は200円引き出す(お金を引き落とすメソッドの呼び出し)
		adachi.withdraw(200);
		// 仲田君は100円預入をした(お金を預入するメソッドの呼び出し)
		nakata.deposit(100);

		// 足立君の口座であることを表示
		System.out.println(Constant.Adachi_Account);
		// 足立君の口座名を表示
		System.out.println(Constant.Account_Name + adachi.getName());
		// 足立君の口座番号を表示
		System.out.println(Constant.Account_Number + adachi.getNo());
		// 足立君の預金残高を表示
		System.out.println(Constant.Account_Balance + adachi.getBalance());
		// 足立君の口座開設日を表示
		System.out.println(Constant.Account_Opening_Date + adachi.getAccountOpeningDate());

		// 足立君と仲田君を分けるため改行
		System.out.println();

		// 仲田君の口座であることを表示
		System.out.println(Constant.Nakata_Account);
		// 仲田君の口座名を表示
		System.out.println(Constant.Account_Name + nakata.getName());
		// 仲田君の口座番号を表示
		System.out.println(Constant.Account_Number + nakata.getNo());
		// 仲田君の預金残高を表示
		System.out.println(Constant.Account_Balance + nakata.getBalance());
		// 仲田君の口座開設日を表示
		System.out.println(Constant.Account_Opening_Date + nakata.getAccountOpeningDate());

	}
}
