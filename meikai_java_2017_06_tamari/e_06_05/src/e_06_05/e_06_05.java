/*
  演習6-4		立て向きの棒グラフで表示するプログラム
  演習日		6月8日
  製作者		玉利仁美
 */
package e_06_05;
import java.util.Scanner;
public interface e_06_05 {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		System.out.print("要素数：");
		int x = stdIn.nextInt();

		int[] a = new int[x];

		for(int i = 0; i < x ; i++){
			System.out.print("a[" + i + "] = " );
			a[i] = stdIn.nextInt();

		}
		System.out.print("a = {"  );
		for(int i = 0; i < x ; i++){

			if(i != x-1 ){
				System.out.print(a[i]+ ",");
			}else{
				System.out.print(a[i] + "}");
			}
		}

	}
}
