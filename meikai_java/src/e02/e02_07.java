package e02;

import java.util.Random;

/*
以下に示すプログラムを作成せよ。
・1桁の整数値（すなわち1以上9以下の値）をランダムに生成して表示。
・1桁の負の整数値（すなわち-9以上-1以下の値）をランダムに生成して表示。
・2桁の正の整数値（すなわち10以上99以下の値）をランダムに生成して表示。
 */
public class e02_07 {
	public static void main(String[] args) {
		Random rand = new Random();
		// 1桁の正の整数を算出するためのランダム生成する範囲を宣言する。
		final int INT_RANDOM_DIGIT1 = 9;
		// 1桁の正の整数を算出するための調整値を宣言する。
		final int INT_ADJUST_DIGIT1 = 1;
		// 1桁の正の値をランダムに生成して整数型で宣言する。
		int positive_integer = rand.nextInt(INT_RANDOM_DIGIT1) + INT_ADJUST_DIGIT1;
		// 値を表示する。
		System.out.println(positive_integer + "は1桁の正の整数です。");
		// 1桁の負の整数を算出するためのランダム生成する範囲を宣言する。
		final int INT_RANDOM_NEGATIVE_DIGIT1 = 9;
		// 1桁の負の整数を算出するための調整値を宣言する。
		final int INT_ADJUST_NEGATIVE_DIGIT1 = -9;
		// 1桁の負の値をランダムに生成して整数型で宣言する。
		int negative_integer = rand.nextInt(INT_RANDOM_NEGATIVE_DIGIT1) + INT_ADJUST_NEGATIVE_DIGIT1;
		// 値を表示する。
		System.out.println(negative_integer + "は1桁の負の整数です。");
		final int INT_RANDOM_DIGIT2 = 90;
		// 1桁の負の整数を算出するための調整値を宣言する。
		final int INT_ADJUST_DIGIT2 = 10;
		// 2桁の正の値をランダムに生成して整数型で宣言する。
		int double_digit_integer = rand.nextInt(INT_RANDOM_DIGIT2) + INT_ADJUST_DIGIT2;
		// 値を表示する。
		System.out.println(double_digit_integer + "は2桁の正の整数です。");
	}

}
