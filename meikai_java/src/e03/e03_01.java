package e03;

/*
右に示すように、整数値を読みこんで、その絶対値を求めて表示するプログラムを作成せよ。
 */
import java.util.Scanner;

public class e03_01 {
	public static void main(String[] args) {
		//Scannerクラスの標準入力ストリームを実体化する。
		Scanner stdIn = new Scanner(System.in);
		// 整数値：という文字を表示する。
		System.out.print("整数値：");
		// 入力した値をint型で宣言する。
		int inputInt = stdIn.nextInt();
		// 出力する値を入れる変数を宣言する。
		int outputInt;

		// 入力した値が負の場合は入力した値の符号を反転した値を絶対値とする。
		if (inputInt < 0) {
			outputInt = -inputInt;

		// 入力した値が0以上の場合は入力した値を絶対値とする。
		} else {
			outputInt = inputInt;
		}
		// 絶対値を表示する。
		System.out.println("その絶対値は" + outputInt + "です。");
	}

}
