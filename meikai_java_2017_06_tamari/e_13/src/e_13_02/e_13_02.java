/*
  演習13-2		図形クラス群に対して、直角二等辺三角形を表すクラス群を追加せよ。
  				直角二等辺三角形を表す抽象クラスを作りそこから個々のクラスを派生して作ること。
  演習日		6月30日
  製作者		玉利仁美
 */
package e_13_02;

import java.util.Scanner;
//メインクラス
public class e_13_02 {
	//メインメソッド
	public static void main(String[] args) {
		// キーボード入力をするため宣言
		Scanner scan = new Scanner(System.in);
		// 何個の図形を表示させるのか図形の個数の入力を促す
		System.out.print("図形は何個：");
		// 表示させる図形の個数の値をキーボードから取得
		int howManyElements = scan.nextInt();
		// キーボードから取得した値分、図形を生成したいのでその長さ分の配列を生成
		Shape[] shapeValue = new Shape[howManyElements];

		// 配列の長さ分図形を生成する処理を行うので配列の長さ繰り返し行う
		for (int i = 0; i < howManyElements; i++) {
			// 何の図形を生成するのか入力を促す
			System.out.print((i + 1) + "番の図形の種類(1…点/2…水平直線/3…垂直直線/4…直角二等辺三角形/5…長方形)");
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
				System.out.print("辺の長さ：");
				// 幅の値をキーボードから取得する
				int weightTriangle = scan.nextInt();
				// どこが直角の三角形なのか質問する
				System.out.print((i + 1) + "番の三角の種類(1…左上が直角/2…左下が直角/3…右上が直角/4…右下が直角)");
				// 度の三角形を表示するのかキーボードから入力
				int whatTriangle = scan.nextInt();
				// 入力された番号によって表示する三角形の各クラスを呼び出す
				switch (whatTriangle) {
				// 1が入力されたら左上が直角の三角形
				case 1:
					// 左上が直角の三角形を生成するクラスを呼び出す
					shapeValue[i] = new LeftUp(weightTriangle);
					// switch文から抜け出す
					break;
				// 2が入力されたら左下が直角の三角形
				case 2:
					// 左下が直角の三角形を生成するクラスを呼び出す
					shapeValue[i] = new LeftBottom(weightTriangle);
					// switch文から抜け出す
					break;
				// 3が入力されたら右上が直角の三角形
				case 3:
					// 右上が直角の三角形を生成するクラスを呼び出す
					shapeValue[i] = new RightUp(weightTriangle);
					// switch文から抜け出す
					break;
				// 4が入力されたら右下が直角の三角形
				case 4:
					// 右下が直角の三角形を生成するクラスを呼び出す
					shapeValue[i] = new RightBottom(weightTriangle);
					// switch文から抜け出す
					break;
				// 想定されてない値が入力されたら
				default:
					// デフォルトで左上直角の三角形を生成
					shapeValue[i] = new LeftUp(weightTriangle);
					// switch文から抜け出す
					break;
				}

				// switch文から抜け出す
				break;

			case 5:
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
