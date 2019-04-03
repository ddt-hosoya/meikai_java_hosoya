package e02;

/*
演習2-2
三つのint型変数に値を代入し、合計と平均を求めるプログラムを作成せよ。
 */
public class e02_02 {
	public static void main(String[] args) {
		// int型変数を宣言する
		int integer_first;
		int integer_second;
		int integer_third;

		// int型変数をそれぞれに整数値を代入する。
		integer_first = 55;
		integer_second = 123;
		integer_third = 98;

		// 3つの変数の合計値を表示する
		System.out.println("合計は" + (integer_first + integer_second + integer_third) + "です。");
		// 3つの変数の平均値を表示する
		System.out.println("平均は" + (integer_first + integer_second + integer_third) / 3 + "です。");

	}

}
