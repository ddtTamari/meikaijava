/*
  演習4-18		1からnまでの整数値の2乗を表示する
  演習日		6月7日
  製作者		玉利仁美
 */
package e_04_18;
import java.util.Scanner;;
public interface e_04_18 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		//ｎの値の入力を促す
		System.out.print("nの値：");
		//ｎをキーボードから入力
		int n = stdIn.nextInt();

		//iがｎ以下の時繰り返し、繰り返すたびにiの値が１つずつ増える
		for(int i = 1; i <= n ; i++){
			//iの２乗の数字を表示する
			System.out.println( i +"の２乗は" + i*i );
		}

	}

}
