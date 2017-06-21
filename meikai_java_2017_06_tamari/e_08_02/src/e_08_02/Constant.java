/*
  演習8-2		carクラスに対して、フィールドやメソッドを自由に追加する
  演習日		6月21日
  製作者		玉利仁美
 */
package e_08_02;

//表示する文字を定数として保管しておくクラス
public class Constant {
	// 車のデータの入力を促すときに呼び出す
	public static final String Car_Date_Prompt = new String("車のデータを入力せよ");
	// 車の名前の入力を促すときに呼び出す
	public static final String Car_Name = new String("名前は：");
	// 車の車幅の入力を促すときに呼び出す
	public static final String Car_Width = new String("車幅は：");
	// 車の高さの入力を促すときに呼び出す
	public static final String Car_Height = new String("高さは：");
	// 車の長さの入力を促すときに呼び出す
	public static final String Car_Length = new String("長さは：");
	// 車のプレートナンバーの入力を促すときに呼び出す
	public static final String Car_Plate_Number = new String("プレートナンバーは：");
	// 車のタンク容量の入力を促すときに呼び出す
	public static final String Car_Fuel_Tank_Capacity = new String("タンク容量は：");
	// 車のガソリン量の入力を促すときに呼び出す
	public static final String Car_Fuel_Remaining_Quantity = new String("ガソリン量は：");
	// 車の燃費の入力を促すときに呼び出す
	public static final String Car_Fuel_Consumption = new String("燃費は：");
	// 車のx方向の移動距離の入力を促すときに呼び出す
	public static final String Car_X_Move_Distance = new String("x方向の移動距離：");
	// 車のy方向の移動距離の入力を促すときに呼び出す
	public static final String Car_Y_Move_Distance = new String("y方向の移動距離：");
	// 車の移動をするかどうかの入力を促すときに呼び出す
	public static final String Car_Move_Continue = new String("移動しますか[0…No/1…Yes]:");
	// 車の燃料が足りないときに呼び出す
	public static final String Car_Nomore_Fuel = new String("燃料が足りません！！");
	// 車の給油するかどうかを促すときに呼び出す
	public static final String Car_Fuel_Refill = new String("給油しますか？[0…No/1…Yes]:");
	// 車のどれぐらい給油するかの値の入力を促すときに呼び出す
	public static final String Car_Howmany_Add = new String("どれくらい給油しますか：");
	// 車のガソリンがタンク容量より大きくなってしまったときに呼び出す
	public static final String Car_Over_Fuel = new String("ガソリンが溢れました！\nガソリンは満タンになりました。");
	// 車が確率で事故を起こしてしまったときに呼び出す
	public static final String Car_Crash = new String("車が事故を起こしてしまった！！");

}
