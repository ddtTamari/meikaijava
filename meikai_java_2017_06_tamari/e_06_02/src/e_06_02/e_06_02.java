/*
  演習6-2		要素型がint型で要素数が5の配列の要素に5.4.3.2.1を代入、表示
  演習日		6月8日
  製作者		玉利仁美
 */
package e_06_02;

public interface e_06_02 {

	public static void main(String[] args){
		//int型の要素数が5つある配列を生成
		int[] a = new int[5];

		//要素数の数の分だけ繰り返す
		for(int i = 0; i < a.length ; i++){
			//要素の中に要素数-iの値を代入
			a[i] = a.length -i;
			//各要素の値を表示
			System.out.println("a[" + i + "] = " +  a[i]);
		}
	}

}
