/*
  演習8-1		名前・身長・体重などをメンバとして持つ《人間クラス》を作成せよ(フィールドやメソッドなどは自分で自由に設計すること)
  演習日		6月21日
  製作者		玉利仁美
 */
package e_08_01;

public class e_08_01 {
	public static void main(String[] args) {
		HumanClass hatakeyama = new HumanClass("畠山和洋", 34, "男", "日本", 180.0f, 96.0f);
		HumanClass balentien = new HumanClass("ウラディミール・バレンティン", 32, "男", "オランダ", 185.0f, 100.0f);
		HumanClass yoshida = new HumanClass("吉田沙保里", 34, "女", "日本", 156.0f, 55.0f);

		hatakeyama.putHumanSpec();
		System.out.println();
		balentien.putHumanSpec();
		System.out.println();
		yoshida.putHumanSpec();

	}
}
