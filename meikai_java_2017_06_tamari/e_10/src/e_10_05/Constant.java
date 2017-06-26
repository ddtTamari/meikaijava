/*
  演習10-5		インスタンスが生成されるたび『明解銀行での口座開設ありがとうございます。』と表示するように、
  				銀行口座クラスAccountを変更せよ。表示のタイミングはインスタンス初期化子で行うこと
  演習日		6月26日
  製作者		玉利仁美
 */
package e_10_05;

//文字列を定数として格納しておくためのクラス
public class Constant {
	// 足立君の口座情報であることを表示するときに使う
	public static final String ADACHI_ACCOUNT_DISPLAY = new String("■足立君の口座");
	// 仲田君の口座情報であることを表示するときに使う
	public static final String NAKATA_ACCOUNT_DISPLAY = new String("■仲田君の口座");
	// 口座名義を表示するときに使う
	public static final String ACCOUNT_NAME = new String("  口座名義：");
	// 口座番号を表示するときに使う
	public static final String ACCOUNT_NUMBER = new String("  口座番号：");
	// 預金残高を表示するときに使う
	public static final String ACCOUNT_BALANCE = new String("  預金残高：");
	// 識別番号を表示するときに使う
	public static final String ID_NUMBER = new String("  識別番号：");
	// インスタンスを生成するときにお礼をするため使う
	public static final String SAY_THANKS = new String("明解銀行での口座開設ありがとうございます。");
	// 足立君の名前を表示するときに使う
	public static final String ADACHI_NAME = new String("足立幸一");
	// 仲田君の名前を表示するときに使う
	public static final String NAKATA_NAME = new String("仲田真二");
	// 足立君の口座番号を表示するときに使う
	public static final String ADACHI_ACCOUNT_NUMBER = new String("123456");
	// 仲田君の口座番号を表示するときに使う
	public static final String NAKATA_ACCOUNT_NUMBER = new String("654321");
}
