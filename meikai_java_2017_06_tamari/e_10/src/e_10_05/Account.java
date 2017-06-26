/*
  演習10-5		インスタンスが生成されるたび『明解銀行での口座開設ありがとうございます。』と表示するように、
  				銀行口座クラスAccountを変更せよ。表示のタイミングはインスタンス初期化子で行うこと
  演習日		6月26日
  製作者		玉利仁美
 */
package e_10_05;

//口座の情報を扱うクラス
public class Account {
	// 何回インスタンスを生成したのかカウントする変数
	private static int counter = 0;
	// 口座名義を入れる変数
	private String name;
	// 口座番号を入れる変数
	private String accountNumber;
	// 預金残高を入れる変数
	private long balance;
	// 各インスタンスの識別番号
	private int id;

	{
		// インスタンス初期化子でインスタンスが生成されるたび表示される
		System.out.println(Constant.SAY_THANKS);
	}

	// Accountクラスを使うならば最低でもこの三つの変数を引数として渡さなければならない
	public Account(String name, String accountNumber, long balance) {
		// 与えられた引数で口座名義を初期化
		this.name = name;
		// 与えられた引数で口座番号を初期化
		this.accountNumber = accountNumber;
		// 与えられた引数で預金残高を初期化
		this.balance = balance;
		// インスタンスが生成されると識別番号を1増やす
		id = ++counter;
	}

	// 口座名義を取得するメソッド
	public String getName() {
		// 口座名義を返す
		return name;
	}

	// 口座番号を取得するメソッド
	public String getAccountNumber() {
		// 口座番号を返す
		return accountNumber;
	}

	// 預金残高を取得するメソッド
	public long getBalance() {
		// 預金残高を返す
		return balance;
	}

	// 識別番号を返すメソッド
	public int getId() {
		// 識別番号を返す
		return id;
	}

	// 預入をするメソッド
	public void deposit(long addMoney) {
		// 預金残高に引数として受け取った値を足す
		balance += addMoney;
	}

	// 引き下ろしをするメソッド
	public void withdraw(long subtractMoney) {
		// 預金残高から引数として受け取った値を引く
		balance -= subtractMoney;
	}

}
