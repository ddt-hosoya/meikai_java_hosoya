package e15;

import java.util.Scanner;

/*
 * 浮動小数点数値xを、小数点以下の部分をp桁で、全体を少なくともw桁で表示するメソッドprintDoubleを作成しよ。
 */
public class e15_04 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		//表示する浮動小数点数値xをたずねる
		System.out.print("浮動小数点数値x : ");
		// 入力値を浮動小数点数値xに設定
		double doubleNumberX  = stdIn.nextDouble();
		// 小数点以下の桁数pをたずねる
		System.out.print("小数点以下の桁数p : ");
		int decimalPlaceP = stdIn.nextInt();
		// 小数点以下の桁数pをたずねる
		System.out.print("全体の桁数w : ");
		int digitNumberW = stdIn.nextInt();
		// 浮動小数点数値xを、小数点以下の部分をp桁で、全体を少なくともw桁に表示する
		printDouble(doubleNumberX, decimalPlaceP, digitNumberW);
	}


	/**
	 * 浮動小数点数値xを、小数点以下の部分をp桁で、全体を少なくともw桁で表示するメソッド
	 * @author t.hosoya
	 * @since 20201104
	 * @param x 浮動小数点数値
	 * @param p 小数点以下の桁数
	 * @param w 全体の桁数
	 *
	 */
	private static void printDouble(double x, int p, int w){
		// 表示する桁数を%x.xfの形式にする
		// 全体の桁数の値をx.xの整数部分とする
		double displayDigit = w;

		// 小数点以下の桁数の値をx.xの少数部分とする為にpをp自身の桁数に応じた数で割る（例：1桁の場合10で割り、2桁の場合100で割る）
		// 割る数
		int divideNumber = 1;
		// pを割る数を算出するための値
		final int CALUCULATION_NUMBER = 10;
		// p自身の桁数分ループ
		for(int num = 0; num < String.valueOf(p).length(); num++){
			// pを割る数を算出する
			divideNumber = divideNumber * CALUCULATION_NUMBER;
		}
		// 小数点以下の桁数の値をx.xの少数部分とする
		double displayDecimal = (double) p / divideNumber;

		// 整数部分と小数部分をたしてx.xの形式にする
		displayDigit = displayDigit + displayDecimal;

		// 浮動小数点数値Xを指定した桁数表示にする
		System.out.println(String.format(String.format("%%%sf", displayDigit), x));
	}

}
