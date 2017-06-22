/*
  演習9-3		第8章で作成した銀行口座クラスに口座開設日のフィールドとtoStringメソッドを追加
  演習日		6月22日
  製作者		玉利仁美
 */
package e_09_03;

public class e_09_03 {
	public static void main(String[] args) {
		Account adachi = new Account("足立幸一", "123456", 1000, new Day(2014, 12, 23));
		Account nakata = new Account("仲田信二", "654321", 200, new Day(2002, 3, 3));

		adachi.withdraw(200);
		nakata.deposit(100);

		System.out.println(Constant.Adachi_Account);
		System.out.println(Constant.Account_Name + adachi.getName());
		System.out.println(Constant.Account_Number + adachi.getNo());
		System.out.println(Constant.Account_Balance + adachi.getBalance());
		System.out.println(Constant.Account_Opening_Date + adachi.getAccountOpeningDate());

		System.out.println();

		System.out.println(Constant.Nakata_Account);
		System.out.println(Constant.Account_Name + nakata.getName());
		System.out.println(Constant.Account_Number + nakata.getNo());
		System.out.println(Constant.Account_Balance + nakata.getBalance());
		System.out.println(Constant.Account_Opening_Date + nakata.getAccountOpeningDate());

	}
}
