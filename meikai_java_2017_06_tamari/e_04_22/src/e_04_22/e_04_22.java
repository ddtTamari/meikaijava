/*
  演習4-22		n段のピラミッドを表示するプログラムを生成
  演習日		6月7日
  製作者		玉利仁美
 */package e_04_22;
import java.util.Scanner;
public interface e_04_22 {

	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		//ｎ段の入力を促す
		System.out.print("n段：");
		//nの値をキーボードから取得
		int n = stdIn.nextInt();

		//ｎ回繰り返す
		for(int i =1 ; i <= n; i++){

			//n-1回空白を生成する
			for(int j = 1 ; j <=  n-i ; j++){
				//空白を生成
				System.out.print(" ");
			}
			//(i-1)*2+1個*を生成する
			for(int t = 1 ; t <= (i-1) * 2 + 1 ; t++){
				//*を生成する
				System.out.print('*');
			}
			//空白を生成する
			System.out.println();
		}

	}

}
