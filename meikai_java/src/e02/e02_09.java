package e02;

import java.util.Random;
/*
以下に示すプログラムを作成せよ。（実数値の乱数の生成にはnextDouble()を使うこと：Column 2-3参照）。
・0.0以上1.0未満の実数値をランダムに生成して表示。
・0.0以上10.0未満の実数値をランダムに生成して表示。
・-1.0以上1.0未満の実数値をランダムに生成して表示。
 */

public class e02_09 {
	public static void main(String[] args) {
		// ランダムクラスの乱数を生成するインスタンスを実体化する。
		Random rand = new Random();
		// 0.0～10.0の実数値を生成するための調整値
		final int ADJUST_DOUBLE_UNDER10 = 10;

		// 0.0～1.0の実数値をランダムに生成する。
		double doubleUnder1 = rand.nextDouble();
		// 0.0～10.0の実数値をランダムに生成する。
		double doubleUnder10 = doubleUnder1 * ADJUST_DOUBLE_UNDER10;
		// 0または1の整数値をランダムに生成し、-1.0～1.0の実数値を求める調整値とする。
		int adjustInt = rand.nextInt(2);
		// -1.0～1.0の実数値をランダムに生成する。
		double doubleAround1 = doubleUnder1 - adjustInt;

		// 0.0以上1.0未満の実数値をランダムに生成して表示する。
		System.out.println("0.0以上1.0未満の実数値：" + doubleUnder1);
		// 0.0以上10.0未満の実数値をランダムに生成して表示する。
		System.out.println("0.0以上10.0未満の実数値：" + doubleUnder10);
		// -1.0以上1.0未満の実数値をランダムに生成して表示する。
		System.out.println("-1.0以上1.0未満の実数値：" + doubleAround1);
	}
}
