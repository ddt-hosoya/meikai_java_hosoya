package e02;
/*
演習2-1
List2-6の[2]の箇所を、小数部を持つ実数値をxとyに代入するように変更して、その結果を考察せよ。
 */
public class e02_01 {
	public static void main(String[] args){
		//xのint型変数の宣言
		int x;
		//yのint型変数の宣言
		int y;

		//変数xに実数値を代入する
		x = 63.5;
		//変数yに実数値を代入する
		y = 18.2;

		//xの値を文字列型で表示する
		System.out.println("xの値は" + x  +"です。");
		//yの値を文字列型で表示する
		System.out.println("yの値は" + y  +"です。");
		//xとyの合計を文字列型で表示する
		System.out.println("合計は" + (x + y)  +"です。");
		//xとyの平均を文字列型で表示する
		System.out.println("平均は" + (x + y) / 2  +"です。");

	}

}

/*
考察：
変数xとyはint型で宣言しているため整数型ではない実数値を扱うことができない。
そのためエラーとなる。
 */
