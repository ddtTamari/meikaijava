/*
  演習4-9　		正の整数値nを読み込んで、1からnまでの積を求めるプログラムを作成
  演習日		6月6日
  製作者		玉利仁美
 */
package e_04_09;
import java.util.Scanner;
public interface e_04_09 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		int n;
		//正の整数が入るまで繰り返し入力を求める
		do {
			System.out.print("nの値:");
			n = stdIn.nextInt();
		}while (n <= 0);

		int pro = 1;  //積
		int i = 1;

		//iがｎ以下の場合、proにiをかけ、iに1ずつ足していく
		while(i <= n){
			pro *= i;
			i++;

		}
		//積を表示
		System.out.println("1から"+ n + "までの積は"+ pro + "です。");
	}

}
