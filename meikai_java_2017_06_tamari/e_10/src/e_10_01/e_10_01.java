/*
  演習10-1		連番クラスIDに最後に与えた識別番号を返すクラスメソッドgitMaxIdを追加。
  演習日		6月23日
  製作者		玉利仁美
 */
package e_10_01;

public class e_10_01 {
	public static void main(String[] args) {
		Id a = new Id();
		Id b = new Id();

		System.out.println(Constant.A_IDENTIFICATION_NUMBER + a.getId());
		System.out.println(Constant.B_IDENTIFICATION_NUMBER + b.getId());

		System.out.println(Constant.ID_COUNTER + Id.counter);
		System.out.println(Constant.A_COUNTER + a.counter);
		System.out.println(Constant.B_COUNTER + b.counter);

		System.out.println(b.getMaxId());
	}

}
