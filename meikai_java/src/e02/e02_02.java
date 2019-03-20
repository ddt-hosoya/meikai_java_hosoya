package e02;
/*
演習2-2
三つのint型変数に値を代入し、合計と平均を求めるプログラムを作成せよ。
 */
public class e02_02 {
	public static void main(String[] args){
		//int型変数、x,y,zを宣言する
		int x;
		int y;
		int z;

		//int型変数x,y,zそれぞれに整数値を代入する。
		x = 55;
		y = 123;
		z = 98;

		//変数x,y,zの合計値を表示する
		System.out.println("合計は" + (x + y + z) + "です。");
		//変数x,y,zの平均値を表示する
		System.out.println("平均は" + (x + y + z)/3 + "です。");

	}

}
