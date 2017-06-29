/*
  演習13-1		図形クラス群をテストするプログラムを作成。個々の要素をキーボードから取得できるように
  演習日		6月29日
  製作者		玉利仁美
 */
package e_14_01;

import java.util.Scanner;

public class e_14_01 {
	public static void main(String[] args) {
		// キーボード入力をするため宣言
		Scanner scan = new Scanner(System.in);
		// 何個の図形を表示させるのか図形の個数の入力を促す
		System.out.print("図形は何個：");
		// 表示させる図形の個数の値をキーボードから取得
		int howManyElements = scan.nextInt();
		// キーボードから取得した値分、図形を生成したいのでその長さ分の配列を生成
		Shape[] shapeValue = new Shape[howManyElements];
		//インターフェースを参照するクラスが二個あるので配列にして各クラスで参照できるよう準備する
		Plane2D[] whatShapeRect = new Plane2D[2];

		// 配列の長さ分図形を生成する処理を行うので配列の長さ繰り返し行う
		for (int i = 0; i < howManyElements; i++) {
			// 何の図形を生成するのか入力を促す
			System.out.print((i + 1) + "番の図形の種類(1…点/2…水平直線/3…垂直直線/4…長方形/5…平行四辺形)");
			// 生成する図形の値をキーボードから取得
			int whatShape = scan.nextInt();
			// キーボードから取得した値によって呼び出すクラスを分ける
			switch (whatShape) {
			// 入力された値が1ならば以下の処理を行う
			case 1:
				// ＊を一つ生成するpointクラスを呼び出す
				shapeValue[i] = new Point();
				// switch文から抜け出す
				break;
			// 入力された値が2ならば以下の処理を行う
			case 2:
				// 横一列にいくつーを表示させるのか入力を促す
				System.out.print("幅：");
				// 横一列に表示させるーの数をキーボードから取得する
				int weightHorizon = scan.nextInt();
				// 横にキーボードから入力された値だけーを生成させるクラスを呼び出す
				shapeValue[i] = new HorizonLine(weightHorizon);
				// switch文から抜け出す
				break;
			// 入力された値が3ならば以下の処理を行う
			case 3:
				// 縦にいくつ｜を表示させるのか入力を促す
				System.out.print("高さ：");
				// 縦にいくつ表示させるのかキーボードから値を取得
				int heightVertical = scan.nextInt();
				// ｜をキーボードから取得した値だけ生成を行うクラスを呼び出す
				shapeValue[i] = new VirtLine(heightVertical);
				// switch文から抜け出す
				break;
			// 入力された値が4ならば以下の処理を行う
			case 4:
				// 何×何の四角を生成するのか幅の入力を促す
				System.out.print("幅：");
				// 幅の値をキーボードから取得する
				int weightRect = scan.nextInt();
				// 何×何の四角を生成するのか高さの入力を促す
				System.out.print("高さ：");
				// 高さの値をキーボードから取得
				int heightRect = scan.nextInt();
				// 入力された縦横の長方形の図形の生成を行うクラスを呼び出す
				shapeValue[i] = new Rectangle(weightRect, heightRect);
				//インターフェースから実装クラスのレクトアングルを参照できるようにする
				whatShapeRect[0] = new Rectangle(weightRect, heightRect);
				//四角形の面積を求めるメソッドを呼び出し表示する
				System.out.println("四角形の面積は：" + whatShapeRect[0].getArea());
				// switch文から抜け出す
				break;
			case 5:
				// 何×何の四角を生成するのか幅の入力を促す
				System.out.print("幅：");
				// 幅の値をキーボードから取得する
				int weightParallelogram = scan.nextInt();
				// 何×何の四角を生成するのか高さの入力を促す
				System.out.print("高さ：");
				// 高さの値をキーボードから取得
				int heightParallelogram = scan.nextInt();
				// 入力された縦横の長方形の図形の生成を行うクラスを呼び出す
				shapeValue[i] = new Parallelogram(weightParallelogram, heightParallelogram);
				//インターフェースから実装クラスのレクトアングルを参照できるようにする
				whatShapeRect[1] = new Parallelogram(weightParallelogram, heightParallelogram);
				//四角形の面積を求めるメソッドを呼び出し表示する
				System.out.println("平行四辺形の面積は：" + whatShapeRect[1].getArea());
				// switch文から抜け出す
				break;
			}
		}
		// 要素を一個ずつ走査する
		for (Shape s : shapeValue) {
			// 各要素が呼び出しているクラスから返された値を表示する
			s.print();
			// 一つの要素を表示し終えたので改行する
			System.out.println();
		}
		// ストリームを解放する
		scan.close();
	}
}
