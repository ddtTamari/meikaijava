/*
  演習14-2		ロボット型ペットクラスRobotPetを拡張した着せ替え可能なロボット型ペットクラスを作成せよ
  演習日		6月29日
  製作者		玉利仁美
 */package e_14_02;

 //スキンを変えるインターフェース
public interface Skinnable {
	//変数BLACKの値を0にする
	int BLACK = 0;
	//変数REDの値を1にする
	int RED = 1;
	//変数GREENの値を2にする
	int GREEN = 2;
	//変数BLUEの値を3にする
	int BLUE = 3;
	//変数LEOPARDの値を4にする
	int LEOPARD = 4;

	//インターフェースを実装しているクラス内にあるchangeSkinのメソッドを定義
	void changeSkin(int skin);
}
