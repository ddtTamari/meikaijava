/*
  演習6-19		クラス数・各クラスの人数・全員の点数を読み込み合計点と平均点を求めるプログラム
  				合計平均は、クラスごとのものと全体のものとを表示
  演習日		6月15日
  製作者		玉利仁美
 */
package e_06_19;

import java.util.Scanner;

public class e_06_19 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// クラスごとに、各個人の点数を入れておく配列変数を生成
		int[][] score;
		// クラスがいくつあるかで行数を決めるのでクラス数の入力を促す
		System.out.print("クラス数：");
		// クラスの数がいくつあるかキーボードから値を取得する
		int classCount = scan.nextInt();
		// クラスの数の分だけ、配列scoreの構成要素を作る
		score = new int[classCount][];

		// クラス数と次の文との間に見やすいよう空行を生成
		System.out.println();
		// 各クラスの人数分、score[classCount]の各行に要素を生成するので、クラスの人数の変数を生成する
		int classMember = 0;

		// 各クラスの人数と点数の値を入力したいのでクラス数の分だけ繰り返す
		for (int i = 0; i < score.length; i++) {
			//各組の人数がscoreの各行の要素数になるので各組の人数の入力を促す
			System.out.print((i + 1) + "組の人数：");
			//各組の人数をキーボードから取得
			classMember = scan.nextInt();
			//各行に要素数としてクラスの人数の値を代入する
			score[i] = new int[classMember];
			//各行の要素に点数として値を入力するので、各行の要素数の分だけ繰り返す
			for (int j = 0; j < score[i].length; j++) {
				//配列scoreのi行目のj列目が個人の点数の値を入れる場所なので、各行列に点数の値の入力を促す
				System.out.print((i + 1) + "組" + (j + 1) + "番の点数：");
				//何クラスの何番目の人が何点取ったのかキーボードから取得
				score[i][j] = scan.nextInt();
			}
			//一クラス分の点数の入力が終わったので見やすいよう改行
			System.out.println();
		}

		//各クラス分合計点の値がほしいので、要素数がクラス数と同じの配列sumを生成
		int sum[] = new int[classCount];
		//各クラス分平均点の値がほしいので、要素数がクラス数と同じの配列averageを生成
		float average[] = new float[classCount];
		//各クラスごとに合計点を知りたいので、行数分繰り返しを行う
		for (int i = 0; i < score.length; i++) {
			//各クラスの合計点を求めたいので、各クラスの人数分の繰り返しを行う
			for (int j = 0; j < score[i].length; j++) {
				//各クラスの人の点数を足していく
				sum[i] += score[i][j];
			}
			//各クラスの合計点を、各クラスの人数で割って平均点を出す、この時averageはfloat型なので、割る数をfloat型に変換してから割る
			average[i] = sum[i] / (score[i].length * 1.0f);
		}


		int total = 0;	//全体の合計点を入れる変数を生成
		float totalAverage = 0;	//全体の平均点を入れる変数を生成

		//何組の合計と平均なのか見やすいよう間隔をあけて表示
		System.out.print("　組　|　　合計　　平均\n");
		//表に見えるよう区切りを表示
		System.out.print("------+-----------------\n");
		//各クラスの合計点平均点を表示したいので、各クラス分だけ表示するよう繰り返す
		for (int i = 0; i < score.length; i++) {
			//何組の点数なのか表示し、間隔を揃えるため最低でも7桁で合計点を、9桁(小数点第1位まで)で平均点を表示
			System.out.printf(" " + (i + 1) + "組　|%7d%9.1f", sum[i], average[i]);
			//一クラス目の表示が終わったので改行する
			System.out.println();
			//各クラスの合計点を、全体の合計点として代入
			total += sum[i];
			//各クラスの平均点を足したものを、totalAverageに代入する、
			totalAverage += average[i];
		}
		//見やすいように区切りを表示
		System.out.print("------+-----------------\n");

		//合計としてわかるように計と表示し、全体の合計点であるtotalを最低でも7桁で表示、
		//平均点の合計であるtotalAverageをクラスの数で割って全体の平均点として最低でも9桁で表示
		System.out.printf("　計　|%7d%9.1f", total, (totalAverage / score.length));

		//ストリームを解放
		scan.close();
	}
}
