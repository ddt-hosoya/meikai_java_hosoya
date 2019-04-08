package e02;

/*
キーボードから読み込んだ整数値プラスマイナス5の範囲の整数値を
ランダムに生成して表示するプログラムを作成せよ。
 */
import java.util.Random;
import java.util.Scanner;

public class e02_08 {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);

		// 0～10の整数値をランダムに生成するための定数を宣言する。
		final int INT_RANDOM_INTEGER = 11;
		// －5～＋5の整数値を算出するための調整値を定数宣言する。
		final int INT_ADJUST_AROUND5 = -5;

		// 0～10の整数値に調整値-5を足して±5の乱数を生成する。
		int intAdjustRandom = rand.nextInt(INT_RANDOM_INTEGER) + INT_ADJUST_AROUND5;

		// 文字を表示する。
		System.out.print("整数値：");
		// キーボードから値を読み込んだ値を整数値として宣言する。
		int intInput = stdIn.nextInt();

		// キーボードから読み込んだ値と±5の乱数で値を生成する。
		int intInputAround5 = intInput + intAdjustRandom;
		// キーボードから読み込んだ値と±5の乱数で生成した結果を表示する。
		System.out.println("その値の±5の乱数を生成しました。それは" + intInputAround5 + "です。");

	}
}
