package e02;

import java.util.Scanner;

/*
二つの実数値を読み込み、その和と平均を求めて表示するプログラムを作成せよ。
*/
public class e02_05 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		// 文字を表示する。
		System.out.println("1番目の入力値：");
		// キーボードで読み込んだ値を実数値として宣言する。
		double inputvalue_first = stdIn.nextDouble();

		// 文字を表示する。
		System.out.println("2番目の入力値：");
		// キーボードで読み込んだ値を実数値として宣言する。
		double inputvalue_second = stdIn.nextDouble();

		// 合計値を表示する。
		System.out.println("合計は" + (inputvalue_first + inputvalue_second) + "です。");
		System.out.println("平均は" + (inputvalue_first + inputvalue_second) / 2 + "です。");
	}
}
