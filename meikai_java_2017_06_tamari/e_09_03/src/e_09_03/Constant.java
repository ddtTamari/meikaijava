/*
  演習9-3		第8章で作成した銀行口座クラスに口座開設日のフィールドとtoStringメソッドを追加
  演習日		6月22日
  製作者		玉利仁美
 */
package e_09_03;

//表示する文字列を定数として保管しておくクラス
public class Constant {
	// 足立君口座を表示する際に使用
	public static final String Adachi_Account = new String("■足立君の口座");
	// 仲田君の口座を表示する際に使用
	public static final String Nakata_Account = new String("■仲田君の口座");
	// 口座名義を表示する際に使用
	public static final String Account_Name = new String("口座名義：");
	// 口座番号を表示する際に使用
	public static final String Account_Number = new String("口座番号：");
	// 預金残高を表示する際に使用
	public static final String Account_Balance = new String("預金残高：");
	// 口座開設日を表示する際に使用
	public static final String Account_Opening_Date = new String("口座開設日：");

}
