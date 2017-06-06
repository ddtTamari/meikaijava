/*
 	演習3-1	整数値を読み込みその絶対値を求めて表示する
	制作日時	6月5日
	制作者	玉利仁美

*/
package e_03_01;
import java.util.Scanner;
public interface e_03_01 {
	public static void main(String[] args){
	Scanner stdIn = new Scanner(System.in);

	//整数値の入力を促す
	System.out.print("整数値：");
	//変数ｎにキーボードから入力
	int n = stdIn.nextInt();

	//ｎが0以上の時、ｎの値をそのまま返す
	 if (n >= 0)
		System.out.println("その絶対値は" + n + "です。");
	 //ｎが負の数の時、ｎを正の数に直し表示する
	 else if(n < 0)
			System.out.println("その絶対値は" + n * (-1)+ "です。");


	}


}
