/*
 	演習3-8	点数に応じた評価を判定するプログラム
	制作日時	6月5日
	制作者	玉利仁美

*/
package e_03_08;
import java.util.Scanner;
public interface e_03_08 {

	public static void main(String[] args){
	Scanner stdIn = new Scanner(System.in);

	System.out.print("点数：");
	int score = stdIn.nextInt();

	//点数が0～59点の場合、不可
	if(score >= 0 && score <60)
		System.out.println("不可");
	//点数が60~69点の場合、可
	else if (score >= 60 && score <70)
		System.out.println("可");
	//点数が70~79点の場合、良
	else if (score >=70 && score <80)
		System.out.println("良");
	//点数が80~100点の場合、優
	else if(score >=80 && score <=100)
		System.out.println("優");
	//それ以外の点数の場合、判定外
	else
		System.out.println("判定外");

	}
}
