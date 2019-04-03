package e02;

/*
演習2-1
List2-6の[2]の箇所を、小数部を持つ実数値をxとyに代入するように変更して、その結果を考察せよ。
(補足:変数名をx,y以外に変更しています。)
 */
public class e02_01 {
	public static void main(String[] args) {
		// int型変数の宣言
		int integer_first;
		// int型変数の宣言
		int integer_second;

		// 変数xに実数値を代入する
		integer_first = 63.5;
		// 変数yに実数値を代入する
		integer_second = 18.2;

		// integer_firstの値を文字列型で表示する
		System.out.println("xの値は" + integer_first + "です。");
		// integer_secondの値を文字列型で表示する
		System.out.println("integer_secondの値は" + integer_second + "です。");
		// integer_firstとinteger_secondの合計を文字列型で表示する
		System.out.println("合計は" + (integer_first + integer_second) + "です。");
		// integer_firstとinteger_secondの平均を文字列型で表示する
		System.out.println("平均は" + (integer_first + integer_second) / 2 + "です。");

	}

}

/*
 * 考察： 変数xとyはint型で宣言しているため整数型ではない実数値を扱うことができない。 そのためエラーとなる。
 */
