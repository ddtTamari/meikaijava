/*
  演習10-5		インスタンスが生成されるたび『明解銀行での口座開設ありがとうございます。』と表示するように、
  				銀行口座クラスAccountを変更せよ。表示のタイミングはインスタンス初期化子で行うこと
  演習日		6月26日
  製作者		玉利仁美
 */
package e_10_05;

public class e_10_05 {
	// メインメソッド
	public static void main(String[] args) {

		// 足立君の口座を生成
		Account adachi = new Account(Constant.ADACHI_NAME, Constant.ADACHI_ACCOUNT_NUMBER, 1000);

		// 足立君の口座であることを明示する
		System.out.println(Constant.ADACHI_ACCOUNT_DISPLAY);
		// 足立君の口座名義を表示する
		System.out.println(Constant.ACCOUNT_NAME + adachi.getName());
		// 足立君の口座番号を表示する
		System.out.println(Constant.ACCOUNT_NUMBER + adachi.getAccountNumber());
		// 足立君の預金残高を表示する
		System.out.println(Constant.ACCOUNT_BALANCE + adachi.getBalance());
		// 足立君の口座のインスタンスが作られた識別番号を表示する
		System.out.println(Constant.ID_NUMBER + adachi.getId());

		// 足立君の口座と仲田君の口座を分けるため改行
		System.out.println();

		// 仲田君の口座を生成
		Account nakata = new Account(Constant.NAKATA_NAME, Constant.NAKATA_ACCOUNT_NUMBER, 200);

		// 仲田君の口座であることを明示する
		System.out.println(Constant.NAKATA_ACCOUNT_DISPLAY);
		// 仲田君の口座名義を表示する
		System.out.println(Constant.ACCOUNT_NAME + nakata.getName());
		// 仲田君の口座番号を表示する
		System.out.println(Constant.ACCOUNT_NUMBER + nakata.getAccountNumber());
		// 仲田君の預金残高を表示する
		System.out.println(Constant.ACCOUNT_BALANCE + nakata.getBalance());
		// 仲田君の口座のインスタンスが作られた識別番号を表示する
		System.out.println(Constant.ID_NUMBER + nakata.getId());
	}
}
